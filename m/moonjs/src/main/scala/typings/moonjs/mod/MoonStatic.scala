package typings.moonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoonStatic extends MoonConstructor {
  
  def compile(template: String): Unit = js.native
  
  def component[Props /* <: String */, Data, Methods](name: String, options: ComponentOptions[Props, Data, Methods]): MoonConstructor = js.native
  
  var config: MoonConfig = js.native
  
  def directive(name: String, action: js.Function2[/* el */ js.Any, /* val */ js.Any, Unit]): Unit = js.native
  
  def nextTick(callback: js.Function0[Unit]): Unit = js.native
  
  def use(plugin: js.Object): Unit = js.native
}
