package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineItemKind extends StObject
@JSImport("paypal-checkout-components/modules/callback-data", "LineItemKind")
@js.native
object LineItemKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LineItemKind with String] = js.native
  
  @js.native
  sealed trait Credit extends LineItemKind
  /* "credit" */ val Credit: typings.paypalCheckoutComponents.callbackDataMod.LineItemKind.Credit with String = js.native
  
  @js.native
  sealed trait Debit extends LineItemKind
  /* "debit" */ val Debit: typings.paypalCheckoutComponents.callbackDataMod.LineItemKind.Debit with String = js.native
}
