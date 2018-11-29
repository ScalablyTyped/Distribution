package typings
package officeDashUiDashFabricDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_GetMaxHeightFromTargetRectangle extends js.Object {
  var _calculateActualBeakWidthInPixels: js.Function1[/* beakWidth */ scala.Double, scala.Double]
  var _finalizePositionData: js.Function3[
    /* positionedElement */ officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningMod.IElementPosition, 
    /* hostElement */ reactLib.HTMLElement, 
    /* coverTarget */ js.UndefOr[scala.Boolean], 
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.IPositionedData
  ]
  var _getMaxHeightFromTargetRectangle: js.Function5[
    /* targetRectangle */ officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningMod.Rectangle, 
    /* targetEdge */ officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`0` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`2` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`10` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`9` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`8` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`7` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`6` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`5` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`4` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`3` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`1` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`13` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`11` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`12`, 
    /* gapSpace */ scala.Double, 
    /* bounds */ officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningMod.Rectangle, 
    /* coverTarget */ js.UndefOr[scala.Boolean], 
    scala.Double
  ]
  var _getPositionData: js.Function3[
    /* directionalHint */ js.UndefOr[
      officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`0` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`2` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`10` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`9` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`8` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`7` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`6` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`5` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`4` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`3` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`1` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`13` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`11` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`12`
    ], 
    /* directionalHintForRTL */ js.UndefOr[
      officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`0` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`2` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`10` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`9` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`8` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`7` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`6` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`5` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`4` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`3` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`1` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`13` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`11` | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibNumbers.`12`
    ], 
    /* previousPositions */ js.UndefOr[
      officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.IPositionDirectionalHintData
    ], 
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.IPositionDirectionalHintData
  ]
  var _positionBeak: js.Function2[
    /* beakWidth */ scala.Double, 
    /* elementPosition */ officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningMod.IElementPositionInfo, 
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningMod.Rectangle
  ]
  var _positionElementWithinBounds: js.Function7[
    /* elementToPosition */ officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningMod.Rectangle, 
    /* target */ officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningMod.Rectangle, 
    /* bounding */ officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningMod.Rectangle, 
    /* positionData */ officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.IPositionDirectionalHintData, 
    /* gap */ scala.Double, 
    /* directionalHintFixed */ js.UndefOr[scala.Boolean], 
    /* coverTarget */ js.UndefOr[scala.Boolean], 
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningMod.IElementPosition
  ]
}

