package typings.openlayers.mod.style

import typings.openlayers.mod.StyleImageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * A base class used for creating subclasses and not instantiated in
  * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
  * {@link ol.style.RegularShape}.
  *
  * @param options Options.
  * @api
  */
@JSImport("openlayers", "style.Image")
@js.native
class Image protected () extends js.Object {
  /**
    * @classdesc
    * A base class used for creating subclasses and not instantiated in
    * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
    * {@link ol.style.RegularShape}.
    *
    * @param options Options.
    * @api
    */
  def this(options: StyleImageOptions) = this()
  /**
    * Get the symbolizer opacity.
    * @return Opacity.
    * @api
    */
  def getOpacity(): Double = js.native
  /**
    * Determine whether the symbolizer rotates with the map.
    * @return Rotate with map.
    * @api
    */
  def getRotateWithView(): Boolean = js.native
  /**
    * Get the symoblizer rotation.
    * @return Rotation.
    * @api
    */
  def getRotation(): Double = js.native
  /**
    * Get the symbolizer scale.
    * @return Scale.
    * @api
    */
  def getScale(): Double = js.native
  /**
    * Determine whether the symbolizer should be snapped to a pixel.
    * @return The symbolizer should snap to a pixel.
    * @api
    */
  def getSnapToPixel(): Boolean = js.native
  /**
    * Set the opacity.
    *
    * @param opacity Opacity.
    * @api
    */
  def setOpacity(opacity: Double): Unit = js.native
  /**
    * Set the rotation.
    *
    * @param rotation Rotation.
    * @api
    */
  def setRotation(rotation: Double): Unit = js.native
  /**
    * Set the scale.
    *
    * @param scale Scale.
    * @api
    */
  def setScale(scale: Double): Unit = js.native
}

