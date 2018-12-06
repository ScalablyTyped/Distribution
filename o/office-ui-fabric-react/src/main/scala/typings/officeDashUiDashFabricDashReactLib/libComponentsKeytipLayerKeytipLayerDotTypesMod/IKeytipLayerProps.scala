package typings
package officeDashUiDashFabricDashReactLib.libComponentsKeytipLayerKeytipLayerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IKeytipLayerProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[IKeytipLayer] {
  /**
       * Optional callback to access the KeytipLayer component. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IKeytipLayer]] = js.undefined
  /**
       * String to put inside the layer to be used for the aria-describedby for the component with the keytip
       * Should be one of the starting sequences
       */
  var content: java.lang.String
  /**
       * List of key sequences that will exit keytips mode
       */
  var keytipExitSequences: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod.IKeytipTransitionKey
    ]
  ] = js.undefined
  /**
       * List of key sequences that execute the return functionality in keytips (going back to the previous level of keytips)
       */
  var keytipReturnSequences: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod.IKeytipTransitionKey
    ]
  ] = js.undefined
  /**
       * List of key sequences that will start keytips mode
       */
  var keytipStartSequences: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libUtilitiesKeytipsIKeytipTransitionKeyMod.IKeytipTransitionKey
    ]
  ] = js.undefined
  /**
       * Callback function triggered when keytip mode is entered
       */
  var onEnterKeytipMode: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback function triggered when keytip mode is exited.
       * ev is the Mouse or Keyboard Event that triggered the exit, if any.
       */
  var onExitKeytipMode: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement] | reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * (Optional) Call to provide customized styling.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]
  ] = js.undefined
}

