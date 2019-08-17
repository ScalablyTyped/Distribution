package typings.officeDashUiDashFabricDashReact.libComponentsCoachmarkPositioningContainerPositioningContainerDotTypesMod

import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIPointMod.IPoint
import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionedData
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositioningContainerProps extends IBaseProps[IPositioningContainer] {
  /**
    * Defines the element id referencing the element containing the description for the positioningContainer.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Accessible label text for positioningContainer.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    *  Defines the element id referencing the element containing label text for positioningContainer.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    * The background color of the positioningContainer in hex format ie. #ffffff.
    * @defaultvalue $ms-color-white
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * The bounding rectangle for which the contextual menu can appear in.
    */
  var bounds: js.UndefOr[IRectangle] = js.undefined
  /**
    * CSS class to apply to the positioningContainer.
    * @defaultvalue null
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[Boolean] = js.undefined
  /**
    * How the element should be positioned
    * @defaultvalue DirectionalHint.BottomAutoEdge
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * If true the position will not change sides in an attempt to fit the positioningContainer within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.undefined
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * If true do not render on a new layer. If false render on a new layer.
    */
  var doNotLayer: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the final height of the content.
    * To be used when expanding the content dynamically so that positioningContainer can adjust its position.
    */
  var finalHeight: js.UndefOr[Double] = js.undefined
  /**
    * The minimum distance the positioningContainer will be away from the edge of the screen.
    *  @defaultvalue 8
    */
  var minPagePadding: js.UndefOr[Double] = js.undefined
  /**
    * The gap between the positioningContainer and the target
    * @defaultvalue 0
    */
  var offsetFromTarget: js.UndefOr[Double] = js.undefined
  /**
    * Callback when the positioningContainer tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * Optional callback when the layer content has mounted.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional callback that is called once the positioningContainer has been correctly positioned.
    * @param positions - gives the user information about how the container is positioned such
    * as the element position, the target edge, and the alignment edge of the container.
    */
  var onPositioned: js.UndefOr[js.Function1[/* positions */ js.UndefOr[IPositionedData], Unit]] = js.undefined
  /**
    * Set max height of positioningContainer
    * When not set the positioningContainer will expand with contents up to the bottom of the screen
    */
  var positioningContainerMaxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Custom width for positioningContainer including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var positioningContainerWidth: js.UndefOr[Double] = js.undefined
  /**
    * If true then the onClose will not not dismiss on scroll
    * @defaultvalue false
    */
  var preventDismissOnScroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Aria role assigned to the positioningContainer (Eg. dialog, alertdialog).
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * If true then the positioningContainer will attempt to focus the first focusable element that it contains.
    * If it doesn't find an element, no focus will be set and the method will return false.
    * This means that it's the contents responsibility to either set focus or have
    * focusable items.
    * @returns True if focus was set, false if it was not.
    */
  var setInitialFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * The target that the positioningContainer should try to position itself based on.
    * It can be either an HTMLElement a querySelector string of a valid HTMLElement
    * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
    */
  var target: js.UndefOr[HTMLElement | String | MouseEvent | IPoint | Null] = js.undefined
  /**
    * Point used to position the positioningContainer.
    * Deprecated, use `target` instead.
    * @deprecated Use `target` instead.
    */
  var targetPoint: js.UndefOr[IPoint] = js.undefined
  /**
    * If true use a point rather than rectangle to position the positioningContainer.
    * For example it can be used to position based on a click.
    * @deprecated Do not use.
    */
  var useTargetPoint: js.UndefOr[Boolean] = js.undefined
}

object IPositioningContainerProps {
  @scala.inline
  def apply(
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    ariaLabelledBy: String = null,
    backgroundColor: String = null,
    bounds: IRectangle = null,
    className: String = null,
    componentRef: IRefObject[IPositioningContainer] = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    doNotLayer: js.UndefOr[Boolean] = js.undefined,
    finalHeight: Int | Double = null,
    minPagePadding: Int | Double = null,
    offsetFromTarget: Int | Double = null,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onLayerMounted: () => Unit = null,
    onPositioned: /* positions */ js.UndefOr[IPositionedData] => Unit = null,
    positioningContainerMaxHeight: Int | Double = null,
    positioningContainerWidth: Int | Double = null,
    preventDismissOnScroll: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    setInitialFocus: js.UndefOr[Boolean] = js.undefined,
    target: HTMLElement | String | MouseEvent | IPoint = null,
    targetPoint: IPoint = null,
    useTargetPoint: js.UndefOr[Boolean] = js.undefined
  ): IPositioningContainerProps = {
    val __obj = js.Dynamic.literal()
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget)
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint)
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed)
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL)
    if (!js.isUndefined(doNotLayer)) __obj.updateDynamic("doNotLayer")(doNotLayer)
    if (finalHeight != null) __obj.updateDynamic("finalHeight")(finalHeight.asInstanceOf[js.Any])
    if (minPagePadding != null) __obj.updateDynamic("minPagePadding")(minPagePadding.asInstanceOf[js.Any])
    if (offsetFromTarget != null) __obj.updateDynamic("offsetFromTarget")(offsetFromTarget.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onLayerMounted != null) __obj.updateDynamic("onLayerMounted")(js.Any.fromFunction0(onLayerMounted))
    if (onPositioned != null) __obj.updateDynamic("onPositioned")(js.Any.fromFunction1(onPositioned))
    if (positioningContainerMaxHeight != null) __obj.updateDynamic("positioningContainerMaxHeight")(positioningContainerMaxHeight.asInstanceOf[js.Any])
    if (positioningContainerWidth != null) __obj.updateDynamic("positioningContainerWidth")(positioningContainerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnScroll)) __obj.updateDynamic("preventDismissOnScroll")(preventDismissOnScroll)
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(setInitialFocus)) __obj.updateDynamic("setInitialFocus")(setInitialFocus)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetPoint != null) __obj.updateDynamic("targetPoint")(targetPoint)
    if (!js.isUndefined(useTargetPoint)) __obj.updateDynamic("useTargetPoint")(useTargetPoint)
    __obj.asInstanceOf[IPositioningContainerProps]
  }
}

