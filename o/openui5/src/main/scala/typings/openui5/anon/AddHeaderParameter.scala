package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddHeaderParameter extends StObject {
  
  /**
    * A function that adds a header parameter to the file that will be uploaded. The function accepts one parameter
    * of type `sap.m.UploadCollectionParameter` which specifies the header parameter that will be added.
    */
  var addHeaderParameter: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Specifies the name of the file to be uploaded.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * A function that returns the corresponding header parameter (type `sap.m.UploadCollectionParameter`) if
    * available. The function accepts one optional parameter of type `string`, which is the name of the header
    * parameter. If no parameter is provided all header parameters are returned.
    */
  var getHeaderParameter: js.UndefOr[js.Function] = js.undefined
}
object AddHeaderParameter {
  
  inline def apply(): AddHeaderParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddHeaderParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddHeaderParameter] (val x: Self) extends AnyVal {
    
    inline def setAddHeaderParameter(value: js.Function): Self = StObject.set(x, "addHeaderParameter", value.asInstanceOf[js.Any])
    
    inline def setAddHeaderParameterUndefined: Self = StObject.set(x, "addHeaderParameter", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setGetHeaderParameter(value: js.Function): Self = StObject.set(x, "getHeaderParameter", value.asInstanceOf[js.Any])
    
    inline def setGetHeaderParameterUndefined: Self = StObject.set(x, "getHeaderParameter", js.undefined)
  }
}
