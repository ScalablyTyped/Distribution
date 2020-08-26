package typings.ol.mod

import typings.ol.extentMod.Extent
import typings.ol.olImageMod.LoadFunction
import typings.ol.olImageMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "Image")
@js.native
class Image protected () extends default {
  def this(
    extent: Extent,
    resolution: js.UndefOr[scala.Nothing],
    pixelRatio: Double,
    src: String,
    crossOrigin: String,
    imageLoadFunction: LoadFunction
  ) = this()
  def this(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    src: String,
    crossOrigin: String,
    imageLoadFunction: LoadFunction
  ) = this()
}

