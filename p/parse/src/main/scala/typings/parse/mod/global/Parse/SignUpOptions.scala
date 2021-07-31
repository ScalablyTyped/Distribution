package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignUpOptions extends StObject {
  
  var installationId: js.UndefOr[String] = js.undefined
  
  var useMasterKey: js.UndefOr[Boolean] = js.undefined
}
object SignUpOptions {
  
  @scala.inline
  def apply(): SignUpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignUpOptions]
  }
  
  @scala.inline
  implicit class SignUpOptionsMutableBuilder[Self <: SignUpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    @scala.inline
    def setUseMasterKey(value: Boolean): Self = StObject.set(x, "useMasterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMasterKeyUndefined: Self = StObject.set(x, "useMasterKey", js.undefined)
  }
}
