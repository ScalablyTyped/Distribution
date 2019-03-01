package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddUserOptions extends CommonOptions {
  var customData: js.UndefOr[js.Object] = js.undefined
  var fsync: scala.Boolean
  var roles: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object AddUserOptions {
  @scala.inline
  def apply(
    fsync: scala.Boolean,
    customData: js.Object = null,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    roles: js.Array[js.Object] = null,
    session: ClientSession = null,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): AddUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fsync")(fsync)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (session != null) __obj.updateDynamic("session")(session)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddUserOptions]
  }
}

