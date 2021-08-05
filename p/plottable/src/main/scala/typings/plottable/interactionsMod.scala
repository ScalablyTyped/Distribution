package typings.plottable

import typings.plottable.anon.X
import typings.plottable.interfacesMod.Point
import typings.plottable.scaleMod.TransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionsMod {
  
  @JSImport("plottable/build/src/interactions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/interactions", "Click")
  @js.native
  class Click ()
    extends typings.plottable.clickInteractionMod.Click
  /* static members */
  object Click {
    
    @JSImport("plottable/build/src/interactions", "Click")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _pointsEqual(p1: js.Any, p2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_pointsEqual")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSImport("plottable/build/src/interactions", "Drag")
  @js.native
  class Drag ()
    extends typings.plottable.dragInteractionMod.Drag {
    def this(mouseButton: Double) = this()
  }
  /* static members */
  object Drag {
    
    @JSImport("plottable/build/src/interactions", "Drag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/interactions", "Drag._DEFAULT_MOUSE_FILTER")
    @js.native
    def _DEFAULT_MOUSE_FILTER: js.Any = js.native
    inline def _DEFAULT_MOUSE_FILTER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_MOUSE_FILTER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/interactions", "Key")
  @js.native
  class Key ()
    extends typings.plottable.keyInteractionMod.Key
  
  @JSImport("plottable/build/src/interactions", "PanZoom")
  @js.native
  /**
    * A PanZoom Interaction updates the domains of an x-scale and/or a y-scale
    * in response to the user panning or zooming.
    *
    * @constructor
    * @param {TransformableScale} [xScale] The x-scale to update on panning/zooming.
    * @param {TransformableScale} [yScale] The y-scale to update on panning/zooming.
    */
  class PanZoom ()
    extends typings.plottable.panZoomInteractionMod.PanZoom {
    def this(xScale: TransformableScale[js.Any, Double]) = this()
    def this(xScale: Unit, yScale: TransformableScale[js.Any, Double]) = this()
    def this(xScale: TransformableScale[js.Any, Double], yScale: TransformableScale[js.Any, Double]) = this()
  }
  /* static members */
  object PanZoom {
    
    @JSImport("plottable/build/src/interactions", "PanZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of pixels occupied in a line.
      */
    @JSImport("plottable/build/src/interactions", "PanZoom._PIXELS_PER_LINE")
    @js.native
    def _PIXELS_PER_LINE: js.Any = js.native
    inline def _PIXELS_PER_LINE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PIXELS_PER_LINE")(x.asInstanceOf[js.Any])
    
    inline def _pointDistance(point1: js.Any, point2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_pointDistance")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def centerPoint(point1: Point, point2: Point): X = (^.asInstanceOf[js.Dynamic].applyDynamic("centerPoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[X]
  }
  
  @JSImport("plottable/build/src/interactions", "Pointer")
  @js.native
  class Pointer ()
    extends typings.plottable.pointerInteractionMod.Pointer
  
  inline def zoomOut(value: Double, zoom: Double, center: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(value.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Double]
}
