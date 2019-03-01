package typings
package mqttLib.typesLibStoreDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStoreOptions extends js.Object {
  /**
    * true, clear _inflights at close
    */
  var clean: js.UndefOr[scala.Boolean] = js.undefined
}

object IStoreOptions {
  @scala.inline
  def apply(clean: js.UndefOr[scala.Boolean] = js.undefined): IStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    __obj.asInstanceOf[IStoreOptions]
  }
}

