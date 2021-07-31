package typings.microsoftSdkSoap.mod.global.Sdk.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OrderType extends StObject
@JSGlobal("Sdk.Query.OrderType")
@js.native
object OrderType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderType & Double] = js.native
  
  @js.native
  sealed trait Ascending
    extends StObject
       with OrderType
  /* 0 */ val Ascending: typings.microsoftSdkSoap.mod.global.Sdk.Query.OrderType.Ascending & Double = js.native
  
  @js.native
  sealed trait Descending
    extends StObject
       with OrderType
  /* 1 */ val Descending: typings.microsoftSdkSoap.mod.global.Sdk.Query.OrderType.Descending & Double = js.native
}
