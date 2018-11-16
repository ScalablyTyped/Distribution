package typings
package officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IKeytipProps extends js.Object {
  /**
       * ICalloutProps to pass to the callout element
       */
  var calloutProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
  ] = js.undefined
  /**
       * Optional callback to access the Keytip component. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IKeytip]] = js.undefined
  /**
       * Content to put inside the keytip
       */
  var content: java.lang.String
  /**
       * T/F if the corresponding control for this keytip is disabled
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on keytip activation)
       * Common cases are a Pivot or Modal
       */
  var hasDynamicChildren: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether or not this keytip belongs to a component that has a menu
       * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
       */
  var hasMenu: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Array of KeySequences which is the full key sequence to trigger this keytip
       * Should not include initial 'start' key sequence
       */
  var keySequences: js.Array[java.lang.String]
  /**
       * Offset x and y for the keytip, added from the top-left corner
       * By default the keytip will be anchored to the bottom-center of the element
       */
  var offset: js.UndefOr[atUifabricUtilitiesLib.libIPointMod.IPoint] = js.undefined
  /**
       * Function to call when this keytip is activated.
       * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
       * 'target' is the DOM element marked with 'data-ktp-target'.
       */
  var onExecute: js.UndefOr[
    js.Function2[
      /* executeTarget */ reactLib.HTMLElement | scala.Null, 
      /* target */ reactLib.HTMLElement | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Function to call when the keytip is the currentKeytip and a return sequence is pressed.
       * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
       * 'target' is the DOM element marked with 'data-ktp-target'.
       */
  var onReturn: js.UndefOr[
    js.Function2[
      /* executeTarget */ reactLib.HTMLElement | scala.Null, 
      /* target */ reactLib.HTMLElement | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Full KeySequence of the overflow set button, will be set automatically if this keytip is inside an overflow
       */
  var overflowSetSequence: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Optional styles for the component.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]
  ] = js.undefined
  /**
       * Theme for the component
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * T/F if the keytip is visible
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

