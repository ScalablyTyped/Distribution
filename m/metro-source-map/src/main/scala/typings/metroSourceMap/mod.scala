package typings.metroSourceMap

import typings.metroSourceMap.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait BasicSourceMap
    extends StObject
       with MixedSourceMap {
    
    val file: js.UndefOr[String] = js.undefined
    
    val mappings: String
    
    val names: js.Array[String]
    
    val sourceRoot: js.UndefOr[String] = js.undefined
    
    val sources: js.Array[String]
    
    val sourcesContent: js.UndefOr[js.Array[js.UndefOr[String]]] = js.undefined
    
    val version: Double
  }
  object BasicSourceMap {
    
    inline def apply(mappings: String, names: js.Array[String], sources: js.Array[String], version: Double): BasicSourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicSourceMap]
    }
    
    extension [Self <: BasicSourceMap](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait FBSourceFunctionMap extends StObject {
    
    val mappings: String
    
    val names: js.Array[String]
  }
  object FBSourceFunctionMap {
    
    inline def apply(mappings: String, names: js.Array[String]): FBSourceFunctionMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[FBSourceFunctionMap]
    }
    
    extension [Self <: FBSourceFunctionMap](x: Self) {
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
  
  type GeneratedCodeMapping = js.Tuple2[Double, Double]
  
  trait IndexMap
    extends StObject
       with MixedSourceMap {
    
    val file: js.UndefOr[String] = js.undefined
    
    val mappings: js.UndefOr[Any] = js.undefined
    
    val sections: js.Array[IndexMapSection]
    
    val sourcesContent: js.UndefOr[Any] = js.undefined
    
    val version: Double
  }
  object IndexMap {
    
    inline def apply(sections: js.Array[IndexMapSection], version: Double): IndexMap = {
      val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexMap]
    }
    
    extension [Self <: IndexMap](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMappings(value: Any): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
      
      inline def setSections(value: js.Array[IndexMapSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsVarargs(value: IndexMapSection*): Self = StObject.set(x, "sections", js.Array(value*))
      
      inline def setSourcesContent(value: Any): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexMapSection extends StObject {
    
    var map: IndexMap | BasicSourceMap
    
    var offset: Column
  }
  object IndexMapSection {
    
    inline def apply(map: IndexMap | BasicSourceMap, offset: Column): IndexMapSection = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexMapSection]
    }
    
    extension [Self <: IndexMapSection](x: Self) {
      
      inline def setMap(value: IndexMap | BasicSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Column): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type MetroSourceMapSegmentTuple = SourceMappingWithName | SourceMapping | GeneratedCodeMapping
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroSourceMap.mod.IndexMap
    - typings.metroSourceMap.mod.BasicSourceMap
  */
  trait MixedSourceMap extends StObject
  object MixedSourceMap {
    
    inline def BasicSourceMap(mappings: String, names: js.Array[String], sources: js.Array[String], version: Double): typings.metroSourceMap.mod.BasicSourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.metroSourceMap.mod.BasicSourceMap]
    }
    
    inline def IndexMap(sections: js.Array[IndexMapSection], version: Double): typings.metroSourceMap.mod.IndexMap = {
      val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.metroSourceMap.mod.IndexMap]
    }
  }
  
  type SourceMapping = js.Tuple4[Double, Double, Double, Double]
  
  type SourceMappingWithName = js.Tuple5[Double, Double, Double, Double, String]
}
