package typings
package officeDashUiDashFabricDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CurrentState extends js.Object {
  def getInitialResizeGroupState(data: js.Any): officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod.IResizeGroupState = js.native
  def getNextState(
    props: officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotTypesMod.IResizeGroupProps,
    currentState: officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod.IResizeGroupState,
    getElementToMeasureWidth: js.Function0[scala.Double]
  ): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod.IResizeGroupState
  ] = js.native
  def getNextState(
    props: officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotTypesMod.IResizeGroupProps,
    currentState: officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod.IResizeGroupState,
    getElementToMeasureWidth: js.Function0[scala.Double],
    newContainerWidth: scala.Double
  ): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsResizeGroupResizeGroupDotBaseMod.IResizeGroupState
  ] = js.native
  def shouldRenderDataForMeasurement(dataToMeasure: js.Any): scala.Boolean = js.native
}

