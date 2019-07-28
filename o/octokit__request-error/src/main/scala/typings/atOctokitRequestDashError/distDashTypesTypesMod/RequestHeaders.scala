package typings.atOctokitRequestDashError.distDashTypesTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHeaders
  extends /* header */ StringDictionary[js.UndefOr[String | Double]] {
  /**
    * Used for API previews and custom formats
    */
  var accept: js.UndefOr[String] = js.undefined
  /**
    * Redacted authorization header
    */
  var authorization: js.UndefOr[String] = js.undefined
  var `user-agent`: js.UndefOr[String] = js.undefined
}

object RequestHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* header */ StringDictionary[js.UndefOr[String | Double]] = null,
    accept: String = null,
    authorization: String = null,
    `user-agent`: String = null
  ): RequestHeaders = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`)
    __obj.asInstanceOf[RequestHeaders]
  }
}

