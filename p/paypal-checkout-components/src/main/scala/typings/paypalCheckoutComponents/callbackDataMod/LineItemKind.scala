package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineItemKind extends js.Object
@JSImport("paypal-checkout-components/modules/callback-data", "LineItemKind")
@js.native
object LineItemKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LineItemKind with String] = js.native
  
  @js.native
  sealed trait Credit extends LineItemKind
  /* "credit" */ @js.native
  object Credit extends TopLevel[Credit with String]
  
  @js.native
  sealed trait Debit extends LineItemKind
  /* "debit" */ @js.native
  object Debit extends TopLevel[Debit with String]
}
