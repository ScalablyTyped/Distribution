package typings.nodeBarion.mod

import typings.nodeBarion.nodeBarionStrings.CZK
import typings.nodeBarion.nodeBarionStrings.EUR
import typings.nodeBarion.nodeBarionStrings.HUF
import typings.nodeBarion.nodeBarionStrings.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankTransferRequest extends StObject {
  
  var Amount: Double
  
  var BankAccount: typings.nodeBarion.mod.BankAccount
  
  var Comment: js.UndefOr[String] = js.undefined
  
  var Currency: CZK | EUR | HUF | USD
  
  var Password: String
  
  var RecipientName: String
  
  var UserName: String
}
object BankTransferRequest {
  
  inline def apply(
    Amount: Double,
    BankAccount: BankAccount,
    Currency: CZK | EUR | HUF | USD,
    Password: String,
    RecipientName: String,
    UserName: String
  ): BankTransferRequest = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], RecipientName = RecipientName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankTransferRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankTransferRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setBankAccount(value: BankAccount): Self = StObject.set(x, "BankAccount", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setCurrency(value: CZK | EUR | HUF | USD): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setRecipientName(value: String): Self = StObject.set(x, "RecipientName", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
