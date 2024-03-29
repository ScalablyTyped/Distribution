package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullOptions extends StObject {
  
  var error: js.UndefOr[js.Function] = js.undefined
  
  var installationId: js.UndefOr[String] = js.undefined
  
  var progress: js.UndefOr[js.Function] = js.undefined
  
  var sessionToken: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[js.Function] = js.undefined
  
  var useMasterKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * logIn will default to POST instead of GET method since
    * version 3.0.0 for security reasons.
    * If you need to use GET set this to `false`.
    */
  var usePost: js.UndefOr[Boolean] = js.undefined
}
object FullOptions {
  
  inline def apply(): FullOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullOptions] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    inline def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    inline def setProgress(value: js.Function): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUseMasterKey(value: Boolean): Self = StObject.set(x, "useMasterKey", value.asInstanceOf[js.Any])
    
    inline def setUseMasterKeyUndefined: Self = StObject.set(x, "useMasterKey", js.undefined)
    
    inline def setUsePost(value: Boolean): Self = StObject.set(x, "usePost", value.asInstanceOf[js.Any])
    
    inline def setUsePostUndefined: Self = StObject.set(x, "usePost", js.undefined)
  }
}
