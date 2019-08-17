package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningMod

import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.ICalloutBeakPositionedInfo
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionDirectionalHintData
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionedData
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.IElementPosition
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.IElementPositionInfo
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning", "__positioningTestPackage")
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
  var _finalizePositionData: js.Function4[
    /* positionedElement */ IElementPosition, 
    /* hostElement */ HTMLElement, 
    /* bounds */ js.UndefOr[
      typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod.Rectangle
    ], 
    /* coverTarget */ js.UndefOr[Boolean], 
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

