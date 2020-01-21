package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementLocation extends StartTagLocation {
  /**
    * Element's end tag location info.
    */
  var endTag: Location
  /**
    * Element's start tag location info.
    */
  var startTag: StartTagLocation
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
}

