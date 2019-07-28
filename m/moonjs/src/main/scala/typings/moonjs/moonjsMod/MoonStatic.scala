package typings.moonjs.moonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoonStatic extends MoonConstructor {
  var config: MoonConfig = js.native
  def compile(template: String): Unit = js.native
  def component[Props /* <: String */, Data, Methods](name: String, options: ComponentOptions[Props, Data, Methods]): MoonConstructor = js.native
  def directive(name: String, action: js.Function2[/* el */ js.Any, /* val */ js.Any, Unit]): Unit = js.native
  def nextTick(callback: js.Function0[Unit]): Unit = js.native
  def use(plugin: js.Object): Unit = js.native
}

