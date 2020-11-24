package typings.moxios.mod

import typings.axios.mod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  var config: AxiosRequestConfig = js.native
  
  var headers: js.Any = js.native
  
  /**
    * Respond to this request with a specified result
    *
    * @param res The data representing the result of the request
    * @return A Promise that resolves once the response is ready
    */
  def respondWith(res: Item): js.Promise[Response] = js.native
  
  /**
    * Respond to this request with a timeout result
    *
    * @return A Promise that rejects with a timeout result
    */
  def respondWithTimeout(): js.Promise[Response] = js.native
  
  var responseType: String = js.native
  
  var timeout: Double = js.native
  
  var url: String = js.native
  
  var withCredentials: Boolean = js.native
}
object Request {
  
  @scala.inline
  def apply(
    config: AxiosRequestConfig,
    headers: js.Any,
    respondWith: Item => js.Promise[Response],
    respondWithTimeout: () => js.Promise[Response],
    responseType: String,
    timeout: Double,
    url: String,
    withCredentials: Boolean
  ): Request = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], respondWith = js.Any.fromFunction1(respondWith), respondWithTimeout = js.Any.fromFunction0(respondWithTimeout), responseType = responseType.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: AxiosRequestConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespondWith(value: Item => js.Promise[Response]): Self = this.set("respondWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRespondWithTimeout(value: () => js.Promise[Response]): Self = this.set("respondWithTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
}
