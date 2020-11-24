package typings.parquetjs.anon

import typings.nodeInt64.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Codec extends js.Object {
  
  var codec: Double | Null = js.native
  
  var data_page_offset: ^  | Null = js.native
  
  var dictionary_page_offset: ^  | Null = js.native
  
  var encoding_stats: js.Any = js.native
  
  var encodings: js.Array[Double] | Null = js.native
  
  var index_page_offset: ^  | Null = js.native
  
  var key_value_metadata: js.Array[Key] | Null = js.native
  
  var num_values: ^  | Null = js.native
  
  var path_in_schema: (js.Array[js.Array[String] | String]) | Null = js.native
  
  var statistics: js.Any = js.native
  
  var total_compressed_size: ^  | Null = js.native
  
  var total_uncompressed_size: ^  | Null = js.native
  
  var `type`: Double | Null = js.native
}
object Codec {
  
  @scala.inline
  def apply(encoding_stats: js.Any, statistics: js.Any): Codec = {
    val __obj = js.Dynamic.literal(encoding_stats = encoding_stats.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
  
  @scala.inline
  implicit class CodecOps[Self <: Codec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncoding_stats(value: js.Any): Self = this.set("encoding_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistics(value: js.Any): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec(value: Double): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecNull: Self = this.set("codec", null)
    
    @scala.inline
    def setData_page_offset(value: ^): Self = this.set("data_page_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_page_offsetNull: Self = this.set("data_page_offset", null)
    
    @scala.inline
    def setDictionary_page_offset(value: ^): Self = this.set("dictionary_page_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionary_page_offsetNull: Self = this.set("dictionary_page_offset", null)
    
    @scala.inline
    def setEncodingsVarargs(value: Double*): Self = this.set("encodings", js.Array(value :_*))
    
    @scala.inline
    def setEncodings(value: js.Array[Double]): Self = this.set("encodings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingsNull: Self = this.set("encodings", null)
    
    @scala.inline
    def setIndex_page_offset(value: ^): Self = this.set("index_page_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex_page_offsetNull: Self = this.set("index_page_offset", null)
    
    @scala.inline
    def setKey_value_metadataVarargs(value: Key*): Self = this.set("key_value_metadata", js.Array(value :_*))
    
    @scala.inline
    def setKey_value_metadata(value: js.Array[Key]): Self = this.set("key_value_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_value_metadataNull: Self = this.set("key_value_metadata", null)
    
    @scala.inline
    def setNum_values(value: ^): Self = this.set("num_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_valuesNull: Self = this.set("num_values", null)
    
    @scala.inline
    def setPath_in_schemaVarargs(value: (js.Array[String] | String)*): Self = this.set("path_in_schema", js.Array(value :_*))
    
    @scala.inline
    def setPath_in_schema(value: js.Array[js.Array[String] | String]): Self = this.set("path_in_schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath_in_schemaNull: Self = this.set("path_in_schema", null)
    
    @scala.inline
    def setTotal_compressed_size(value: ^): Self = this.set("total_compressed_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_compressed_sizeNull: Self = this.set("total_compressed_size", null)
    
    @scala.inline
    def setTotal_uncompressed_size(value: ^): Self = this.set("total_uncompressed_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_uncompressed_sizeNull: Self = this.set("total_uncompressed_size", null)
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
