package typings.monacoDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineEnding extends js.Object {
  var lineEnding: String
  var preserveBOM: Boolean
}

object Anon_LineEnding {
  @scala.inline
  def apply(lineEnding: String, preserveBOM: Boolean): Anon_LineEnding = {
    val __obj = js.Dynamic.literal(lineEnding = lineEnding.asInstanceOf[js.Any], preserveBOM = preserveBOM.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LineEnding]
  }
}

