package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.MetadataConditionOperator.Equals
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.MetadataConditionOperator.GreaterThan
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.MetadataConditionOperator.In
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.MetadataConditionOperator.LessThan
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.MetadataConditionOperator.NotEquals
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.MetadataConditionOperator.NotIn
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
  def apply(value: scala.Double): js.UndefOr[MetadataConditionOperator with scala.Double] = js.native
  /* 0 */ @js.native
  object Equals
    extends TopLevel[Equals with scala.Double]
  
  /* 4 */ @js.native
  object GreaterThan
    extends TopLevel[GreaterThan with scala.Double]
  
  /* 2 */ @js.native
  object In
    extends TopLevel[In with scala.Double]
  
  /* 5 */ @js.native
  object LessThan
    extends TopLevel[LessThan with scala.Double]
  
  /* 1 */ @js.native
  object NotEquals
    extends TopLevel[NotEquals with scala.Double]
  
  /* 3 */ @js.native
  object NotIn
    extends TopLevel[NotIn with scala.Double]
  
}

