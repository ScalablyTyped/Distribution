package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.ProcessDialog.ConfigOptions
import typings.oojsUi.OO.ui.ProcessDialog.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProcessDialog extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ProcessDialog")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.ProcessDialog {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$content")
    var $content: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$focusTrapAfter")
    var $focusTrapAfter: JQuery[HTMLElement] = js.native
    
    /**
      * Set focus traps
      *
      * It is considered best practice to trap focus in a loop within a modal dialog, even
      * though with 'inert' support we could allow focus to break out to the browser chrome.
      *
      * - https://www.w3.org/TR/wai-aria-practices-1.1/examples/dialog-modal/dialog.html#kbd_label
      * - https://allyjs.io/tutorials/accessible-dialog.html#reacting-to-kbdtabkbd-and-kbdshift-tabkbd
      * - https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Roles/dialog_role#focus_management
      */
    /* CompleteClass */
    @JSName("$focusTrapBefore")
    var $focusTrapBefore: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$focusTraps")
    var $focusTraps: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$frame")
    var $frame: JQuery[HTMLElement] = js.native
    
    /**
      * Overlay element to use for the `$overlay` configuration option of widgets that support it.
      * Things put inside it are overlaid on top of the window and are not bound to its dimensions.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      *
      *     MyDialog.prototype.initialize = function () {
      *       ...
      *       var popupButton = new OO.ui.PopupButtonWidget( {
      *         $overlay: this.$overlay,
      *         label: 'Popup button',
      *         popup: {
      *           $content: $( '<p>Popup content.</p><p>More content.</p><p>Yet more content.</p>' ),
      *           padded: true
      *         }
      *       } );
      *       ...
      *     };
      */
    /* CompleteClass */
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement] = js.native
    
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
  
  @JSGlobal("OO.ui.ProcessDialog")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ProcessDialog.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.Dialog {
    def this(config: typings.oojsUi.OO.ui.Dialog.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$content")
    var $content: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$focusTrapAfter")
    var $focusTrapAfter: JQuery[HTMLElement] = js.native
    
    /**
      * Set focus traps
      *
      * It is considered best practice to trap focus in a loop within a modal dialog, even
      * though with 'inert' support we could allow focus to break out to the browser chrome.
      *
      * - https://www.w3.org/TR/wai-aria-practices-1.1/examples/dialog-modal/dialog.html#kbd_label
      * - https://allyjs.io/tutorials/accessible-dialog.html#reacting-to-kbdtabkbd-and-kbdshift-tabkbd
      * - https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Roles/dialog_role#focus_management
      */
    /* CompleteClass */
    @JSName("$focusTrapBefore")
    var $focusTrapBefore: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$focusTraps")
    var $focusTraps: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$frame")
    var $frame: JQuery[HTMLElement] = js.native
    
    /**
      * Overlay element to use for the `$overlay` configuration option of widgets that support it.
      * Things put inside it are overlaid on top of the window and are not bound to its dimensions.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      *
      *     MyDialog.prototype.initialize = function () {
      *       ...
      *       var popupButton = new OO.ui.PopupButtonWidget( {
      *         $overlay: this.$overlay,
      *         label: 'Popup button',
      *         popup: {
      *           $content: $( '<p>Popup content.</p><p>More content.</p><p>Yet more content.</p>' ),
      *           padded: true
      *         }
      *       } );
      *       ...
      *     };
      */
    /* CompleteClass */
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement] = js.native
    
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ProcessDialog.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.Dialog {
    def this(config: typings.oojsUi.OO.ui.Dialog.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$content")
    var $content: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$focusTrapAfter")
    var $focusTrapAfter: JQuery[HTMLElement] = js.native
    
    /**
      * Set focus traps
      *
      * It is considered best practice to trap focus in a loop within a modal dialog, even
      * though with 'inert' support we could allow focus to break out to the browser chrome.
      *
      * - https://www.w3.org/TR/wai-aria-practices-1.1/examples/dialog-modal/dialog.html#kbd_label
      * - https://allyjs.io/tutorials/accessible-dialog.html#reacting-to-kbdtabkbd-and-kbdshift-tabkbd
      * - https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Roles/dialog_role#focus_management
      */
    /* CompleteClass */
    @JSName("$focusTrapBefore")
    var $focusTrapBefore: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$focusTraps")
    var $focusTraps: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$frame")
    var $frame: JQuery[HTMLElement] = js.native
    
    /**
      * Overlay element to use for the `$overlay` configuration option of widgets that support it.
      * Things put inside it are overlaid on top of the window and are not bound to its dimensions.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      *
      *     MyDialog.prototype.initialize = function () {
      *       ...
      *       var popupButton = new OO.ui.PopupButtonWidget( {
      *         $overlay: this.$overlay,
      *         label: 'Popup button',
      *         popup: {
      *           $content: $( '<p>Popup content.</p><p>More content.</p><p>Yet more content.</p>' ),
      *           padded: true
      *         }
      *       } );
      *       ...
      *     };
      */
    /* CompleteClass */
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement] = js.native
    
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
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `ProcessDialog.foo` */
  override def _to: js.Object & Constructor = ^
}
