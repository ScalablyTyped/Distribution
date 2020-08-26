package typings.ol

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/dom", JSImport.Namespace)
@js.native
object domMod extends js.Object {
  def createCanvasContext2D(): CanvasRenderingContext2D = js.native
  def createCanvasContext2D(
    opt_width: js.UndefOr[scala.Nothing],
    opt_height: js.UndefOr[scala.Nothing],
    opt_canvasPool: js.Array[HTMLCanvasElement]
  ): CanvasRenderingContext2D = js.native
  def createCanvasContext2D(opt_width: js.UndefOr[scala.Nothing], opt_height: Double): CanvasRenderingContext2D = js.native
  def createCanvasContext2D(
    opt_width: js.UndefOr[scala.Nothing],
    opt_height: Double,
    opt_canvasPool: js.Array[HTMLCanvasElement]
  ): CanvasRenderingContext2D = js.native
  def createCanvasContext2D(opt_width: Double): CanvasRenderingContext2D = js.native
  def createCanvasContext2D(
    opt_width: Double,
    opt_height: js.UndefOr[scala.Nothing],
    opt_canvasPool: js.Array[HTMLCanvasElement]
  ): CanvasRenderingContext2D = js.native
  def createCanvasContext2D(opt_width: Double, opt_height: Double): CanvasRenderingContext2D = js.native
  def createCanvasContext2D(opt_width: Double, opt_height: Double, opt_canvasPool: js.Array[HTMLCanvasElement]): CanvasRenderingContext2D = js.native
  def outerHeight(element: HTMLElement): Double = js.native
  def outerWidth(element: HTMLElement): Double = js.native
  def removeChildren(node: Node): Unit = js.native
  def removeNode(node: Node): Node = js.native
  def replaceChildren(node: Node, children: js.Array[Node]): Unit = js.native
  def replaceNode(newNode: Node, oldNode: Node): Unit = js.native
}

