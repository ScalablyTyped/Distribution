package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MetadataConditionOperator extends js.Object

@JSGlobal("Sdk.Mdq.MetadataConditionOperator")
@js.native
object MetadataConditionOperator extends js.Object {
  @js.native
  sealed trait Equals extends MetadataConditionOperator
  
  @js.native
  sealed trait GreaterThan extends MetadataConditionOperator
  
  @js.native
  sealed trait In extends MetadataConditionOperator
  
  @js.native
  sealed trait LessThan extends MetadataConditionOperator
  
  @js.native
  sealed trait NotEquals extends MetadataConditionOperator
  
  @js.native
  sealed trait NotIn extends MetadataConditionOperator
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataConditionOperator with Double] = js.native
  /* 0 */ @js.native
  object Equals extends TopLevel[Equals with Double]
  
  /* 4 */ @js.native
  object GreaterThan extends TopLevel[GreaterThan with Double]
  
  /* 2 */ @js.native
  object In extends TopLevel[In with Double]
  
  /* 5 */ @js.native
  object LessThan extends TopLevel[LessThan with Double]
  
  /* 1 */ @js.native
  object NotEquals extends TopLevel[NotEquals with Double]
  
  /* 3 */ @js.native
  object NotIn extends TopLevel[NotIn with Double]
  
}

