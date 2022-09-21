package typings.nightwatch.mod

import typings.nightwatch.anon.ComponentTyp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchComponentTestingCommands extends StObject {
  
  def importScript(scriptPath: String, options: ComponentTyp, callback: js.Function0[Unit]): this.type = js.native
  
  def launchComponentRenderer(): this.type = js.native
  
  def mountComponent(componentPath: String): Element = js.native
  def mountComponent(componentPath: String, props: String): Element = js.native
  def mountComponent(componentPath: String, props: String, callback: js.Function0[Unit]): Element = js.native
  def mountComponent(componentPath: String, props: js.Function0[Unit]): Element = js.native
  def mountComponent(componentPath: String, props: js.Function0[Unit], callback: js.Function0[Unit]): Element = js.native
  def mountComponent(componentPath: String, props: Unit, callback: js.Function0[Unit]): Element = js.native
  
  def mountReactComponent(componentPath: String): Element = js.native
  def mountReactComponent(componentPath: String, props: String): Element = js.native
  def mountReactComponent(componentPath: String, props: String, callback: js.Function0[Unit]): Element = js.native
  def mountReactComponent(componentPath: String, props: js.Function0[Unit]): Element = js.native
  def mountReactComponent(componentPath: String, props: js.Function0[Unit], callback: js.Function0[Unit]): Element = js.native
  def mountReactComponent(componentPath: String, props: Unit, callback: js.Function0[Unit]): Element = js.native
  
  def mountVueComponent(componentPath: String): Element = js.native
  def mountVueComponent(componentPath: String, options: Any): Element = js.native
  def mountVueComponent(componentPath: String, options: Any, callback: js.Function0[Unit]): Element = js.native
  def mountVueComponent(componentPath: String, options: Unit, callback: js.Function0[Unit]): Element = js.native
}
