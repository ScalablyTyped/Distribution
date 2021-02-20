package typings.microsoftSdkSoap.mod.global.Sdk.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogicalOperator extends StObject
@JSGlobal("Sdk.Query.LogicalOperator")
@js.native
object LogicalOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogicalOperator with Double] = js.native
  
  @js.native
  sealed trait And extends LogicalOperator
  /* 1 */ val And: typings.microsoftSdkSoap.mod.global.Sdk.Query.LogicalOperator.And with Double = js.native
  
  @js.native
  sealed trait Or extends LogicalOperator
  /* 0 */ val Or: typings.microsoftSdkSoap.mod.global.Sdk.Query.LogicalOperator.Or with Double = js.native
}
