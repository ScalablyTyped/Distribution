package typings.paper.paperMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Project")
@js.native
class Project protected ()
  extends typings.paper.paperNs.Project {
  def this(element: String) = this()
  /**
    * Creates a Paper.js project containing one empty Layer, referenced by project.activeLayer.
    * @param element - the HTML canvas element that should be used as the element for the view, or an ID string by which to find the element.
    */
  def this(element: HTMLCanvasElement) = this()
}

