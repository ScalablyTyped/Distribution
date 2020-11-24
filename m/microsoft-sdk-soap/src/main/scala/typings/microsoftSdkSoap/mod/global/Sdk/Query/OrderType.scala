package typings.microsoftSdkSoap.mod.global.Sdk.Query

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OrderType extends js.Object
@JSGlobal("Sdk.Query.OrderType")
@js.native
object OrderType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderType with Double] = js.native
  
  @js.native
  sealed trait Ascending extends OrderType
  /* 0 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  @js.native
  sealed trait Descending extends OrderType
  /* 1 */ @js.native
  object Descending extends TopLevel[Descending with Double]
}
