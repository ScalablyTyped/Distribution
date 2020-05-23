package typings.mongodb.mod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends WriteConcern {
  var session: js.UndefOr[ClientSession] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    j: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    w: scala.Double | majority | String = null,
    wtimeout: js.UndefOr[scala.Double] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

