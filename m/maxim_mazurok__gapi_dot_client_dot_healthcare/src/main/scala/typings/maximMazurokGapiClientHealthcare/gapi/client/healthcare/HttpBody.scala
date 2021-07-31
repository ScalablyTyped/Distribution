package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpBody extends StObject {
  
  /** The HTTP Content-Type header value specifying the content type of the body. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** The HTTP request/response body as raw binary. */
  var data: js.UndefOr[String] = js.undefined
  
  /** Application specific response metadata. Must be set in the first response for streaming APIs. */
  var extensions: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.HttpBody & TopLevel[js.Any]
    ]
  ] = js.undefined
}
object HttpBody {
  
  @scala.inline
  def apply(): HttpBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpBody]
  }
  
  @scala.inline
  implicit class HttpBodyMutableBuilder[Self <: HttpBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setExtensions(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.HttpBody & TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.HttpBody & TopLevel[js.Any])*
    ): Self = StObject.set(x, "extensions", js.Array(value :_*))
  }
}
