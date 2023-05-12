package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionPinchZoomMod {
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=400] Animation duration in milliseconds.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map by pinching with two fingers
    * on a touch screen.
    * @api
    */
  @JSImport("ol/interaction/PinchZoom", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends PinchZoom {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Animation duration in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
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
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=400] Animation duration in milliseconds.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map by pinching with two fingers
    * on a touch screen.
    * @api
    */
  @js.native
  trait PinchZoom
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
    /* private */ var lastDistance_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var lastScaleDelta_ : Any = js.native
  }
}
