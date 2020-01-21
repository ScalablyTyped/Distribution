package typings.moxios.mod

import typings.axios.mod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var config: AxiosRequestConfig
  var headers: js.Any
  var responseType: String
  var timeout: Double
  var url: String
  var withCredentials: Boolean
  /**
    * Respond to this request with a specified result
    *
    * @param res The data representing the result of the request
    * @return A Promise that resolves once the response is ready
    */
  def respondWith(res: Item): js.Promise[Response]
  /**
    * Respond to this request with a timeout result
    *
    * @return A Promise that rejects with a timeout result
    */
  def respondWithTimeout(): js.Promise[Response]
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
}

