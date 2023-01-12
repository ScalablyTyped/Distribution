package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDownloadFileParam
  extends StObject
     with IAPIParam[IDownloadFileSuccessResult] {
  
  var header: js.UndefOr[AnyObject] = js.undefined
  
  var url: String
}
object IDownloadFileParam {
  
  inline def apply(url: String): IDownloadFileParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDownloadFileParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDownloadFileParam] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
