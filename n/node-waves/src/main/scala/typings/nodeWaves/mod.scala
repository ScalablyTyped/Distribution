package typings.nodeWaves

import typings.nodeWaves.anon.Delay
import typings.nodeWaves.anon.Position
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-waves", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def attach(elements: ElementSelector): Unit = js.native
  def attach(elements: ElementSelector, classes: String): Unit = js.native
  def attach(elements: ElementSelector, classes: js.Array[String]): Unit = js.native
  def calm(elements: ElementSelector): Unit = js.native
  def init(): Unit = js.native
  def init(config: Delay): Unit = js.native
  def ripple(elements: ElementSelector): Unit = js.native
  def ripple(elements: ElementSelector, option: Position): Unit = js.native
  type ElementSelector = String | HTMLElement | js.Array[HTMLElement]
}

