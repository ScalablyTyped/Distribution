package typings
package mithrilLib.mithrilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions[T] extends js.Object {
  /** Whether the request should be asynchronous. Defaults to true. */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /** If false, redraws mounted components upon completion of the request. If true, it does not. */
  var background: js.UndefOr[scala.Boolean] = js.undefined
  /** Exposes the underlying XMLHttpRequest object for low-level configuration. */
  var config: js.UndefOr[
    js.Function2[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* options */ this.type, 
      stdLib.XMLHttpRequest | scala.Unit
    ]
  ] = js.undefined
  /** The data to be interpolated into the URL and serialized into the querystring (for GET requests) or body (for other types of requests). */
  var data: js.UndefOr[js.Any] = js.undefined
  /** A deserialization method to be applied to the response. Defaults to a small wrapper around JSON.parse that returns null for empty responses. */
  var deserialize: js.UndefOr[js.Function1[/* data */ java.lang.String, T]] = js.undefined
  /** A hook to specify how the XMLHttpRequest response should be read. Useful for reading response headers and cookies. Defaults to a function that returns xhr.responseText */
  var extract: js.UndefOr[js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* options */ this.type, T]] = js.undefined
  /** Headers to append to the request before sending it. */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** The HTTP method to use. */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** A password for HTTP authorization. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** A serialization method to be applied to data. Defaults to JSON.stringify, or if options.data is an instance of FormData, defaults to the identity function. */
  var serialize: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  /** A constructor to be applied to each object in the response. */
  var `type`: js.UndefOr[org.scalablytyped.runtime.Instantiable1[/* o */ js.Any, js.Any]] = js.undefined
  /**
  		 * Force the use of the HTTP body section for data in GET requests when set to true,
  		 * or the use of querystring for other HTTP methods when set to false.
  		 * Defaults to false for GET requests and true for other methods.
  		 */
  var useBody: js.UndefOr[scala.Boolean] = js.undefined
  /** A username for HTTP authorization. */
  var user: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to send cookies to 3rd party domains. */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply[T](
    async: js.UndefOr[scala.Boolean] = js.undefined,
    background: js.UndefOr[scala.Boolean] = js.undefined,
    config: (/* xhr */ stdLib.XMLHttpRequest, RequestOptions[T]) => stdLib.XMLHttpRequest | scala.Unit = null,
    data: js.Any = null,
    deserialize: /* data */ java.lang.String => T = null,
    extract: (/* xhr */ stdLib.XMLHttpRequest, RequestOptions[T]) => T = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: java.lang.String = null,
    password: java.lang.String = null,
    serialize: /* data */ js.Any => _ = null,
    `type`: org.scalablytyped.runtime.Instantiable1[/* o */ js.Any, js.Any] = null,
    useBody: js.UndefOr[scala.Boolean] = js.undefined,
    user: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (config != null) __obj.updateDynamic("config")(js.Any.fromFunction2(config))
    if (data != null) __obj.updateDynamic("data")(data)
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1(deserialize))
    if (extract != null) __obj.updateDynamic("extract")(js.Any.fromFunction2(extract))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (password != null) __obj.updateDynamic("password")(password)
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useBody)) __obj.updateDynamic("useBody")(useBody)
    if (user != null) __obj.updateDynamic("user")(user)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[RequestOptions[T]]
  }
}

