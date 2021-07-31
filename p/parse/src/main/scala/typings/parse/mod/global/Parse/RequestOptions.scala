package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var include: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var installationId: js.UndefOr[String] = js.undefined
  
  var progress: js.UndefOr[js.Function] = js.undefined
  
  var sessionToken: js.UndefOr[String] = js.undefined
  
  var useMasterKey: js.UndefOr[Boolean] = js.undefined
}
object RequestOptions {
  
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    
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
    def setUseMasterKey(value: Boolean): Self = StObject.set(x, "useMasterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMasterKeyUndefined: Self = StObject.set(x, "useMasterKey", js.undefined)
  }
}
