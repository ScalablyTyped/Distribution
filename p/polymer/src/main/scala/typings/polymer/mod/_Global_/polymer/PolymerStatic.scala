package typings.polymer.mod._Global_.polymer

import typings.polymer.AnonInstantiable
import typings.std.CustomElementConstructor
import typings.std.Event_
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolymerStatic extends js.Object {
  var ArraySplice: typings.polymer.mod._Global_.polymer.ArraySplice = js.native
  var Base: typings.polymer.mod._Global_.polymer.Base = js.native
  /** @deprecated */
  var ImportStatus: typings.polymer.mod._Global_.polymer.ImportStatus = js.native
  var RenderStatus: typings.polymer.mod._Global_.polymer.RenderStatus = js.native
  var Settings: typings.polymer.mod._Global_.polymer.Settings = js.native
  var Templatizer: typings.polymer.mod._Global_.polymer.Templatizer = js.native
  @JSName("dom")
  var dom_Original: DomApiStatic = js.native
  def apply(prototype: AnonInstantiable): CustomElementConstructor = js.native
  def apply(prototype: Base): CustomElementConstructor = js.native
  def Class(prototype: AnonInstantiable): CustomElementConstructor = js.native
  def Class(prototype: Base): CustomElementConstructor = js.native
  def dom(obj: Base): DomApi = js.native
  def dom(obj: Event_): EventApi = js.native
  def dom(obj: Node): DomApi = js.native
  def isInstance(element: String): Boolean = js.native
}

