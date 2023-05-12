package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionPinchRotateMod {
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=250] The duration of the animation in
    * milliseconds.
    * @property {number} [threshold=0.3] Minimal angle in radians to start a rotation.
    */
  /**
    * @classdesc
    * Allows the user to rotate the map by twisting with two fingers
    * on a touch screen.
    * @api
    */
  @JSImport("ol/interaction/PinchRotate", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends PinchRotate {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * The duration of the animation in
      * milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimal angle in radians to start a rotation.
      */
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=250] The duration of the animation in
    * milliseconds.
    * @property {number} [threshold=0.3] Minimal angle in radians to start a rotation.
    */
  /**
    * @classdesc
    * Allows the user to rotate the map by twisting with two fingers
    * on a touch screen.
    * @api
    */
  @js.native
  trait PinchRotate
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * @private
      * @type {import("../coordinate.js").Coordinate}
      */
    /* private */ var anchor_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var duration_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var lastAngle_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var rotating_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var rotationDelta_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var threshold_ : Any = js.native
  }
}
