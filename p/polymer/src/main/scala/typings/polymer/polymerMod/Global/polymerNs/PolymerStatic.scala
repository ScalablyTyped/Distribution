package typings.polymer.polymerMod.Global.polymerNs

import typings.polymer.Anon_Base
import typings.std.Event
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolymerStatic extends js.Object {
  var ArraySplice: typings.polymer.polymerMod.Global.polymerNs.ArraySplice = js.native
  var Base: typings.polymer.polymerMod.Global.polymerNs.Base = js.native
  /** @deprecated */
  var ImportStatus: typings.polymer.polymerMod.Global.polymerNs.ImportStatus = js.native
  var RenderStatus: typings.polymer.polymerMod.Global.polymerNs.RenderStatus = js.native
  var Settings: typings.polymer.polymerMod.Global.polymerNs.Settings = js.native
  var Templatizer: typings.polymer.polymerMod.Global.polymerNs.Templatizer = js.native
  @JSName("dom")
  var dom_Original: DomApiStatic = js.native
  def apply(prototype: Anon_Base): js.Any = js.native
  def apply(prototype: Base): js.Any = js.native
  def Class(prototype: Anon_Base): js.Any = js.native
  def Class(prototype: Base): js.Any = js.native
  def dom(obj: Base): DomApi = js.native
  def dom(obj: Event): EventApi = js.native
  def dom(obj: Node): DomApi = js.native
  def isInstance(element: String): Boolean = js.native
}

