package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.mixin.ButtonElement.Props
import typings.oojsUi.OO.ui.mixin.ButtonElement.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ButtonElement is often mixed into other classes to generate a button, which is a clickable
  * interface element that can be configured with access keys for keyboard interaction.
  * See the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Buttons_and_Switches#Buttons)
  * for examples.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.ButtonElement
  */
@js.native
trait ButtonElement
  extends StObject
     with Props
     with Prototype
object ButtonElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * The button element created by the class. If this configuration is omitted,
      * the button element will use a generated `<a>`.
      */
    @JSName("$button")
    var $button: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /** Render the button with a frame */
    var framed: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$button(value: JQuery[HTMLElement]): Self = StObject.set(x, "$button", value.asInstanceOf[js.Any])
      
      inline def set$buttonUndefined: Self = StObject.set(x, "$button", js.undefined)
      
      inline def setFramed(value: Boolean): Self = StObject.set(x, "framed", value.asInstanceOf[js.Any])
      
      inline def setFramedUndefined: Self = StObject.set(x, "framed", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[ButtonElement]
       with Instantiable1[/* config */ ConfigOptions, ButtonElement] {
    
    var static: Static = js.native
  }
  
  trait EventMap extends StObject {
    
    var click: js.Array[Any]
  }
  object EventMap {
    
    inline def apply(click: js.Array[Any]): EventMap = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setClick(value: js.Array[Any]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickVarargs(value: Any*): Self = StObject.set(x, "click", js.Array(value*))
    }
  }
  
  /**
    * @see https://www.mediawiki.org/wiki/OOUI/Elements/Flagged#ButtonElement_and_Tool
    */
  /* Rewritten from type alias, can be one of: 
    - typings.oojsUi.oojsUiStrings.progressive
    - typings.oojsUi.oojsUiStrings.destructive
    - typings.oojsUi.oojsUiStrings.primary
  */
  trait Flag extends StObject
  object Flag {
    
    inline def destructive: typings.oojsUi.oojsUiStrings.destructive = "destructive".asInstanceOf[typings.oojsUi.oojsUiStrings.destructive]
    
    inline def primary: typings.oojsUi.oojsUiStrings.primary = "primary".asInstanceOf[typings.oojsUi.oojsUiStrings.primary]
    
    inline def progressive: typings.oojsUi.oojsUiStrings.progressive = "progressive".asInstanceOf[typings.oojsUi.oojsUiStrings.progressive]
  }
  
  trait Props extends StObject {
    
    @JSName("$button")
    var $button: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($button: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($button = $button.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$button(value: JQuery[HTMLElement]): Self = StObject.set(x, "$button", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Check if the button is active
      */
    def isActive(): Boolean = js.native
    
    /**
      * Check if button has a frame.
      *
      * @return Button is framed
      */
    def isFramed(): Boolean = js.native
    
    // The two functions below are marked as protected in ButtonElement's doc, but are made
    // public in ButtonWidget's doc, so they are listed here.
    /**
      * Set the button's active state.
      *
      * The active state can be set on:
      *
      *  - {@link OO.ui.ButtonOptionWidget ButtonOptionWidget} when it is selected
      *  - {@link OO.ui.ToggleButtonWidget ToggleButtonWidget} when it is toggle on
      *  - {@link OO.ui.ButtonWidget ButtonWidget} when clicking the button would only refresh
      * the page
      *
      * @param value Make button active
      * @return The element, for chaining
      */
    def setActive(value: Boolean): this.type = js.native
    
    /**
      * Set the button element.
      *
      * This method is used to retarget a button mixin so that its functionality applies to
      * the specified button element instead of the one created by the class. If a button
      * element is already set, the method will remove the mixin’s effect on that element.
      *
      * @param $button Element to use as button
      */
    def setButtonElement($button: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Render the button with or without a frame. Omit the `framed` parameter to toggle the
      * button frame on and off.
      *
      * @param framed Make button framed, omit to toggle
      * @return The element, for chaining
      */
    def toggleFramed(): this.type = js.native
    def toggleFramed(framed: Boolean): this.type = js.native
  }
  
  trait Static extends StObject {
    
    /**
      * Cancel mouse down events.
      *
      * This property is usually set to `true` to prevent the focus from changing when the
      * button is clicked.
      * Classes such as {@link OO.ui.mixin.DraggableElement DraggableElement} and
      * {@link OO.ui.ButtonOptionWidget ButtonOptionWidget} use a value of `false` so that
      * dragging behavior is possible and mousedown events can be handled by a parent widget.
      */
    var cancelButtonMouseDownEvents: Boolean
  }
  object Static {
    
    inline def apply(cancelButtonMouseDownEvents: Boolean): Static = {
      val __obj = js.Dynamic.literal(cancelButtonMouseDownEvents = cancelButtonMouseDownEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setCancelButtonMouseDownEvents(value: Boolean): Self = StObject.set(x, "cancelButtonMouseDownEvents", value.asInstanceOf[js.Any])
    }
  }
}
