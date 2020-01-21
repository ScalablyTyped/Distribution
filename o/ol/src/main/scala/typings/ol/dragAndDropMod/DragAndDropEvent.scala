package typings.ol.dragAndDropMod

import typings.ol.olFeatureMod.FeatureLike
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/DragAndDrop", "DragAndDropEvent")
@js.native
class DragAndDropEvent protected ()
  extends typings.ol.eventMod.default {
  def this(`type`: DragAndDropEventType, file: File) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
  ) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
    opt_projection: typings.ol.projectionMod.default
  ) = this()
  var features: js.Array[FeatureLike] = js.native
  var file: File = js.native
  var projection: typings.ol.projectionMod.default = js.native
}

