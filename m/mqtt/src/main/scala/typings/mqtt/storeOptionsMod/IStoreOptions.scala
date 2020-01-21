package typings.mqtt.storeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStoreOptions extends js.Object {
  /**
    * true, clear _inflights at close
    */
  var clean: js.UndefOr[Boolean] = js.undefined
}

object IStoreOptions {
  @scala.inline
  def apply(clean: js.UndefOr[Boolean] = js.undefined): IStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStoreOptions]
  }
}

