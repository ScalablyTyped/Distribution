package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query.JoinOperator.Inner
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query.JoinOperator.LeftOuter
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query.JoinOperator.Natural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JoinOperator extends js.Object

@JSGlobal("Sdk.Query.JoinOperator")
@js.native
object JoinOperator extends js.Object {
  @js.native
  sealed trait Inner extends JoinOperator
  
  @js.native
  sealed trait LeftOuter extends JoinOperator
  
  @js.native
  sealed trait Natural extends JoinOperator
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[JoinOperator with scala.Double] = js.native
  /* 0 */ @js.native
  object Inner
    extends TopLevel[Inner with scala.Double]
  
  /* 1 */ @js.native
  object LeftOuter
    extends TopLevel[LeftOuter with scala.Double]
  
  /* 2 */ @js.native
  object Natural
    extends TopLevel[Natural with scala.Double]
  
}

