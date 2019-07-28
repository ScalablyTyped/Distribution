package typings.parse5.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTagLocation extends Location {
  /**
    * Start tag attributes' location info
    */
  var attrs: AttributesLocation
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
    val __obj = js.Dynamic.literal(attrs = attrs, endCol = endCol, endLine = endLine, endOffset = endOffset, startCol = startCol, startLine = startLine, startOffset = startOffset)
  
    __obj.asInstanceOf[StartTagLocation]
  }
}

