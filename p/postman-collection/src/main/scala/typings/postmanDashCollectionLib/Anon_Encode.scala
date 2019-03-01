package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encode extends js.Object {
  var encode: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDisabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Encode {
  @scala.inline
  def apply(
    encode: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDisabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Encode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode)
    if (!js.isUndefined(ignoreDisabled)) __obj.updateDynamic("ignoreDisabled")(ignoreDisabled)
    __obj.asInstanceOf[Anon_Encode]
  }
}

