package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.mixin.FloatableElement.Props
import typings.oojsUi.OO.ui.mixin.FloatableElement.Prototype
import typings.oojsUi.anon.Recordtopleftbottomrightn
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Element that will stick adjacent to a specified container, even when it is inserted elsewhere
  * in the document (for example, in an OO.ui.Window's $overlay).
  *
  * The elements's position is automatically calculated and maintained when window is resized or the
  * page is scrolled. If you reposition the container manually, you have to call {@link position} to make
  * sure the element is still placed correctly.
  *
  * As positioning is only possible when both the element and the container are attached to the DOM
  * and visible, it's only done after you call {@link togglePositioning}. You might want to do this inside
  * the toggle method to display a floating popup, for example.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.FloatableElement
  */
@js.native
trait FloatableElement
  extends StObject
     with Props
     with Prototype
object FloatableElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * Node to position, assigned to {@link Props.$floatable $floatable}, omit to use
      * {@link Element.Props.$element $element}
      */
    @JSName("$floatable")
    var $floatable: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /** Node to position adjacent to */
    @JSName("$floatableContainer")
    var $floatableContainer: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /** Whether to hide the floatable element if the container is out of view */
    var hideWhenOutOfView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Where to position {@link $floatable} horizontally:
      * - 'before': Directly before {@link $floatableContainer}, aligning f's end edge with fC's start edge
      * - 'after': Directly after $floatableContainer, aligning f's start edge with fC's end edge
      * - 'start': Align the start (left in LTR, right in RTL) edge with $floatableContainer's start edge
      * - 'end': Align the end (right in LTR, left in RTL) edge with $floatableContainer's end edge
      * - 'center': Horizontally align the center with $floatableContainer's center
      */
    var horizontalPosition: js.UndefOr[HorizontalPosition] = js.undefined
    
    /**
      * Where to position {@link $floatable} vertically:
      * - 'below': Directly below {@link $floatableContainer}, aligning f's top edge with fC's bottom edge
      * - 'above': Directly above $floatableContainer, aligning f's bottom edge with fC's top edge
      * - 'top': Align the top edge with $floatableContainer's top edge
      * - 'bottom': Align the bottom edge with $floatableContainer's bottom edge
      * - 'center': Vertically align the center with $floatableContainer's center
      */
    var verticalPosition: js.UndefOr[VerticalPosition] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$floatable(value: JQuery[HTMLElement]): Self = StObject.set(x, "$floatable", value.asInstanceOf[js.Any])
      
      inline def set$floatableContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "$floatableContainer", value.asInstanceOf[js.Any])
      
      inline def set$floatableContainerUndefined: Self = StObject.set(x, "$floatableContainer", js.undefined)
      
      inline def set$floatableUndefined: Self = StObject.set(x, "$floatable", js.undefined)
      
      inline def setHideWhenOutOfView(value: Boolean): Self = StObject.set(x, "hideWhenOutOfView", value.asInstanceOf[js.Any])
      
      inline def setHideWhenOutOfViewUndefined: Self = StObject.set(x, "hideWhenOutOfView", js.undefined)
      
      inline def setHorizontalPosition(value: HorizontalPosition): Self = StObject.set(x, "horizontalPosition", value.asInstanceOf[js.Any])
      
      inline def setHorizontalPositionUndefined: Self = StObject.set(x, "horizontalPosition", js.undefined)
      
      inline def setVerticalPosition(value: VerticalPosition): Self = StObject.set(x, "verticalPosition", value.asInstanceOf[js.Any])
      
      inline def setVerticalPositionUndefined: Self = StObject.set(x, "verticalPosition", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[FloatableElement]
       with Instantiable1[/* config */ ConfigOptions, FloatableElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.oojsUi.oojsUiStrings.before
    - typings.oojsUi.oojsUiStrings.after
    - typings.oojsUi.oojsUiStrings.start
    - typings.oojsUi.oojsUiStrings.end
    - typings.oojsUi.oojsUiStrings.center
  */
  trait HorizontalPosition extends StObject
  object HorizontalPosition {
    
    inline def after: typings.oojsUi.oojsUiStrings.after = "after".asInstanceOf[typings.oojsUi.oojsUiStrings.after]
    
    inline def before: typings.oojsUi.oojsUiStrings.before = "before".asInstanceOf[typings.oojsUi.oojsUiStrings.before]
    
    inline def center: typings.oojsUi.oojsUiStrings.center = "center".asInstanceOf[typings.oojsUi.oojsUiStrings.center]
    
    inline def end: typings.oojsUi.oojsUiStrings.end = "end".asInstanceOf[typings.oojsUi.oojsUiStrings.end]
    
    inline def start: typings.oojsUi.oojsUiStrings.start = "start".asInstanceOf[typings.oojsUi.oojsUiStrings.start]
  }
  
  trait Props extends StObject {
    
    @JSName("$floatable")
    var $floatable: JQuery[HTMLElement]
    
    @JSName("$floatableContainer")
    var $floatableContainer: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($floatable: JQuery[HTMLElement], $floatableContainer: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($floatable = $floatable.asInstanceOf[js.Any], $floatableContainer = $floatableContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$floatable(value: JQuery[HTMLElement]): Self = StObject.set(x, "$floatable", value.asInstanceOf[js.Any])
      
      inline def set$floatableContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "$floatableContainer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Compute how {@link Props.$floatable $floatable} should be positioned based on the
      * position of {@link Props.$floatableContainer $floatableContainer} and the positioning
      * settings. This is a helper for {@link position} that shouldn't be called directly,
      * but may be overridden by subclasses if they want to change or add to the positioning
      * logic.
      *
      * @return New position to apply with {@link JQueryStatic.css() .css()}.
      * Keys are 'top', 'left', 'bottom' and 'right'.
      */
    def computePosition(): Recordtopleftbottomrightn = js.native
    
    /**
      * Check if the floatable is hidden to the user because it was offscreen.
      *
      * @return Floatable is out of view
      */
    def isFloatableOutOfView(): Boolean = js.native
    
    /**
      * Position the floatable below its container.
      *
      * This should only be done when both of them are attached to the DOM and visible.
      *
      * @return The element, for chaining
      */
    def position(): this.type = js.native
    
    /**
      * Set floatable container.
      *
      * The element will be positioned relative to the specified container.
      *
      * @param $floatableContainer Container to keep visible, or null to unset
      */
    def setFloatableContainer(): Unit = js.native
    def setFloatableContainer($floatableContainer: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Set floatable element.
      *
      * If an element is already set, it will be cleaned up before setting up the new element.
      *
      * @param $floatable Element to make floatable
      */
    def setFloatableElement($floatable: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Change how the element is positioned horizontally.
      *
      * @param position 'before', 'after', 'start', 'end' or 'center'
      */
    def setHorizontalPosition(position: HorizontalPosition): Unit = js.native
    
    /**
      * Change how the element is positioned vertically.
      *
      * @param position 'below', 'above', 'top', 'bottom' or 'center'
      */
    def setVerticalPosition(position: VerticalPosition): Unit = js.native
    
    /**
      * Toggle positioning.
      *
      * Do not turn positioning on until after the element is attached to the DOM and visible.
      *
      * @param positioning Enable positioning, omit to toggle
      * @return The element, for chaining
      */
    def togglePositioning(): this.type = js.native
    def togglePositioning(positioning: Boolean): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oojsUi.oojsUiStrings.below
    - typings.oojsUi.oojsUiStrings.above
    - typings.oojsUi.oojsUiStrings.top
    - typings.oojsUi.oojsUiStrings.bottom
    - typings.oojsUi.oojsUiStrings.center
  */
  trait VerticalPosition extends StObject
  object VerticalPosition {
    
    inline def above: typings.oojsUi.oojsUiStrings.above = "above".asInstanceOf[typings.oojsUi.oojsUiStrings.above]
    
    inline def below: typings.oojsUi.oojsUiStrings.below = "below".asInstanceOf[typings.oojsUi.oojsUiStrings.below]
    
    inline def bottom: typings.oojsUi.oojsUiStrings.bottom = "bottom".asInstanceOf[typings.oojsUi.oojsUiStrings.bottom]
    
    inline def center: typings.oojsUi.oojsUiStrings.center = "center".asInstanceOf[typings.oojsUi.oojsUiStrings.center]
    
    inline def top: typings.oojsUi.oojsUiStrings.top = "top".asInstanceOf[typings.oojsUi.oojsUiStrings.top]
  }
}
