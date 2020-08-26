package typings.officeUiFabricReact.modalTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'className' | 'containerClassName' | 'scrollableContentClassName' | 'topOffsetFixed' | 'isModeless'> & {  isOpen :boolean | undefined,   isVisible :boolean | undefined,   hasBeenOpened :boolean | undefined,   modalRectangleTop :number | undefined,   layerClassName :string | undefined,   isDefaultDragHandle :boolean | undefined} */
@js.native
trait IModalStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  /** Modal has been opened state. */
  var hasBeenOpened: js.UndefOr[Boolean] = js.native
  /** Whether this modal is draggable and using the default handler */
  var isDefaultDragHandle: js.UndefOr[Boolean] = js.native
  var isModeless: js.UndefOr[Boolean] = js.native
  /** Modal open state. */
  var isOpen: js.UndefOr[Boolean] = js.native
  /** Modal visible state. */
  var isVisible: js.UndefOr[Boolean] = js.native
  /** Classname for layer element */
  var layerClassName: js.UndefOr[String] = js.native
  /** Positioning of modal on first render */
  var modalRectangleTop: js.UndefOr[Double] = js.native
  var scrollableContentClassName: js.UndefOr[String] = js.native
  var theme: ITheme = js.native
  var topOffsetFixed: js.UndefOr[Boolean] = js.native
}

object IModalStyleProps {
  @scala.inline
  def apply(theme: ITheme): IModalStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalStyleProps]
  }
  @scala.inline
  implicit class IModalStylePropsOps[Self <: IModalStyleProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setHasBeenOpened(value: Boolean): Self = this.set("hasBeenOpened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBeenOpened: Self = this.set("hasBeenOpened", js.undefined)
    @scala.inline
    def setIsDefaultDragHandle(value: Boolean): Self = this.set("isDefaultDragHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultDragHandle: Self = this.set("isDefaultDragHandle", js.undefined)
    @scala.inline
    def setIsModeless(value: Boolean): Self = this.set("isModeless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModeless: Self = this.set("isModeless", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setLayerClassName(value: String): Self = this.set("layerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerClassName: Self = this.set("layerClassName", js.undefined)
    @scala.inline
    def setModalRectangleTop(value: Double): Self = this.set("modalRectangleTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalRectangleTop: Self = this.set("modalRectangleTop", js.undefined)
    @scala.inline
    def setScrollableContentClassName(value: String): Self = this.set("scrollableContentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollableContentClassName: Self = this.set("scrollableContentClassName", js.undefined)
    @scala.inline
    def setTopOffsetFixed(value: Boolean): Self = this.set("topOffsetFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopOffsetFixed: Self = this.set("topOffsetFixed", js.undefined)
  }
  
}

