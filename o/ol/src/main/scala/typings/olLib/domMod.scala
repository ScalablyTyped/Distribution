package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/dom", JSImport.Namespace)
@js.native
object domMod extends js.Object {
  def createCanvasContext2D(): stdLib.CanvasRenderingContext2D = js.native
  def createCanvasContext2D(opt_width: scala.Double): stdLib.CanvasRenderingContext2D = js.native
  def createCanvasContext2D(opt_width: scala.Double, opt_height: scala.Double): stdLib.CanvasRenderingContext2D = js.native
  def outerHeight(element: stdLib.HTMLElement): scala.Double = js.native
  def outerWidth(element: stdLib.HTMLElement): scala.Double = js.native
  def removeChildren(node: stdLib.Node): scala.Unit = js.native
  def removeNode(node: stdLib.Node): stdLib.Node = js.native
  def replaceNode(newNode: stdLib.Node, oldNode: stdLib.Node): scala.Unit = js.native
}

