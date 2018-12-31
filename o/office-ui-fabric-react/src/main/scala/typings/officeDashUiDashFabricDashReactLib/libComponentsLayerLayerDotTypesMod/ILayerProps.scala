package typings
package officeDashUiDashFabricDashReactLib.libComponentsLayerLayerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayerProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[
      reactLib.HTMLDivElement | officeDashUiDashFabricDashReactLib.libComponentsLayerLayerDotBaseMod.LayerBase
    ] {
  /**
    * Optional callback to access the ILayer interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ILayer]] = js.undefined
  /**
    * When enabled, Layer allows events to bubble up from Layer content.
    * Traditionally Layer has not had this behavior. This prop preserves backwards compatibility by
    * default while allowing users to opt in to the new event bubbling functionality.
    */
  var eventBubblingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The optional id property provided on a LayerHost that this Layer should render within. The LayerHost does
    * not need to be immediately available but once has been rendered, and if missing, we'll avoid trying
    * to render the Layer content until the host is available. If an id is not provided, we will render the Layer
    * content in a fixed position element rendered at the end of the document.
    */
  var hostId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback for when the layer is mounted.
    */
  var onLayerDidMount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Callback for when the layer is mounted. */
  var onLayerMounted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback for when the layer is unmounted.
    */
  var onLayerWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ILayerStyleProps, ILayerStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

