package typings.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapCodeStatistics extends js.Object {
  var bytecode_and_metadata_size: Double
  var code_and_metadata_size: Double
  var external_script_source_size: Double
}

object HeapCodeStatistics {
  @scala.inline
  def apply(
    bytecode_and_metadata_size: Double,
    code_and_metadata_size: Double,
    external_script_source_size: Double
  ): HeapCodeStatistics = {
    val __obj = js.Dynamic.literal(bytecode_and_metadata_size = bytecode_and_metadata_size.asInstanceOf[js.Any], code_and_metadata_size = code_and_metadata_size.asInstanceOf[js.Any], external_script_source_size = external_script_source_size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeapCodeStatistics]
  }
}

