package typings.minappEnv.WXNS

import typings.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRequestParam
  extends StObject
     with IAPIParam[IRequestSuccessResult] {
  
  var data: js.UndefOr[AnyObject | String | ArrayBuffer] = js.undefined
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[AnyObject] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var url: String
}
object IRequestParam {
  
  inline def apply(url: String): IRequestParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestParam]
  }
  
  extension [Self <: IRequestParam](x: Self) {
    
    inline def setData(value: AnyObject | String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
