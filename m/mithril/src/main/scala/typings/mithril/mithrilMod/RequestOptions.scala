package typings.mithril.mithrilMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions[T] extends js.Object {
  /** Whether the request should be asynchronous. Defaults to true. */
  var async: js.UndefOr[Boolean] = js.undefined
  /** If false, redraws mounted components upon completion of the request. If true, it does not. */
  var background: js.UndefOr[Boolean] = js.undefined
  /** The data to be serialized into the request body. */
  var body: js.UndefOr[js.Any | (js.Object with StringDictionary[js.Any])] = js.undefined
  /** Exposes the underlying XMLHttpRequest object for low-level configuration. */
  var config: js.UndefOr[
    js.Function2[/* xhr */ XMLHttpRequest, /* options */ this.type, XMLHttpRequest | Unit]
  ] = js.undefined
  /** A deserialization method to be applied to the response. Defaults to a small wrapper around JSON.parse that returns null for empty responses. */
  var deserialize: js.UndefOr[js.Function1[/* data */ String, T]] = js.undefined
  /** A hook to specify how the XMLHttpRequest response should be read. Useful for reading response headers and cookies. Defaults to a function that returns xhr.responseText */
  var extract: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* options */ this.type, T]] = js.undefined
  /** Headers to append to the request before sending it. */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /** The HTTP method to use. */
  var method: js.UndefOr[String] = js.undefined
  /** The data to be interpolated into the URL and serialized into the querystring. */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** A password for HTTP authorization. */
  var password: js.UndefOr[String] = js.undefined
  /** A serialization method to be applied to data. Defaults to JSON.stringify, or if options.data is an instance of FormData, defaults to the identity function. */
  var serialize: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  /** Milliseconds a request can take before automatically being terminated. */
  var timeout: js.UndefOr[Double] = js.undefined
  /** A constructor to be applied to each object in the response. */
  var `type`: js.UndefOr[Instantiable1[/* o */ js.Any, js.Any]] = js.undefined
  /**
  		 * Force the use of the HTTP body section for data in GET requests when set to true,
  		 * or the use of querystring for other HTTP methods when set to false.
  		 * Defaults to false for GET requests and true for other methods.
  		 */
  var useBody: js.UndefOr[Boolean] = js.undefined
  /** A username for HTTP authorization. */
  var user: js.UndefOr[String] = js.undefined
  /** Whether to send cookies to 3rd party domains. */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply[T](
    async: js.UndefOr[Boolean] = js.undefined,
    background: js.UndefOr[Boolean] = js.undefined,
    body: js.Any | (js.Object with StringDictionary[js.Any]) = null,
    config: (/* xhr */ XMLHttpRequest, RequestOptions[T]) => XMLHttpRequest | Unit = null,
    deserialize: /* data */ String => T = null,
    extract: (/* xhr */ XMLHttpRequest, RequestOptions[T]) => T = null,
    headers: StringDictionary[String] = null,
    method: String = null,
    params: StringDictionary[js.Any] = null,
    password: String = null,
    serialize: /* data */ js.Any => _ = null,
    timeout: Int | Double = null,
    `type`: Instantiable1[/* o */ js.Any, js.Any] = null,
    useBody: js.UndefOr[Boolean] = js.undefined,
    user: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): RequestOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(js.Any.fromFunction2(config))
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1(deserialize))
    if (extract != null) __obj.updateDynamic("extract")(js.Any.fromFunction2(extract))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useBody)) __obj.updateDynamic("useBody")(useBody.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions[T]]
  }
}

