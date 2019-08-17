package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotBaseMod.IResizeGroupState
import typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod.IResizeGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CurrentState extends js.Object {
  def getInitialResizeGroupState(data: js.Any): IResizeGroupState = js.native
  def getNextState(
    props: IResizeGroupProps,
    currentState: IResizeGroupState,
    getElementToMeasureDimension: js.Function0[Double]
  ): js.UndefOr[IResizeGroupState] = js.native
  def getNextState(
    props: IResizeGroupProps,
    currentState: IResizeGroupState,
    getElementToMeasureDimension: js.Function0[Double],
    newContainerDimension: Double
  ): js.UndefOr[IResizeGroupState] = js.native
  def shouldRenderDataForMeasurement(dataToMeasure: js.Any): Boolean = js.native
}

