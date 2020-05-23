package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appid extends js.Object {
  var app_id: Double
  var setting: Boolean
}

object Appid {
  @scala.inline
  def apply(app_id: Double, setting: Boolean): Appid = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
}

