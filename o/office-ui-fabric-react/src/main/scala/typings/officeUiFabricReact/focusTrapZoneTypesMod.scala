package typings.officeUiFabricReact

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusTrapZoneTypesMod {
  
  @js.native
  trait IFocusTrapZone extends StObject {
    
    /**
      * Sets focus to a descendant in the Trap Zone.
      * See firstFocusableSelector and focusPreviouslyFocusedInnerElement for details.
      */
    def focus(): Unit = js.native
  }
  object IFocusTrapZone {
    
    @scala.inline
    def apply(focus: () => Unit): IFocusTrapZone = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IFocusTrapZone]
    }
    
    @scala.inline
    implicit class IFocusTrapZoneMutableBuilder[Self <: IFocusTrapZone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IFocusTrapZoneProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Sets the aria-labelledby attribute.
      */
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IFocusTrapZone interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IFocusTrapZone]] = js.native
    
    /**
      * Do not put focus onto the first element inside the focus trap zone.
      * @defaultvalue false
      */
    var disableFirstFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to disable the FocusTrapZone's focus trapping behavior.
      * @defaultvalue false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the element to focus on when exiting the FocusTrapZone.
      * @defaultvalue The `element.target` that triggered the FTZ.
      */
    var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Puts aria-hidden=true on all non-ancestors of the current element, for screen readers.
      * This is an experimental feature that will be graduated to default behavior after testing.
      * This flag will be removed with the next major release.
      */
    var enableAriaHiddenSiblings: js.UndefOr[Boolean] = js.native
    
    /**
      * Class name (not actual selector) for first focusable item. Do not append a dot.
      * Only applies if `focusPreviouslyFocusedInnerElement` is false.
      * @deprecated Use `firstFocusableTarget`, since it is more generic. `firstFocusableTarget` takes precendence if
      * supplied.
      */
    var firstFocusableSelector: js.UndefOr[String | js.Function0[String]] = js.native
    
    /**
      * Either a full query selector for the first focusable element, or a function to select the focusable element
      * within the area directly.
      */
    var firstFocusableTarget: js.UndefOr[String | (js.Function1[/* element */ HTMLElement, HTMLElement | Null])] = js.native
    
    /**
      * Specifies which descendant element to focus when `focus()` is called.
      * If false, use the first focusable descendant, filtered by the `firstFocusableSelector` property if present.
      * If true, use the element that was focused when the trap zone last had a focused descendant
      * (or fall back to the first focusable descendant if the trap zone has never been focused).
      * @defaultvalue false
      */
    var focusPreviouslyFocusedInnerElement: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the focus trap zone should force focus to stay inside of it.
      * @defaultvalue true
      */
    var forceFocusInsideTrap: js.UndefOr[Boolean] = js.native
    
    /**
      * If false (the default), the trap zone will restore focus to the element which activated it
      * once the trap zone is unmounted or disabled. Set to true to disable this behavior.
      * @defaultvalue false
      */
    var ignoreExternalFocusing: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether clicks are allowed outside this FocusTrapZone.
      * @defaultvalue false
      */
    var isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.native
  }
  object IFocusTrapZoneProps {
    
    @scala.inline
    def apply(): IFocusTrapZoneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFocusTrapZoneProps]
    }
    
    @scala.inline
    implicit class IFocusTrapZonePropsMutableBuilder[Self <: IFocusTrapZoneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IFocusTrapZone]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IFocusTrapZone | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDisableFirstFocus(value: Boolean): Self = StObject.set(x, "disableFirstFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFirstFocusUndefined: Self = StObject.set(x, "disableFirstFocus", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setElementToFocusOnDismiss(value: HTMLElement): Self = StObject.set(x, "elementToFocusOnDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementToFocusOnDismissUndefined: Self = StObject.set(x, "elementToFocusOnDismiss", js.undefined)
      
      @scala.inline
      def setEnableAriaHiddenSiblings(value: Boolean): Self = StObject.set(x, "enableAriaHiddenSiblings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAriaHiddenSiblingsUndefined: Self = StObject.set(x, "enableAriaHiddenSiblings", js.undefined)
      
      @scala.inline
      def setFirstFocusableSelector(value: String | js.Function0[String]): Self = StObject.set(x, "firstFocusableSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFocusableSelectorFunction0(value: () => String): Self = StObject.set(x, "firstFocusableSelector", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFirstFocusableSelectorUndefined: Self = StObject.set(x, "firstFocusableSelector", js.undefined)
      
      @scala.inline
      def setFirstFocusableTarget(value: String | (js.Function1[/* element */ HTMLElement, HTMLElement | Null])): Self = StObject.set(x, "firstFocusableTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFocusableTargetFunction1(value: /* element */ HTMLElement => HTMLElement | Null): Self = StObject.set(x, "firstFocusableTarget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirstFocusableTargetUndefined: Self = StObject.set(x, "firstFocusableTarget", js.undefined)
      
      @scala.inline
      def setFocusPreviouslyFocusedInnerElement(value: Boolean): Self = StObject.set(x, "focusPreviouslyFocusedInnerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusPreviouslyFocusedInnerElementUndefined: Self = StObject.set(x, "focusPreviouslyFocusedInnerElement", js.undefined)
      
      @scala.inline
      def setForceFocusInsideTrap(value: Boolean): Self = StObject.set(x, "forceFocusInsideTrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFocusInsideTrapUndefined: Self = StObject.set(x, "forceFocusInsideTrap", js.undefined)
      
      @scala.inline
      def setIgnoreExternalFocusing(value: Boolean): Self = StObject.set(x, "ignoreExternalFocusing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreExternalFocusingUndefined: Self = StObject.set(x, "ignoreExternalFocusing", js.undefined)
      
      @scala.inline
      def setIsClickableOutsideFocusTrap(value: Boolean): Self = StObject.set(x, "isClickableOutsideFocusTrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClickableOutsideFocusTrapUndefined: Self = StObject.set(x, "isClickableOutsideFocusTrap", js.undefined)
    }
  }
}
