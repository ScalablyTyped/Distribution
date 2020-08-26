package typings.mithril.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions[T] extends js.Object {
  /** Whether the request should be asynchronous. Defaults to true. */
  var async: js.UndefOr[Boolean] = js.native
  /** If false, redraws mounted components upon completion of the request. If true, it does not. */
  var background: js.UndefOr[Boolean] = js.native
  /** The data to be serialized into the request body. */
  var body: js.UndefOr[js.Any | (js.Object with StringDictionary[js.Any])] = js.native
  /** Exposes the underlying XMLHttpRequest object for low-level configuration. */
  var config: js.UndefOr[
    js.Function2[/* xhr */ XMLHttpRequest, /* options */ this.type, XMLHttpRequest | Unit]
  ] = js.native
  /** A deserialization method to be applied to the response. Defaults to a small wrapper around JSON.parse that returns null for empty responses. */
  var deserialize: js.UndefOr[js.Function1[/* data */ String, T]] = js.native
  /** A hook to specify how the XMLHttpRequest response should be read. Useful for reading response headers and cookies. Defaults to a function that returns xhr.responseText */
  var extract: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* options */ this.type, T]] = js.native
  /** Headers to append to the request before sending it. */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /** The HTTP method to use. */
  var method: js.UndefOr[String] = js.native
  /** The data to be interpolated into the URL and serialized into the querystring. */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** A password for HTTP authorization. */
  var password: js.UndefOr[String] = js.native
  /** A serialization method to be applied to data. Defaults to JSON.stringify, or if options.data is an instance of FormData, defaults to the identity function. */
  var serialize: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  /** Milliseconds a request can take before automatically being terminated. */
  var timeout: js.UndefOr[Double] = js.native
  /** A constructor to be applied to each object in the response. */
  var `type`: js.UndefOr[Instantiable1[/* o */ js.Any, js.Any]] = js.native
  /**
    * Force the use of the HTTP body section for data in GET requests when set to true,
    * or the use of querystring for other HTTP methods when set to false.
    * Defaults to false for GET requests and true for other methods.
    */
  var useBody: js.UndefOr[Boolean] = js.native
  /** A username for HTTP authorization. */
  var user: js.UndefOr[String] = js.native
  /** Whether to send cookies to 3rd party domains. */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object RequestOptions {
  @scala.inline
  def apply[T](): RequestOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions[T]]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions[_], T] (val x: Self with RequestOptions[T]) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBody(value: js.Any | (js.Object with StringDictionary[js.Any])): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setConfig(value: (/* xhr */ XMLHttpRequest, RequestOptions[T]) => XMLHttpRequest | Unit): Self = this.set("config", js.Any.fromFunction2(value))
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setDeserialize(value: /* data */ String => T): Self = this.set("deserialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeserialize: Self = this.set("deserialize", js.undefined)
    @scala.inline
    def setExtract(value: (/* xhr */ XMLHttpRequest, RequestOptions[T]) => T): Self = this.set("extract", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExtract: Self = this.set("extract", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setSerialize(value: /* data */ js.Any => _): Self = this.set("serialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: Instantiable1[/* o */ js.Any, js.Any]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUseBody(value: Boolean): Self = this.set("useBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBody: Self = this.set("useBody", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

