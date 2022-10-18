package typings.plottable.mod

import typings.plottable.anon.X
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcScalesScaleMod.TransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Interactions {
  
  @JSImport("plottable", "Interactions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable", "Interactions.Click")
  @js.native
  open class Click ()
    extends typings.plottable.buildSrcInteractionsMod.Click
  /* static members */
  object Click {
    
    @JSImport("plottable", "Interactions.Click")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Interactions.Click._pointsEqual")
    @js.native
    def _pointsEqual: Any = js.native
    inline def _pointsEqual_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointsEqual")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Interactions.Drag")
  @js.native
  open class Drag ()
    extends typings.plottable.buildSrcInteractionsMod.Drag {
    def this(mouseButton: Double) = this()
  }
  /* static members */
  object Drag {
    
    @JSImport("plottable", "Interactions.Drag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Interactions.Drag._DEFAULT_MOUSE_FILTER")
    @js.native
    def _DEFAULT_MOUSE_FILTER: Any = js.native
    inline def _DEFAULT_MOUSE_FILTER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_MOUSE_FILTER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable", "Interactions.Key")
  @js.native
  open class Key ()
    extends typings.plottable.buildSrcInteractionsMod.Key
  
  @JSImport("plottable", "Interactions.PanZoom")
  @js.native
  /**
    * A PanZoom Interaction updates the domains of an x-scale and/or a y-scale
    * in response to the user panning or zooming.
    *
    * @constructor
    * @param {TransformableScale} [xScale] The x-scale to update on panning/zooming.
    * @param {TransformableScale} [yScale] The y-scale to update on panning/zooming.
    */
  open class PanZoom ()
    extends typings.plottable.buildSrcInteractionsMod.PanZoom {
    def this(xScale: TransformableScale[Any, Double]) = this()
    def this(xScale: Unit, yScale: TransformableScale[Any, Double]) = this()
    def this(xScale: TransformableScale[Any, Double], yScale: TransformableScale[Any, Double]) = this()
  }
  /* static members */
  object PanZoom {
    
    @JSImport("plottable", "Interactions.PanZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of pixels occupied in a line.
      */
    @JSImport("plottable", "Interactions.PanZoom._PIXELS_PER_LINE")
    @js.native
    def _PIXELS_PER_LINE: Any = js.native
    inline def _PIXELS_PER_LINE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PIXELS_PER_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Interactions.PanZoom._pointDistance")
    @js.native
    def _pointDistance: Any = js.native
    inline def _pointDistance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointDistance")(x.asInstanceOf[js.Any])
    
    inline def centerPoint(point1: Point, point2: Point): X = (^.asInstanceOf[js.Dynamic].applyDynamic("centerPoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[X]
  }
  
  @JSImport("plottable", "Interactions.Pointer")
  @js.native
  open class Pointer ()
    extends typings.plottable.buildSrcInteractionsMod.Pointer
  
  inline def zoomOut(value: Double, zoom: Double, center: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(value.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Double]
}
