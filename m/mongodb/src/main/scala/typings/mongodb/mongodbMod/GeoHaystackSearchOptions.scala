package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoHaystackSearchOptions extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var maxDistance: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
  var search: js.UndefOr[js.Object] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object GeoHaystackSearchOptions {
  @scala.inline
  def apply(
    limit: Int | scala.Double = null,
    maxDistance: Int | scala.Double = null,
    readPreference: ReadPreference | String = null,
    search: js.Object = null,
    session: ClientSession = null
  ): GeoHaystackSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maxDistance != null) __obj.updateDynamic("maxDistance")(maxDistance.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[GeoHaystackSearchOptions]
  }
}

