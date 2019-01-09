package typings
package polymerDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Polymer")
@js.native
object Polymer extends js.Object {
  var Base: js.Any = js.native
  @JSName("dom")
  var dom_Original: polymerDashTsLib.polymerNs.dom = js.native
  def apply(prototype: polymerDashTsLib.polymerNs.Element): stdLib.FunctionConstructor = js.native
  def Class(prototype: polymerDashTsLib.polymerNs.Element): js.Function = js.native
  def appendChild(node: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def dom(node: polymerDashTsLib.polymerNs.Base): stdLib.HTMLElement = js.native
  def dom(node: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def insertBefore(node: stdLib.HTMLElement, beforeNode: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def removeChild(node: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def updateStyles(): scala.Unit = js.native
}

