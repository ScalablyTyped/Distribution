package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDoubleClickZoomMod {
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=250] Animation duration in milliseconds.
    * @property {number} [delta=1] The zoom delta applied on each double click.
    */
  /**
    * @classdesc
    * Allows the user to zoom by double-clicking on the map.
    * @api
    */
  @JSImport("ol/interaction/DoubleClickZoom", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends DoubleClickZoom {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=250] Animation duration in milliseconds.
    * @property {number} [delta=1] The zoom delta applied on each double click.
    */
  /**
    * @classdesc
    * Allows the user to zoom by double-clicking on the map.
    * @api
    */
  @js.native
  trait DoubleClickZoom
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var delta_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var duration_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The zoom delta applied on each double click.
      */
    var delta: js.UndefOr[Double] = js.undefined
    
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
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
}
