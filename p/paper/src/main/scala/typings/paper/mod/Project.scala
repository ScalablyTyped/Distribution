package typings.paper.mod

import typings.paper.paper.Size
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Project")
@js.native
class Project protected ()
  extends typings.paper.paper.Project {
  def this(element: String) = this()
  def this(element: Size) = this()
  /** 
    * Creates a Paper.js project containing one empty {@link Layer}, referenced
    * by {@link Project#activeLayer}.
    * 
    * Note that when working with PaperScript, a project is automatically
    * created for us and the {@link PaperScope#project} variable points to it.
    * 
    * @param element - the HTML canvas element
    * that should be used as the element for the view, or an ID string by which
    * to find the element, or the size of the canvas to be created for usage in
    * a web worker.
    */
  def this(element: HTMLCanvasElement) = this()
}

