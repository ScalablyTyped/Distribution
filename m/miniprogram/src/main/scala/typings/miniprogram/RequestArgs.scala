package typings.miniprogram

import org.scalablytyped.runtime.StringDictionary
import typings.miniprogram.anon.Headers
import typings.miniprogram.miniprogramStrings.GET
import typings.miniprogram.miniprogramStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestArgs extends AsyncCallback[Headers] {
  
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Expected return data format, default json, supporting json, text and base64.
    */
  var dataType: js.UndefOr[String] = js.native
  
  /**
    * Set the request HTTP header, default {'content-type': 'application/json'}.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var method: js.UndefOr[GET | POST] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: String = js.native
}
object RequestArgs {
  
  @scala.inline
  def apply(url: String): RequestArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestArgs]
  }
  
  @scala.inline
  implicit class RequestArgsOps[Self <: RequestArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | POST): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
