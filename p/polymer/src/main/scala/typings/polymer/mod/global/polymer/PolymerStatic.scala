package typings.polymer.mod.global.polymer

import typings.polymer.anon.Instantiable
import typings.std.CustomElementConstructor
import typings.std.Event
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolymerStatic extends js.Object {
  
  def apply(prototype: Instantiable): CustomElementConstructor = js.native
  def apply(prototype: Base): CustomElementConstructor = js.native
  
  var ArraySplice: typings.polymer.mod.global.polymer.ArraySplice = js.native
  
  var Base: typings.polymer.mod.global.polymer.Base = js.native
  
  def Class(prototype: Instantiable): CustomElementConstructor = js.native
  def Class(prototype: Base): CustomElementConstructor = js.native
  
  /** @deprecated */
  var ImportStatus: typings.polymer.mod.global.polymer.ImportStatus = js.native
  
  var RenderStatus: typings.polymer.mod.global.polymer.RenderStatus = js.native
  
  var Settings: typings.polymer.mod.global.polymer.Settings = js.native
  
  var Templatizer: typings.polymer.mod.global.polymer.Templatizer = js.native
  
  def dom(obj: Base): DomApi = js.native
  def dom(obj: Event): EventApi = js.native
  def dom(obj: Node): DomApi = js.native
  @JSName("dom")
  var dom_Original: DomApiStatic = js.native
  
  def isInstance(element: String): Boolean = js.native
}
