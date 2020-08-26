package typings.officeUiFabricReact.selectableDroppableTextTypesMod

import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.panelTypesMod.IPanelProps
import typings.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectableDroppableTextProps[TComponent, TListenerElement] extends HTMLAttributes[TListenerElement] {
  /**
    * Aria Label for the ISelectableDroppableText for screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Custom properties for ISelectableDroppableText's Callout used to render options.
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Optional callback to access the ISelectableDroppableText interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[TComponent]] = js.native
  /**
    * The key(s) that will be initially used to set a selected item.
    *
    * Mutually exclusive with `selectedKey`.
    * For Dropdown in multi-select mode, use `defaultSelectedKeys` instead.
    */
  var defaultSelectedKey: js.UndefOr[String | Double | (js.Array[Double | String]) | Null] = js.native
  /**
    * Whether or not the ISelectableDroppableText is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Descriptive label for the ISelectableDroppableText Error Message
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * Descriptive label for the ISelectableDroppableText
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Optional prop that indicates if multi-choice selections are allowed or not.
    * @defaultvalue false
    */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /**
    * Callback that is issued when the options callout is dismissed
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional custom renderer for the ISelectableDroppableText container
    */
  var onRenderContainer: js.UndefOr[IRenderFunction[ISelectableDroppableTextProps[TComponent, TListenerElement]]] = js.native
  /**
    * Optional custom renderer for the ISelectableDroppableText options
    */
  var onRenderItem: js.UndefOr[IRenderFunction[ISelectableOption]] = js.native
  /**
    * Optional custom renderer for the ISelectableDroppableText list
    */
  var onRenderList: js.UndefOr[IRenderFunction[ISelectableDroppableTextProps[TComponent, TListenerElement]]] = js.native
  /**
    * Optional custom renderer for the ISelectableDroppableText option content
    */
  var onRenderOption: js.UndefOr[IRenderFunction[ISelectableOption]] = js.native
  /**
    * Whether or not the ComboBox/Dropdown should expand on keyboard focus.
    * @defaultvalue false
    */
  var openOnKeyboardFocus: js.UndefOr[Boolean] = js.native
  /**
    * Collection of options for this ISelectableDroppableText
    */
  var options: js.UndefOr[js.Any] = js.native
  /**
    * Custom properties for ISelectableDroppableText's Panel used to render options on small devices.
    */
  var panelProps: js.UndefOr[IPanelProps] = js.native
  /**
    * Whether or not the ISelectableDroppableText is required.
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * The key(s) of the selected item. If you provide this, you must maintain selection
    * state by observing onChange events and passing a new value in when changed.
    * Note that passing in `null` will cause selection to be reset.
    *
    * Mutually exclusive with `defaultSelectedKey`.
    * For Dropdown in multi-select mode, use `selectedKeys` instead.
    */
  var selectedKey: js.UndefOr[String | Double | (js.Array[Double | String]) | Null] = js.native
}

object ISelectableDroppableTextProps {
  @scala.inline
  def apply[TComponent, TListenerElement](): ISelectableDroppableTextProps[TComponent, TListenerElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelectableDroppableTextProps[TComponent, TListenerElement]]
  }
  @scala.inline
  implicit class ISelectableDroppableTextPropsOps[Self <: ISelectableDroppableTextProps[_, _], TComponent, TListenerElement] (val x: Self with (ISelectableDroppableTextProps[TComponent, TListenerElement])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setCalloutProps(value: ICalloutProps): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutProps: Self = this.set("calloutProps", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ TComponent | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[TComponent]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDefaultSelectedKeyVarargs(value: (Double | String)*): Self = this.set("defaultSelectedKey", js.Array(value :_*))
    @scala.inline
    def setDefaultSelectedKey(value: String | Double | (js.Array[Double | String])): Self = this.set("defaultSelectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedKey: Self = this.set("defaultSelectedKey", js.undefined)
    @scala.inline
    def setDefaultSelectedKeyNull: Self = this.set("defaultSelectedKey", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnRenderContainer(
      value: (/* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], 
            Element | Null
          ]
        ]) => Element | Null
    ): Self = this.set("onRenderContainer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderContainer: Self = this.set("onRenderContainer", js.undefined)
    @scala.inline
    def setOnRenderItem(
      value: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderItem: Self = this.set("onRenderItem", js.undefined)
    @scala.inline
    def setOnRenderList(
      value: (/* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], 
            Element | Null
          ]
        ]) => Element | Null
    ): Self = this.set("onRenderList", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderList: Self = this.set("onRenderList", js.undefined)
    @scala.inline
    def setOnRenderOption(
      value: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderOption", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderOption: Self = this.set("onRenderOption", js.undefined)
    @scala.inline
    def setOpenOnKeyboardFocus(value: Boolean): Self = this.set("openOnKeyboardFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOnKeyboardFocus: Self = this.set("openOnKeyboardFocus", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPanelProps(value: IPanelProps): Self = this.set("panelProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelProps: Self = this.set("panelProps", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setSelectedKeyVarargs(value: (Double | String)*): Self = this.set("selectedKey", js.Array(value :_*))
    @scala.inline
    def setSelectedKey(value: String | Double | (js.Array[Double | String])): Self = this.set("selectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKey: Self = this.set("selectedKey", js.undefined)
    @scala.inline
    def setSelectedKeyNull: Self = this.set("selectedKey", null)
  }
  
}

