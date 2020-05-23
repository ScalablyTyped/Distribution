package typings.microsoftSdkSoap.mod.global.Sdk.Mdq.ValueEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeRequiredLevel extends js.Object

@JSGlobal("Sdk.Mdq.ValueEnums.AttributeRequiredLevel")
@js.native
object AttributeRequiredLevel extends js.Object {
  @js.native
  sealed trait ApplicationRequired extends AttributeRequiredLevel
  
  @js.native
  sealed trait None extends AttributeRequiredLevel
  
  @js.native
  sealed trait Recommended extends AttributeRequiredLevel
  
  @js.native
  sealed trait SystemRequired extends AttributeRequiredLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttributeRequiredLevel with Double] = js.native
  /* 0 */ @js.native
  object ApplicationRequired extends TopLevel[ApplicationRequired with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Recommended extends TopLevel[Recommended with Double]
  
  /* 3 */ @js.native
  object SystemRequired extends TopLevel[SystemRequired with Double]
  
}

