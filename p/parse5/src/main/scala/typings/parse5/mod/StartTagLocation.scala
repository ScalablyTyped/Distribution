package typings.parse5.mod

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
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTagLocation]
  }
}

