package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.oojsUi.OO.ui.mixin.AccessKeyedElement.ConfigOptions
import typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace for OOUI mixins.
  *
  * Mixins are named according to the type of object they are intended to
  * be mixed in to. For example, {@link OO.ui.mixin.GroupElement} is intended to be
  * mixed in to an instance of {@link OO.ui.Element}, and {@link OO.ui.mixin.GroupWidget}
  * is intended to be mixed in to an instance of {@link OO.ui.Widget}.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin
  */
object mixin {
  
  object AccessKeyedElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.AccessKeyedElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.AccessKeyedElement {
      def this(config: ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$accessKeyed")
      var $accessKeyed: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.AccessKeyedElement")
    @js.native
    val ^ : js.Object & Constructor = js.native
    
    type _To = js.Object & Constructor
    
    /* This means you don't have to write `^`, but can instead just say `AccessKeyedElement.foo` */
    override def _to: js.Object & Constructor = ^
  }
  
  object ButtonElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.ButtonElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.ButtonElement {
      def this(config: typings.oojsUi.OO.ui.mixin.ButtonElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$button")
      var $button: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.ButtonElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.ButtonElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.ButtonElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `ButtonElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.ButtonElement.Constructor = ^
  }
  
  object ClippableElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.ClippableElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.ClippableElement {
      def this(config: typings.oojsUi.OO.ui.mixin.ClippableElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$clippable")
      var $clippable: JQuery[HTMLElement] = js.native
      
      /* CompleteClass */
      @JSName("$clippableContainer")
      var $clippableContainer: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.ClippableElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.ClippableElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.ClippableElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `ClippableElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.ClippableElement.Constructor = ^
  }
  
  object DraggableElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.DraggableElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.DraggableElement {
      def this(config: typings.oojsUi.OO.ui.mixin.DraggableElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$handle")
      var $handle: JQuery[HTMLElement] = js.native
      
      /**
        * Check the draggable state of this widget.
        *
        * @return Widget supports draggable operations
        */
      /* CompleteClass */
      override def isDraggable(): Boolean = js.native
      
      /**
        * Change the draggable state of this widget.
        * This allows users to temporarily halt the dragging operations.
        *
        * @param isDraggable Widget supports draggable operations
        */
      /* CompleteClass */
      override def toggleDraggable(isDraggable: Boolean): Unit = js.native
    }
    
    @JSGlobal("OO.ui.mixin.DraggableElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.DraggableElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.DraggableElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `DraggableElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.DraggableElement.Constructor = ^
  }
  
  object DraggableGroupElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.DraggableGroupElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.DraggableGroupElement {
      def this(config: typings.oojsUi.OO.ui.mixin.DraggableGroupElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$group")
      var $group: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.DraggableGroupElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.DraggableGroupElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.DraggableGroupElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `DraggableGroupElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.DraggableGroupElement.Constructor = ^
  }
  
  object FlaggedElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.FlaggedElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.FlaggedElement {
      def this(config: typings.oojsUi.OO.ui.mixin.FlaggedElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$flagged")
      var $flagged: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.FlaggedElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.FlaggedElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.FlaggedElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `FlaggedElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.FlaggedElement.Constructor = ^
  }
  
  object FloatableElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.FloatableElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.FloatableElement {
      def this(config: typings.oojsUi.OO.ui.mixin.FloatableElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$floatable")
      var $floatable: JQuery[HTMLElement] = js.native
      
      /* CompleteClass */
      @JSName("$floatableContainer")
      var $floatableContainer: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.FloatableElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.FloatableElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.FloatableElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `FloatableElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.FloatableElement.Constructor = ^
  }
  
  object GroupElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.GroupElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.GroupElement {
      def this(config: typings.oojsUi.OO.ui.mixin.GroupElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$group")
      var $group: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.GroupElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.GroupElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.GroupElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `GroupElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.GroupElement.Constructor = ^
  }
  
  object IconElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.IconElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.IconElement {
      def this(config: typings.oojsUi.OO.ui.mixin.IconElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$icon")
      var $icon: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.IconElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.IconElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.IconElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `IconElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.IconElement.Constructor = ^
  }
  
  object IndicatorElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.IndicatorElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.IndicatorElement {
      def this(config: typings.oojsUi.OO.ui.mixin.IndicatorElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$indicator")
      var $indicator: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.IndicatorElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.IndicatorElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.IndicatorElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `IndicatorElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.IndicatorElement.Constructor = ^
  }
  
  object LabelElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.LabelElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.LabelElement {
      def this(config: typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$label")
      var $label: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.LabelElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.LabelElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.LabelElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `LabelElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.LabelElement.Constructor = ^
  }
  
  object LookupElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.LookupElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.LookupElement {
      def this(config: typings.oojsUi.OO.ui.mixin.LookupElement.ConfigOptions) = this()
      
      /**
        * Get request results for the current query.
        *
        * @return Promise object which will be passed response data as the first argument
        *  of the done event. If the request was aborted to make way for a subsequent request, this
        *  promise may not be rejected, depending on what jQuery feels like doing.
        */
      /* CompleteClass */
      override def getRequestData(): Promise[Any, Any, Any] = js.native
      
      /**
        * Disable or re-enable lookups.
        *
        * When lookups are disabled, calls to populateLookupMenu will be ignored.
        *
        * @param disabled Disable lookups
        */
      /* CompleteClass */
      override def setLookupsDisabled(disabled: Boolean): Unit = js.native
      
      /**
        * Set the read-only state of the widget.
        *
        * This will also disable/enable the lookups functionality.
        *
        * @param readOnly Make input read-only
        * @return The element, for chaining
        */
      /* CompleteClass */
      override def setReadOnly(readOnly: Boolean): this.type = js.native
    }
    
    @JSGlobal("OO.ui.mixin.LookupElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.LookupElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.LookupElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `LookupElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.LookupElement.Constructor = ^
  }
  
  object PendingElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.PendingElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.PendingElement {
      def this(config: typings.oojsUi.OO.ui.mixin.PendingElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$pending")
      var $pending: JQuery[HTMLElement] = js.native
      
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
    
    @JSGlobal("OO.ui.mixin.PendingElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.PendingElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.PendingElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `PendingElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.PendingElement.Constructor = ^
  }
  
  object PopupElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.PopupElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.PopupElement {
      def this(config: typings.oojsUi.OO.ui.mixin.PopupElement.ConfigOptions) = this()
      
      /**
        * Get popup.
        *
        * @return Popup widget
        */
      /* CompleteClass */
      override def getPopup(): typings.oojsUi.OO.ui.PopupWidget = js.native
    }
    
    @JSGlobal("OO.ui.mixin.PopupElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.PopupElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.PopupElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `PopupElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.PopupElement.Constructor = ^
  }
  
  object RequestManager extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.RequestManager")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.RequestManager {
      def this(config: typings.oojsUi.OO.ui.mixin.RequestManager.ConfigOptions) = this()
      
      /**
        * Get request results for the current query.
        *
        * @return Promise object which will be passed response data as the first argument
        *  of the done event. If the request was aborted to make way for a subsequent request, this
        *  promise may not be rejected, depending on what jQuery feels like doing.
        */
      /* CompleteClass */
      override def getRequestData(): Promise[Any, Any, Any] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.RequestManager")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.RequestManager.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.RequestManager.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `RequestManager.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.RequestManager.Constructor = ^
  }
  
  object RequiredElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.RequiredElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.RequiredElement {
      def this(config: typings.oojsUi.OO.ui.mixin.RequiredElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$required")
      var $required: JQuery[HTMLElement] = js.native
      
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
    
    @JSGlobal("OO.ui.mixin.RequiredElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.RequiredElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.RequiredElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `RequiredElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.RequiredElement.Constructor = ^
  }
  
  object TabIndexedElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.TabIndexedElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.TabIndexedElement {
      def this(config: typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$tabIndexed")
      var $tabIndexed: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.TabIndexedElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.TabIndexedElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.TabIndexedElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `TabIndexedElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.TabIndexedElement.Constructor = ^
  }
  
  object TitledElement extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("OO.ui.mixin.TitledElement")
    @js.native
    /** @param config Configuration options */
    open class ^ ()
      extends StObject
         with typings.oojsUi.OO.ui.mixin.TitledElement {
      def this(config: typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions) = this()
      
      /* CompleteClass */
      @JSName("$titled")
      var $titled: JQuery[HTMLElement] = js.native
    }
    
    @JSGlobal("OO.ui.mixin.TitledElement")
    @js.native
    val ^ : js.Object & typings.oojsUi.OO.ui.mixin.TitledElement.Constructor = js.native
    
    type _To = js.Object & typings.oojsUi.OO.ui.mixin.TitledElement.Constructor
    
    /* This means you don't have to write `^`, but can instead just say `TitledElement.foo` */
    override def _to: js.Object & typings.oojsUi.OO.ui.mixin.TitledElement.Constructor = ^
  }
}
