package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolymerStatic extends js.Object {
  var ArraySplice: ArraySplice = js.native
  var Base: Base = js.native
  /** @deprecated */
  var ImportStatus: ImportStatus = js.native
  var RenderStatus: RenderStatus = js.native
  var Settings: Settings = js.native
  var Templatizer: Templatizer = js.native
  @JSName("dom")
  var dom_Original: DomApiStatic = js.native
  def apply(prototype: polymerLib.Anon_Base): js.Any = js.native
  def apply(prototype: Base): js.Any = js.native
  def Class(prototype: polymerLib.Anon_Base): js.Any = js.native
  def Class(prototype: Base): js.Any = js.native
  def dom(obj: Base): DomApi = js.native
  def dom(obj: stdLib.Event): EventApi = js.native
  def dom(obj: stdLib.Node): DomApi = js.native
  def isInstance(element: java.lang.String): scala.Boolean = js.native
}

