package typings.officeUiFabricReact

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.basePickerTypesMod.IInputProps
import typings.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typings.officeUiFabricReact.libAutofillMod.Autofill
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseExtendedPickerTypesMod {
  
  trait IBaseExtendedPicker[T] extends StObject {
    
    /** Sets focus to the input. */
    def focus(): Unit
    
    /** Forces the picker to resolve */
    var forceResolve: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Gets the current value of the input. */
    var items: js.UndefOr[js.Array[T]] = js.undefined
  }
  object IBaseExtendedPicker {
    
    @scala.inline
    def apply[T](focus: () => Unit): IBaseExtendedPicker[T] = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IBaseExtendedPicker[T]]
    }
    
    @scala.inline
    implicit class IBaseExtendedPickerMutableBuilder[Self <: IBaseExtendedPicker[?], T] (val x: Self & IBaseExtendedPicker[T]) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setForceResolve(value: () => Unit): Self = StObject.set(x, "forceResolve", js.Any.fromFunction0(value))
      
      @scala.inline
      def setForceResolveUndefined: Self = StObject.set(x, "forceResolve", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  trait IBaseExtendedPickerProps[T] extends StObject {
    
    /**
      * ClassName for the picker.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Ref of the component
      */
    var componentRef: js.UndefOr[IRefObject[IBaseExtendedPicker[T]]] = js.undefined
    
    /**
      * Current rendered query string that's corealte to current rendered result
      **/
    var currentRenderedQueryString: js.UndefOr[String] = js.undefined
    
    /**
      * Initial items that have already been selected and should appear in the people picker.
      */
    var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * Flag for disabling the picker.
      * @defaultvalue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Floating picker properties
      */
    var floatingPickerProps: IBaseFloatingPickerProps[T]
    
    /**
      * Focus zone props
      */
    var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
    
    /**
      * Header/title element for the picker
      */
    var headerComponent: js.UndefOr[Element] = js.undefined
    
    /**
      * Autofill input native props
      * @defaultvalue undefined
      */
    var inputProps: js.UndefOr[IInputProps] = js.undefined
    
    /**
      * Restrict the amount of selectable items.
      * @defaultvalue undefined
      */
    var itemLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * A callback for when the user moves the focus away from the picker
      */
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.undefined
    
    /**
      * A callback for when the selected list of items changes.
      */
    var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.undefined
    
    /**
      * A callback for when the user put focus on the picker
      */
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.undefined
    
    /**
      * A callback on when an item was added to the selected item list
      */
    var onItemAdded: js.UndefOr[js.Function1[/* addedItem */ T, Unit]] = js.undefined
    
    /**
      * A callback to process a selection after the user selects a suggestion from the picker.
      * The returned item will be added to the selected items list
      */
    var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.undefined
    
    /**
      * A callback on when an item or items were removed from the selected item list
      */
    var onItemsRemoved: js.UndefOr[js.Function1[/* removedItems */ js.Array[T], Unit]] = js.undefined
    
    /**
      * A callback for when text is pasted into the input
      */
    var onPaste: js.UndefOr[js.Function1[/* pastedText */ String, js.Array[T]]] = js.undefined
    
    /**
      * Function that specifies how the floating picker will appear.
      */
    var onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[T]]
    
    /**
      * Function that specifies how the floating picker will appear.
      */
    var onRenderSelectedItems: ComponentType[IBaseSelectedItemsListProps[T]]
    
    /**
      * If using as a controlled component use selectedItems here instead of the SelectedItemsList
      */
    var selectedItems: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * Selected items list properties
      */
    var selectedItemsListProps: IBaseSelectedItemsListProps[T]
    
    /**
      * If using as a controlled component use suggestionItems here instead of FloatingPicker
      */
    var suggestionItems: js.UndefOr[js.Array[T]] = js.undefined
  }
  object IBaseExtendedPickerProps {
    
    @scala.inline
    def apply[T](
      floatingPickerProps: IBaseFloatingPickerProps[T],
      onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[T]],
      onRenderSelectedItems: ComponentType[IBaseSelectedItemsListProps[T]],
      selectedItemsListProps: IBaseSelectedItemsListProps[T]
    ): IBaseExtendedPickerProps[T] = {
      val __obj = js.Dynamic.literal(floatingPickerProps = floatingPickerProps.asInstanceOf[js.Any], onRenderFloatingPicker = onRenderFloatingPicker.asInstanceOf[js.Any], onRenderSelectedItems = onRenderSelectedItems.asInstanceOf[js.Any], selectedItemsListProps = selectedItemsListProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseExtendedPickerProps[T]]
    }
    
    @scala.inline
    implicit class IBaseExtendedPickerPropsMutableBuilder[Self <: IBaseExtendedPickerProps[?], T] (val x: Self & IBaseExtendedPickerProps[T]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IBaseExtendedPicker[T]]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IBaseExtendedPicker[T] | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setCurrentRenderedQueryString(value: String): Self = StObject.set(x, "currentRenderedQueryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentRenderedQueryStringUndefined: Self = StObject.set(x, "currentRenderedQueryString", js.undefined)
      
      @scala.inline
      def setDefaultSelectedItems(value: js.Array[T]): Self = StObject.set(x, "defaultSelectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedItemsUndefined: Self = StObject.set(x, "defaultSelectedItems", js.undefined)
      
      @scala.inline
      def setDefaultSelectedItemsVarargs(value: T*): Self = StObject.set(x, "defaultSelectedItems", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFloatingPickerProps(value: IBaseFloatingPickerProps[T]): Self = StObject.set(x, "floatingPickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusZoneProps(value: IFocusZoneProps): Self = StObject.set(x, "focusZoneProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusZonePropsUndefined: Self = StObject.set(x, "focusZoneProps", js.undefined)
      
      @scala.inline
      def setHeaderComponent(value: Element): Self = StObject.set(x, "headerComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderComponentUndefined: Self = StObject.set(x, "headerComponent", js.undefined)
      
      @scala.inline
      def setInputProps(value: IInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setItemLimit(value: Double): Self = StObject.set(x, "itemLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLimitUndefined: Self = StObject.set(x, "itemLimit", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLInputElement | Autofill] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* items */ js.UndefOr[js.Array[T]] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLInputElement | Autofill] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnItemAdded(value: /* addedItem */ T => Unit): Self = StObject.set(x, "onItemAdded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemAddedUndefined: Self = StObject.set(x, "onItemAdded", js.undefined)
      
      @scala.inline
      def setOnItemSelected(value: /* selectedItem */ js.UndefOr[T] => T | js.Thenable[T]): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemSelectedUndefined: Self = StObject.set(x, "onItemSelected", js.undefined)
      
      @scala.inline
      def setOnItemsRemoved(value: /* removedItems */ js.Array[T] => Unit): Self = StObject.set(x, "onItemsRemoved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemsRemovedUndefined: Self = StObject.set(x, "onItemsRemoved", js.undefined)
      
      @scala.inline
      def setOnPaste(value: /* pastedText */ String => js.Array[T]): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnRenderFloatingPicker(value: ComponentType[IBaseFloatingPickerProps[T]]): Self = StObject.set(x, "onRenderFloatingPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRenderSelectedItems(value: ComponentType[IBaseSelectedItemsListProps[T]]): Self = StObject.set(x, "onRenderSelectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsListProps(value: IBaseSelectedItemsListProps[T]): Self = StObject.set(x, "selectedItemsListProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
      
      @scala.inline
      def setSuggestionItems(value: js.Array[T]): Self = StObject.set(x, "suggestionItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionItemsUndefined: Self = StObject.set(x, "suggestionItems", js.undefined)
      
      @scala.inline
      def setSuggestionItemsVarargs(value: T*): Self = StObject.set(x, "suggestionItems", js.Array(value :_*))
    }
  }
}
