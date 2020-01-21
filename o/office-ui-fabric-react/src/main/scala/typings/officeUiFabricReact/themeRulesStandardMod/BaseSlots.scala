package typings.officeUiFabricReact.themeRulesStandardMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BaseSlots extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ThemeGenerator/ThemeRulesStandard", "BaseSlots")
@js.native
object BaseSlots extends js.Object {
  @js.native
  sealed trait backgroundColor extends BaseSlots
  
  @js.native
  sealed trait foregroundColor extends BaseSlots
  
  @js.native
  sealed trait primaryColor extends BaseSlots
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BaseSlots with Double] = js.native
  /* 1 */ @js.native
  object backgroundColor extends TopLevel[backgroundColor with Double]
  
  /* 2 */ @js.native
  object foregroundColor extends TopLevel[foregroundColor with Double]
  
  /* 0 */ @js.native
  object primaryColor extends TopLevel[primaryColor with Double]
  
}

