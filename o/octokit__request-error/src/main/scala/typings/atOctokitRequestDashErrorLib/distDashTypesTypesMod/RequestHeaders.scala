package typings
package atOctokitRequestDashErrorLib.distDashTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHeaders
  extends /* header */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double]] {
  /**
    * Used for API previews and custom formats
    */
  var accept: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Redacted authorization header
    */
  var authorization: js.UndefOr[java.lang.String] = js.undefined
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

