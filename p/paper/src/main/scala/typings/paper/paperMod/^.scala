package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** 
    * The currently active project.
    */
  var project: typings.paper.paper.Project | Null = js.native
  /** 
    * The list of all open projects within the current Paper.js context.
    */
  var projects: js.Array[typings.paper.paper.Project] | Null = js.native
  /** 
    * Gives access to paper's configurable settings.
    * 
    * @option [settings.insertItems=true] {Boolean} controls whether newly
    *     created items are automatically inserted into the scene graph, by
    *     adding them to {@link Project#activeLayer}
    * @option [settings.applyMatrix=true] {Boolean} controls what value newly
    *     created items have their {@link Item#applyMatrix} property set to
    *     (Note that not all items can set this to `false`)
    * @option [settings.handleSize=4] {Number} the size of the curve handles
    *     when drawing selections
    * @option [settings.hitTolerance=0] {Number} the default tolerance for hit-
    *     tests, when no value is specified
    */
  var settings: js.Any = js.native
  /** 
    * The reference to the active tool.
    */
  var tool: typings.paper.paper.Tool | Null = js.native
  /** 
    * The list of available tools.
    */
  var tools: js.Array[typings.paper.paper.Tool] | Null = js.native
  /** 
    * The version of Paper.js, as a string.
    */
  var version: String = js.native
  /** 
    * The reference to the active project's view.
    */
  var view: typings.paper.paper.View = js.native
}

