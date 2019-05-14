package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsStringPrecision extends js.Object {
  var asString: js.UndefOr[paperLib.paperLibNumbers.`true`] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AsStringPrecision {
  @scala.inline
  def apply(asString: paperLib.paperLibNumbers.`true` = null, precision: scala.Int | scala.Double = null): Anon_AsStringPrecision = {
    val __obj = js.Dynamic.literal()
    if (asString != null) __obj.updateDynamic("asString")(asString)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsStringPrecision]
  }
}

