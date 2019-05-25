package typings
package olLib.interactionDragAndDropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/DragAndDrop", "DragAndDropEvent")
@js.native
class DragAndDropEvent protected ()
  extends olLib.eventsEventMod.default {
  def this(`type`: DragAndDropEventType, file: stdLib.File) = this()
  def this(`type`: DragAndDropEventType, file: stdLib.File, opt_features: js.Array[olLib.featureMod.default]) = this()
  def this(`type`: DragAndDropEventType, file: stdLib.File, opt_features: js.Array[olLib.featureMod.default], opt_projection: olLib.projProjectionMod.default) = this()
  var features: js.Array[olLib.featureMod.FeatureLike] = js.native
  var file: stdLib.File = js.native
  var projection: olLib.projProjectionMod.default = js.native
}

