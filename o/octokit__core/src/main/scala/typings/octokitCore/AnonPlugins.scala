package typings.octokitCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlugins extends js.Object {
  var plugins: js.Array[_]
}

object AnonPlugins {
  @scala.inline
  def apply(plugins: js.Array[_]): AnonPlugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlugins]
  }
}

