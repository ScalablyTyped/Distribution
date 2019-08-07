package typings.ol.imageBaseMod

import typings.ol.extentMod.Extent
import typings.ol.imageStateMod.ImageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ImageBase", JSImport.Default)
@js.native
class default protected () extends ImageBase {
  def this(extent: Extent, resolution: js.UndefOr[scala.Nothing], pixelRatio: Double, state: ImageState) = this()
  def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
}

