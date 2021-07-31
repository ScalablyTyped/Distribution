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
  @scala.inline
  def default_=(x: OsmToGeoJSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  object GeoJSON {
    
    type Coordinate = Coordinate2d | Coordinate3d
    
    type Coordinate2d = js.Tuple2[Double, Double]
    
    type Coordinate3d = js.Tuple3[Double, Double, Double]
    
    trait Feature
      extends StObject
         with GeoJSONObject {
      
      var geometry: Geometry
      
      var id: js.UndefOr[String] = js.undefined
      
      var properties: js.Any
    }
    object Feature {
      
      @scala.inline
      def apply(geometry: Geometry, properties: js.Any, `type`: String): Feature = {
        val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Feature]
      }
      
      @scala.inline
      implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      }
    }
    
    trait FeatureCollection
      extends StObject
         with GeoJSONObject {
      
      var features: js.Array[Feature]
    }
    object FeatureCollection {
      
      @scala.inline
      def apply(features: js.Array[Feature], `type`: String): FeatureCollection = {
        val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[FeatureCollection]
      }
      
      @scala.inline
      implicit class FeatureCollectionMutableBuilder[Self <: FeatureCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
      }
    }
    
    trait GeoJSONObject extends StObject {
      
      var `type`: String
    }
    object GeoJSONObject {
      
      @scala.inline
      def apply(`type`: String): GeoJSONObject = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[GeoJSONObject]
      }
      
      @scala.inline
      implicit class GeoJSONObjectMutableBuilder[Self <: GeoJSONObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait Geometry
      extends StObject
         with GeoJSONObject {
      
      var coordinates: Coordinate | (js.Array[js.Array[Coordinate] | Coordinate])
    }
    object Geometry {
      
      @scala.inline
      def apply(coordinates: Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), `type`: String): Geometry = {
        val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Geometry]
      }
      
      @scala.inline
      implicit class GeometryMutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCoordinates(value: Coordinate | (js.Array[js.Array[Coordinate] | Coordinate])): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoordinatesVarargs(value: (js.Array[Coordinate] | Coordinate)*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      }
    }
    
    trait GeometryCollection
      extends StObject
         with GeoJSONObject {
      
      var geometries: js.Array[Geometry]
    }
    object GeometryCollection {
      
      @scala.inline
      def apply(geometries: js.Array[Geometry], `type`: String): GeometryCollection = {
        val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[GeometryCollection]
      }
      
      @scala.inline
      implicit class GeometryCollectionMutableBuilder[Self <: GeometryCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value :_*))
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
    var polygonFeatures: js.UndefOr[js.Any | js.Function] = js.undefined
    
    /**
      * Either a blacklist of tag keys or a callback function. Will be used to decide if a feature is interesting enough for its own GeoJSON feature.
      */
    var uninterestingTags: js.UndefOr[StringDictionary[Boolean] | js.Function] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlatProperties(value: Boolean): Self = StObject.set(x, "flatProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatPropertiesUndefined: Self = StObject.set(x, "flatProperties", js.undefined)
      
      @scala.inline
      def setPolygonFeatures(value: js.Any | js.Function): Self = StObject.set(x, "polygonFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonFeaturesUndefined: Self = StObject.set(x, "polygonFeatures", js.undefined)
      
      @scala.inline
      def setUninterestingTags(value: StringDictionary[Boolean] | js.Function): Self = StObject.set(x, "uninterestingTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninterestingTagsUndefined: Self = StObject.set(x, "uninterestingTags", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
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
      
      @scala.inline
      def apply(id: Double, `type`: String): Element = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Element]
      }
      
      @scala.inline
      implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChangeset(value: Double): Self = StObject.set(x, "changeset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChangesetUndefined: Self = StObject.set(x, "changeset", js.undefined)
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        @scala.inline
        def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
        
        @scala.inline
        def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        
        @scala.inline
        def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    trait Member extends StObject {
      
      var ref: Double
      
      var role: String
      
      var `type`: String
    }
    object Member {
      
      @scala.inline
      def apply(ref: Double, role: String, `type`: String): Member = {
        val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Member]
      }
      
      @scala.inline
      implicit class MemberMutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait Node
      extends StObject
         with Element {
      
      var lat: Double
      
      var lon: Double
    }
    object Node {
      
      @scala.inline
      def apply(id: Double, lat: Double, lon: Double, `type`: String): Node = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Node]
      }
      
      @scala.inline
      implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
      }
    }
    
    trait OsmJSONObject extends StObject {
      
      var elements: js.Array[Node | Way | Relationship]
    }
    object OsmJSONObject {
      
      @scala.inline
      def apply(elements: js.Array[Node | Way | Relationship]): OsmJSONObject = {
        val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
        __obj.asInstanceOf[OsmJSONObject]
      }
      
      @scala.inline
      implicit class OsmJSONObjectMutableBuilder[Self <: OsmJSONObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setElements(value: js.Array[Node | Way | Relationship]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementsVarargs(value: (Node | Way | Relationship)*): Self = StObject.set(x, "elements", js.Array(value :_*))
      }
    }
    
    trait Relationship
      extends StObject
         with Element {
      
      var members: js.Array[Member]
    }
    object Relationship {
      
      @scala.inline
      def apply(id: Double, members: js.Array[Member], `type`: String): Relationship = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Relationship]
      }
      
      @scala.inline
      implicit class RelationshipMutableBuilder[Self <: Relationship] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMembers(value: js.Array[Member]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMembersVarargs(value: Member*): Self = StObject.set(x, "members", js.Array(value :_*))
      }
    }
    
    trait Way
      extends StObject
         with Element {
      
      var nodes: js.Array[Double]
    }
    object Way {
      
      @scala.inline
      def apply(id: Double, nodes: js.Array[Double], `type`: String): Way = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Way]
      }
      
      @scala.inline
      implicit class WayMutableBuilder[Self <: Way] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNodes(value: js.Array[Double]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodesVarargs(value: Double*): Self = StObject.set(x, "nodes", js.Array(value :_*))
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
