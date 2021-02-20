package typings.officeUiFabricReact

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.positioningTypesMod.IPositionedData
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positioningContainerTypesMod {
  
  @js.native
  trait IPositioningContainer extends StObject
  
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
    implicit class IPositioningContainerPropsMutableBuilder[Self <: IPositioningContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBounds(value: IRectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCoverTarget(value: Boolean): Self = StObject.set(x, "coverTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverTargetUndefined: Self = StObject.set(x, "coverTarget", js.undefined)
      
      @scala.inline
      def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixed(value: Boolean): Self = StObject.set(x, "directionalHintFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixedUndefined: Self = StObject.set(x, "directionalHintFixed", js.undefined)
      
      @scala.inline
      def setDirectionalHintForRTL(value: DirectionalHint): Self = StObject.set(x, "directionalHintForRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintForRTLUndefined: Self = StObject.set(x, "directionalHintForRTL", js.undefined)
      
      @scala.inline
      def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      @scala.inline
      def setDoNotLayer(value: Boolean): Self = StObject.set(x, "doNotLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotLayerUndefined: Self = StObject.set(x, "doNotLayer", js.undefined)
      
      @scala.inline
      def setFinalHeight(value: Double): Self = StObject.set(x, "finalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalHeightUndefined: Self = StObject.set(x, "finalHeight", js.undefined)
      
      @scala.inline
      def setMinPagePadding(value: Double): Self = StObject.set(x, "minPagePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPagePaddingUndefined: Self = StObject.set(x, "minPagePadding", js.undefined)
      
      @scala.inline
      def setOffsetFromTarget(value: Double): Self = StObject.set(x, "offsetFromTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFromTargetUndefined: Self = StObject.set(x, "offsetFromTarget", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnLayerMounted(value: () => Unit): Self = StObject.set(x, "onLayerMounted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLayerMountedUndefined: Self = StObject.set(x, "onLayerMounted", js.undefined)
      
      @scala.inline
      def setOnPositioned(value: /* positions */ js.UndefOr[IPositionedData] => Unit): Self = StObject.set(x, "onPositioned", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPositionedUndefined: Self = StObject.set(x, "onPositioned", js.undefined)
      
      @scala.inline
      def setPositioningContainerMaxHeight(value: Double): Self = StObject.set(x, "positioningContainerMaxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositioningContainerMaxHeightUndefined: Self = StObject.set(x, "positioningContainerMaxHeight", js.undefined)
      
      @scala.inline
      def setPositioningContainerWidth(value: Double): Self = StObject.set(x, "positioningContainerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositioningContainerWidthUndefined: Self = StObject.set(x, "positioningContainerWidth", js.undefined)
      
      @scala.inline
      def setPreventDismissOnScroll(value: Boolean): Self = StObject.set(x, "preventDismissOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDismissOnScrollUndefined: Self = StObject.set(x, "preventDismissOnScroll", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSetInitialFocus(value: Boolean): Self = StObject.set(x, "setInitialFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetInitialFocusUndefined: Self = StObject.set(x, "setInitialFocus", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String | MouseEvent | Point): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetPoint(value: Point): Self = StObject.set(x, "targetPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPointUndefined: Self = StObject.set(x, "targetPoint", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setUseTargetPoint(value: Boolean): Self = StObject.set(x, "useTargetPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTargetPointUndefined: Self = StObject.set(x, "useTargetPoint", js.undefined)
    }
  }
  
  type IPositioningContainerTypes = IPositioningContainerProps
}
