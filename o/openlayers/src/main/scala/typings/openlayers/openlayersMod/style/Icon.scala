package typings.openlayers.openlayersMod.style

import typings.openlayers.openlayersMod.Size
import typings.openlayers.openlayersMod.olx.style.IconOptions
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Set icon style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "style.Icon")
@js.native
/**
  * @classdesc
  * Set icon style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
class Icon ()
  extends typings.openlayers.openlayersMod.style.Image {
  def this(opt_options: IconOptions) = this()
  /**
    * @inheritDoc
    * @api
    */
  def getAnchor(): js.Array[Double] = js.native
  /**
    * Get the image icon.
    * @param pixelRatio Pixel ratio.
    * @return Image or Canvas element.
    * @api
    */
  def getImage(pixelRatio: Double): typings.openlayers.openlayersMod.style.Image | HTMLCanvasElement = js.native
  /**
    * @inheritDoc
    * @api
    */
  def getOrigin(): js.Array[Double] = js.native
  /**
    * @inheritDoc
    * @api
    */
  def getSize(): Size = js.native
  /**
    * Get the image URL.
    * @return Image src.
    * @api
    */
  def getSrc(): String = js.native
  /**
    * Load not yet loaded URI.
    * When rendering a feature with an icon style, the vector renderer will
    * automatically call this method. However, you might want to call this
    * method yourself for preloading or other purposes.
    * @api
    */
  def load(): Unit = js.native
}

