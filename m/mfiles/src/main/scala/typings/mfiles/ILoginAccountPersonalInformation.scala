package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoginAccountPersonalInformation extends StObject {
  
  val AccountName: String
  
  val Email: String
  
  val FullName: String
}
object ILoginAccountPersonalInformation {
  
  inline def apply(AccountName: String, Email: String, FullName: String): ILoginAccountPersonalInformation = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginAccountPersonalInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILoginAccountPersonalInformation] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
  }
}
