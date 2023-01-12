package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHeaderParameter extends StObject {
  
  /**
    * Specifies the name of the file of which the upload is to be terminated.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * This callback function returns the corresponding header parameter (type sap.m.UploadCollectionParameter)
    * if available.
    */
  var getHeaderParameter: js.UndefOr[js.Function] = js.undefined
}
object GetHeaderParameter {
  
  inline def apply(): GetHeaderParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHeaderParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHeaderParameter] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setGetHeaderParameter(value: js.Function): Self = StObject.set(x, "getHeaderParameter", value.asInstanceOf[js.Any])
    
    inline def setGetHeaderParameterUndefined: Self = StObject.set(x, "getHeaderParameter", js.undefined)
  }
}
