package typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResizeGroupDirection extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.types", "ResizeGroupDirection")
@js.native
object ResizeGroupDirection extends js.Object {
  @js.native
  sealed trait horizontal extends ResizeGroupDirection
  
  @js.native
  sealed trait vertical extends ResizeGroupDirection
  
  /* 0 */ val horizontal: typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod.ResizeGroupDirection.horizontal with Double = js.native
  /* 1 */ val vertical: typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod.ResizeGroupDirection.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResizeGroupDirection with Double] = js.native
}

