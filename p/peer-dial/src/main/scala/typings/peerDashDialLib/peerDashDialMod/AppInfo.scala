package typings
package peerDashDialLib.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppInfo extends js.Object {
  var dialVer: java.lang.String
  var name: java.lang.String
  var options: AppInfoOptions
  var state: java.lang.String
  var xmlns: java.lang.String
}

object AppInfo {
  @scala.inline
  def apply(
    dialVer: java.lang.String,
    name: java.lang.String,
    options: AppInfoOptions,
    state: java.lang.String,
    xmlns: java.lang.String
  ): AppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dialVer")(dialVer)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[AppInfo]
  }
}

