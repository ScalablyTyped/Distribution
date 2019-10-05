package typings.officeDashUiDashFabricDashReact

import org.scalablytyped.runtime.Instantiable1
import typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod.IResizeGroupProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ResizeGroup", JSImport.Namespace)
@js.native
object libComponentsResizeGroupMod extends js.Object {
  @js.native
  class ResizeGroupBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotBaseMod.ResizeGroupBase {
    def this(props: IResizeGroupProps) = this()
  }
  
  val MeasuredContext: Context[Anon_IsMeasured] = js.native
  val ResizeGroup: Instantiable1[
    /* props */ IResizeGroupProps, 
    typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotBaseMod.ResizeGroupBase
  ] = js.native
  def getMeasurementCache(): Anon_AddMeasurementToCache = js.native
  def getNextResizeGroupStateProvider(): Anon_CurrentState = js.native
  def getNextResizeGroupStateProvider(measurementCache: Anon_AddMeasurementToCache): Anon_CurrentState = js.native
  @js.native
  object ResizeGroupDirection extends js.Object {
    /* 0 */ val horizontal: typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod.ResizeGroupDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod.ResizeGroupDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod.ResizeGroupDirection with Double
      ] = js.native
  }
  
}

