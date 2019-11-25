package typings.openlayers.openlayersMod.layer

import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.Object
import typings.openlayers.openlayersMod.olx.layer.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Note that with `ol.layer.Base` and all its subclasses, any property set in
  * the options is set as a {@link ol.Object} property on the layer object, so
  * is observable, and has get/set accessors.
  *
  * @param options Layer options.
  * @api stable
  */
@JSImport("openlayers", "layer.Base")
@js.native
class Base protected () extends Object {
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Note that with `ol.layer.Base` and all its subclasses, any property set in
    * the options is set as a {@link ol.Object} property on the layer object, so
    * is observable, and has get/set accessors.
    *
    * @param options Layer options.
    * @api stable
    */
  def this(options: BaseOptions) = this()
  /**
    * Return the {@link ol.Extent extent} of the layer or `undefined` if it
    * will be visible regardless of extent.
    * @return The layer extent.
    * @observable
    * @api stable
    */
  def getExtent(): Extent = js.native
  /**
    * Return the maximum resolution of the layer.
    * @return The maximum resolution of the layer.
    * @observable
    * @api stable
    */
  def getMaxResolution(): Double = js.native
  /**
    * Return the minimum resolution of the layer.
    * @return The minimum resolution of the layer.
    * @observable
    * @api stable
    */
  def getMinResolution(): Double = js.native
  /**
    * Return the opacity of the layer (between 0 and 1).
    * @return The opacity of the layer.
    * @observable
    * @api stable
    */
  def getOpacity(): Double = js.native
  /**
    * Return the visibility of the layer (`true` or `false`).
    * @return The visibility of the layer.
    * @observable
    * @api stable
    */
  def getVisible(): Boolean = js.native
  /**
    * Return the Z-index of the layer, which is used to order layers before
    * rendering. The default Z-index is 0.
    * @return The Z-index of the layer.
    * @observable
    * @api
    */
  def getZIndex(): Double = js.native
  /**
    * Set the extent at which the layer is visible.  If `undefined`, the layer
    * will be visible at all extents.
    * @param extent The extent of the layer.
    * @observable
    * @api stable
    */
  def setExtent(extent: Extent): Unit = js.native
  /**
    * Set the maximum resolution at which the layer is visible.
    * @param maxResolution The maximum resolution of the layer.
    * @observable
    * @api stable
    */
  def setMaxResolution(maxResolution: Double): Unit = js.native
  /**
    * Set the minimum resolution at which the layer is visible.
    * @param minResolution The minimum resolution of the layer.
    * @observable
    * @api stable
    */
  def setMinResolution(minResolution: Double): Unit = js.native
  /**
    * Set the opacity of the layer, allowed values range from 0 to 1.
    * @param opacity The opacity of the layer.
    * @observable
    * @api stable
    */
  def setOpacity(opacity: Double): Unit = js.native
  /**
    * Set the visibility of the layer (`true` or `false`).
    * @param visible The visibility of the layer.
    * @observable
    * @api stable
    */
  def setVisible(visible: Boolean): Unit = js.native
  /**
    * Set Z-index of the layer, which is used to order layers before rendering.
    * The default Z-index is 0.
    * @param zindex The z-index of the layer.
    * @observable
    * @api
    */
  def setZIndex(zindex: Double): Unit = js.native
}

