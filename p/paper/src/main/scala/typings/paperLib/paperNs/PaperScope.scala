package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.PaperScope")
@js.native
class PaperScope () extends js.Object {
  /**
    * The currently active project.
    */
  var project: Project = js.native
  /**
    * The list of all open projects within the current Paper.js context.
    */
  var projects: js.Array[Project] = js.native
  /**
    * Gives access to paper's configurable settings.
    */
  var settings: paperLib.Anon_HandleSize = js.native
  /**
    * The reference to the active tool.
    */
  var tool: Tool = js.native
  /**
    * The list of available tools.
    */
  var tools: js.Array[Tool] = js.native
  /**
    * The version of Paper.js, as a string.
    */
  var version: java.lang.String = js.native
  /**
    * The reference to the active project's view.
    * Read Only.
    */
  val view: View = js.native
  /**
    * Activates this PaperScope, so all newly created items will be placed in its active project.
    */
  def activate(): scala.Unit = js.native
  /**
    * Compiles the PaperScript code into a compiled function and executes it. The compiled function receives all properties of this PaperScope as arguments, to emulate a global scope with unaffected performance. It also installs global view and tool handlers automatically on the respective objects.
    * @param code - the PaperScript code
    * @param options [optional] - the compilation options
    * @param options.url - the url of the source, for source-map debugging
    * @param options.source - the source to be used for the source- mapping, in case the code that’s passed in has already been mingled.
    */
  def execute(code: java.lang.String): scala.Unit = js.native
  def execute(code: java.lang.String, option: paperLib.Anon_Url): scala.Unit = js.native
  /**
    * Injects the paper scope into any other given scope. Can be used for examle to inject the currently active PaperScope into the window's global scope, to emulate PaperScript-style globally accessible Paper classes and objects
    * Please note: Using this method may override native constructors (e.g. Path, RGBColor). This may cause problems when using Paper.js in conjunction with other libraries that rely on these constructors. Keep the library scoped if you encounter issues caused by this.
    * @param scope -
    */
  def install(scope: js.Any): scala.Unit = js.native
  def setup(canvas: java.lang.String): scala.Unit = js.native
  /**
    * Sets up an empty project for us. If a canvas is provided, it also creates a View for it, both linked to this scope.
    * @param element - the HTML canvas element this scope should be associated with, or an ID string by which to find the element.
    */
  def setup(canvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
}

@JSGlobal("paper.PaperScope")
@js.native
object PaperScope extends js.Object {
  /**
    * Retrieves a PaperScope object with the given scope id.
    * @param id - scope id to retrieve
    */
  def get(id: java.lang.String): paperLib.paperNs.PaperScope = js.native
}

