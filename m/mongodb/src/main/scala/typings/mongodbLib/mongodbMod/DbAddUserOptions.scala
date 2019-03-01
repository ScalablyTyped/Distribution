package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbAddUserOptions extends CommonOptions {
  var customData: js.UndefOr[js.Object] = js.undefined
  var roles: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object DbAddUserOptions {
  @scala.inline
  def apply(
    customData: js.Object = null,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    roles: js.Array[js.Object] = null,
    session: ClientSession = null,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): DbAddUserOptions = {
    val __obj = js.Dynamic.literal()
    if (customData != null) __obj.updateDynamic("customData")(customData)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (session != null) __obj.updateDynamic("session")(session)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbAddUserOptions]
  }
}

