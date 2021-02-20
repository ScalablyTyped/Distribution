package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonunits
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleLineMod {
  
  @JSImport("ol/control/ScaleLine", JSImport.Default)
  @js.native
  class default () extends ScaleLine {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  sealed trait Units extends StObject
  @JSImport("ol/control/ScaleLine", "Units")
  @js.native
  object Units extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Units with String] = js.native
    
    @js.native
    sealed trait DEGREES extends Units
    /* "degrees" */ val DEGREES: typings.ol.scaleLineMod.Units.DEGREES with String = js.native
    
    @js.native
    sealed trait IMPERIAL extends Units
    /* "imperial" */ val IMPERIAL: typings.ol.scaleLineMod.Units.IMPERIAL with String = js.native
    
    @js.native
    sealed trait METRIC extends Units
    /* "metric" */ val METRIC: typings.ol.scaleLineMod.Units.METRIC with String = js.native
    
    @js.native
    sealed trait NAUTICAL extends Units
    /* "nautical" */ val NAUTICAL: typings.ol.scaleLineMod.Units.NAUTICAL with String = js.native
    
    @js.native
    sealed trait US extends Units
    /* "us" */ val US: typings.ol.scaleLineMod.Units.US with String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var bar: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dpi: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var render: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapEventMod.default, Unit]] = js.native
    
    var steps: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[HTMLElement | String] = js.native
    
    var text: js.UndefOr[Boolean] = js.native
    
    var units: js.UndefOr[Units | String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBar(value: Boolean): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setRender(value: /* p0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setUnits(value: Units | String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  @js.native
  trait ScaleLine
    extends typings.ol.controlControlMod.default {
    
    /**
      * Creates a marker at given position
      */
    def createMarker(position: String, i: Double): String = js.native
    
    /**
      * Creates the label for a marker marker at given position
      */
    def createStepText(i: Double, width: Double, isLast: Boolean, scale: Double, suffix: String): String = js.native
    
    /**
      * Returns the appropriate scale for the given resolution and units.
      */
    def getScaleForResolution(): Double = js.native
    
    /**
      * Return the units to use in the scale line.
      */
    def getUnits(): Units = js.native
    
    @JSName("on")
    def on_changeunits(`type`: changeColonunits, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changeunits(`type`: changeColonunits, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Specify the dpi of output device such as printer.
      */
    def setDpi(): Unit = js.native
    def setDpi(dpi: Double): Unit = js.native
    
    /**
      * Set the units to use in the scale line.
      */
    def setUnits(units: Units): Unit = js.native
    
    @JSName("un")
    def un_changeunits(`type`: changeColonunits, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
}
