package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsString extends js.Object {
  var asString: js.UndefOr[scala.Boolean] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AsString {
  @scala.inline
  def apply(asString: js.UndefOr[scala.Boolean] = js.undefined, precision: scala.Int | scala.Double = null): Anon_AsString = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsString]
  }
}

