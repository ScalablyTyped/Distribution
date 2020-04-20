package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * One-based column index of the last character
    */
  var endCol: Double
  /**
    * One-based line index of the last character
    */
  var endLine: Double
  /**
    * Zero-based last character index
    */
  var endOffset: Double
  /**
    * One-based column index of the first character
    */
  var startCol: Double
  /**
    * One-based line index of the first character
    */
  var startLine: Double
  /**
    * Zero-based first character index
    */
  var startOffset: Double
}

object Location {
  @scala.inline
  def apply(
    endCol: Double,
    endLine: Double,
    endOffset: Double,
    startCol: Double,
    startLine: Double,
    startOffset: Double
  ): Location = {
    val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

