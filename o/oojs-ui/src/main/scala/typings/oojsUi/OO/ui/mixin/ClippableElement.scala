package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.mixin.ClippableElement.Props
import typings.oojsUi.OO.ui.mixin.ClippableElement.Prototype
import typings.oojsUi.oojsUiStrings.bottom
import typings.oojsUi.oojsUiStrings.left
import typings.oojsUi.oojsUiStrings.right
import typings.oojsUi.oojsUiStrings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Element that can be automatically clipped to visible boundaries.
  *
  * Whenever the element's natural height changes, you have to call
  * {@link OO.ui.mixin.ClippableElement.clip} to make sure it's still
  * clipping correctly.
  *
  * The dimensions of {@link ClippableElement.Props.$clippableContainer $clippableContainer} will
  * be compared to the boundaries of the nearest scrollable container. If $clippableContainer is
  * too tall and/or too wide, then {@link ClippableElement.Props.$clippable $clippable} will be
  * given a fixed reduced height and/or width and will be made scrollable. By default, $clippable
  * and $clippableContainer are the same element, but you can build a static footer by setting
  * $clippableContainer to an element that contains $clippable and the footer.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.ClippableElement
  */
@js.native
trait ClippableElement
  extends StObject
     with Props
     with Prototype
object ClippableElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * Node to clip, assigned to {@link Props.$clippable $clippable},
      * omit to use {@link Element.Props.$element $element}
      */
    @JSName("$clippable")
    var $clippable: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Node to keep visible, assigned to {@link Props.$clippableContainer $clippableContainer},
      * omit to use {@link $clippable}
      */
    @JSName("$clippableContainer")
    var $clippableContainer: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$clippable(value: JQuery[HTMLElement]): Self = StObject.set(x, "$clippable", value.asInstanceOf[js.Any])
      
      inline def set$clippableContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "$clippableContainer", value.asInstanceOf[js.Any])
      
      inline def set$clippableContainerUndefined: Self = StObject.set(x, "$clippableContainer", js.undefined)
      
      inline def set$clippableUndefined: Self = StObject.set(x, "$clippable", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[ClippableElement]
       with Instantiable1[/* config */ ConfigOptions, ClippableElement]
  
  trait Props extends StObject {
    
    @JSName("$clippable")
    var $clippable: JQuery[HTMLElement]
    
    @JSName("$clippableContainer")
    var $clippableContainer: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($clippable: JQuery[HTMLElement], $clippableContainer: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($clippable = $clippable.asInstanceOf[js.Any], $clippableContainer = $clippableContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$clippable(value: JQuery[HTMLElement]): Self = StObject.set(x, "$clippable", value.asInstanceOf[js.Any])
      
      inline def set$clippableContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "$clippableContainer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Clip element to visible boundaries and allow scrolling when needed. You should call
      * this method when the element's natural height changes.
      *
      * Element will be clipped the bottom or right of the element is within 10px of the edge
      * of, or overlapped by, the visible area of the nearest scrollable container.
      *
      * Because calling clip() when the natural height changes isn't always possible, we also
      * set max-height when the element isn't being clipped. This means that if the element
      * tries to grow beyond the edge, something reasonable will happen before clip() is called.
      *
      * @return The element, for chaining
      */
    def clip(): this.type = js.native
    
    /**
      * Return the side of the clippable on which it is "anchored" (aligned to something else).
      * ClippableElement will clip the opposite side when reducing element's width.
      *
      * Classes that mix in ClippableElement should override this to return 'right' if their
      * clippable is absolutely positioned and using 'right: Npx' (and not using 'left').
      * If your class also mixes in FloatableElement, this is handled automatically.
      *
      * (This can't be guessed from the actual CSS because the computed values for
      * 'left'/'right' are always in pixels, even if they were unset or set to 'auto'.)
      *
      * When in doubt, 'left' (or 'right' in RTL) is a reasonable fallback.
      *
      * @return 'left' or 'right'
      */
    def getHorizontalAnchorEdge(): left | right = js.native
    
    /**
      * Return the side of the clippable on which it is "anchored" (aligned to something else).
      * ClippableElement will clip the opposite side when reducing element's width.
      *
      * Classes that mix in ClippableElement should override this to return 'bottom' if their
      * clippable is absolutely positioned and using 'bottom: Npx' (and not using 'top').
      * If your class also mixes in FloatableElement, this is handled automatically.
      *
      * (This can't be guessed from the actual CSS because the computed values for 'left'/'right'
      * are always in pixels, even if they were unset or set to 'auto'.)
      *
      * When in doubt, 'top' is a reasonable fallback.
      *
      * @return 'top' or 'bottom'
      */
    def getVerticalAnchorEdge(): top | bottom = js.native
    
    /**
      * Check if the bottom or right of the element is being clipped by the nearest scrollable
      * container.
      *
      * @return Part of the element is being clipped
      */
    def isClipped(): Boolean = js.native
    
    /**
      * Check if the right of the element is being clipped by the nearest scrollable container.
      *
      * @return Part of the element is being clipped
      */
    def isClippedHorizontally(): Boolean = js.native
    
    /**
      * Check if the bottom of the element is being clipped by the nearest scrollable container.
      *
      * @return Part of the element is being clipped
      */
    def isClippedVertically(): Boolean = js.native
    
    /**
      * Check if the element will be clipped to fit the visible area of the nearest scrollable
      * container.
      *
      * @return Element will be clipped to the visible area
      */
    def isClipping(): Boolean = js.native
    
    /**
      * Set clippable container.
      *
      * This is the container that will be measured when deciding whether to clip. When clipping,
      * {@link Props.$clippable $clippable} will be resized in order to keep the clippable
      * container fully visible.
      *
      * If the clippable container is unset, {@link Props.$clippable $clippable} will be used.
      *
      * @param $clippableContainer Container to keep visible, or null to unset
      */
    def setClippableContainer(): Unit = js.native
    def setClippableContainer($clippableContainer: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Set clippable element.
      *
      * If an element is already set, it will be cleaned up before setting up the new element.
      *
      * @param $clippable Element to make clippable
      */
    def setClippableElement($clippable: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Set the ideal size. These are the dimensions {@link Props.$clippable} will have when
      * it's not being clipped.
      *
      * @param width Width as a number of pixels or CSS string with unit suffix
      * @param height Height as a number of pixels or CSS string with unit suffix
      */
    def setIdealSize(): Unit = js.native
    def setIdealSize(width: String): Unit = js.native
    def setIdealSize(width: String, height: String): Unit = js.native
    def setIdealSize(width: String, height: Double): Unit = js.native
    def setIdealSize(width: Double): Unit = js.native
    def setIdealSize(width: Double, height: String): Unit = js.native
    def setIdealSize(width: Double, height: Double): Unit = js.native
    def setIdealSize(width: Unit, height: String): Unit = js.native
    def setIdealSize(width: Unit, height: Double): Unit = js.native
    
    /**
      * Toggle clipping.
      *
      * Do not turn clipping on until after the element is attached to the DOM and visible.
      *
      * @param clipping Enable clipping, omit to toggle
      * @return The element, for chaining
      */
    def toggleClipping(): this.type = js.native
    def toggleClipping(clipping: Boolean): this.type = js.native
  }
}
