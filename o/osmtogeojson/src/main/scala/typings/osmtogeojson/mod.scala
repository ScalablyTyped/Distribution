package typings.osmtogeojson

import org.scalablytyped.runtime.StringDictionary
import typings.osmtogeojson.mod.GeoJSON.GeoJSONObject
import typings.osmtogeojson.mod.OsmJSON.OsmJSONObject
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("osmtogeojson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("osmtogeojson", JSImport.Default)
  @js.native
  def default: OsmToGeoJSON = js.native
  inline def default_=(x: OsmToGeoJSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  object GeoJSON {
    
    type Coordinate = Coordinate2d | Coordinate3d
    
    type Coordinate2d = js.Tuple2[Double, Double]
    
    type Coordinate3d = js.Tuple3[Double, Double, Double]
    
    trait Feature
      extends StObject
         with GeoJSONObject {
      
      var geometry: Geometry
      
      var id: js.UndefOr[String] = js.undefined
      
      var properties: Any
    }
    object Feature {
      
      inline def apply(geometry: Geometry, properties: Any, `type`: String): Feature = {
        val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Feature]
      }
      
      extension [Self <: Feature](x: Self) {
        
        inline def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      }
    }
    
    trait FeatureCollection
      extends StObject
         with GeoJSONObject {
      
      var features: js.Array[Feature]
    }
    object FeatureCollection {
      
      inline def apply(features: js.Array[Feature], `type`: String): FeatureCollection = {
        val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[FeatureCollection]
      }
      
      extension [Self <: FeatureCollection](x: Self) {
        
        inline def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value*))
      }
    }
    
    trait GeoJSONObject extends StObject {
      
      var `type`: String
    }
    object GeoJSONObject {
      
      inline def apply(`type`: String): GeoJSONObject = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[GeoJSONObject]
      }
      
      extension [Self <: GeoJSONObject](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait Geometry
      extends StObject
         with GeoJSONObject {
      
      var coordinates: Coordinate | (js.Array[js.Array[Coordinate] | Coordinate])
    }
    object Geometry {
      
      inline def apply(coordinates: Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), `type`: String): Geometry = {
        val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Geometry]
      }
      
      extension [Self <: Geometry](x: Self) {
        
        inline def setCoordinates(value: Coordinate | (js.Array[js.Array[Coordinate] | Coordinate])): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
        
        inline def setCoordinatesVarargs(value: (js.Array[Coordinate] | Coordinate)*): Self = StObject.set(x, "coordinates", js.Array(value*))
      }
    }
    
    trait GeometryCollection
      extends StObject
         with GeoJSONObject {
      
      var geometries: js.Array[Geometry]
    }
    object GeometryCollection {
      
      inline def apply(geometries: js.Array[Geometry], `type`: String): GeometryCollection = {
        val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[GeometryCollection]
      }
      
      extension [Self <: GeometryCollection](x: Self) {
        
        inline def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
        
        inline def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value*))
      }
    }
  }
  
  trait Options extends StObject {
    
    /**
      * If true, the resulting GeoJSON feature's properties will be a simple key-value list instead of a structured json object (with separate tags and metadata). default: false
      */
    var flatProperties: js.UndefOr[Boolean] = js.undefined
    
    //TODO: type function
    /**
      * Either a json object or callback function that is used to determine if a closed way should be treated as a Polygon or LineString.
      */
    var polygonFeatures: js.UndefOr[Any | js.Function] = js.undefined
    
    /**
      * Either a blacklist of tag keys or a callback function. Will be used to decide if a feature is interesting enough for its own GeoJSON feature.
      */
    var uninterestingTags: js.UndefOr[StringDictionary[Boolean] | js.Function] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFlatProperties(value: Boolean): Self = StObject.set(x, "flatProperties", value.asInstanceOf[js.Any])
      
      inline def setFlatPropertiesUndefined: Self = StObject.set(x, "flatProperties", js.undefined)
      
      inline def setPolygonFeatures(value: Any | js.Function): Self = StObject.set(x, "polygonFeatures", value.asInstanceOf[js.Any])
      
      inline def setPolygonFeaturesUndefined: Self = StObject.set(x, "polygonFeatures", js.undefined)
      
      inline def setUninterestingTags(value: StringDictionary[Boolean] | js.Function): Self = StObject.set(x, "uninterestingTags", value.asInstanceOf[js.Any])
      
      inline def setUninterestingTagsUndefined: Self = StObject.set(x, "uninterestingTags", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  object OsmJSON {
    
    trait Element extends StObject {
      
      var changeset: js.UndefOr[Double] = js.undefined
      
      var id: Double
      
      var tags: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var timestamp: js.UndefOr[String] = js.undefined
      
      var `type`: String
      
      var uid: js.UndefOr[Double] = js.undefined
      
      var user: js.UndefOr[String] = js.undefined
      
      var version: js.UndefOr[Double] = js.undefined
    }
    object Element {
      
      inline def apply(id: Double, `type`: String): Element = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Element]
      }
      
      extension [Self <: Element](x: Self) {
        
        inline def setChangeset(value: Double): Self = StObject.set(x, "changeset", value.asInstanceOf[js.Any])
        
        inline def setChangesetUndefined: Self = StObject.set(x, "changeset", js.undefined)
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
        
        inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        
        inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    trait Member extends StObject {
      
      var ref: Double
      
      var role: String
      
      var `type`: String
    }
    object Member {
      
      inline def apply(ref: Double, role: String, `type`: String): Member = {
        val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Member]
      }
      
      extension [Self <: Member](x: Self) {
        
        inline def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait Node
      extends StObject
         with Element {
      
      var lat: Double
      
      var lon: Double
    }
    object Node {
      
      inline def apply(id: Double, lat: Double, lon: Double, `type`: String): Node = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Node]
      }
      
      extension [Self <: Node](x: Self) {
        
        inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
        
        inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
      }
    }
    
    trait OsmJSONObject extends StObject {
      
      var elements: js.Array[Node | Way | Relationship]
    }
    object OsmJSONObject {
      
      inline def apply(elements: js.Array[Node | Way | Relationship]): OsmJSONObject = {
        val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
        __obj.asInstanceOf[OsmJSONObject]
      }
      
      extension [Self <: OsmJSONObject](x: Self) {
        
        inline def setElements(value: js.Array[Node | Way | Relationship]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        inline def setElementsVarargs(value: (Node | Way | Relationship)*): Self = StObject.set(x, "elements", js.Array(value*))
      }
    }
    
    trait Relationship
      extends StObject
         with Element {
      
      var members: js.Array[Member]
    }
    object Relationship {
      
      inline def apply(id: Double, members: js.Array[Member], `type`: String): Relationship = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Relationship]
      }
      
      extension [Self <: Relationship](x: Self) {
        
        inline def setMembers(value: js.Array[Member]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
        
        inline def setMembersVarargs(value: Member*): Self = StObject.set(x, "members", js.Array(value*))
      }
    }
    
    trait Way
      extends StObject
         with Element {
      
      var nodes: js.Array[Double]
    }
    object Way {
      
      inline def apply(id: Double, nodes: js.Array[Double], `type`: String): Way = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Way]
      }
      
      extension [Self <: Way](x: Self) {
        
        inline def setNodes(value: js.Array[Double]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        inline def setNodesVarargs(value: Double*): Self = StObject.set(x, "nodes", js.Array(value*))
      }
    }
  }
  
  @js.native
  trait OsmToGeoJSON extends StObject {
    
    def apply(data: OsmJSONObject): GeoJSONObject = js.native
    def apply(data: OsmJSONObject, options: Options): GeoJSONObject = js.native
    def apply(data: Document): GeoJSONObject = js.native
    def apply(data: Document, options: Options): GeoJSONObject = js.native
    
    def toGeojson(data: OsmJSONObject): GeoJSONObject = js.native
    def toGeojson(data: OsmJSONObject, options: Options): GeoJSONObject = js.native
    def toGeojson(data: Document): GeoJSONObject = js.native
    def toGeojson(data: Document, options: Options): GeoJSONObject = js.native
  }
}
