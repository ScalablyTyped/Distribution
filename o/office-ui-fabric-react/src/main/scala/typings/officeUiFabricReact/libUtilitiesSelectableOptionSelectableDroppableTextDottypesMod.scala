package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typings.officeUiFabricReact.libComponentsPanelPanelDottypesMod.IPanelProps
import typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.ISelectableOption
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesSelectableOptionSelectableDroppableTextDottypesMod {
  
  trait ISelectableDroppableTextProps[TComponent, TListenerElement]
    extends StObject
       with HTMLAttributes[TListenerElement] {
    
    /**
      * Aria Label for the field for screen reader users.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Custom properties for the Callout used to render the option list.
      */
    var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
    
    /**
      * Optional callback to access the component interface (usually `IDropdown` or `IComboBox`).
      * Use this instead of `ref` for accessing the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[TComponent]] = js.undefined
    
    /**
      * The key(s) that will be initially used to set a selected item.
      *
      * Mutually exclusive with `selectedKey`.
      * For Dropdown (but not ComboBox) in multi-select mode, use `defaultSelectedKeys` instead.
      */
    var defaultSelectedKey: js.UndefOr[String | Double | (js.Array[Double | String]) | Null] = js.undefined
    
    /**
      * Whether or not the field is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Error message for the field.
      */
    var errorMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Descriptive label for the field
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Whether multi-choice selections are allowed or not.
      * @defaultvalue false
      */
    var multiSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback for when the options list callout is dismissed
      */
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Optional custom renderer for the option list container
      */
    var onRenderContainer: js.UndefOr[IRenderFunction[ISelectableDroppableTextProps[TComponent, TListenerElement]]] = js.undefined
    
    /**
      * Optional custom renderer for all items, including headers and dividers as well as normal options.
      */
    var onRenderItem: js.UndefOr[IRenderFunction[ISelectableOption]] = js.undefined
    
    /**
      * Optional custom renderer for the option list
      */
    var onRenderList: js.UndefOr[IRenderFunction[ISelectableDroppableTextProps[TComponent, TListenerElement]]] = js.undefined
    
    /**
      * Optional custom renderer for normal options only.
      * Use `onRenderItem` to control rendering for separators and headers as well.
      */
    var onRenderOption: js.UndefOr[IRenderFunction[ISelectableOption]] = js.undefined
    
    /**
      * Whether or not the ComboBox/Dropdown should expand on keyboard focus.
      * @defaultvalue false
      */
    var openOnKeyboardFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Collection of options for this field
      */
    var options: js.UndefOr[Any] = js.undefined
    
    /**
      * Custom properties for the Panel used to render the option list on small devices.
      */
    var panelProps: js.UndefOr[IPanelProps] = js.undefined
    
    /**
      * Whether or not the field is required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key(s) of the selected item. If you provide this, you must maintain selection
      * state by observing onChange events and passing a new value in when changed.
      * Note that passing in `null` will cause selection to be reset.
      *
      * Mutually exclusive with `defaultSelectedKey`.
      * For Dropdown (but not ComboBox) in multi-select mode, use `selectedKeys` instead.
      */
    var selectedKey: js.UndefOr[String | Double | (js.Array[Double | String]) | Null] = js.undefined
  }
  object ISelectableDroppableTextProps {
    
    inline def apply[TComponent, TListenerElement](): ISelectableDroppableTextProps[TComponent, TListenerElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISelectableDroppableTextProps[TComponent, TListenerElement]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISelectableDroppableTextProps[?, ?], TComponent, TListenerElement] (val x: Self & (ISelectableDroppableTextProps[TComponent, TListenerElement])) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      inline def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      inline def setComponentRef(value: IRefObject[TComponent]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ TComponent | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDefaultSelectedKey(value: String | Double | (js.Array[Double | String])): Self = StObject.set(x, "defaultSelectedKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeyNull: Self = StObject.set(x, "defaultSelectedKey", null)
      
      inline def setDefaultSelectedKeyUndefined: Self = StObject.set(x, "defaultSelectedKey", js.undefined)
      
      inline def setDefaultSelectedKeyVarargs(value: (Double | String)*): Self = StObject.set(x, "defaultSelectedKey", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnRenderContainer(
        value: (/* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], /* defaultRender */ js.UndefOr[
              js.Function1[
                /* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], 
                Element | Null
              ]
            ]) => Element | Null
      ): Self = StObject.set(x, "onRenderContainer", js.Any.fromFunction2(value))
      
      inline def setOnRenderContainerUndefined: Self = StObject.set(x, "onRenderContainer", js.undefined)
      
      inline def setOnRenderItem(
        value: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction2(value))
      
      inline def setOnRenderItemUndefined: Self = StObject.set(x, "onRenderItem", js.undefined)
      
      inline def setOnRenderList(
        value: (/* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], /* defaultRender */ js.UndefOr[
              js.Function1[
                /* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], 
                Element | Null
              ]
            ]) => Element | Null
      ): Self = StObject.set(x, "onRenderList", js.Any.fromFunction2(value))
      
      inline def setOnRenderListUndefined: Self = StObject.set(x, "onRenderList", js.undefined)
      
      inline def setOnRenderOption(
        value: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderOption", js.Any.fromFunction2(value))
      
      inline def setOnRenderOptionUndefined: Self = StObject.set(x, "onRenderOption", js.undefined)
      
      inline def setOpenOnKeyboardFocus(value: Boolean): Self = StObject.set(x, "openOnKeyboardFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnKeyboardFocusUndefined: Self = StObject.set(x, "openOnKeyboardFocus", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPanelProps(value: IPanelProps): Self = StObject.set(x, "panelProps", value.asInstanceOf[js.Any])
      
      inline def setPanelPropsUndefined: Self = StObject.set(x, "panelProps", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSelectedKey(value: String | Double | (js.Array[Double | String])): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyNull: Self = StObject.set(x, "selectedKey", null)
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setSelectedKeyVarargs(value: (Double | String)*): Self = StObject.set(x, "selectedKey", js.Array(value*))
    }
  }
}
