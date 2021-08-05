package typings.officeUiFabricReact

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typings.officeUiFabricReact.positioningTypesMod.IPositionProps
import typings.officeUiFabricReact.positioningTypesMod.IPositionedData
import typings.officeUiFabricReact.positioningTypesMod.IWindowWithSegments
import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positioningMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/positioning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/positioning", "Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.positioningTypesMod.Position & Double] = js.native
    
    /* 1 */ val bottom: typings.officeUiFabricReact.positioningTypesMod.Position.bottom & Double = js.native
    
    /* 3 */ val end: typings.officeUiFabricReact.positioningTypesMod.Position.end & Double = js.native
    
    /* 2 */ val start: typings.officeUiFabricReact.positioningTypesMod.Position.start & Double = js.native
    
    /* 0 */ val top: typings.officeUiFabricReact.positioningTypesMod.Position.top & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/positioning", "RectangleEdge")
  @js.native
  object RectangleEdge extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.positioningTypesMod.RectangleEdge & Double] = js.native
    
    /* -1 */ val bottom: typings.officeUiFabricReact.positioningTypesMod.RectangleEdge.bottom & Double = js.native
    
    /* 2 */ val left: typings.officeUiFabricReact.positioningTypesMod.RectangleEdge.left & Double = js.native
    
    /* -2 */ val right: typings.officeUiFabricReact.positioningTypesMod.RectangleEdge.right & Double = js.native
    
    /* 1 */ val top: typings.officeUiFabricReact.positioningTypesMod.RectangleEdge.top & Double = js.native
  }
  
  inline def getBoundsFromTargetWindow(target: Null, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: Element, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: MouseEvent, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: Point, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  
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
}
