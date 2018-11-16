package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableDroppableTextDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISelectableDroppableTextProps[TComponent, TListenerElement]
  extends reactLib.reactMod.ReactNs.HTMLAttributes[TListenerElement] {
  /**
       * Aria Label for the ISelectableDroppableText for screen reader users.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Custom properties for ISelectableDroppableText's Callout used to render options.
       */
  var calloutProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
  ] = js.undefined
  /**
       * Optional callback to access the ISelectableDroppableText interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[TComponent]] = js.undefined
  /**
       * The key(s) that will be initially used to set a selected item.
       */
  var defaultSelectedKey: js.UndefOr[
    java.lang.String | scala.Double | js.Array[java.lang.String] | js.Array[scala.Double]
  ] = js.undefined
  /**
       * Whether or not the ISelectableDroppableText is disabled.
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Descriptive label for the ISelectableDroppableText Error Message
       */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Descriptive label for the ISelectableDroppableText
       */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional custom renderer for the ISelectableDroppableText container
       */
  var onRenderContainer: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[ISelectableDroppableTextProps[TComponent, TComponent]]
  ] = js.undefined
  /**
       * Optional custom renderer for the ISelectableDroppableText options
       */
  var onRenderItem: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.ISelectableOption
    ]
  ] = js.undefined
  /**
       * Optional custom renderer for the ISelectableDroppableText list
       */
  var onRenderList: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[ISelectableDroppableTextProps[TComponent, TComponent]]
  ] = js.undefined
  /**
       * Optional custom renderer for the ISelectableDroppableText option content
       */
  var onRenderOption: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.ISelectableOption
    ]
  ] = js.undefined
  /**
       * Collection of options for this ISelectableDroppableText
       */
  var options: js.UndefOr[js.Any] = js.undefined
  /**
       * Custom properties for ISelectableDroppableText's Panel used to render options on small devices.
       */
  var panelProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod.IPanelProps
  ] = js.undefined
  /**
       * Whether or not the ISelectableDroppableText is required.
       */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The key(s) of the selected item. If you provide this, you must maintain selection
       * state by observing onChange events and passing a new value in when changed.
       */
  var selectedKey: js.UndefOr[
    java.lang.String | scala.Double | js.Array[java.lang.String] | js.Array[scala.Double]
  ] = js.undefined
}

