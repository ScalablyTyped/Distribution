package typings
package officeDashUiDashFabricDashReactLib.libComponentsCoachmarkPositioningContainerPositioningContainerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositioningContainerProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IPositioningContainer] {
  /**
    * Defines the element id referencing the element containing the description for the positioningContainer.
    */
  var ariaDescribedBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Accessible label text for positioningContainer.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Defines the element id referencing the element containing label text for positioningContainer.
    */
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The background color of the positioningContainer in hex format ie. #ffffff.
    * @defaultvalue $ms-color-white
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The bounding rectangle for which the contextual menu can appear in.
    */
  var bounds: js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.undefined
  /**
    * CSS class to apply to the positioningContainer.
    * @defaultvalue null
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How the element should be positioned
    * @defaultvalue DirectionalHint.BottomAutoEdge
    */
  var directionalHint: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
    * If true the position will not change sides in an attempt to fit the positioningContainer within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
    * If true do not render on a new layer. If false render on a new layer.
    */
  var doNotLayer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the final height of the content.
    * To be used when expanding the content dynamically so that positioningContainer can adjust its position.
    */
  var finalHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum distance the positioningContainer will be away from the edge of the screen.
    *  @defaultvalue 8
    */
  var minPagePadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The gap between the positioningContainer and the target
    * @defaultvalue 0
    */
  var offsetFromTarget: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback when the positioningContainer tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
    * Optional callback when the layer content has mounted.
    */
  var onLayerMounted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Optional callback that is called once the positioningContainer has been correctly positioned.
    * @param positions - gives the user information about how the container is positioned such
    * as the element position, the target edge, and the alignment edge of the container.
    */
  var onPositioned: js.UndefOr[
    js.Function1[
      /* positions */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.IPositionedData
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Set max height of positioningContainer
    * When not set the positioningContainer will expand with contents up to the bottom of the screen
    */
  var positioningContainerMaxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Custom width for positioningContainer including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var positioningContainerWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true then the onClose will not not dismiss on scroll
    * @defaultvalue false
    */
  var preventDismissOnScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Aria role assigned to the positioningContainer (Eg. dialog, alertdialog).
    */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true then the positioningContainer will attempt to focus the first focusable element that it contains.
    * If it doesn't find an element, no focus will be set and the method will return false.
    * This means that it's the contents responsibility to either set focus or have
    * focusable items.
    * @returns True if focus was set, false if it was not.
    */
  var setInitialFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The target that the positioningContainer should try to position itself based on.
    * It can be either an HTMLElement a querySelector string of a valid HTMLElement
    * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
    */
  var target: js.UndefOr[
    reactLib.HTMLElement | java.lang.String | reactLib.MouseEvent | atUifabricUtilitiesLib.libIPointMod.IPoint | scala.Null
  ] = js.undefined
  /**
    * Point used to position the positioningContainer.
    * Deprecated, use `target` instead.
    * @deprecated Use `target` instead.
    */
  var targetPoint: js.UndefOr[atUifabricUtilitiesLib.libIPointMod.IPoint] = js.undefined
  /**
    * If true use a point rather than rectangle to position the positioningContainer.
    * For example it can be used to position based on a click.
    * @deprecated Do not use.
    */
  var useTargetPoint: js.UndefOr[scala.Boolean] = js.undefined
}

