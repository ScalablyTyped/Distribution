package typings
package parse5Lib.parse5Mod

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
    endCol: scala.Double,
    endLine: scala.Double,
    endOffset: scala.Double,
    startCol: scala.Double,
    startLine: scala.Double,
    startOffset: scala.Double
  ): StartTagLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attrs")(attrs)
    __obj.updateDynamic("endCol")(endCol)
    __obj.updateDynamic("endLine")(endLine)
    __obj.updateDynamic("endOffset")(endOffset)
    __obj.updateDynamic("startCol")(startCol)
    __obj.updateDynamic("startLine")(startLine)
    __obj.updateDynamic("startOffset")(startOffset)
    __obj.asInstanceOf[StartTagLocation]
  }
}

