package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoClientCommonOption extends js.Object {
  /** Do not make the db an event listener to the original connection. */
  var noListener: js.UndefOr[Boolean] = js.undefined
  /** Control if you want to return a cached instance or have a new one created */
  var returnNonCachedInstance: js.UndefOr[Boolean] = js.undefined
}

object MongoClientCommonOption {
  @scala.inline
  def apply(
    noListener: js.UndefOr[Boolean] = js.undefined,
    returnNonCachedInstance: js.UndefOr[Boolean] = js.undefined
  ): MongoClientCommonOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noListener)) __obj.updateDynamic("noListener")(noListener.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnNonCachedInstance)) __obj.updateDynamic("returnNonCachedInstance")(returnNonCachedInstance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoClientCommonOption]
  }
}

