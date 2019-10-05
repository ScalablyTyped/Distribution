package typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableDroppableTextDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod.IPanelProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.ISelectableOption
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectableDroppableTextProps[TComponent, TListenerElement] extends HTMLAttributes[TListenerElement] {
  /**
    * Aria Label for the ISelectableDroppableText for screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Custom properties for ISelectableDroppableText's Callout used to render options.
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  /**
    * Optional callback to access the ISelectableDroppableText interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[TComponent]] = js.undefined
  /**
    * The key(s) that will be initially used to set a selected item.
    */
  var defaultSelectedKey: js.UndefOr[String | Double | (js.Array[Double | String]) | Null] = js.undefined
  /**
    * Whether or not the ISelectableDroppableText is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Descriptive label for the ISelectableDroppableText Error Message
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
    * Descriptive label for the ISelectableDroppableText
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Optional custom renderer for the ISelectableDroppableText container
    */
  var onRenderContainer: js.UndefOr[IRenderFunction[ISelectableDroppableTextProps[TComponent, TListenerElement]]] = js.undefined
  /**
    * Optional custom renderer for the ISelectableDroppableText options
    */
  var onRenderItem: js.UndefOr[IRenderFunction[ISelectableOption]] = js.undefined
  /**
    * Optional custom renderer for the ISelectableDroppableText list
    */
  var onRenderList: js.UndefOr[IRenderFunction[ISelectableDroppableTextProps[TComponent, TListenerElement]]] = js.undefined
  /**
    * Optional custom renderer for the ISelectableDroppableText option content
    */
  var onRenderOption: js.UndefOr[IRenderFunction[ISelectableOption]] = js.undefined
  /**
    * Whether or not the combobox should expand on keyboard focus
    * @defaultvalue false
    */
  var openOnKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Collection of options for this ISelectableDroppableText
    */
  var options: js.UndefOr[js.Any] = js.undefined
  /**
    * Custom properties for ISelectableDroppableText's Panel used to render options on small devices.
    */
  var panelProps: js.UndefOr[IPanelProps] = js.undefined
  /**
    * Whether or not the ISelectableDroppableText is required.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * The key(s) of the selected item. If you provide this, you must maintain selection
    * state by observing onChange events and passing a new value in when changed.
    * Note that passing in `null` will cause selection to be reset.
    */
  var selectedKey: js.UndefOr[String | Double | (js.Array[Double | String]) | Null] = js.undefined
}

object ISelectableDroppableTextProps {
  @scala.inline
  def apply[TComponent, TListenerElement](
    HTMLAttributes: HTMLAttributes[TListenerElement] = null,
    ariaLabel: String = null,
    calloutProps: ICalloutProps = null,
    className: String = null,
    componentRef: IRefObject[TComponent] = null,
    defaultSelectedKey: String | Double | (js.Array[Double | String]) = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    id: String = null,
    label: String = null,
    onRenderContainer: (/* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], 
        Element | Null
      ]
    ]) => Element | Null = null,
    onRenderItem: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], Element | Null]]) => Element | Null = null,
    onRenderList: (/* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[TComponent, TListenerElement]], 
        Element | Null
      ]
    ]) => Element | Null = null,
    onRenderOption: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], Element | Null]]) => Element | Null = null,
    openOnKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    options: js.Any = null,
    panelProps: IPanelProps = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    selectedKey: String | Double | (js.Array[Double | String]) = null
  ): ISelectableDroppableTextProps[TComponent, TListenerElement] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultSelectedKey != null) __obj.updateDynamic("defaultSelectedKey")(defaultSelectedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onRenderContainer != null) __obj.updateDynamic("onRenderContainer")(js.Any.fromFunction2(onRenderContainer))
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction2(onRenderItem))
    if (onRenderList != null) __obj.updateDynamic("onRenderList")(js.Any.fromFunction2(onRenderList))
    if (onRenderOption != null) __obj.updateDynamic("onRenderOption")(js.Any.fromFunction2(onRenderOption))
    if (!js.isUndefined(openOnKeyboardFocus)) __obj.updateDynamic("openOnKeyboardFocus")(openOnKeyboardFocus)
    if (options != null) __obj.updateDynamic("options")(options)
    if (panelProps != null) __obj.updateDynamic("panelProps")(panelProps)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectableDroppableTextProps[TComponent, TListenerElement]]
  }
}

