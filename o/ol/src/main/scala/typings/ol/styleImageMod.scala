package typings.ol

import typings.ol.olStrings.declutter
import typings.ol.olStrings.none
import typings.ol.olStrings.obstacle
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleImageMod {
  
  /**
    * @typedef {Object} Options
    * @property {number} opacity Opacity.
    * @property {boolean} rotateWithView If the image should get rotated with the view.
    * @property {number} rotation Rotation.
    * @property {number|import("../size.js").Size} scale Scale.
    * @property {Array<number>} displacement Displacement.
    * @property {"declutter"|"obstacle"|"none"|undefined} declutterMode Declutter mode: `declutter`, `obstacle`, 'none */
  /**
    * @classdesc
    * A base class used for creating subclasses and not instantiated in
    * apps. Base class for {@link module:ol/style/Icon~Icon}, {@link module:ol/style/Circle~CircleStyle} and
    * {@link module:ol/style/RegularShape~RegularShape}.
    * @abstract
    * @api
    */
  @JSImport("ol/style/Image", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ImageStyle {
    /**
      * @param {Options} options Options.
      */
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} opacity Opacity.
    * @property {boolean} rotateWithView If the image should get rotated with the view.
    * @property {number} rotation Rotation.
    * @property {number|import("../size.js").Size} scale Scale.
    * @property {Array<number>} displacement Displacement.
    * @property {"declutter"|"obstacle"|"none"|undefined} declutterMode Declutter mode: `declutter`, `obstacle`, 'none */
  /**
    * @classdesc
    * A base class used for creating subclasses and not instantiated in
    * apps. Base class for {@link module:ol/style/Icon~Icon}, {@link module:ol/style/Circle~CircleStyle} and
    * {@link module:ol/style/RegularShape~RegularShape}.
    * @abstract
    * @api
    */
  @js.native
  trait ImageStyle extends StObject {
    
    /**
      * @private
      * @type {"declutter"|"obstacle"|"none"|undefined}
      */
    /* private */ var declutterMode_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var displacement_ : Any = js.native
    
    /**
      * Get the anchor point in pixels. The anchor determines the center point for the
      * symbolizer.
      * @abstract
      * @return {Array<number>} Anchor.
      */
    def getAnchor(): js.Array[Double] = js.native
    
    /**
      * Get the declutter mode of the shape
      * @return {"declutter"|"obstacle"|"none"|undefined} Shape's declutter mode
      * @api
      */
    def getDeclutterMode(): js.UndefOr[declutter | obstacle | none] = js.native
    
    /**
      * Get the displacement of the shape
      * @return {Array<number>} Shape's center displacement
      * @api
      */
    def getDisplacement(): js.Array[Double] = js.native
    
    /**
      * @abstract
      * @return {HTMLCanvasElement|HTMLVideoElement|HTMLImageElement} Image element.
      */
    def getHitDetectionImage(): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
    
    /**
      * Get the image element for the symbolizer.
      * @abstract
      * @param {number} pixelRatio Pixel ratio.
      * @return {HTMLCanvasElement|HTMLVideoElement|HTMLImageElement} Image element.
      */
    def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
    
    /**
      * @abstract
      * @return {import("../size.js").Size} Image size.
      */
    def getImageSize(): Size = js.native
    
    /**
      * @abstract
      * @return {import("../ImageState.js").default} Image state.
      */
    def getImageState(): Any = js.native
    
    /**
      * Get the symbolizer opacity.
      * @return {number} Opacity.
      * @api
      */
    def getOpacity(): Double = js.native
    
    /**
      * Get the origin of the symbolizer.
      * @abstract
      * @return {Array<number>} Origin.
      */
    def getOrigin(): js.Array[Double] = js.native
    
    /**
      * Get the image pixel ratio.
      * @param {number} pixelRatio Pixel ratio.
      * @return {number} Pixel ratio.
      */
    def getPixelRatio(pixelRatio: Double): Double = js.native
    
    /**
      * Determine whether the symbolizer rotates with the map.
      * @return {boolean} Rotate with map.
      * @api
      */
    def getRotateWithView(): Boolean = js.native
    
    /**
      * Get the symoblizer rotation.
      * @return {number} Rotation.
      * @api
      */
    def getRotation(): Double = js.native
    
    /**
      * Get the symbolizer scale.
      * @return {number|import("../size.js").Size} Scale.
      * @api
      */
    def getScale(): Double | Size = js.native
    
    /**
      * Get the symbolizer scale array.
      * @return {import("../size.js").Size} Scale array.
      */
    def getScaleArray(): Size = js.native
    
    /**
      * Get the size of the symbolizer (in pixels).
      * @abstract
      * @return {import("../size.js").Size} Size.
      */
    def getSize(): Size = js.native
    
    /**
      * @abstract
      * @param {function(import("../events/Event.js").default): void} listener Listener function.
      */
    def listenImageChange(listener: js.Function1[/* arg0 */ typings.ol.eventsEventMod.default, Unit]): Unit = js.native
    
    /**
      * Load not yet loaded URI.
      * @abstract
      */
    def load(): Unit = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var opacity_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var rotateWithView_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var rotation_ : Any = js.native
    
    /**
      * @private
      * @type {import("../size.js").Size}
      */
    /* private */ var scaleArray_ : Any = js.native
    
    /**
      * @private
      * @type {number|import("../size.js").Size}
      */
    /* private */ var scale_ : Any = js.native
    
    /**
      * Set the displacement.
      *
      * @param {Array<number>} displacement Displacement.
      * @api
      */
    def setDisplacement(displacement: js.Array[Double]): Unit = js.native
    
    /**
      * Set the opacity.
      *
      * @param {number} opacity Opacity.
      * @api
      */
    def setOpacity(opacity: Double): Unit = js.native
    
    /**
      * Set whether to rotate the style with the view.
      *
      * @param {boolean} rotateWithView Rotate with map.
      * @api
      */
    def setRotateWithView(rotateWithView: Boolean): Unit = js.native
    
    /**
      * Set the rotation.
      *
      * @param {number} rotation Rotation.
      * @api
      */
    def setRotation(rotation: Double): Unit = js.native
    
    /**
      * Set the scale.
      *
      * @param {number|import("../size.js").Size} scale Scale.
      * @api
      */
    def setScale(scale: Double): Unit = js.native
    def setScale(scale: Size): Unit = js.native
    
    /**
      * @abstract
      * @param {function(import("../events/Event.js").default): void} listener Listener function.
      */
    def unlistenImageChange(listener: js.Function1[/* arg0 */ typings.ol.eventsEventMod.default, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Declutter mode: `declutter`, `obstacle`, 'none
      */
    var declutterMode: js.UndefOr[declutter | obstacle | none] = js.undefined
    
    /**
      * Displacement.
      */
    var displacement: js.Array[Double]
    
    /**
      * Opacity.
      */
    var opacity: Double
    
    /**
      * If the image should get rotated with the view.
      */
    var rotateWithView: Boolean
    
    /**
      * Rotation.
      */
    var rotation: Double
    
    /**
      * Scale.
      */
    var scale: Double | Size
  }
  object Options {
    
    inline def apply(
      displacement: js.Array[Double],
      opacity: Double,
      rotateWithView: Boolean,
      rotation: Double,
      scale: Double | Size
    ): Options = {
      val __obj = js.Dynamic.literal(displacement = displacement.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], rotateWithView = rotateWithView.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDeclutterMode(value: declutter | obstacle | none): Self = StObject.set(x, "declutterMode", value.asInstanceOf[js.Any])
      
      inline def setDeclutterModeUndefined: Self = StObject.set(x, "declutterMode", js.undefined)
      
      inline def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      inline def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value*))
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
    }
  }
}
