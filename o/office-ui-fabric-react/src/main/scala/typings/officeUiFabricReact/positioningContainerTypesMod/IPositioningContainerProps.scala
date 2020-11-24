package typings.officeUiFabricReact.positioningContainerTypesMod

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.positioningTypesMod.IPositionedData
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositioningContainerProps extends IBaseProps[IPositioningContainer] {
  
  /**
    * Defines the element id referencing the element containing the description for the positioningContainer.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  /**
    * Accessible label text for positioningContainer.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    *  Defines the element id referencing the element containing label text for positioningContainer.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  /**
    * The background color of the positioningContainer in hex format ie. #ffffff.
    * @defaultvalue $ms-color-white
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * The bounding rectangle for which the contextual menu can appear in.
    */
  var bounds: js.UndefOr[IRectangle] = js.native
  
  /**
    * CSS class to apply to the positioningContainer.
    * @defaultvalue null
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * How the element should be positioned
    * @defaultvalue DirectionalHint.BottomAutoEdge
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  
  /**
    * If true the position will not change sides in an attempt to fit the positioningContainer within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
  
  /**
    * If true do not render on a new layer. If false render on a new layer.
    */
  var doNotLayer: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the final height of the content.
    * To be used when expanding the content dynamically so that positioningContainer can adjust its position.
    */
  var finalHeight: js.UndefOr[Double] = js.native
  
  /**
    * The minimum distance the positioningContainer will be away from the edge of the screen.
    *  @defaultvalue 8
    */
  var minPagePadding: js.UndefOr[Double] = js.native
  
  /**
    * The gap between the positioningContainer and the target
    * @defaultvalue 0
    */
  var offsetFromTarget: js.UndefOr[Double] = js.native
  
  /**
    * Callback when the positioningContainer tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  
  /**
    * Optional callback when the layer content has mounted.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Optional callback that is called once the positioningContainer has been correctly positioned.
    * @param positions - gives the user information about how the container is positioned such
    * as the element position, the target edge, and the alignment edge of the container.
    */
  var onPositioned: js.UndefOr[js.Function1[/* positions */ js.UndefOr[IPositionedData], Unit]] = js.native
  
  /**
    * Set max height of positioningContainer
    * When not set the positioningContainer will expand with contents up to the bottom of the screen
    */
  var positioningContainerMaxHeight: js.UndefOr[Double] = js.native
  
  /**
    * Custom width for positioningContainer including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var positioningContainerWidth: js.UndefOr[Double] = js.native
  
  /**
    * If true then the onClose will not not dismiss on scroll
    * @defaultvalue false
    */
  var preventDismissOnScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Aria role assigned to the positioningContainer (Eg. dialog, alertdialog).
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * If true then the positioningContainer will attempt to focus the first focusable element that it contains.
    * If it doesn't find an element, no focus will be set and the method will return false.
    * This means that it's the contents responsibility to either set focus or have
    * focusable items.
    * @returns True if focus was set, false if it was not.
    */
  var setInitialFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * The target that the positioningContainer should try to position itself based on.
    * It can be either an HTMLElement a querySelector string of a valid HTMLElement
    * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
    */
  var target: js.UndefOr[HTMLElement | String | MouseEvent | Point | Null] = js.native
  
  /**
    * Point used to position the positioningContainer.
    * Deprecated, use `target` instead.
    * @deprecated Use `target` instead.
    */
  var targetPoint: js.UndefOr[Point] = js.native
  
  /**
    * If true use a point rather than rectangle to position the positioningContainer.
    * For example it can be used to position based on a click.
    * @deprecated Do not use.
    */
  var useTargetPoint: js.UndefOr[Boolean] = js.native
}
object IPositioningContainerProps {
  
  @scala.inline
  def apply(): IPositioningContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositioningContainerProps]
  }
  
  @scala.inline
  implicit class IPositioningContainerPropsOps[Self <: IPositioningContainerProps] (val x: Self) extends AnyVal {
    
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
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBounds(value: IRectangle): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCoverTarget(value: Boolean): Self = this.set("coverTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverTarget: Self = this.set("coverTarget", js.undefined)
    
    @scala.inline
    def setDirectionalHint(value: DirectionalHint): Self = this.set("directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHint: Self = this.set("directionalHint", js.undefined)
    
    @scala.inline
    def setDirectionalHintFixed(value: Boolean): Self = this.set("directionalHintFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHintFixed: Self = this.set("directionalHintFixed", js.undefined)
    
    @scala.inline
    def setDirectionalHintForRTL(value: DirectionalHint): Self = this.set("directionalHintForRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHintForRTL: Self = this.set("directionalHintForRTL", js.undefined)
    
    @scala.inline
    def setDoNotLayer(value: Boolean): Self = this.set("doNotLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotLayer: Self = this.set("doNotLayer", js.undefined)
    
    @scala.inline
    def setFinalHeight(value: Double): Self = this.set("finalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalHeight: Self = this.set("finalHeight", js.undefined)
    
    @scala.inline
    def setMinPagePadding(value: Double): Self = this.set("minPagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPagePadding: Self = this.set("minPagePadding", js.undefined)
    
    @scala.inline
    def setOffsetFromTarget(value: Double): Self = this.set("offsetFromTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetFromTarget: Self = this.set("offsetFromTarget", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnLayerMounted(value: () => Unit): Self = this.set("onLayerMounted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLayerMounted: Self = this.set("onLayerMounted", js.undefined)
    
    @scala.inline
    def setOnPositioned(value: /* positions */ js.UndefOr[IPositionedData] => Unit): Self = this.set("onPositioned", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPositioned: Self = this.set("onPositioned", js.undefined)
    
    @scala.inline
    def setPositioningContainerMaxHeight(value: Double): Self = this.set("positioningContainerMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositioningContainerMaxHeight: Self = this.set("positioningContainerMaxHeight", js.undefined)
    
    @scala.inline
    def setPositioningContainerWidth(value: Double): Self = this.set("positioningContainerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositioningContainerWidth: Self = this.set("positioningContainerWidth", js.undefined)
    
    @scala.inline
    def setPreventDismissOnScroll(value: Boolean): Self = this.set("preventDismissOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDismissOnScroll: Self = this.set("preventDismissOnScroll", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSetInitialFocus(value: Boolean): Self = this.set("setInitialFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetInitialFocus: Self = this.set("setInitialFocus", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement | String | MouseEvent | Point): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTargetPoint(value: Point): Self = this.set("targetPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPoint: Self = this.set("targetPoint", js.undefined)
    
    @scala.inline
    def setUseTargetPoint(value: Boolean): Self = this.set("useTargetPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTargetPoint: Self = this.set("useTargetPoint", js.undefined)
  }
}
