package typings
package monacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineEnding extends js.Object {
  var lineEnding: java.lang.String
  var preserveBOM: scala.Boolean
}

object Anon_LineEnding {
  @scala.inline
  def apply(lineEnding: java.lang.String, preserveBOM: scala.Boolean): Anon_LineEnding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lineEnding")(lineEnding)
    __obj.updateDynamic("preserveBOM")(preserveBOM)
    __obj.asInstanceOf[Anon_LineEnding]
  }
}

