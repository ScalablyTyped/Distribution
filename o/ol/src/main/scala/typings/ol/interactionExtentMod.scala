package typings.ol

import typings.ol.conditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olStrings.extentchanged
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionExtentMod {
  
  @JSImport("ol/interaction/Extent", JSImport.Default)
  @js.native
  class default () extends Extent {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Extent
    extends typings.ol.pointerMod.default {
    
    /**
      * Returns the current drawn extent in the view projection (or user projection if set)
      */
    def getExtent(): typings.ol.extentMod.Extent = js.native
    
    /**
      * Returns the current drawn extent in the view projection
      */
    def getExtentInternal(): typings.ol.extentMod.Extent = js.native
    
    @JSName("on")
    def on_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): EventsKey = js.native
    
    /**
      * Manually sets the drawn extent, using the view projection.
      */
    def setExtent(extent: typings.ol.extentMod.Extent): Unit = js.native
    
    @JSName("un")
    def un_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait ExtentEvent
    extends typings.ol.eventMod.default {
    
    /**
      * The current extent.
      */
    var extent: typings.ol.extentMod.Extent = js.native
  }
  
  trait Options extends StObject {
    
    var boxStyle: js.UndefOr[StyleLike] = js.undefined
    
    var condition: js.UndefOr[Condition] = js.undefined
    
    var extent: js.UndefOr[typings.ol.extentMod.Extent] = js.undefined
    
    var pixelTolerance: js.UndefOr[Double] = js.undefined
    
    var pointerStyle: js.UndefOr[StyleLike] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBoxStyle(value: StyleLike): Self = StObject.set(x, "boxStyle", value.asInstanceOf[js.Any])
      
      inline def setBoxStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = StObject.set(x, "boxStyle", js.Any.fromFunction2(value))
      
      inline def setBoxStyleUndefined: Self = StObject.set(x, "boxStyle", js.undefined)
      
      inline def setBoxStyleVarargs(value: Style*): Self = StObject.set(x, "boxStyle", js.Array(value :_*))
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setExtent(value: typings.ol.extentMod.Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
      
      inline def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
      
      inline def setPointerStyle(value: StyleLike): Self = StObject.set(x, "pointerStyle", value.asInstanceOf[js.Any])
      
      inline def setPointerStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = StObject.set(x, "pointerStyle", js.Any.fromFunction2(value))
      
      inline def setPointerStyleUndefined: Self = StObject.set(x, "pointerStyle", js.undefined)
      
      inline def setPointerStyleVarargs(value: Style*): Self = StObject.set(x, "pointerStyle", js.Array(value :_*))
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
