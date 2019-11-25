package typings.peerDashDial.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppInfo extends js.Object {
  var dialVer: String
  var name: String
  var options: AppInfoOptions
  var state: String
  var xmlns: String
}

object AppInfo {
  @scala.inline
  def apply(dialVer: String, name: String, options: AppInfoOptions, state: String, xmlns: String): AppInfo = {
    val __obj = js.Dynamic.literal(dialVer = dialVer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], xmlns = xmlns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppInfo]
  }
}

