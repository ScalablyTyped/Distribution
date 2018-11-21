package typings
package officeDashUiDashFabricDashReactLib.libComponentsCheckboxCheckboxDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICheckboxProps
  extends reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLElement | reactLib.HTMLInputElement] {
  /**
       * ID for element that provides extended information for the checkbox.
       */
  var ariaDescribedBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Accessible label for the checkbox.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * ID for element that contains label information for the checkbox.
       */
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The position in the parent set (if in a set) for aria-posinset.
       */
  var ariaPositionInSet: js.UndefOr[scala.Double] = js.undefined
  /**
       * The total size of the parent set (if in a set) for aria-setsize.
       */
  var ariaSetSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Allows you to set the checkbox to be at the before (start) or after (end) the label.
       * @default 'start'
       */
  var boxSide: js.UndefOr[
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.start | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.end
  ] = js.undefined
  /**
       * Checked state. Mutually exclusive to "defaultChecked". Use this if you control the checked state at a higher
       * level and plan to pass in the correct value based on handling onChange events and re-rendering.
       */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Custom icon props for the check mark rendered by the checkbox
       */
  var checkmarkIconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
       * Optional callback to access the ICheckbox interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ICheckbox]] = js.undefined
  /**
       * Optional input props that will be mixed into the input element, *before* other props are applied. This allows
       * you to extend the input element with additional attributes, such as data-automation-id needed for automation.
       * Note that if you provide, for example, "disabled" as well as "inputProps.disabled", the former will take
       * precedence over the later.
       */
  var inputProps: js.UndefOr[
    reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLElement | reactLib.HTMLButtonElement]
  ] = js.undefined
  /**
       * Optional keytip for this checkbox
       */
  var keytipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
  ] = js.undefined
  /**
       * Label to display next to the checkbox.
       */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Callback that is called when the checked value has changed.
       */
  @JSName("onChange")
  var onChange_ICheckboxProps: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLElement | reactLib.HTMLInputElement]
      ], 
      /* checked */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Custom render function for the label.
       */
  var onRenderLabel: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[ICheckboxProps]] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]
  ] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

