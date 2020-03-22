package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typings.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ResizeGroup", JSImport.Namespace)
@js.native
object libResizeGroupMod extends js.Object {
  @js.native
  class ResizeGroupBase protected ()
    extends typings.officeUiFabricReact.resizeGroupMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  
  val MeasuredContext: Context[AnonIsMeasured] = js.native
  val ResizeGroup: Instantiable1[
    /* props */ IResizeGroupProps, 
    typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase
  ] = js.native
  def getMeasurementCache(): AnonAddMeasurementToCache = js.native
  def getNextResizeGroupStateProvider(): AnonGetInitialResizeGroupState = js.native
  def getNextResizeGroupStateProvider(measurementCache: AnonAddMeasurementToCache): AnonGetInitialResizeGroupState = js.native
  @js.native
  object ResizeGroupDirection extends js.Object {
    /* 0 */ val horizontal: typings.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typings.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.resizeGroupTypesMod.ResizeGroupDirection with Double] = js.native
  }
  
}

