package typings.parse5.parse5Mod

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
    val __obj = js.Dynamic.literal(attrs = attrs, endCol = endCol, endLine = endLine, endOffset = endOffset, endTag = endTag, startCol = startCol, startLine = startLine, startOffset = startOffset, startTag = startTag)
  
    __obj.asInstanceOf[ElementLocation]
  }
}

