package typings.openlayers.mod.source

import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.olx.source.ImageVectorOptions
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * An image source whose images are canvas elements into which vector features
  * read from a vector source (`ol.source.Vector`) are drawn. An
  * `ol.source.ImageVector` object is to be used as the `source` of an image
  * layer (`ol.layer.Image`). Image layers are rotated, scaled, and translated,
  * as opposed to being re-rendered, during animations and interactions. So, like
  * any other image layer, an image layer configured with an
  * `ol.source.ImageVector` will exhibit this behaviour. This is in contrast to a
  * vector layer, where vector features are re-drawn during animations and
  * interactions.
  *
  * @param options Options.
  * @api
  */
@JSImport("openlayers", "source.ImageVector")
@js.native
class ImageVector protected () extends ImageCanvas {
  /**
    * @classdesc
    * An image source whose images are canvas elements into which vector features
    * read from a vector source (`ol.source.Vector`) are drawn. An
    * `ol.source.ImageVector` object is to be used as the `source` of an image
    * layer (`ol.layer.Image`). Image layers are rotated, scaled, and translated,
    * as opposed to being re-rendered, during animations and interactions. So, like
    * any other image layer, an image layer configured with an
    * `ol.source.ImageVector` will exhibit this behaviour. This is in contrast to a
    * vector layer, where vector features are re-drawn during animations and
    * interactions.
    *
    * @param options Options.
    * @api
    */
  def this(options: ImageVectorOptions) = this()
  /**
    * Get a reference to the wrapped source.
    * @return Source.
    * @api
    */
  def getSource(): Vector = js.native
  /**
    * Get the style for features.  This returns whatever was passed to the `style`
    * option at construction or to the `setStyle` method.
    * @return Layer style.
    * @api stable
    */
  def getStyle(): Style | js.Array[Style] | StyleFunction = js.native
  /**
    * Get the style function.
    * @return Layer style function.
    * @api stable
    */
  def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
  def setStyle(): Unit = js.native
  def setStyle(style: js.Array[Style]): Unit = js.native
  def setStyle(style: StyleFunction): Unit = js.native
  /**
    * Set the style for features.  This can be a single style object, an array
    * of styles, or a function that takes a feature and resolution and returns
    * an array of styles. If it is `undefined` the default style is used. If
    * it is `null` the layer has no style (a `null` style), so only features
    * that have their own styles will be rendered in the layer. See
    * {@link ol.style} for information on the default style.
    * @param style Layer style.
    * @api stable
    */
  def setStyle(style: Style): Unit = js.native
}

