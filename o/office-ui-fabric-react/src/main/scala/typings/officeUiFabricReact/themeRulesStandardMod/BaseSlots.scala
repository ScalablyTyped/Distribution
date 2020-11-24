package typings.officeUiFabricReact.themeRulesStandardMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BaseSlots extends js.Object
@JSImport("office-ui-fabric-react/lib/components/ThemeGenerator/ThemeRulesStandard", "BaseSlots")
@js.native
object BaseSlots extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BaseSlots with Double] = js.native
  
  @js.native
  sealed trait backgroundColor extends BaseSlots
  /* 1 */ @js.native
  object backgroundColor extends TopLevel[backgroundColor with Double]
  
  @js.native
  sealed trait foregroundColor extends BaseSlots
  /* 2 */ @js.native
  object foregroundColor extends TopLevel[foregroundColor with Double]
  
  @js.native
  sealed trait primaryColor extends BaseSlots
  /* 0 */ @js.native
  object primaryColor extends TopLevel[primaryColor with Double]
}
