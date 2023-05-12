package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.RadioInputWidget.ConfigOptions
import typings.oojsUi.OO.ui.RadioInputWidget.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioInputWidget extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.RadioInputWidget")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.RadioInputWidget {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$input")
    var $input: JQuery[HTMLElement] = js.native
    
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
      * Check if the input is {@link ConfigOptions.required required}.
      *
      * @return
      */
    /* CompleteClass */
    override def isRequired(): Boolean = js.native
    
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
  
  @JSGlobal("OO.ui.RadioInputWidget")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.RadioInputWidget.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget {
    def this(config: typings.oojsUi.OO.ui.InputWidget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$input")
    var $input: JQuery[HTMLElement] = js.native
    
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
  @JSGlobal("OO.ui.RadioInputWidget.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget {
    def this(config: typings.oojsUi.OO.ui.InputWidget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accessKeyed")
    var $accessKeyed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$input")
    var $input: JQuery[HTMLElement] = js.native
    
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
  
  /* This means you don't have to write `^`, but can instead just say `RadioInputWidget.foo` */
  override def _to: js.Object & Constructor = ^
}
