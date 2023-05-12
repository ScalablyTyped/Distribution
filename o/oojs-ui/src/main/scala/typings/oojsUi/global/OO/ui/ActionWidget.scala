package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.ActionWidget.ConfigOptions
import typings.oojsUi.OO.ui.ActionWidget.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionWidget extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ActionWidget")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.ActionWidget {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$button")
    var $button: JQuery[HTMLElement] = js.native
    
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
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$pending")
    var $pending: JQuery[HTMLElement] = js.native
    
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
  }
  
  @JSGlobal("OO.ui.ActionWidget")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ActionWidget.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.ButtonWidget {
    def this(config: typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$button")
    var $button: JQuery[HTMLElement] = js.native
    
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
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
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
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ActionWidget.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.ButtonWidget {
    def this(config: typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$button")
    var $button: JQuery[HTMLElement] = js.native
    
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
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
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
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `ActionWidget.foo` */
  override def _to: js.Object & Constructor = ^
}
