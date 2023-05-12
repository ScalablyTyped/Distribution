package typings.ol

import typings.ol.eventsConditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragZoomMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-dragzoom'] CSS class name for styling the
    * box.
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.shiftKeyOnly}.
    * @property {number} [duration=200] Animation duration in milliseconds.
    * @property {boolean} [out=false] Use interaction for zooming out.
    * @property {number} [minArea=64] The minimum area of the box in pixel, this value is used by the parent default
    * `boxEndCondition` function.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map by clicking and dragging on the map,
    * normally combined with an {@link module:ol/events/condition} that limits
    * it to when a key, shift by default, is held down.
    *
    * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
    * your custom one configured with `className`.
    * @api
    */
  @JSImport("ol/interaction/DragZoom", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends DragZoom {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-dragzoom'] CSS class name for styling the
    * box.
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.shiftKeyOnly}.
    * @property {number} [duration=200] Animation duration in milliseconds.
    * @property {boolean} [out=false] Use interaction for zooming out.
    * @property {number} [minArea=64] The minimum area of the box in pixel, this value is used by the parent default
    * `boxEndCondition` function.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map by clicking and dragging on the map,
    * normally combined with an {@link module:ol/events/condition} that limits
    * it to when a key, shift by default, is held down.
    *
    * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
    * your custom one configured with `className`.
    * @api
    */
  @js.native
  trait DragZoom
    extends typings.ol.interactionDragBoxMod.default {
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var duration_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var out_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * CSS class name for styling the
      * box.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled.
      * Default is {@link module :ol/events/condition.shiftKeyOnly}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Animation duration in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum area of the box in pixel, this value is used by the parent default
      * `boxEndCondition` function.
      */
    var minArea: js.UndefOr[Double] = js.undefined
    
    /**
      * Use interaction for zooming out.
      */
    var out: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMinArea(value: Double): Self = StObject.set(x, "minArea", value.asInstanceOf[js.Any])
      
      inline def setMinAreaUndefined: Self = StObject.set(x, "minArea", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    }
  }
}
