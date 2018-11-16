package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModelFullField[Field, Doc] extends js.Object {
  var default: js.UndefOr[js.Function0[Field]] = js.undefined
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* doc */ Doc, Field]] = js.undefined
  var transient: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: TypeOptions
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}

