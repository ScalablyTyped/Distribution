package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * One-based column index of the last character
    */
  var endCol: scala.Double
  /**
    * One-based line index of the last character
    */
  var endLine: scala.Double
  /**
    * Zero-based last character index
    */
  var endOffset: scala.Double
  /**
    * One-based column index of the first character
    */
  var startCol: scala.Double
  /**
    * One-based line index of the first character
    */
  var startLine: scala.Double
  /**
    * Zero-based first character index
    */
  var startOffset: scala.Double
}

object Location {
  @scala.inline
  def apply(
    endCol: scala.Double,
    endLine: scala.Double,
    endOffset: scala.Double,
    startCol: scala.Double,
    startLine: scala.Double,
    startOffset: scala.Double
  ): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endCol")(endCol)
    __obj.updateDynamic("endLine")(endLine)
    __obj.updateDynamic("endOffset")(endOffset)
    __obj.updateDynamic("startCol")(startCol)
    __obj.updateDynamic("startLine")(startLine)
    __obj.updateDynamic("startOffset")(startOffset)
    __obj.asInstanceOf[Location]
  }
}

