package typings.miniprogram.anon

import typings.miniprogram.AsyncCallbackFailObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  filePath :string,   fileType :string} & miniprogram.AsyncCallback<any> */
trait filePathstringfileTypestr extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.undefined
  
  var filePath: String
  
  var fileType: String
  
  var success: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
}
object filePathstringfileTypestr {
  
  inline def apply(filePath: String, fileType: String): filePathstringfileTypestr = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[filePathstringfileTypestr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: filePathstringfileTypestr] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* err */ AsyncCallbackFailObject => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
