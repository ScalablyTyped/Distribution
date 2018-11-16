package typings
package moonjsLib.moonjsMod.MoonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoonStatic extends MoonConstructor {
  var config: MoonConfig = js.native
  def compile(template: java.lang.String): scala.Unit = js.native
  def component[Props /* <: java.lang.String */, Data, Methods](name: java.lang.String, options: ComponentOptions[Props, Data, Methods]): MoonConstructor = js.native
  def directive(name: java.lang.String, action: js.Function2[/* el */ js.Any, /* val */ js.Any, scala.Unit]): scala.Unit = js.native
  def nextTick(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def use(plugin: js.Object): scala.Unit = js.native
}

