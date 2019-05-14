package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsStringFalse extends js.Object {
  var asString: paperLib.paperLibNumbers.`false`
  var precision: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AsStringFalse {
  @scala.inline
  def apply(asString: paperLib.paperLibNumbers.`false`, precision: scala.Int | scala.Double = null): Anon_AsStringFalse = {
    val __obj = js.Dynamic.literal(asString = asString)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsStringFalse]
  }
}

