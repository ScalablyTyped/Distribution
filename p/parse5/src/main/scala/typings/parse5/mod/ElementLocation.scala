package typings.parse5.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ElementLocationMutableBuilder[Self <: ElementLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTag(value: Location): Self = StObject.set(x, "endTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTag(value: StartTagLocation): Self = StObject.set(x, "startTag", value.asInstanceOf[js.Any])
  }
}
