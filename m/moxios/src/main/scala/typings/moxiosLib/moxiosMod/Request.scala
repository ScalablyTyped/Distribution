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
    respondWith: js.Function1[Item, js.Promise[Response]],
    respondWithTimeout: js.Function0[js.Promise[Response]],
    responseType: java.lang.String,
    timeout: scala.Double,
    url: java.lang.String,
    withCredentials: scala.Boolean
  ): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("respondWith")(respondWith)
    __obj.updateDynamic("respondWithTimeout")(respondWithTimeout)
    __obj.updateDynamic("responseType")(responseType)
    __obj.updateDynamic("timeout")(timeout)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[Request]
  }
}

