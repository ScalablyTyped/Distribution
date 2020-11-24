package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementLocation extends StartTagLocation {
  
  /**
    * Element's end tag location info.
    */
  var endTag: Location = js.native
  
  /**
    * Element's start tag location info.
    */
  var startTag: StartTagLocation = js.native
}
object ElementLocation {
  
  @scala.inline
  def apply(
    attrs: AttributesLocation,
    endCol: Double,
    endLine: Double,
    endOffset: Double,
    endTag: Location,
    startCol: Double,
    startLine: Double,
    startOffset: Double,
    startTag: StartTagLocation
  ): ElementLocation = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], endTag = endTag.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTag = startTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementLocation]
  }
  
  @scala.inline
  implicit class ElementLocationOps[Self <: ElementLocation] (val x: Self) extends AnyVal {
    
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
    def setEndTag(value: Location): Self = this.set("endTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTag(value: StartTagLocation): Self = this.set("startTag", value.asInstanceOf[js.Any])
  }
}
