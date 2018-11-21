package typings
package officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IChoiceGroupProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLElement | reactLib.HTMLInputElement] {
  /**
       * Aria labelled by prop for the ChoiceGroup itself
       */
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IChoiceGroup]] = js.undefined
  /**
       * The key of the option that will be initially checked.
       */
  var defaultSelectedKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
       * Descriptive label for the choice group.
       */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A callback for receiving a notification when the choice has been changed.
       */
  @JSName("onChange")
  var onChange_IChoiceGroupProps: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLElement | reactLib.HTMLInputElement]
      ], 
      /* option */ js.UndefOr[IChoiceGroupOption], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Deprecated and will be removed by 07/17/2017 Use 'onChange' instead.
       * @deprecated
       */
  var onChanged: js.UndefOr[
    js.Function2[
      /* option */ IChoiceGroupOption, 
      /* evt */ js.UndefOr[
        reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLElement | reactLib.HTMLInputElement]
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * The options for the choice group.
       */
  var options: js.UndefOr[js.Array[IChoiceGroupOption]] = js.undefined
  /**
       * The key of the selected option. If you provide this, you must maintain selection
       * state by observing onChange events and passing a new value in when changed.
       */
  var selectedKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IChoiceGroupStyleProps, IChoiceGroupStyles]
  ] = js.undefined
  /**
       * Theme (provided through customization.)
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

