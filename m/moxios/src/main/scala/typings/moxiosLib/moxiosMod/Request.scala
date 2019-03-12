package typings
package moxiosLib.moxiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var config: axiosLib.axiosMod.AxiosRequestConfig
  var headers: js.Any
  var responseType: java.lang.String
  var timeout: scala.Double
  var url: java.lang.String
  var withCredentials: scala.Boolean
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
    config: axiosLib.axiosMod.AxiosRequestConfig,
    headers: js.Any,
    respondWith: Item => js.Promise[Response],
    respondWithTimeout: () => js.Promise[Response],
    responseType: java.lang.String,
    timeout: scala.Double,
    url: java.lang.String,
    withCredentials: scala.Boolean
  ): Request = {
    val __obj = js.Dynamic.literal(config = config, headers = headers, respondWith = js.Any.fromFunction1(respondWith), respondWithTimeout = js.Any.fromFunction0(respondWithTimeout), responseType = responseType, timeout = timeout, url = url, withCredentials = withCredentials)
  
    __obj.asInstanceOf[Request]
  }
}

