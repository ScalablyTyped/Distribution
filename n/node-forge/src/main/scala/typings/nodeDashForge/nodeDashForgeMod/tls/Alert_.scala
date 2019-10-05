package typings.nodeDashForge.nodeDashForgeMod.tls

import typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Description
import typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Alert")
trait Alert_ extends js.Object {
  var description: Description
  var level: Level
}

object Alert_ {
  @scala.inline
  def apply(description: Description, level: Level): Alert_ = {
    val __obj = js.Dynamic.literal(description = description, level = level)
  
    __obj.asInstanceOf[Alert_]
  }
}

