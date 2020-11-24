package typings.officeUiFabricReact.groupedListTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CollapseAllVisibility extends js.Object
@JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedList.types", "CollapseAllVisibility")
@js.native
object CollapseAllVisibility extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollapseAllVisibility with Double] = js.native
  
  @js.native
  sealed trait hidden extends CollapseAllVisibility
  /* 0 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  @js.native
  sealed trait visible extends CollapseAllVisibility
  /* 1 */ @js.native
  object visible extends TopLevel[visible with Double]
}
