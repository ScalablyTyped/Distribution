package typings.plottable

import typings.d3Selection.mod.Selection_
import typings.plottable.canvasDrawerMod.CanvasDrawer
import typings.plottable.drawStepMod.AppliedDrawStep
import typings.plottable.svgDrawerMod.SVGDrawer
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod {
  
  @JSImport("plottable/build/src/drawers/drawer", "ProxyDrawer")
  @js.native
  class ProxyDrawer protected ()
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
    
    var _canvasDrawerFactory: js.Any = js.native
    
    var _currentDrawer: js.Any = js.native
    
    var _svgDrawerFactory: js.Any = js.native
    
    /**
      * Mutate the surface to reflect the data being passed in. This method is responsible
      * for calling the animators at the right time and order.
      * @param data The data to be drawn.
      * @param drawSteps The draw steps that the data go through.
      */
    /* CompleteClass */
    override def draw(data: js.Array[js.Any], drawSteps: js.Array[AppliedDrawStep]): Unit = js.native
    
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
    def useCanvas(canvas: Selection_[HTMLCanvasElement, js.Any, js.Any, js.Any]): Unit = js.native
    
    /**
      * Remove the old drawer and use SVG rendering from now on.
      */
    def useSVG(parent: Selection_[SVGElement, js.Any, js.Any, js.Any]): Unit = js.native
  }
  
  trait IDrawer extends StObject {
    
    /**
      * Mutate the surface to reflect the data being passed in. This method is responsible
      * for calling the animators at the right time and order.
      * @param data The data to be drawn.
      * @param drawSteps The draw steps that the data go through.
      */
    def draw(data: js.Array[js.Any], drawSteps: js.Array[AppliedDrawStep]): Unit
    
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
    
    @scala.inline
    def apply(
      draw: (js.Array[js.Any], js.Array[AppliedDrawStep]) => Unit,
      getVisualPrimitiveAtIndex: Double => Element,
      getVisualPrimitives: () => js.Array[Element],
      remove: () => Unit
    ): IDrawer = {
      val __obj = js.Dynamic.literal(draw = js.Any.fromFunction2(draw), getVisualPrimitiveAtIndex = js.Any.fromFunction1(getVisualPrimitiveAtIndex), getVisualPrimitives = js.Any.fromFunction0(getVisualPrimitives), remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[IDrawer]
    }
    
    @scala.inline
    implicit class IDrawerMutableBuilder[Self <: IDrawer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDraw(value: (js.Array[js.Any], js.Array[AppliedDrawStep]) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetVisualPrimitiveAtIndex(value: Double => Element): Self = StObject.set(x, "getVisualPrimitiveAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetVisualPrimitives(value: () => js.Array[Element]): Self = StObject.set(x, "getVisualPrimitives", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
