package typings.minappEnv.WXNS

import typings.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRequestParam extends IAPIParam[IRequestSuccessResult] {
  
  var data: js.UndefOr[AnyObject | String | ArrayBuffer] = js.native
  
  var dataType: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[AnyObject] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object IRequestParam {
  
  @scala.inline
  def apply(url: String): IRequestParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestParam]
  }
  
  @scala.inline
  implicit class IRequestParamMutableBuilder[Self <: IRequestParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: AnyObject | String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
