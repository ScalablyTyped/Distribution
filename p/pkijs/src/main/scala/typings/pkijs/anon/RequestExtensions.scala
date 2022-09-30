package typings.pkijs.anon

import typings.pkijs.mod.ExtensionsSchema
import typings.pkijs.mod.GeneralNameSchema
import typings.pkijs.mod.RequestSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestExtensions extends StObject {
  
  var TBSRequestVersion: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[ExtensionsSchema] = js.undefined
  
  var requestExtensions: js.UndefOr[String] = js.undefined
  
  var requestList: js.UndefOr[String] = js.undefined
  
  var requestNames: js.UndefOr[RequestSchema] = js.undefined
  
  var requestorName: js.UndefOr[GeneralNameSchema] = js.undefined
  
  var requests: js.UndefOr[String] = js.undefined
}
object RequestExtensions {
  
  inline def apply(): RequestExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestExtensions]
  }
  
  extension [Self <: RequestExtensions](x: Self) {
    
    inline def setExtensions(value: ExtensionsSchema): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setRequestExtensions(value: String): Self = StObject.set(x, "requestExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequestExtensionsUndefined: Self = StObject.set(x, "requestExtensions", js.undefined)
    
    inline def setRequestList(value: String): Self = StObject.set(x, "requestList", value.asInstanceOf[js.Any])
    
    inline def setRequestListUndefined: Self = StObject.set(x, "requestList", js.undefined)
    
    inline def setRequestNames(value: RequestSchema): Self = StObject.set(x, "requestNames", value.asInstanceOf[js.Any])
    
    inline def setRequestNamesUndefined: Self = StObject.set(x, "requestNames", js.undefined)
    
    inline def setRequestorName(value: GeneralNameSchema): Self = StObject.set(x, "requestorName", value.asInstanceOf[js.Any])
    
    inline def setRequestorNameUndefined: Self = StObject.set(x, "requestorName", js.undefined)
    
    inline def setRequests(value: String): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setTBSRequestVersion(value: String): Self = StObject.set(x, "TBSRequestVersion", value.asInstanceOf[js.Any])
    
    inline def setTBSRequestVersionUndefined: Self = StObject.set(x, "TBSRequestVersion", js.undefined)
  }
}
