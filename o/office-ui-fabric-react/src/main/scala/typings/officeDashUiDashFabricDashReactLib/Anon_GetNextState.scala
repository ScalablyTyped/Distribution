package typings
package officeDashUiDashFabricDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetNextState extends js.Object {
  var getInitialResizeGroupState: js.Function1[
    /* data */ js.Any, 
    officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod.IResizeGroupState
  ]
  var getNextState: js.Function4[
    /* props */ officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotTypesMod.IResizeGroupProps, 
    /* currentState */ officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod.IResizeGroupState, 
    /* getElementToMeasureWidth */ js.Function0[scala.Double], 
    /* newContainerWidth */ js.UndefOr[scala.Double], 
    js.UndefOr[
      officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod.IResizeGroupState
    ]
  ]
  var shouldRenderDataForMeasurement: js.Function1[/* dataToMeasure */ js.Any, scala.Boolean]
}

