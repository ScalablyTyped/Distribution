package typings.polymerDashTs

import typings.polymerDashTs.polymerNs.Base
import typings.polymerDashTs.polymerNs.Element
import typings.polymerDashTs.polymerNs.dom
import typings.std.FunctionConstructor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Polymer")
@js.native
object Polymer extends js.Object {
  var Base: js.Any = js.native
  @JSName("dom")
  var dom_Original: dom = js.native
  def apply(prototype: Element): FunctionConstructor = js.native
  def Class(prototype: Element): js.Function = js.native
  def appendChild(node: HTMLElement): HTMLElement = js.native
  def dom(node: Base): HTMLElement = js.native
  def dom(node: HTMLElement): HTMLElement = js.native
  def insertBefore(node: HTMLElement, beforeNode: HTMLElement): HTMLElement = js.native
  def removeChild(node: HTMLElement): HTMLElement = js.native
  def updateStyles(): Unit = js.native
}

