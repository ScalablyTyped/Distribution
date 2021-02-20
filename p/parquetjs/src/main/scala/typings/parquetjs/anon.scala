package typings.parquetjs

import typings.node.Buffer
import typings.nodeInt64.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Codec extends StObject {
    
    var codec: Double | Null = js.native
    
    var data_page_offset: ^ | Null = js.native
    
    var dictionary_page_offset: ^ | Null = js.native
    
    var encoding_stats: js.Any = js.native
    
    var encodings: js.Array[Double] | Null = js.native
    
    var index_page_offset: ^ | Null = js.native
    
    var key_value_metadata: js.Array[Key] | Null = js.native
    
    var num_values: ^ | Null = js.native
    
    var path_in_schema: (js.Array[js.Array[String] | String]) | Null = js.native
    
    var statistics: js.Any = js.native
    
    var total_compressed_size: ^ | Null = js.native
    
    var total_uncompressed_size: ^ | Null = js.native
    
    var `type`: Double | Null = js.native
  }
  object Codec {
    
    @scala.inline
    def apply(encoding_stats: js.Any, statistics: js.Any): Codec = {
      val __obj = js.Dynamic.literal(encoding_stats = encoding_stats.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codec]
    }
    
    @scala.inline
    implicit class CodecMutableBuilder[Self <: Codec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodec(value: Double): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodecNull: Self = StObject.set(x, "codec", null)
      
      @scala.inline
      def setData_page_offset(value: ^): Self = StObject.set(x, "data_page_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_page_offsetNull: Self = StObject.set(x, "data_page_offset", null)
      
      @scala.inline
      def setDictionary_page_offset(value: ^): Self = StObject.set(x, "dictionary_page_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionary_page_offsetNull: Self = StObject.set(x, "dictionary_page_offset", null)
      
      @scala.inline
      def setEncoding_stats(value: js.Any): Self = StObject.set(x, "encoding_stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodings(value: js.Array[Double]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingsNull: Self = StObject.set(x, "encodings", null)
      
      @scala.inline
      def setEncodingsVarargs(value: Double*): Self = StObject.set(x, "encodings", js.Array(value :_*))
      
      @scala.inline
      def setIndex_page_offset(value: ^): Self = StObject.set(x, "index_page_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex_page_offsetNull: Self = StObject.set(x, "index_page_offset", null)
      
      @scala.inline
      def setKey_value_metadata(value: js.Array[Key]): Self = StObject.set(x, "key_value_metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey_value_metadataNull: Self = StObject.set(x, "key_value_metadata", null)
      
      @scala.inline
      def setKey_value_metadataVarargs(value: Key*): Self = StObject.set(x, "key_value_metadata", js.Array(value :_*))
      
      @scala.inline
      def setNum_values(value: ^): Self = StObject.set(x, "num_values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_valuesNull: Self = StObject.set(x, "num_values", null)
      
      @scala.inline
      def setPath_in_schema(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "path_in_schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath_in_schemaNull: Self = StObject.set(x, "path_in_schema", null)
      
      @scala.inline
      def setPath_in_schemaVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "path_in_schema", js.Array(value :_*))
      
      @scala.inline
      def setStatistics(value: js.Any): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_compressed_size(value: ^): Self = StObject.set(x, "total_compressed_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_compressed_sizeNull: Self = StObject.set(x, "total_compressed_size", null)
      
      @scala.inline
      def setTotal_uncompressed_size(value: ^): Self = StObject.set(x, "total_uncompressed_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_uncompressed_sizeNull: Self = StObject.set(x, "total_uncompressed_size", null)
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  @js.native
  trait Columns extends StObject {
    
    var columns: js.Any = js.native
    
    var num_rows: Double = js.native
    
    var sorting_columns: Null | js.Array[String] = js.native
    
    var total_byte_size: Double = js.native
  }
  object Columns {
    
    @scala.inline
    def apply(columns: js.Any, num_rows: Double, total_byte_size: Double): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], total_byte_size = total_byte_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    @scala.inline
    implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_rows(value: Double): Self = StObject.set(x, "num_rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorting_columns(value: js.Array[String]): Self = StObject.set(x, "sorting_columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorting_columnsNull: Self = StObject.set(x, "sorting_columns", null)
      
      @scala.inline
      def setSorting_columnsVarargs(value: String*): Self = StObject.set(x, "sorting_columns", js.Array(value :_*))
      
      @scala.inline
      def setTotal_byte_size(value: Double): Self = StObject.set(x, "total_byte_size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Count extends StObject {
    
    var count: Double = js.native
    
    var dlevels: js.Array[Double] = js.native
    
    var rlevels: js.Array[Double] = js.native
    
    var values: js.Array[Buffer] = js.native
  }
  object Count {
    
    @scala.inline
    def apply(count: Double, dlevels: js.Array[Double], rlevels: js.Array[Double], values: js.Array[Buffer]): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dlevels = dlevels.asInstanceOf[js.Any], rlevels = rlevels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlevels(value: js.Array[Double]): Self = StObject.set(x, "dlevels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlevelsVarargs(value: Double*): Self = StObject.set(x, "dlevels", js.Array(value :_*))
      
      @scala.inline
      def setRlevels(value: js.Array[Double]): Self = StObject.set(x, "rlevels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRlevelsVarargs(value: Double*): Self = StObject.set(x, "rlevels", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[Buffer]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Buffer*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
    
    var value: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String, value: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
