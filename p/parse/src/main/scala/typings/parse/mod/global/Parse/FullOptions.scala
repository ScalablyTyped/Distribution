package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullOptions extends StObject {
  
  var error: js.UndefOr[js.Function] = js.native
  
  var installationId: js.UndefOr[String] = js.native
  
  var progress: js.UndefOr[js.Function] = js.native
  
  var sessionToken: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[js.Function] = js.native
  
  var useMasterKey: js.UndefOr[Boolean] = js.native
}
object FullOptions {
  
  @scala.inline
  def apply(): FullOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullOptions]
  }
  
  @scala.inline
  implicit class FullOptionsMutableBuilder[Self <: FullOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    @scala.inline
    def setProgress(value: js.Function): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    @scala.inline
    def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUseMasterKey(value: Boolean): Self = StObject.set(x, "useMasterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMasterKeyUndefined: Self = StObject.set(x, "useMasterKey", js.undefined)
  }
}
