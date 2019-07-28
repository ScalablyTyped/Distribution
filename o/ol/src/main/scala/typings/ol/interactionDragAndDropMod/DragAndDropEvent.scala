package typings.ol.interactionDragAndDropMod

import typings.ol.featureMod.FeatureLike
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/DragAndDrop", "DragAndDropEvent")
@js.native
class DragAndDropEvent protected ()
  extends typings.ol.eventsEventMod.default {
  def this(`type`: DragAndDropEventType, file: File) = this()
  def this(`type`: DragAndDropEventType, file: File, opt_features: js.Array[typings.ol.featureMod.default]) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.Array[typings.ol.featureMod.default],
    opt_projection: typings.ol.projProjectionMod.default
  ) = this()
  var features: js.Array[FeatureLike] = js.native
  var file: File = js.native
  var projection: typings.ol.projProjectionMod.default = js.native
}

