package typings.officeUiFabricReact.modalTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Modal/Modal.types.IModalProps, 'className' | 'containerClassName' | 'scrollableContentClassName' | 'topOffsetFixed' | 'isModeless'> & {  isOpen ? :boolean,   isVisible ? :boolean,   hasBeenOpened ? :boolean,   modalRectangleTop ? :number,   layerClassName ? :string,   isDefaultDragHandle ? :boolean} */
trait IModalStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var containerClassName: js.UndefOr[String] = js.undefined
  /** Modal has been opened state. */
  var hasBeenOpened: js.UndefOr[Boolean] = js.undefined
  /** Whether this modal is draggable and using the default handler */
  var isDefaultDragHandle: js.UndefOr[Boolean] = js.undefined
  var isModeless: js.UndefOr[Boolean] = js.undefined
  /** Modal open state. */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /** Modal visible state. */
  var isVisible: js.UndefOr[Boolean] = js.undefined
  /** Classname for layer element */
  var layerClassName: js.UndefOr[String] = js.undefined
  /** Positioning of modal on first render */
  var modalRectangleTop: js.UndefOr[Double] = js.undefined
  var scrollableContentClassName: js.UndefOr[String] = js.undefined
  var theme: ITheme
  var topOffsetFixed: js.UndefOr[Boolean] = js.undefined
}

object IModalStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    containerClassName: String = null,
    hasBeenOpened: js.UndefOr[Boolean] = js.undefined,
    isDefaultDragHandle: js.UndefOr[Boolean] = js.undefined,
    isModeless: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    layerClassName: String = null,
    modalRectangleTop: js.UndefOr[Double] = js.undefined,
    scrollableContentClassName: String = null,
    topOffsetFixed: js.UndefOr[Boolean] = js.undefined
  ): IModalStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBeenOpened)) __obj.updateDynamic("hasBeenOpened")(hasBeenOpened.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultDragHandle)) __obj.updateDynamic("isDefaultDragHandle")(isDefaultDragHandle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isModeless)) __obj.updateDynamic("isModeless")(isModeless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.get.asInstanceOf[js.Any])
    if (layerClassName != null) __obj.updateDynamic("layerClassName")(layerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(modalRectangleTop)) __obj.updateDynamic("modalRectangleTop")(modalRectangleTop.get.asInstanceOf[js.Any])
    if (scrollableContentClassName != null) __obj.updateDynamic("scrollableContentClassName")(scrollableContentClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffsetFixed)) __obj.updateDynamic("topOffsetFixed")(topOffsetFixed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalStyleProps]
  }
}

