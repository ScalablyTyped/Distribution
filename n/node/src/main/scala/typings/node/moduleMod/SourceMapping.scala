package typings.node.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapping extends js.Object {
  var generatedColumn: Double = js.native
  var generatedLine: Double = js.native
  var originalColumn: Double = js.native
  var originalLine: Double = js.native
  var originalSource: String = js.native
}

object SourceMapping {
  @scala.inline
  def apply(
    generatedColumn: Double,
    generatedLine: Double,
    originalColumn: Double,
    originalLine: Double,
    originalSource: String
  ): SourceMapping = {
    val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], originalSource = originalSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapping]
  }
  @scala.inline
  implicit class SourceMappingOps[Self <: SourceMapping] (val x: Self) extends AnyVal {
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
    def setGeneratedColumn(value: Double): Self = this.set("generatedColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneratedLine(value: Double): Self = this.set("generatedLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalColumn(value: Double): Self = this.set("originalColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalLine(value: Double): Self = this.set("originalLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalSource(value: String): Self = this.set("originalSource", value.asInstanceOf[js.Any])
  }
  
}

