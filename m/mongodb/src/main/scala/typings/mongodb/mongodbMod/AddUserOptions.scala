package typings.mongodb.mongodbMod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddUserOptions extends CommonOptions {
  var customData: js.UndefOr[js.Object] = js.undefined
  var fsync: Boolean
  var roles: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object AddUserOptions {
  @scala.inline
  def apply(
    fsync: Boolean,
    customData: js.Object = null,
    j: js.UndefOr[Boolean] = js.undefined,
    roles: js.Array[js.Object] = null,
    session: ClientSession = null,
    w: scala.Double | majority | String = null,
    wtimeout: Int | scala.Double = null
  ): AddUserOptions = {
    val __obj = js.Dynamic.literal(fsync = fsync)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (session != null) __obj.updateDynamic("session")(session)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddUserOptions]
  }
}

