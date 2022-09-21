package typings.officeUiFabricReact

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.positioningTypesMod.ICalloutBeakPositionedInfo
import typings.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typings.officeUiFabricReact.positioningTypesMod.IPositionDirectionalHintData
import typings.officeUiFabricReact.positioningTypesMod.IPositionProps
import typings.officeUiFabricReact.positioningTypesMod.IPositionedData
import typings.officeUiFabricReact.positioningTypesMod.IWindowWithSegments
import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.officeUiFabricReact.utilitiesMod.Rectangle
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positioningPositioningMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBoundsFromTargetWindow(target: Null, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: Rectangle, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: Element, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: MouseEvent, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: Point, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint, gapSpace: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Rectangle,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: Unit,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Rectangle,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint, gapSpace: Unit, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint, gapSpace: Unit, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Rectangle,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Unit, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Unit, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: Unit,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: Unit,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Unit, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Double, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Point,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Unit, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Unit, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Point,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getOppositeEdge(edge: RectangleEdge): RectangleEdge = ^.asInstanceOf[js.Dynamic].applyDynamic("getOppositeEdge")(edge.asInstanceOf[js.Any]).asInstanceOf[RectangleEdge]
  
  inline def positionCallout(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): ICalloutPositionedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("positionCallout")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any])).asInstanceOf[ICalloutPositionedInfo]
  inline def positionCallout(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: ICalloutPositionedInfo
  ): ICalloutPositionedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("positionCallout")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any], previousPositions.asInstanceOf[js.Any])).asInstanceOf[ICalloutPositionedInfo]
  
  inline def positionCard(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): ICalloutPositionedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("positionCard")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any])).asInstanceOf[ICalloutPositionedInfo]
  inline def positionCard(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: ICalloutPositionedInfo
  ): ICalloutPositionedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("positionCard")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any], previousPositions.asInstanceOf[js.Any])).asInstanceOf[ICalloutPositionedInfo]
  
  inline def positionElement(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): IPositionedData = (^.asInstanceOf[js.Dynamic].applyDynamic("positionElement")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any])).asInstanceOf[IPositionedData]
  inline def positionElement(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: IPositionedData
  ): IPositionedData = (^.asInstanceOf[js.Dynamic].applyDynamic("positionElement")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any], previousPositions.asInstanceOf[js.Any])).asInstanceOf[IPositionedData]
  
  object positioningTestPackage {
    
    @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "__positioningTestPackage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "__positioningTestPackage._calculateActualBeakWidthInPixels")
    @js.native
    def calculateActualBeakWidthInPixels: js.Function1[/* beakWidth */ Double, Double] = js.native
    
    inline def calculateActualBeakWidthInPixels_=(x: js.Function1[/* beakWidth */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_calculateActualBeakWidthInPixels")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "__positioningTestPackage._finalizeBeakPosition")
    @js.native
    def finalizeBeakPosition: js.Function3[
        /* elementPosition */ IElementPosition, 
        /* positionedBeak */ Rectangle, 
        /* bounds */ js.UndefOr[Rectangle], 
        ICalloutBeakPositionedInfo
      ] = js.native
    
    inline def finalizeBeakPosition_=(
      x: js.Function3[
          /* elementPosition */ IElementPosition, 
          /* positionedBeak */ Rectangle, 
          /* bounds */ js.UndefOr[Rectangle], 
          ICalloutBeakPositionedInfo
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_finalizeBeakPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "__positioningTestPackage._finalizePositionData")
    @js.native
    def finalizePositionData: js.Function5[
        /* positionedElement */ IElementPosition, 
        /* hostElement */ HTMLElement, 
        /* bounds */ js.UndefOr[Rectangle], 
        /* coverTarget */ js.UndefOr[Boolean], 
        /* doNotFinalizeReturnEdge */ js.UndefOr[Boolean], 
        IPositionedData
      ] = js.native
    
    inline def finalizePositionData_=(
      x: js.Function5[
          /* positionedElement */ IElementPosition, 
          /* hostElement */ HTMLElement, 
          /* bounds */ js.UndefOr[Rectangle], 
          /* coverTarget */ js.UndefOr[Boolean], 
          /* doNotFinalizeReturnEdge */ js.UndefOr[Boolean], 
          IPositionedData
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_finalizePositionData")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "__positioningTestPackage._getMaxHeightFromTargetRectangle")
    @js.native
    def getMaxHeightFromTargetRectangle: js.Function5[
        /* targetRectangle */ Rectangle, 
        /* targetEdge */ DirectionalHint, 
        /* gapSpace */ Double, 
        /* bounds */ Rectangle, 
        /* coverTarget */ js.UndefOr[Boolean], 
        Double
      ] = js.native
    
    inline def getMaxHeightFromTargetRectangle_=(
      x: js.Function5[
          /* targetRectangle */ Rectangle, 
          /* targetEdge */ DirectionalHint, 
          /* gapSpace */ Double, 
          /* bounds */ Rectangle, 
          /* coverTarget */ js.UndefOr[Boolean], 
          Double
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getMaxHeightFromTargetRectangle")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "__positioningTestPackage._getPositionData")
    @js.native
    def getPositionData: js.Function3[
        /* directionalHint */ js.UndefOr[DirectionalHint], 
        /* directionalHintForRTL */ js.UndefOr[DirectionalHint], 
        /* previousPositions */ js.UndefOr[IPositionDirectionalHintData], 
        IPositionDirectionalHintData
      ] = js.native
    
    inline def getPositionData_=(
      x: js.Function3[
          /* directionalHint */ js.UndefOr[DirectionalHint], 
          /* directionalHintForRTL */ js.UndefOr[DirectionalHint], 
          /* previousPositions */ js.UndefOr[IPositionDirectionalHintData], 
          IPositionDirectionalHintData
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getPositionData")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "__positioningTestPackage._positionBeak")
    @js.native
    def positionBeak: js.Function2[/* beakWidth */ Double, /* elementPosition */ IElementPositionInfo, Rectangle] = js.native
    
    inline def positionBeak_=(x: js.Function2[/* beakWidth */ Double, /* elementPosition */ IElementPositionInfo, Rectangle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_positionBeak")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "__positioningTestPackage._positionElementWithinBounds")
    @js.native
    def positionElementWithinBounds: js.Function7[
        /* elementToPosition */ Rectangle, 
        /* target */ Rectangle, 
        /* bounding */ Rectangle, 
        /* positionData */ IPositionDirectionalHintData, 
        /* gap */ Double, 
        /* directionalHintFixed */ js.UndefOr[Boolean], 
        /* coverTarget */ js.UndefOr[Boolean], 
        IElementPosition
      ] = js.native
    
    inline def positionElementWithinBounds_=(
      x: js.Function7[
          /* elementToPosition */ Rectangle, 
          /* target */ Rectangle, 
          /* bounding */ Rectangle, 
          /* positionData */ IPositionDirectionalHintData, 
          /* gap */ Double, 
          /* directionalHintFixed */ js.UndefOr[Boolean], 
          /* coverTarget */ js.UndefOr[Boolean], 
          IElementPosition
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_positionElementWithinBounds")(x.asInstanceOf[js.Any])
  }
  
  trait IElementPosition extends StObject {
    
    var alignmentEdge: js.UndefOr[RectangleEdge] = js.undefined
    
    var elementRectangle: Rectangle
    
    var targetEdge: RectangleEdge
  }
  object IElementPosition {
    
    inline def apply(elementRectangle: Rectangle, targetEdge: RectangleEdge): IElementPosition = {
      val __obj = js.Dynamic.literal(elementRectangle = elementRectangle.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
      __obj.asInstanceOf[IElementPosition]
    }
    
    extension [Self <: IElementPosition](x: Self) {
      
      inline def setAlignmentEdge(value: RectangleEdge): Self = StObject.set(x, "alignmentEdge", value.asInstanceOf[js.Any])
      
      inline def setAlignmentEdgeUndefined: Self = StObject.set(x, "alignmentEdge", js.undefined)
      
      inline def setElementRectangle(value: Rectangle): Self = StObject.set(x, "elementRectangle", value.asInstanceOf[js.Any])
      
      inline def setTargetEdge(value: RectangleEdge): Self = StObject.set(x, "targetEdge", value.asInstanceOf[js.Any])
    }
  }
  
  trait IElementPositionInfo
    extends StObject
       with IElementPosition {
    
    var targetRectangle: Rectangle
  }
  object IElementPositionInfo {
    
    inline def apply(elementRectangle: Rectangle, targetEdge: RectangleEdge, targetRectangle: Rectangle): IElementPositionInfo = {
      val __obj = js.Dynamic.literal(elementRectangle = elementRectangle.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any], targetRectangle = targetRectangle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IElementPositionInfo]
    }
    
    extension [Self <: IElementPositionInfo](x: Self) {
      
      inline def setTargetRectangle(value: Rectangle): Self = StObject.set(x, "targetRectangle", value.asInstanceOf[js.Any])
    }
  }
}
