package typings
package parse5Lib.parse5Mod

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
    endCol: scala.Double,
    endLine: scala.Double,
    endOffset: scala.Double,
    endTag: Location,
    startCol: scala.Double,
    startLine: scala.Double,
    startOffset: scala.Double,
    startTag: StartTagLocation
  ): ElementLocation = {
    val __obj = js.Dynamic.literal(attrs = attrs, endCol = endCol, endLine = endLine, endOffset = endOffset, endTag = endTag, startCol = startCol, startLine = startLine, startOffset = startOffset, startTag = startTag)
  
    __obj.asInstanceOf[ElementLocation]
  }
}

