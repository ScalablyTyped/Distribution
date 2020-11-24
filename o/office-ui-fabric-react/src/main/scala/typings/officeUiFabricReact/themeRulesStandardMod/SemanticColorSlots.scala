package typings.officeUiFabricReact.themeRulesStandardMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticColorSlots extends js.Object
@JSImport("office-ui-fabric-react/lib/components/ThemeGenerator/ThemeRulesStandard", "SemanticColorSlots")
@js.native
object SemanticColorSlots extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SemanticColorSlots with Double] = js.native
  
  @js.native
  sealed trait bodyBackground extends SemanticColorSlots
  /* 0 */ @js.native
  object bodyBackground extends TopLevel[bodyBackground with Double]
  
  @js.native
  sealed trait bodyText extends SemanticColorSlots
  /* 1 */ @js.native
  object bodyText extends TopLevel[bodyText with Double]
  
  @js.native
  sealed trait disabledBackground extends SemanticColorSlots
  /* 2 */ @js.native
  object disabledBackground extends TopLevel[disabledBackground with Double]
  
  @js.native
  sealed trait disabledText extends SemanticColorSlots
  /* 3 */ @js.native
  object disabledText extends TopLevel[disabledText with Double]
}
