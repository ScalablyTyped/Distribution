package typings.paypalCheckoutComponents.modulesCallbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineItemKind extends StObject
@JSImport("paypal-checkout-components/modules/callback-data", "LineItemKind")
@js.native
object LineItemKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LineItemKind & String] = js.native
  
  @js.native
  sealed trait Credit
    extends StObject
       with LineItemKind
  /* "credit" */ val Credit: typings.paypalCheckoutComponents.modulesCallbackDataMod.LineItemKind.Credit & String = js.native
  
  @js.native
  sealed trait Debit
    extends StObject
       with LineItemKind
  /* "debit" */ val Debit: typings.paypalCheckoutComponents.modulesCallbackDataMod.LineItemKind.Debit & String = js.native
}
