package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  /**
    * A list of uploaded files. Each entry contains the following members. fileName : The name of a file to
    * be uploaded. response : Response message which comes from the server. On the server side, this response
    * has to be put within the 'body' tags of the response document of the iFrame. It can consist of a return
    * code and an optional message. This does not work in cross-domain scenarios. reponse : deprecated Since
    * version 1.48.0. This parameter is deprecated, use parameter response instead. responseRaw : HTTP-Response
    * which comes from the server. This property is not supported by Internet Explorer Versions lower than
    * 9. status : Status of the XHR request. This property is not supported by Internet Explorer 9 and lower.
    * headers : HTTP-Response-Headers which come from the server. Provided as a JSON-map, i.e. each header-field
    * is reflected by a property in the header-object, with the property value reflecting the header-field's
    * content. This property is not supported by Internet Explorer 9 and lower. Since 1.28.0.
    */
  var files: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * Ready state XHR. This parameter is deprecated since 1.28.0. Use the `files` parameter instead.
    */
  var readyStateXHR: js.UndefOr[String] = js.undefined
  
  /**
    * Response of the completed upload request. This parameter is deprecated since 1.28.0. Use the `files`
    * parameter instead.
    */
  var response: js.UndefOr[String] = js.undefined
  
  /**
    * Status Code of the completed upload event. This parameter is deprecated since 1.28.0. Use the `files`
    * parameter instead.
    */
  var status: js.UndefOr[String] = js.undefined
}
object Response {
  
  inline def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: js.Array[js.Object]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: js.Object*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setReadyStateXHR(value: String): Self = StObject.set(x, "readyStateXHR", value.asInstanceOf[js.Any])
    
    inline def setReadyStateXHRUndefined: Self = StObject.set(x, "readyStateXHR", js.undefined)
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
