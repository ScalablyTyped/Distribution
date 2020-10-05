package typings.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeapCodeStatistics extends js.Object {
  var bytecode_and_metadata_size: Double = js.native
  var code_and_metadata_size: Double = js.native
  var external_script_source_size: Double = js.native
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
  @scala.inline
  implicit class HeapCodeStatisticsOps[Self <: HeapCodeStatistics] (val x: Self) extends AnyVal {
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
    def setBytecode_and_metadata_size(value: Double): Self = this.set("bytecode_and_metadata_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode_and_metadata_size(value: Double): Self = this.set("code_and_metadata_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal_script_source_size(value: Double): Self = this.set("external_script_source_size", value.asInstanceOf[js.Any])
  }
  
}

