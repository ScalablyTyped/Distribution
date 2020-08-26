package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTagLocation extends Location {
  /**
    * Start tag attributes' location info
    */
  var attrs: AttributesLocation = js.native
}

object StartTagLocation {
  @scala.inline
  def apply(
    attrs: AttributesLocation,
    endCol: Double,
    endLine: Double,
    endOffset: Double,
    startCol: Double,
    startLine: Double,
    startOffset: Double
  ): StartTagLocation = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTagLocation]
  }
  @scala.inline
  implicit class StartTagLocationOps[Self <: StartTagLocation] (val x: Self) extends AnyVal {
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
    def setAttrs(value: AttributesLocation): Self = this.set("attrs", value.asInstanceOf[js.Any])
  }
  
}

