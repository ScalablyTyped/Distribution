package typings.plottable

import typings.d3Selection.mod.Selection_
import typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawer
import typings.plottable.buildSrcDrawersDrawStepMod.AppliedDrawStep
import typings.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDrawersDrawerMod {
  
  @JSImport("plottable/build/src/drawers/drawer", "ProxyDrawer")
  @js.native
  open class ProxyDrawer protected ()
    extends StObject
       with IDrawer {
    /**
      * A Drawer draws svg elements based on the input Dataset.
      *
      * @constructor
      * @param _svgDrawerFactory A factory that will be invoked to create an SVGDrawer whenever useSVG is called
      * @param _canvasDrawStep The DrawStep to be fed into a new CanvasDrawer whenever useCanvas is called
      */
    def this(
      _svgDrawerFactory: js.Function0[SVGDrawer],
      _canvasDrawerFactory: js.Function1[/* ctx */ CanvasRenderingContext2D, CanvasDrawer]
    ) = this()
    
    /* private */ var _canvasDrawerFactory: Any = js.native
    
    /* private */ var _currentDrawer: Any = js.native
    
    /* private */ var _svgDrawerFactory: Any = js.native
    
    /**
      * Mutate the surface to reflect the data being passed in. This method is responsible
      * for calling the animators at the right time and order.
      * @param data The data to be drawn.
      * @param drawSteps The draw steps that the data go through.
      */
    /* CompleteClass */
    override def draw(data: js.Array[Any], drawSteps: js.Array[AppliedDrawStep]): Unit = js.native
    
    def getDrawer(): IDrawer = js.native
    
    /**
      * Get the visual primitive for the given *data* index.
      */
    /* CompleteClass */
    override def getVisualPrimitiveAtIndex(index: Double): Element = js.native
    
    /**
      * Get the the last drawn visual primitives.
      */
    /* CompleteClass */
    override def getVisualPrimitives(): js.Array[Element] = js.native
    
    /**
      * Called when the Drawer is no longer needed - implementors may use this to cleanup
      * any resources they've created
      */
    /* CompleteClass */
    override def remove(): Unit = js.native
    
    /**
      * Remove the old drawer and use Canvas rendering from now on.
      */
    def useCanvas(canvas: Selection_[HTMLCanvasElement, Any, Any, Any]): Unit = js.native
    
    /**
      * Remove the old drawer and use SVG rendering from now on.
      */
    def useSVG(parent: Selection_[SVGElement, Any, Any, Any]): Unit = js.native
  }
  
  trait IDrawer extends StObject {
    
    /**
      * Mutate the surface to reflect the data being passed in. This method is responsible
      * for calling the animators at the right time and order.
      * @param data The data to be drawn.
      * @param drawSteps The draw steps that the data go through.
      */
    def draw(data: js.Array[Any], drawSteps: js.Array[AppliedDrawStep]): Unit
    
    /**
      * Get the visual primitive for the given *data* index.
      */
    def getVisualPrimitiveAtIndex(index: Double): Element
    
    /**
      * Get the the last drawn visual primitives.
      */
    def getVisualPrimitives(): js.Array[Element]
    
    /**
      * Called when the Drawer is no longer needed - implementors may use this to cleanup
      * any resources they've created
      */
    def remove(): Unit
  }
  object IDrawer {
    
    inline def apply(
      draw: (js.Array[Any], js.Array[AppliedDrawStep]) => Unit,
      getVisualPrimitiveAtIndex: Double => Element,
      getVisualPrimitives: () => js.Array[Element],
      remove: () => Unit
    ): IDrawer = {
      val __obj = js.Dynamic.literal(draw = js.Any.fromFunction2(draw), getVisualPrimitiveAtIndex = js.Any.fromFunction1(getVisualPrimitiveAtIndex), getVisualPrimitives = js.Any.fromFunction0(getVisualPrimitives), remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[IDrawer]
    }
    
    extension [Self <: IDrawer](x: Self) {
      
      inline def setDraw(value: (js.Array[Any], js.Array[AppliedDrawStep]) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
      
      inline def setGetVisualPrimitiveAtIndex(value: Double => Element): Self = StObject.set(x, "getVisualPrimitiveAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetVisualPrimitives(value: () => js.Array[Element]): Self = StObject.set(x, "getVisualPrimitives", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
