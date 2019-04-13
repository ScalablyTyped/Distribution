package typings
package nsDashApiLib.nsDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var password: java.lang.String
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var username: java.lang.String
}

object Configuration {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String, timeout: scala.Int | scala.Double = null): Configuration = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

