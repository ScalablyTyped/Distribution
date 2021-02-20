package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogicalOperator extends StObject
@JSGlobal("Sdk.Mdq.LogicalOperator")
@js.native
object LogicalOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogicalOperator with Double] = js.native
  
  @js.native
  sealed trait And extends LogicalOperator
  /* 0 */ val And: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.LogicalOperator.And with Double = js.native
  
  @js.native
  sealed trait Or extends LogicalOperator
  /* 1 */ val Or: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.LogicalOperator.Or with Double = js.native
}
