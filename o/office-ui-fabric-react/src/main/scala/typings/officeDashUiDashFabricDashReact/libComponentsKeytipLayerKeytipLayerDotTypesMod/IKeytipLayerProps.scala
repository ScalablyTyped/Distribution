package typings.officeDashUiDashFabricDashReact.libComponentsKeytipLayerKeytipLayerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.IKeytipTransitionKey
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipLayerProps extends ClassAttributes[IKeytipLayer] {
  /**
    * Optional callback to access the KeytipLayer component. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IKeytipLayer]] = js.undefined
  /**
    * String to put inside the layer to be used for the aria-describedby for the component with the keytip
    * Should be one of the starting sequences
    */
  var content: String
  /**
    * List of key sequences that will exit keytips mode
    */
  var keytipExitSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.undefined
  /**
    * List of key sequences that execute the return functionality in keytips (going back to the previous level of keytips)
    */
  var keytipReturnSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.undefined
  /**
    * List of key sequences that will start keytips mode
    */
  var keytipStartSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.undefined
  /**
    * Callback function triggered when keytip mode is entered
    */
  var onEnterKeytipMode: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback function triggered when keytip mode is exited.
    * ev is the Mouse or Keyboard Event that triggered the exit, if any.
    */
  var onExitKeytipMode: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[KeyboardEvent[HTMLElement] | (MouseEvent[HTMLElement, NativeMouseEvent])], 
      Unit
    ]
  ] = js.undefined
  /**
    * (Optional) Call to provide customized styling.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]] = js.undefined
}

object IKeytipLayerProps {
  @scala.inline
  def apply(
    content: String,
    componentRef: IRefObject[IKeytipLayer] = null,
    key: Key = null,
    keytipExitSequences: js.Array[IKeytipTransitionKey] = null,
    keytipReturnSequences: js.Array[IKeytipTransitionKey] = null,
    keytipStartSequences: js.Array[IKeytipTransitionKey] = null,
    onEnterKeytipMode: () => Unit = null,
    onExitKeytipMode: /* ev */ js.UndefOr[KeyboardEvent[HTMLElement] | (MouseEvent[HTMLElement, NativeMouseEvent])] => Unit = null,
    ref: LegacyRef[IKeytipLayer] = null,
    styles: IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles] = null
  ): IKeytipLayerProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keytipExitSequences != null) __obj.updateDynamic("keytipExitSequences")(keytipExitSequences.asInstanceOf[js.Any])
    if (keytipReturnSequences != null) __obj.updateDynamic("keytipReturnSequences")(keytipReturnSequences.asInstanceOf[js.Any])
    if (keytipStartSequences != null) __obj.updateDynamic("keytipStartSequences")(keytipStartSequences.asInstanceOf[js.Any])
    if (onEnterKeytipMode != null) __obj.updateDynamic("onEnterKeytipMode")(js.Any.fromFunction0(onEnterKeytipMode))
    if (onExitKeytipMode != null) __obj.updateDynamic("onExitKeytipMode")(js.Any.fromFunction1(onExitKeytipMode))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipLayerProps]
  }
}

