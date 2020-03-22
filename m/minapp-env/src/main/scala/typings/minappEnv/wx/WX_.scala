package typings.minappEnv.wx

import typings.minappEnv.AnonCallFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WX_ extends js.Object {
  var cloud: AnonCallFunction
}

object WX_ {
  @scala.inline
  def apply(cloud: AnonCallFunction): WX_ = {
    val __obj = js.Dynamic.literal(cloud = cloud.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WX_]
  }
}

