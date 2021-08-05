package typings.plottable

import typings.d3Selection.mod.Selection_
import typings.plottable.drawStepMod.AppliedDrawStep
import typings.plottable.drawerMod.IDrawer
import typings.plottable.interfacesMod.SimpleSelection
import typings.std.Element
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgDrawerMod {
  
  @JSImport("plottable/build/src/drawers/svgDrawer", "SVGDrawer")
  @js.native
  class SVGDrawer protected ()
    extends StObject
       with IDrawer {
    /**
      * @param svgElementName an HTML/SVG tag name to be created, one per datum.
      * @param className CSS classes to be applied to the drawn primitives.
      * @param applyDefaultAttributes
      */
    def this(svgElementName: String, className: String) = this()
    
    /* protected */ def _applyDefaultAttributes(selection: SimpleSelection[js.Any]): Unit = js.native
    
    /* private */ var _cachedVisualPrimitivesNodeMap: js.Any = js.native
    
    /**
      * Cache of the _selection.nodes().
      */
    /* private */ var _cachedVisualPrimitivesNodes: js.Any = js.native
    
    /* protected */ var _className: String = js.native
    
    /* private */ def _createAndDestroyDOMElements(data: js.Any): js.Any = js.native
    
    /**
      * Draws data using one step
      *
      * @param{AppliedDrawStep} step The step, how data should be drawn.
      */
    /* private */ def _drawStep(step: js.Any): js.Any = js.native
    
    /**
      * The root element holding the visual elements. The SVGDrawer owns
      * this variable and manipulates it accordingly.
      */
    /* protected */ var _root: Selection_[SVGElement, js.Any, js.Any, js.Any] = js.native
    
    /**
      * All of the DOM elements from the last draw.
      */
    /* private */ var _selection: js.Any = js.native
    
    /* protected */ var _svgElementName: String = js.native
    
    def attachTo(parent: Selection_[SVGElement, js.Any, js.Any, js.Any]): Unit = js.native
    
    /**
      * Mutate the surface to reflect the data being passed in. This method is responsible
      * for calling the animators at the right time and order.
      * @param data The data to be drawn.
      * @param drawSteps The draw steps that the data go through.
      */
    /* CompleteClass */
    override def draw(data: js.Array[js.Any], drawSteps: js.Array[AppliedDrawStep]): Unit = js.native
    
    def getRoot(): Selection_[SVGElement, js.Any, js.Any, js.Any] = js.native
    
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
      * Returns the CSS selector for this Drawer's visual elements.
      */
    def selector(): String = js.native
  }
}
