package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.std.AddEventListenerOptions
import typings.std.DOMRect
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.MouseEvent
import typings.std.Window
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positioningTypesMod {
  
  @js.native
  sealed trait Position extends StObject
  @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Position & Double] = js.native
    
    @js.native
    sealed trait bottom
      extends StObject
         with Position
    /* 1 */ val bottom: typings.officeUiFabricReact.positioningTypesMod.Position.bottom & Double = js.native
    
    @js.native
    sealed trait end
      extends StObject
         with Position
    /* 3 */ val end: typings.officeUiFabricReact.positioningTypesMod.Position.end & Double = js.native
    
    @js.native
    sealed trait start
      extends StObject
         with Position
    /* 2 */ val start: typings.officeUiFabricReact.positioningTypesMod.Position.start & Double = js.native
    
    @js.native
    sealed trait top
      extends StObject
         with Position
    /* 0 */ val top: typings.officeUiFabricReact.positioningTypesMod.Position.top & Double = js.native
  }
  
  @js.native
  sealed trait RectangleEdge extends StObject
  @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "RectangleEdge")
  @js.native
  object RectangleEdge extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RectangleEdge & Double] = js.native
    
    @js.native
    sealed trait bottom
      extends StObject
         with RectangleEdge
    /* -1 */ val bottom: typings.officeUiFabricReact.positioningTypesMod.RectangleEdge.bottom & Double = js.native
    
    @js.native
    sealed trait left
      extends StObject
         with RectangleEdge
    /* 2 */ val left: typings.officeUiFabricReact.positioningTypesMod.RectangleEdge.left & Double = js.native
    
    @js.native
    sealed trait right
      extends StObject
         with RectangleEdge
    /* -2 */ val right: typings.officeUiFabricReact.positioningTypesMod.RectangleEdge.right & Double = js.native
    
    @js.native
    sealed trait top
      extends StObject
         with RectangleEdge
    /* 1 */ val top: typings.officeUiFabricReact.positioningTypesMod.RectangleEdge.top & Double = js.native
  }
  
  trait ICalloutBeakPositionedInfo
    extends StObject
       with IPositionedData {
    
    var closestEdge: RectangleEdge
  }
  object ICalloutBeakPositionedInfo {
    
    inline def apply(closestEdge: RectangleEdge, elementPosition: IPosition, targetEdge: RectangleEdge): ICalloutBeakPositionedInfo = {
      val __obj = js.Dynamic.literal(closestEdge = closestEdge.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalloutBeakPositionedInfo]
    }
    
    extension [Self <: ICalloutBeakPositionedInfo](x: Self) {
      
      inline def setClosestEdge(value: RectangleEdge): Self = StObject.set(x, "closestEdge", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICalloutPositionProps
    extends StObject
       with IPositionProps {
    
    /**
      * The width of the beak.
      */
    var beakWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether or not the beak is visible
      */
    var isBeakVisible: js.UndefOr[Boolean] = js.undefined
  }
  object ICalloutPositionProps {
    
    inline def apply(): ICalloutPositionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalloutPositionProps]
    }
    
    extension [Self <: ICalloutPositionProps](x: Self) {
      
      inline def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
      
      inline def setBeakWidthUndefined: Self = StObject.set(x, "beakWidth", js.undefined)
      
      inline def setIsBeakVisible(value: Boolean): Self = StObject.set(x, "isBeakVisible", value.asInstanceOf[js.Any])
      
      inline def setIsBeakVisibleUndefined: Self = StObject.set(x, "isBeakVisible", js.undefined)
    }
  }
  
  trait ICalloutPositionedInfo
    extends StObject
       with IPositionedData {
    
    var beakPosition: ICalloutBeakPositionedInfo
  }
  object ICalloutPositionedInfo {
    
    inline def apply(beakPosition: ICalloutBeakPositionedInfo, elementPosition: IPosition, targetEdge: RectangleEdge): ICalloutPositionedInfo = {
      val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalloutPositionedInfo]
    }
    
    extension [Self <: ICalloutPositionedInfo](x: Self) {
      
      inline def setBeakPosition(value: ICalloutBeakPositionedInfo): Self = StObject.set(x, "beakPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPosition
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[Double]] {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object IPosition {
    
    inline def apply(): IPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPosition]
    }
    
    extension [Self <: IPosition](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait IPositionDirectionalHintData extends StObject {
    
    var alignTargetEdge: js.UndefOr[Boolean] = js.undefined
    
    var alignmentEdge: js.UndefOr[RectangleEdge] = js.undefined
    
    var isAuto: js.UndefOr[Boolean] = js.undefined
    
    var targetEdge: RectangleEdge
  }
  object IPositionDirectionalHintData {
    
    inline def apply(targetEdge: RectangleEdge): IPositionDirectionalHintData = {
      val __obj = js.Dynamic.literal(targetEdge = targetEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionDirectionalHintData]
    }
    
    extension [Self <: IPositionDirectionalHintData](x: Self) {
      
      inline def setAlignTargetEdge(value: Boolean): Self = StObject.set(x, "alignTargetEdge", value.asInstanceOf[js.Any])
      
      inline def setAlignTargetEdgeUndefined: Self = StObject.set(x, "alignTargetEdge", js.undefined)
      
      inline def setAlignmentEdge(value: RectangleEdge): Self = StObject.set(x, "alignmentEdge", value.asInstanceOf[js.Any])
      
      inline def setAlignmentEdgeUndefined: Self = StObject.set(x, "alignmentEdge", js.undefined)
      
      inline def setIsAuto(value: Boolean): Self = StObject.set(x, "isAuto", value.asInstanceOf[js.Any])
      
      inline def setIsAutoUndefined: Self = StObject.set(x, "isAuto", js.undefined)
      
      inline def setTargetEdge(value: RectangleEdge): Self = StObject.set(x, "targetEdge", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPositionProps extends StObject {
    
    /**
      * If true the positioning logic will prefer flipping edges over nudging the rectangle to fit within bounds,
      * thus making sure the element align perfectly with target.
      */
    var alignTargetEdge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The bounding rectangle for which  the contextual menu can appear in.
      */
    var bounds: js.UndefOr[IRectangle] = js.undefined
    
    /**
      * If true the position returned will have the menu element cover the target.
      * If false then it will position next to the target;
      */
    var coverTarget: js.UndefOr[Boolean] = js.undefined
    
    /** how the element should be positioned */
    var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
    
    /**
      * If true the position will not change edges in an attempt to fit the rectangle within bounds.
      * It will still attempt to align it to whatever bounds are given.
      * @defaultvalue false
      */
    var directionalHintFixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How the element should be positioned in RTL layouts.
      * If not specified, a mirror of `directionalHint` will be used instead
      */
    var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
    
    /** The gap between the callout and the target */
    var gapSpace: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[Element | MouseEvent | Point] = js.undefined
  }
  object IPositionProps {
    
    inline def apply(): IPositionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPositionProps]
    }
    
    extension [Self <: IPositionProps](x: Self) {
      
      inline def setAlignTargetEdge(value: Boolean): Self = StObject.set(x, "alignTargetEdge", value.asInstanceOf[js.Any])
      
      inline def setAlignTargetEdgeUndefined: Self = StObject.set(x, "alignTargetEdge", js.undefined)
      
      inline def setBounds(value: IRectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCoverTarget(value: Boolean): Self = StObject.set(x, "coverTarget", value.asInstanceOf[js.Any])
      
      inline def setCoverTargetUndefined: Self = StObject.set(x, "coverTarget", js.undefined)
      
      inline def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      inline def setDirectionalHintFixed(value: Boolean): Self = StObject.set(x, "directionalHintFixed", value.asInstanceOf[js.Any])
      
      inline def setDirectionalHintFixedUndefined: Self = StObject.set(x, "directionalHintFixed", js.undefined)
      
      inline def setDirectionalHintForRTL(value: DirectionalHint): Self = StObject.set(x, "directionalHintForRTL", value.asInstanceOf[js.Any])
      
      inline def setDirectionalHintForRTLUndefined: Self = StObject.set(x, "directionalHintForRTL", js.undefined)
      
      inline def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      inline def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
      
      inline def setGapSpaceUndefined: Self = StObject.set(x, "gapSpace", js.undefined)
      
      inline def setTarget(value: Element | MouseEvent | Point): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait IPositionedData extends StObject {
    
    /**
      * The finalized alignment edge that the element is aligning too. For instance, RectangleEdge.left means
      * that the left edge of the target should be in line with the left edge of the element being positioned.
      */
    var alignmentEdge: js.UndefOr[RectangleEdge] = js.undefined
    
    /**
      * The new position of the element.
      */
    var elementPosition: IPosition
    
    /**
      * The finalized target edge that element is aligning to. For instance RectangleEdge.bottom would mean
      * that the bottom edge of the target is being aligned to by the RectangleEdge.top of the element
      * that is being positioned.
      */
    var targetEdge: RectangleEdge
  }
  object IPositionedData {
    
    inline def apply(elementPosition: IPosition, targetEdge: RectangleEdge): IPositionedData = {
      val __obj = js.Dynamic.literal(elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionedData]
    }
    
    extension [Self <: IPositionedData](x: Self) {
      
      inline def setAlignmentEdge(value: RectangleEdge): Self = StObject.set(x, "alignmentEdge", value.asInstanceOf[js.Any])
      
      inline def setAlignmentEdgeUndefined: Self = StObject.set(x, "alignmentEdge", js.undefined)
      
      inline def setElementPosition(value: IPosition): Self = StObject.set(x, "elementPosition", value.asInstanceOf[js.Any])
      
      inline def setTargetEdge(value: RectangleEdge): Self = StObject.set(x, "targetEdge", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRelativePositions extends StObject {
    
    var beakPosition: typings.officeUiFabricReact.anon.Position
    
    var calloutPosition: IPosition
    
    var directionalClassName: String
    
    var submenuDirection: DirectionalHint
  }
  object IRelativePositions {
    
    inline def apply(
      beakPosition: typings.officeUiFabricReact.anon.Position,
      calloutPosition: IPosition,
      directionalClassName: String,
      submenuDirection: DirectionalHint
    ): IRelativePositions = {
      val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], calloutPosition = calloutPosition.asInstanceOf[js.Any], directionalClassName = directionalClassName.asInstanceOf[js.Any], submenuDirection = submenuDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRelativePositions]
    }
    
    extension [Self <: IRelativePositions](x: Self) {
      
      inline def setBeakPosition(value: typings.officeUiFabricReact.anon.Position): Self = StObject.set(x, "beakPosition", value.asInstanceOf[js.Any])
      
      inline def setCalloutPosition(value: IPosition): Self = StObject.set(x, "calloutPosition", value.asInstanceOf[js.Any])
      
      inline def setDirectionalClassName(value: String): Self = StObject.set(x, "directionalClassName", value.asInstanceOf[js.Any])
      
      inline def setSubmenuDirection(value: DirectionalHint): Self = StObject.set(x, "submenuDirection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IWindowWithSegments
    extends StObject
       with Window {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var getWindowSegments: js.UndefOr[js.Function0[js.Array[DOMRect]]] = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
}
