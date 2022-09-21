package typings.parquetjs

import typings.node.bufferMod.global.Buffer
import typings.nodeInt64.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Codec extends StObject {
    
    var codec: Double | Null
    
    var data_page_offset: ^ | Null
    
    var dictionary_page_offset: ^ | Null
    
    var encoding_stats: Any
    
    var encodings: js.Array[Double] | Null
    
    var index_page_offset: ^ | Null
    
    var key_value_metadata: js.Array[Key] | Null
    
    var num_values: ^ | Null
    
    var path_in_schema: (js.Array[js.Array[String] | String]) | Null
    
    var statistics: Any
    
    var total_compressed_size: ^ | Null
    
    var total_uncompressed_size: ^ | Null
    
    var `type`: Double | Null
  }
  object Codec {
    
    inline def apply(encoding_stats: Any, statistics: Any): Codec = {
      val __obj = js.Dynamic.literal(encoding_stats = encoding_stats.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], codec = null, data_page_offset = null, dictionary_page_offset = null, encodings = null, index_page_offset = null, key_value_metadata = null, num_values = null, path_in_schema = null, total_compressed_size = null, total_uncompressed_size = null)
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[Codec]
    }
    
    extension [Self <: Codec](x: Self) {
      
      inline def setCodec(value: Double): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setCodecNull: Self = StObject.set(x, "codec", null)
      
      inline def setData_page_offset(value: ^): Self = StObject.set(x, "data_page_offset", value.asInstanceOf[js.Any])
      
      inline def setData_page_offsetNull: Self = StObject.set(x, "data_page_offset", null)
      
      inline def setDictionary_page_offset(value: ^): Self = StObject.set(x, "dictionary_page_offset", value.asInstanceOf[js.Any])
      
      inline def setDictionary_page_offsetNull: Self = StObject.set(x, "dictionary_page_offset", null)
      
      inline def setEncoding_stats(value: Any): Self = StObject.set(x, "encoding_stats", value.asInstanceOf[js.Any])
      
      inline def setEncodings(value: js.Array[Double]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
      
      inline def setEncodingsNull: Self = StObject.set(x, "encodings", null)
      
      inline def setEncodingsVarargs(value: Double*): Self = StObject.set(x, "encodings", js.Array(value*))
      
      inline def setIndex_page_offset(value: ^): Self = StObject.set(x, "index_page_offset", value.asInstanceOf[js.Any])
      
      inline def setIndex_page_offsetNull: Self = StObject.set(x, "index_page_offset", null)
      
      inline def setKey_value_metadata(value: js.Array[Key]): Self = StObject.set(x, "key_value_metadata", value.asInstanceOf[js.Any])
      
      inline def setKey_value_metadataNull: Self = StObject.set(x, "key_value_metadata", null)
      
      inline def setKey_value_metadataVarargs(value: Key*): Self = StObject.set(x, "key_value_metadata", js.Array(value*))
      
      inline def setNum_values(value: ^): Self = StObject.set(x, "num_values", value.asInstanceOf[js.Any])
      
      inline def setNum_valuesNull: Self = StObject.set(x, "num_values", null)
      
      inline def setPath_in_schema(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "path_in_schema", value.asInstanceOf[js.Any])
      
      inline def setPath_in_schemaNull: Self = StObject.set(x, "path_in_schema", null)
      
      inline def setPath_in_schemaVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "path_in_schema", js.Array(value*))
      
      inline def setStatistics(value: Any): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
      
      inline def setTotal_compressed_size(value: ^): Self = StObject.set(x, "total_compressed_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_compressed_sizeNull: Self = StObject.set(x, "total_compressed_size", null)
      
      inline def setTotal_uncompressed_size(value: ^): Self = StObject.set(x, "total_uncompressed_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_uncompressed_sizeNull: Self = StObject.set(x, "total_uncompressed_size", null)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  trait Columns extends StObject {
    
    var columns: Any
    
    var num_rows: Double
    
    var sorting_columns: Null | js.Array[String]
    
    var total_byte_size: Double
  }
  object Columns {
    
    inline def apply(columns: Any, num_rows: Double, total_byte_size: Double): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], total_byte_size = total_byte_size.asInstanceOf[js.Any], sorting_columns = null)
      __obj.asInstanceOf[Columns]
    }
    
    extension [Self <: Columns](x: Self) {
      
      inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setNum_rows(value: Double): Self = StObject.set(x, "num_rows", value.asInstanceOf[js.Any])
      
      inline def setSorting_columns(value: js.Array[String]): Self = StObject.set(x, "sorting_columns", value.asInstanceOf[js.Any])
      
      inline def setSorting_columnsNull: Self = StObject.set(x, "sorting_columns", null)
      
      inline def setSorting_columnsVarargs(value: String*): Self = StObject.set(x, "sorting_columns", js.Array(value*))
      
      inline def setTotal_byte_size(value: Double): Self = StObject.set(x, "total_byte_size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var dlevels: js.Array[Double]
    
    var rlevels: js.Array[Double]
    
    var values: js.Array[Buffer]
  }
  object Count {
    
    inline def apply(count: Double, dlevels: js.Array[Double], rlevels: js.Array[Double], values: js.Array[Buffer]): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dlevels = dlevels.asInstanceOf[js.Any], rlevels = rlevels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDlevels(value: js.Array[Double]): Self = StObject.set(x, "dlevels", value.asInstanceOf[js.Any])
      
      inline def setDlevelsVarargs(value: Double*): Self = StObject.set(x, "dlevels", js.Array(value*))
      
      inline def setRlevels(value: js.Array[Double]): Self = StObject.set(x, "rlevels", value.asInstanceOf[js.Any])
      
      inline def setRlevelsVarargs(value: Double*): Self = StObject.set(x, "rlevels", js.Array(value*))
      
      inline def setValues(value: js.Array[Buffer]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Buffer*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var value: String
  }
  object Key {
    
    inline def apply(key: String, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
