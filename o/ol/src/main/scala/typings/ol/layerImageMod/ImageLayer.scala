package typings.ol.layerImageMod

import typings.ol.layerTypeMod.LayerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageLayer
  extends typings.ol.layerLayerMod.default {
  var `type`: LayerType = js.native
  @JSName("getSource")
  def getSource_default(): typings.ol.sourceSourceMod.default = js.native
}

