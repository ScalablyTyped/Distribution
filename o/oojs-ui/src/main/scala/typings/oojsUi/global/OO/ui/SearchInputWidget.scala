package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.SearchInputWidget.ConfigOptions
import typings.oojsUi.OO.ui.SearchInputWidget.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchInputWidget extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.SearchInputWidget")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.SearchInputWidget {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$flagged")
    var $flagged: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$icon")
    var $icon: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$indicator")
    var $indicator: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$input")
    var $input: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$pending")
    var $pending: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$required")
    var $required: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$tabIndexed")
    var $tabIndexed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$titled")
    var $titled: JQuery[HTMLElement] = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    /**
      * Check if an element is pending.
      *
      * @return Element is pending
      */
    /* CompleteClass */
    override def isPending(): Boolean = js.native
    
    /**
      * Check if the input is {@link ConfigOptions.required required}.
      *
      * @return
      */
    /* CompleteClass */
    override def isRequired(): Boolean = js.native
    
    /**
      * Decrease the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    /* CompleteClass */
    override def popPending(): this.type = js.native
    
    /**
      * Increase the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    /* CompleteClass */
    override def pushPending(): this.type = js.native
    
    /**
      * Set the pending element (and clean up any existing one).
      *
      * @param $pending The element to set to pending.
      */
    /* CompleteClass */
    override def setPendingElement($pending: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Set the {@link ConfigOptions.required required} state of the input.
      *
      * @param state Make input required
      * @return The widget, for chaining
      */
    /* CompleteClass */
    override def setRequired(state: Boolean): this.type = js.native
    
    /**
      * Set the element which can take the required attribute.
      *
      * This method is used to retarget a RequiredElement mixin so that its functionality
      * applies to the specified element.
      * If an element is already set, the mixin’s effect on that element is removed before
      * the new element is set up.
      *
      * @param $required Element that should use the 'required' functionality
      */
    /* CompleteClass */
    override def setRequiredElement($required: JQuery[HTMLElement]): Unit = js.native
  }
  
  @JSGlobal("OO.ui.SearchInputWidget")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.SearchInputWidget.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget {
    def this(config: typings.oojsUi.OO.ui.TextInputWidget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$flagged")
    var $flagged: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$icon")
    var $icon: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$indicator")
    var $indicator: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$input")
    var $input: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$pending")
    var $pending: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$required")
    var $required: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$tabIndexed")
    var $tabIndexed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$titled")
    var $titled: JQuery[HTMLElement] = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    /**
      * Check if an element is pending.
      *
      * @return Element is pending
      */
    /* CompleteClass */
    override def isPending(): Boolean = js.native
    
    /**
      * Check if the input is {@link ConfigOptions.required required}.
      *
      * @return
      */
    /* CompleteClass */
    override def isRequired(): Boolean = js.native
    
    /**
      * Decrease the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    /* CompleteClass */
    override def popPending(): this.type = js.native
    
    /**
      * Increase the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    /* CompleteClass */
    override def pushPending(): this.type = js.native
    
    /**
      * Set the pending element (and clean up any existing one).
      *
      * @param $pending The element to set to pending.
      */
    /* CompleteClass */
    override def setPendingElement($pending: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Set the {@link ConfigOptions.required required} state of the input.
      *
      * @param state Make input required
      * @return The widget, for chaining
      */
    /* CompleteClass */
    override def setRequired(state: Boolean): this.type = js.native
    
    /**
      * Set the element which can take the required attribute.
      *
      * This method is used to retarget a RequiredElement mixin so that its functionality
      * applies to the specified element.
      * If an element is already set, the mixin’s effect on that element is removed before
      * the new element is set up.
      *
      * @param $required Element that should use the 'required' functionality
      */
    /* CompleteClass */
    override def setRequiredElement($required: JQuery[HTMLElement]): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.SearchInputWidget.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget {
    def this(config: typings.oojsUi.OO.ui.TextInputWidget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$flagged")
    var $flagged: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$icon")
    var $icon: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$indicator")
    var $indicator: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$input")
    var $input: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$pending")
    var $pending: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$required")
    var $required: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$tabIndexed")
    var $tabIndexed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$titled")
    var $titled: JQuery[HTMLElement] = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    /**
      * Check if an element is pending.
      *
      * @return Element is pending
      */
    /* CompleteClass */
    override def isPending(): Boolean = js.native
    
    /**
      * Check if the input is {@link ConfigOptions.required required}.
      *
      * @return
      */
    /* CompleteClass */
    override def isRequired(): Boolean = js.native
    
    /**
      * Decrease the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    /* CompleteClass */
    override def popPending(): this.type = js.native
    
    /**
      * Increase the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    /* CompleteClass */
    override def pushPending(): this.type = js.native
    
    /**
      * Set the pending element (and clean up any existing one).
      *
      * @param $pending The element to set to pending.
      */
    /* CompleteClass */
    override def setPendingElement($pending: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Set the {@link ConfigOptions.required required} state of the input.
      *
      * @param state Make input required
      * @return The widget, for chaining
      */
    /* CompleteClass */
    override def setRequired(state: Boolean): this.type = js.native
    
    /**
      * Set the element which can take the required attribute.
      *
      * This method is used to retarget a RequiredElement mixin so that its functionality
      * applies to the specified element.
      * If an element is already set, the mixin’s effect on that element is removed before
      * the new element is set up.
      *
      * @param $required Element that should use the 'required' functionality
      */
    /* CompleteClass */
    override def setRequiredElement($required: JQuery[HTMLElement]): Unit = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SearchInputWidget.foo` */
  override def _to: js.Object & Constructor = ^
}
