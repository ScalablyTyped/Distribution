package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an incoming HTTP request.
  */
trait Request extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Returns the specified HTTP header field. The match is case-insensitive.
    *
    */
  def get(field: java.lang.String): js.UndefOr[_]
  /**
    * Checks if the request’s Content-Type HTTP header matches any of the given MIME types.
    *
    */
  def is(types: js.Array[java.lang.String]): java.lang.String | oauth2DashServerLib.oauth2DashServerLibNumbers.`false`
}

object Request {
  @scala.inline
  def apply(
    get: js.Function1[java.lang.String, js.UndefOr[_]],
    is: js.Function1[
      js.Array[java.lang.String], 
      java.lang.String | oauth2DashServerLib.oauth2DashServerLibNumbers.`false`
    ],
    body: js.Any = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: java.lang.String = null,
    query: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("is")(is)
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Request]
  }
}

