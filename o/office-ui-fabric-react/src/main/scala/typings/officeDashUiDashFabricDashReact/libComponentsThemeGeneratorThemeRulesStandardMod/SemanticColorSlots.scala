package typings.officeDashUiDashFabricDashReact.libComponentsThemeGeneratorThemeRulesStandardMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SemanticColorSlots extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ThemeGenerator/ThemeRulesStandard", "SemanticColorSlots")
@js.native
object SemanticColorSlots extends js.Object {
  @js.native
  sealed trait bodyBackground extends SemanticColorSlots
  
  @js.native
  sealed trait bodyText extends SemanticColorSlots
  
  @js.native
  sealed trait disabledBackground extends SemanticColorSlots
  
  @js.native
  sealed trait disabledText extends SemanticColorSlots
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SemanticColorSlots with Double] = js.native
  /* 0 */ @js.native
  object bodyBackground extends TopLevel[bodyBackground with Double]
  
  /* 1 */ @js.native
  object bodyText extends TopLevel[bodyText with Double]
  
  /* 2 */ @js.native
  object disabledBackground extends TopLevel[disabledBackground with Double]
  
  /* 3 */ @js.native
  object disabledText extends TopLevel[disabledText with Double]
  
}

