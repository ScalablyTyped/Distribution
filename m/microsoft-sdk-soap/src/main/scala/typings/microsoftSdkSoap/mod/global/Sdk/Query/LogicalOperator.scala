package typings.microsoftSdkSoap.mod.global.Sdk.Query

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogicalOperator extends js.Object
@JSGlobal("Sdk.Query.LogicalOperator")
@js.native
object LogicalOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogicalOperator with Double] = js.native
  
  @js.native
  sealed trait And extends LogicalOperator
  /* 1 */ @js.native
  object And extends TopLevel[And with Double]
  
  @js.native
  sealed trait Or extends LogicalOperator
  /* 0 */ @js.native
  object Or extends TopLevel[Or with Double]
}
