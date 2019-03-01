package typings
package nanoajaxLib.nanoajaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParameters extends js.Object {
  var body: js.UndefOr[java.lang.String | stdLib.FormData] = js.undefined
  var cors: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object RequestParameters {
  @scala.inline
  def apply(
    url: java.lang.String,
    body: java.lang.String | stdLib.FormData = null,
    cors: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: java.lang.String = null
  ): RequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[RequestParameters]
  }
}

