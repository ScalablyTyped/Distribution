package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.resizeGroupBaseMod.IResizeGroupState
import typings.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInitialResizeGroupState extends js.Object {
  
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
