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
  def respondWith(res: Item): stdLib.Promise[Response]
  /**
       * Respond to this request with a timeout result
       *
       * @return A Promise that rejects with a timeout result
       */
  def respondWithTimeout(): stdLib.Promise[Response]
}

