package typings.officeUiFabricReact.positioningMod

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.positioningPositioningMod.IElementPosition
import typings.officeUiFabricReact.positioningPositioningMod.IElementPositionInfo
import typings.officeUiFabricReact.positioningTypesMod.ICalloutBeakPositionedInfo
import typings.officeUiFabricReact.positioningTypesMod.IPositionDirectionalHintData
import typings.officeUiFabricReact.positioningTypesMod.IPositionedData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning", "__positioningTestPackage")
@js.native
object positioningTestPackage extends js.Object {
  var _calculateActualBeakWidthInPixels: js.Function1[/* beakWidth */ Double, Double] = js.native
  var _finalizeBeakPosition: js.Function3[
    /* elementPosition */ IElementPosition, 
    /* positionedBeak */ typings.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* bounds */ js.UndefOr[typings.officeUiFabricReact.positioningPositioningMod.Rectangle], 
    ICalloutBeakPositionedInfo
  ] = js.native
  var _finalizePositionData: js.Function5[
    /* positionedElement */ IElementPosition, 
    /* hostElement */ HTMLElement, 
    /* bounds */ js.UndefOr[typings.officeUiFabricReact.positioningPositioningMod.Rectangle], 
    /* coverTarget */ js.UndefOr[Boolean], 
    /* doNotFinalizeReturnEdge */ js.UndefOr[Boolean], 
    IPositionedData
  ] = js.native
  var _getMaxHeightFromTargetRectangle: js.Function5[
    /* targetRectangle */ typings.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* targetEdge */ DirectionalHint, 
    /* gapSpace */ Double, 
    /* bounds */ typings.officeUiFabricReact.positioningPositioningMod.Rectangle, 
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
    typings.officeUiFabricReact.positioningPositioningMod.Rectangle
  ] = js.native
  var _positionElementWithinBounds: js.Function7[
    /* elementToPosition */ typings.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* target */ typings.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* bounding */ typings.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* positionData */ IPositionDirectionalHintData, 
    /* gap */ Double, 
    /* directionalHintFixed */ js.UndefOr[Boolean], 
    /* coverTarget */ js.UndefOr[Boolean], 
    IElementPosition
  ] = js.native
}

