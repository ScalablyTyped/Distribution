package typings.officeDashUiDashFabricDashReact

import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.ICalloutBeakPositionedInfo
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.ICalloutPositionedInfo
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPoint
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionDirectionalHintData
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionedData
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.IElementPosition
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.IElementPositionInfo
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning", JSImport.Namespace)
@js.native
object libUtilitiesPositioningMod extends js.Object {
  @js.native
  class Rectangle ()
    extends typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle
  
  def getMaxHeight(target: IPoint, targetEdge: DirectionalHint): Double = js.native
  def getMaxHeight(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def getMaxHeight(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def getMaxHeight(
    target: IPoint,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: Element, targetEdge: DirectionalHint): Double = js.native
  def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint): Double = js.native
  def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def getOppositeEdge(edge: RectangleEdge): RectangleEdge = js.native
  def positionCallout(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): ICalloutPositionedInfo = js.native
  def positionCallout(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: ICalloutPositionedInfo
  ): ICalloutPositionedInfo = js.native
  def positionElement(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): IPositionedData = js.native
  def positionElement(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: IPositionedData
  ): IPositionedData = js.native
  @js.native
  object Position extends js.Object {
    /* 1 */ val bottom: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.bottom with Double = js.native
    /* 3 */ val end: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.end with Double = js.native
    /* 2 */ val start: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.start with Double = js.native
    /* 0 */ val top: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position with Double
      ] = js.native
  }
  
  @js.native
  object RectangleEdge extends js.Object {
    /* -1 */ val bottom: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.bottom with Double = js.native
    /* 2 */ val left: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.left with Double = js.native
    /* -2 */ val right: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.right with Double = js.native
    /* 1 */ val top: typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge.top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge with Double
      ] = js.native
  }
  
  @js.native
  object __positioningTestPackage extends js.Object {
    var _calculateActualBeakWidthInPixels: js.Function1[/* beakWidth */ Double, Double] = js.native
    var _finalizeBeakPosition: js.Function3[
        /* elementPosition */ IElementPosition, 
        /* positionedBeak */ typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* bounds */ js.UndefOr[
          typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle
        ], 
        ICalloutBeakPositionedInfo
      ] = js.native
    var _finalizePositionData: js.Function5[
        /* positionedElement */ IElementPosition, 
        /* hostElement */ HTMLElement, 
        /* bounds */ js.UndefOr[
          typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle
        ], 
        /* coverTarget */ js.UndefOr[Boolean], 
        /* previousPositions */ js.UndefOr[Boolean], 
        IPositionedData
      ] = js.native
    var _getMaxHeightFromTargetRectangle: js.Function5[
        /* targetRectangle */ typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* targetEdge */ DirectionalHint, 
        /* gapSpace */ Double, 
        /* bounds */ typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* coverTarget */ js.UndefOr[Boolean], 
        Double
      ] = js.native
    var _getPositionData: js.Function3[
        /* directionalHint */ js.UndefOr[DirectionalHint], 
        /* directionalHintForRTL */ js.UndefOr[DirectionalHint], 
        /* previousPositions */ js.UndefOr[IPositionDirectionalHintData], 
        IPositionDirectionalHintData
      ] = js.native
    var _positionBeak: js.Function2[
        /* beakWidth */ Double, 
        /* elementPosition */ IElementPositionInfo, 
        typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle
      ] = js.native
    var _positionElementWithinBounds: js.Function7[
        /* elementToPosition */ typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* target */ typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* bounding */ typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle, 
        /* positionData */ IPositionDirectionalHintData, 
        /* gap */ Double, 
        /* directionalHintFixed */ js.UndefOr[Boolean], 
        /* coverTarget */ js.UndefOr[Boolean], 
        IElementPosition
      ] = js.native
  }
  
}

