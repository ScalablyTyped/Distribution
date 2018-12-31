package typings
package officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupOptionProps
  extends officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupOption {
  /**
    * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[
    atUifabricUtilitiesLib.libCreateRefMod.IRefObject[
      officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupOption
    ]
  ] = js.undefined
  /**
    * Indicates if the ChoiceGroupOption should appear focused, visually
    */
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This value is used to group each ChoiceGroupOption into the same logical ChoiceGroup
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback for receiving a notification when the choice has lost focus.
    */
  @JSName("onBlur")
  var onBlur_IChoiceGroupOptionProps: js.UndefOr[
    js.Function2[
      /* ev */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], 
      /* props */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupOption
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A callback for receiving a notification when the choice has been changed.
    */
  @JSName("onChange")
  var onChange_IChoiceGroupOptionProps: js.UndefOr[OnChangeCallback] = js.undefined
  /**
    * A callback for receiving a notification when the choice has received focus.
    */
  @JSName("onFocus")
  var onFocus_IChoiceGroupOptionProps: js.UndefOr[OnFocusCallback] = js.undefined
  /**
    * If true, it specifies that an option must be selected in the ChoiceGroup before submitting the form
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles]
  ] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

