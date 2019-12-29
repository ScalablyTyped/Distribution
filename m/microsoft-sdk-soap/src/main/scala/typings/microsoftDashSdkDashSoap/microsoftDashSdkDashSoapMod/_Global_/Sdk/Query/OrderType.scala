package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrderType extends js.Object

@JSGlobal("Sdk.Query.OrderType")
@js.native
object OrderType extends js.Object {
  @js.native
  sealed trait Ascending extends OrderType
  
  @js.native
  sealed trait Descending extends OrderType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderType with Double] = js.native
  /* 0 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 1 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
}

