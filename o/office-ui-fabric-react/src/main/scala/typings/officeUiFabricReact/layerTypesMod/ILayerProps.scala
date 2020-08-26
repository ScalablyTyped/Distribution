package typings.officeUiFabricReact.layerTypesMod

import typings.officeUiFabricReact.layerBaseMod.LayerBase
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayerProps extends HTMLAttributes[HTMLDivElement | LayerBase] {
  /**
    * Optional callback to access the ILayer interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ILayer]] = js.native
  /**
    * When enabled, Layer allows events to bubble up from Layer content.
    * Traditionally Layer has not had this behavior. This prop preserves backwards compatibility by
    * default while allowing users to opt in to the new event bubbling functionality.
    */
  var eventBubblingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The optional id property provided on a LayerHost that this Layer should render within. The LayerHost does
    * not need to be immediately available but once has been rendered, and if missing, we'll avoid trying
    * to render the Layer content until the host is available. If an id is not provided, we will render the Layer
    * content in a fixed position element rendered at the end of the document.
    */
  var hostId: js.UndefOr[String] = js.native
  /**
    * Whether the layer should be added as the first child of the host.
    * If true, the layer will be inserted as the first child of the host
    * By default, the layer will be appended at the end to the host
    */
  var insertFirst: js.UndefOr[Boolean] = js.native
  /**
    * Callback for when the layer is mounted.
    */
  var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback for when the layer is mounted.
    * @deprecated Use onLayerDidMount.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback for when the layer is unmounted.
    */
  var onLayerWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ILayerStyleProps, ILayerStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ILayerProps {
  @scala.inline
  def apply(): ILayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayerProps]
  }
  @scala.inline
  implicit class ILayerPropsOps[Self <: ILayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ILayer | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[ILayer]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setEventBubblingEnabled(value: Boolean): Self = this.set("eventBubblingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventBubblingEnabled: Self = this.set("eventBubblingEnabled", js.undefined)
    @scala.inline
    def setHostId(value: String): Self = this.set("hostId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostId: Self = this.set("hostId", js.undefined)
    @scala.inline
    def setInsertFirst(value: Boolean): Self = this.set("insertFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertFirst: Self = this.set("insertFirst", js.undefined)
    @scala.inline
    def setOnLayerDidMount(value: () => Unit): Self = this.set("onLayerDidMount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLayerDidMount: Self = this.set("onLayerDidMount", js.undefined)
    @scala.inline
    def setOnLayerMounted(value: () => Unit): Self = this.set("onLayerMounted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLayerMounted: Self = this.set("onLayerMounted", js.undefined)
    @scala.inline
    def setOnLayerWillUnmount(value: () => Unit): Self = this.set("onLayerWillUnmount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLayerWillUnmount: Self = this.set("onLayerWillUnmount", js.undefined)
    @scala.inline
    def setStylesFunction1(value: ILayerStyleProps => DeepPartial[ILayerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ILayerStyleProps, ILayerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

