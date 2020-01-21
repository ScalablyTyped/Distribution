package typings.nodeForge.mod.tls

import typings.nodeForge.mod.tls.Alert.Description
import typings.nodeForge.mod.tls.Alert.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alert_ extends js.Object {
  var description: Description
  var level: Level
}

object Alert_ {
  @scala.inline
  def apply(description: Description, level: Level): Alert_ = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Alert_]
  }
}

