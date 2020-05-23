package typings.parquetjs.anon

import typings.nodeInt64.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codec extends js.Object {
  var codec: Double | Null
  var data_page_offset: ^  | Null
  var dictionary_page_offset: ^  | Null
  var encoding_stats: js.Any
  var encodings: js.Array[Double] | Null
  var index_page_offset: ^  | Null
  var key_value_metadata: js.Array[Key] | Null
  var num_values: ^  | Null
  var path_in_schema: (js.Array[js.Array[String] | String]) | Null
  var statistics: js.Any
  var total_compressed_size: ^  | Null
  var total_uncompressed_size: ^  | Null
  var `type`: Double | Null
}

object Codec {
  @scala.inline
  def apply(
    encoding_stats: js.Any,
    statistics: js.Any,
    codec: Double = null.asInstanceOf[Double],
    data_page_offset: ^ = null,
    dictionary_page_offset: ^ = null,
    encodings: js.Array[Double] = null,
    index_page_offset: ^ = null,
    key_value_metadata: js.Array[Key] = null,
    num_values: ^ = null,
    path_in_schema: js.Array[js.Array[String] | String] = null,
    total_compressed_size: ^ = null,
    total_uncompressed_size: ^ = null,
    `type`: Double = null.asInstanceOf[Double]
  ): Codec = {
    val __obj = js.Dynamic.literal(encoding_stats = encoding_stats.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], data_page_offset = data_page_offset.asInstanceOf[js.Any], dictionary_page_offset = dictionary_page_offset.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], index_page_offset = index_page_offset.asInstanceOf[js.Any], key_value_metadata = key_value_metadata.asInstanceOf[js.Any], num_values = num_values.asInstanceOf[js.Any], path_in_schema = path_in_schema.asInstanceOf[js.Any], total_compressed_size = total_compressed_size.asInstanceOf[js.Any], total_uncompressed_size = total_uncompressed_size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
}

