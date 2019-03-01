package typings
package meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifierOptions extends js.Object {
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
}

object ModifierOptions {
  @scala.inline
  def apply(multi: js.UndefOr[scala.Boolean] = js.undefined, upsert: js.UndefOr[scala.Boolean] = js.undefined): ModifierOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[ModifierOptions]
  }
}

