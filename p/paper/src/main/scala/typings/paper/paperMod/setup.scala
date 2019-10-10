package typings.paper.paperMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "setup")
@js.native
object setup extends js.Object {
  def apply(element: String): Unit = js.native
  def apply(element: typings.paper.paper.Size): Unit = js.native
  /** 
    * Sets up an empty project for us. If a canvas is provided, it also creates
    * a {@link View} for it, both linked to this scope.
    * 
    * @param element - the HTML canvas element
    * this scope should be associated with, or an ID string by which to find
    * the element, or the size of the canvas to be created for usage in a web
    * worker.
    */
  def apply(element: HTMLCanvasElement): Unit = js.native
}

