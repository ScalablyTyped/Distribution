package typings
package parquetjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codec extends js.Object {
  var codec: scala.Double | scala.Null
  var data_page_offset: nodeDashInt64Lib.nodeDashInt64Mod.^  | scala.Null
  var dictionary_page_offset: nodeDashInt64Lib.nodeDashInt64Mod.^  | scala.Null
  var encoding_stats: js.Any
  var encodings: js.Array[scala.Double] | scala.Null
  var index_page_offset: nodeDashInt64Lib.nodeDashInt64Mod.^  | scala.Null
  var key_value_metadata: js.Array[Anon_Key] | scala.Null
  var num_values: nodeDashInt64Lib.nodeDashInt64Mod.^  | scala.Null
  var path_in_schema: (js.Array[js.Array[java.lang.String] | java.lang.String]) | scala.Null
  var statistics: js.Any
  var total_compressed_size: nodeDashInt64Lib.nodeDashInt64Mod.^  | scala.Null
  var total_uncompressed_size: nodeDashInt64Lib.nodeDashInt64Mod.^  | scala.Null
  var `type`: scala.Double | scala.Null
}

object Anon_Codec {
  @scala.inline
  def apply(
    encoding_stats: js.Any,
    statistics: js.Any,
    codec: scala.Int | scala.Double = null,
    data_page_offset: nodeDashInt64Lib.nodeDashInt64Mod.^ = null,
    dictionary_page_offset: nodeDashInt64Lib.nodeDashInt64Mod.^ = null,
    encodings: js.Array[scala.Double] = null,
    index_page_offset: nodeDashInt64Lib.nodeDashInt64Mod.^ = null,
    key_value_metadata: js.Array[Anon_Key] = null,
    num_values: nodeDashInt64Lib.nodeDashInt64Mod.^ = null,
    path_in_schema: js.Array[js.Array[java.lang.String] | java.lang.String] = null,
    total_compressed_size: nodeDashInt64Lib.nodeDashInt64Mod.^ = null,
    total_uncompressed_size: nodeDashInt64Lib.nodeDashInt64Mod.^ = null,
    `type`: scala.Int | scala.Double = null
  ): Anon_Codec = {
    val __obj = js.Dynamic.literal(encoding_stats = encoding_stats, statistics = statistics)
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (data_page_offset != null) __obj.updateDynamic("data_page_offset")(data_page_offset)
    if (dictionary_page_offset != null) __obj.updateDynamic("dictionary_page_offset")(dictionary_page_offset)
    if (encodings != null) __obj.updateDynamic("encodings")(encodings)
    if (index_page_offset != null) __obj.updateDynamic("index_page_offset")(index_page_offset)
    if (key_value_metadata != null) __obj.updateDynamic("key_value_metadata")(key_value_metadata)
    if (num_values != null) __obj.updateDynamic("num_values")(num_values)
    if (path_in_schema != null) __obj.updateDynamic("path_in_schema")(path_in_schema)
    if (total_compressed_size != null) __obj.updateDynamic("total_compressed_size")(total_compressed_size)
    if (total_uncompressed_size != null) __obj.updateDynamic("total_uncompressed_size")(total_uncompressed_size)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Codec]
  }
}

