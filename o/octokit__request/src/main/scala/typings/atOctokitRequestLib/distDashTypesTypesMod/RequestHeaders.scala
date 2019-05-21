package typings
package atOctokitRequestLib.distDashTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHeaders
  extends /* header */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double]] {
  /**
    * Avoid setting `accept`, use `mediaFormat.{format|previews}` instead.
    */
  var accept: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use `authorization` to send authenticated request, remember `token ` / `bearer ` prefixes. Example: `token 1234567890abcdef1234567890abcdef12345678`
    */
  var authorization: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `user-agent` is set do a default and can be overwritten as needed.
    */
  var `user-agent`: js.UndefOr[java.lang.String] = js.undefined
}

object RequestHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* header */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double]] = null,
    accept: java.lang.String = null,
    authorization: java.lang.String = null,
    `user-agent`: java.lang.String = null
  ): RequestHeaders = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`)
    __obj.asInstanceOf[RequestHeaders]
  }
}

