package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPosition extends js.Object {
  /**
    * column (the first character in a line is between column 1 and column 2)
    */
  val column: scala.Double
  /**
    * line number (starts at 1)
    */
  val lineNumber: scala.Double
}

