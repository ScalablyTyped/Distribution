package typings.octokitCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins extends js.Object {
  var plugins: js.Array[_]
}

object Plugins {
  @scala.inline
  def apply(plugins: js.Array[_]): Plugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
}

