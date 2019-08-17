package typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotBaseMod.LayerBase
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayerProps extends HTMLAttributes[HTMLDivElement | LayerBase] {
  /**
    * Optional callback to access the ILayer interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ILayer]] = js.undefined
  /**
    * When enabled, Layer allows events to bubble up from Layer content.
    * Traditionally Layer has not had this behavior. This prop preserves backwards compatibility by
    * default while allowing users to opt in to the new event bubbling functionality.
    */
  var eventBubblingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The optional id property provided on a LayerHost that this Layer should render within. The LayerHost does
    * not need to be immediately available but once has been rendered, and if missing, we'll avoid trying
    * to render the Layer content until the host is available. If an id is not provided, we will render the Layer
    * content in a fixed position element rendered at the end of the document.
    */
  var hostId: js.UndefOr[String] = js.undefined
  /**
    * Whether the layer should be added as the first child of the host.
    * If true, the layer will be inserted as the first child of the host
    * By default, the layer will be appended at the end to the host
    */
  var insertFirst: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback for when the layer is mounted.
    */
  var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Callback for when the layer is mounted. */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback for when the layer is unmounted.
    */
  var onLayerWillUnmount: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ILayerStyleProps, ILayerStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ILayerProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement | LayerBase] = null,
    className: String = null,
    componentRef: IRefObject[ILayer] = null,
    eventBubblingEnabled: js.UndefOr[Boolean] = js.undefined,
    hostId: String = null,
    insertFirst: js.UndefOr[Boolean] = js.undefined,
    onLayerDidMount: () => Unit = null,
    onLayerMounted: () => Unit = null,
    onLayerWillUnmount: () => Unit = null,
    styles: IStyleFunctionOrObject[ILayerStyleProps, ILayerStyles] = null,
    theme: ITheme = null
  ): ILayerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(eventBubblingEnabled)) __obj.updateDynamic("eventBubblingEnabled")(eventBubblingEnabled)
    if (hostId != null) __obj.updateDynamic("hostId")(hostId)
    if (!js.isUndefined(insertFirst)) __obj.updateDynamic("insertFirst")(insertFirst)
    if (onLayerDidMount != null) __obj.updateDynamic("onLayerDidMount")(js.Any.fromFunction0(onLayerDidMount))
    if (onLayerMounted != null) __obj.updateDynamic("onLayerMounted")(js.Any.fromFunction0(onLayerMounted))
    if (onLayerWillUnmount != null) __obj.updateDynamic("onLayerWillUnmount")(js.Any.fromFunction0(onLayerWillUnmount))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ILayerProps]
  }
}

