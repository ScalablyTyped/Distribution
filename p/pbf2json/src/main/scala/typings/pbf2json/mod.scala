package typings.pbf2json

import typings.node.streamMod.Transform
import typings.pbf2json.anon.E
import typings.pbf2json.pbf2jsonStrings.entrance
import typings.pbf2json.pbf2jsonStrings.node
import typings.pbf2json.pbf2jsonStrings.relation
import typings.pbf2json.pbf2jsonStrings.way
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pbf2json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createReadStream(options: Options): Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(options.asInstanceOf[js.Any]).asInstanceOf[Decoder]
  
  trait Centroid
    extends StObject
       with Coordinate {
    
    var `type`: js.UndefOr[entrance] = js.undefined
  }
  object Centroid {
    
    inline def apply(lat: Double, lon: Double): Centroid = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Centroid]
    }
    
    extension [Self <: Centroid](x: Self) {
      
      inline def setType(value: entrance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Coordinate extends StObject {
    
    var lat: Double
    
    var lon: Double
  }
  object Coordinate {
    
    inline def apply(lat: Double, lon: Double): Coordinate = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinate]
    }
    
    extension [Self <: Coordinate](x: Self) {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Decoder extends Transform {
    
    /** terminate the process and pipeline */
    def kill(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pbf2json.mod.Node
    - typings.pbf2json.mod.Way
    - typings.pbf2json.mod.Relation
  */
  trait Item extends StObject
  object Item {
    
    inline def Node(id: Double, lat: Double, lon: Double, tags: Tags): typings.pbf2json.mod.Node = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("node")
      __obj.asInstanceOf[typings.pbf2json.mod.Node]
    }
    
    inline def Relation(bounds: E, centroid: Centroid, id: Double, tags: Tags): typings.pbf2json.mod.Relation = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], centroid = centroid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("relation")
      __obj.asInstanceOf[typings.pbf2json.mod.Relation]
    }
    
    inline def Way(bounds: E, centroid: Centroid, id: Double, nodes: js.Array[Coordinate], tags: Tags): typings.pbf2json.mod.Way = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], centroid = centroid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("way")
      __obj.asInstanceOf[typings.pbf2json.mod.Way]
    }
  }
  
  trait Node
    extends StObject
       with Coordinate
       with Item {
    
    var id: Double
    
    var tags: Tags
    
    var `type`: node
  }
  object Node {
    
    inline def apply(id: Double, lat: Double, lon: Double, tags: Tags): Node = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("node")
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setType(value: node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** Path to the .pbf file */
    var file: String
    
    /** Path to store temp files */
    var leveldb: js.UndefOr[String] = js.undefined
    
    /** To control which tags are output */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var waynodes: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(file: String): Options = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLeveldb(value: String): Self = StObject.set(x, "leveldb", value.asInstanceOf[js.Any])
      
      inline def setLeveldbUndefined: Self = StObject.set(x, "leveldb", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setWaynodes(value: String): Self = StObject.set(x, "waynodes", value.asInstanceOf[js.Any])
      
      inline def setWaynodesUndefined: Self = StObject.set(x, "waynodes", js.undefined)
    }
  }
  
  trait Relation
    extends StObject
       with Item {
    
    var bounds: E
    
    var centroid: Centroid
    
    var id: Double
    
    var tags: Tags
    
    var `type`: relation
  }
  object Relation {
    
    inline def apply(bounds: E, centroid: Centroid, id: Double, tags: Tags): Relation = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], centroid = centroid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("relation")
      __obj.asInstanceOf[Relation]
    }
    
    extension [Self <: Relation](x: Self) {
      
      inline def setBounds(value: E): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setCentroid(value: Centroid): Self = StObject.set(x, "centroid", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setType(value: relation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Tags = Record[String, js.UndefOr[String]]
  
  trait Way
    extends StObject
       with Item {
    
    var bounds: E
    
    var centroid: Centroid
    
    var id: Double
    
    var nodes: js.Array[Coordinate]
    
    var tags: Tags
    
    var `type`: way
  }
  object Way {
    
    inline def apply(bounds: E, centroid: Centroid, id: Double, nodes: js.Array[Coordinate], tags: Tags): Way = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], centroid = centroid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("way")
      __obj.asInstanceOf[Way]
    }
    
    extension [Self <: Way](x: Self) {
      
      inline def setBounds(value: E): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setCentroid(value: Centroid): Self = StObject.set(x, "centroid", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[Coordinate]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Coordinate*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setType(value: way): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
