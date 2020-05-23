package typings.mongodb.mod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateManyOptions extends CommonOptions {
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object UpdateManyOptions {
  @scala.inline
  def apply(
    arrayFilters: js.Array[js.Object] = null,
    j: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    upsert: js.UndefOr[Boolean] = js.undefined,
    w: scala.Double | majority | String = null,
    wtimeout: js.UndefOr[scala.Double] = js.undefined
  ): UpdateManyOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFilters != null) __obj.updateDynamic("arrayFilters")(arrayFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateManyOptions]
  }
}

