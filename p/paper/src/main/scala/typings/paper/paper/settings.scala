package typings.paper.paper

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("paper.settings")
@js.native
object settings
  extends TopLevel[js.Any]

