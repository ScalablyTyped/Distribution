package typings.openlayers.mod.layer

import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.olx.layer.VectorOptions
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Vector data that is rendered client-side.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "layer.Vector")
@js.native
/**
  * @classdesc
  * Vector data that is rendered client-side.
  * Note that any property set in the options is set as a {@link ol.Object}
  * property on the layer object; for example, setting `title: 'My Title'` in the
  * options means that `title` is observable, and has get/set accessors.
  *
  * @fires ol.render.Event
  * @param opt_options Options.
  * @api stable
  */
class Vector () extends Layer {
  def this(opt_options: VectorOptions) = this()
  
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
  def setStyle(): Unit = js.native
  def setStyle(style: js.Array[Style]): Unit = js.native
  def setStyle(style: StyleFunction): Unit = js.native
  def setStyle(style: Style): Unit = js.native
}
