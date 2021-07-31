package typings.mfiles

import typings.mfiles.MFiles.MFImpersonationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImpersonation extends StObject {
  
  var Account: String
  
  def Clone(): IImpersonation
  
  var ImpersonationType: MFImpersonationType
  
  var Password: String
}
object IImpersonation {
  
  @scala.inline
  def apply(
    Account: String,
    Clone: () => IImpersonation,
    ImpersonationType: MFImpersonationType,
    Password: String
  ): IImpersonation = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ImpersonationType = ImpersonationType.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImpersonation]
  }
  
  @scala.inline
  implicit class IImpersonationMutableBuilder[Self <: IImpersonation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IImpersonation): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImpersonationType(value: MFImpersonationType): Self = StObject.set(x, "ImpersonationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
  }
}
