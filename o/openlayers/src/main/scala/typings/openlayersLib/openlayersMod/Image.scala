package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Image")
@js.native
class Image protected () extends ImageBase {
  /**
       * @param extent Extent.
       * @param resolution Resolution.
       * @param pixelRatio Pixel ratio.
       * @param attributions Attributions.
       * @param src Image source URI.
       * @param crossOrigin Cross origin.
       * @param imageLoadFunction Image load function.
       */
  def this(extent: Extent, resolution: scala.Double, pixelRatio: scala.Double, attributions: js.Array[Attribution], src: java.lang.String) = this()
  /**
       * @param extent Extent.
       * @param resolution Resolution.
       * @param pixelRatio Pixel ratio.
       * @param attributions Attributions.
       * @param src Image source URI.
       * @param crossOrigin Cross origin.
       * @param imageLoadFunction Image load function.
       */
  def this(extent: Extent, resolution: scala.Double, pixelRatio: scala.Double, attributions: js.Array[Attribution], src: java.lang.String, crossOrigin: java.lang.String) = this()
  /**
       * @param extent Extent.
       * @param resolution Resolution.
       * @param pixelRatio Pixel ratio.
       * @param attributions Attributions.
       * @param src Image source URI.
       * @param crossOrigin Cross origin.
       * @param imageLoadFunction Image load function.
       */
  def this(extent: Extent, resolution: scala.Double, pixelRatio: scala.Double, attributions: js.Array[Attribution], src: java.lang.String, crossOrigin: java.lang.String, imageLoadFunction: ImageLoadFunctionType) = this()
  /**
       * Get the HTML image element (may be a Canvas, Image, or Video).
       * @param opt_context Object.
       * @return Image.
       * @api
       */
  def getImage(): stdLib.HTMLCanvasElement | Image | stdLib.HTMLVideoElement = js.native
  /**
       * Get the HTML image element (may be a Canvas, Image, or Video).
       * @param opt_context Object.
       * @return Image.
       * @api
       */
  def getImage(opt_context: GlobalObject): stdLib.HTMLCanvasElement | Image | stdLib.HTMLVideoElement = js.native
  /**
       * Load the image or retry if loading previously failed.
       * Loading is taken care of by the tile queue, and calling this method is
       * only needed for preloading or for reloading in case of an error.
       * @api
       */
  def load(): scala.Unit = js.native
}

