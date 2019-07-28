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
    val __obj = js.Dynamic.literal(dialVer = dialVer, name = name, options = options, state = state, xmlns = xmlns)
  
    __obj.asInstanceOf[AppInfo]
  }
}

