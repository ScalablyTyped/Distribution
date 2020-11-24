package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataConditionOperator extends js.Object
@JSGlobal("Sdk.Mdq.MetadataConditionOperator")
@js.native
object MetadataConditionOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataConditionOperator with Double] = js.native
  
  @js.native
  sealed trait Equals extends MetadataConditionOperator
  /* 0 */ @js.native
  object Equals extends TopLevel[Equals with Double]
  
  @js.native
  sealed trait GreaterThan extends MetadataConditionOperator
  /* 4 */ @js.native
  object GreaterThan extends TopLevel[GreaterThan with Double]
  
  @js.native
  sealed trait In extends MetadataConditionOperator
  /* 2 */ @js.native
  object In extends TopLevel[In with Double]
  
  @js.native
  sealed trait LessThan extends MetadataConditionOperator
  /* 5 */ @js.native
  object LessThan extends TopLevel[LessThan with Double]
  
  @js.native
  sealed trait NotEquals extends MetadataConditionOperator
  /* 1 */ @js.native
  object NotEquals extends TopLevel[NotEquals with Double]
  
  @js.native
  sealed trait NotIn extends MetadataConditionOperator
  /* 3 */ @js.native
  object NotIn extends TopLevel[NotIn with Double]
}
