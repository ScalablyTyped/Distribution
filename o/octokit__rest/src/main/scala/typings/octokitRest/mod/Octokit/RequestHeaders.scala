package typings.octokitRest.mod.Octokit

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHeaders
  extends /* header */ StringDictionary[js.UndefOr[String | Double]] {
  /**
    * Avoid setting `accept`, use `mediaFormat.{format|previews}` instead.
    */
  var accept: js.UndefOr[String] = js.undefined
  /**
    * Use `authorization` to send authenticated request, remember `token ` / `bearer ` prefixes. Example: `token 1234567890abcdef1234567890abcdef12345678`
    */
  var authorization: js.UndefOr[String] = js.undefined
  /**
    * `user-agent` is set do a default and can be overwritten as needed.
    */
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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestHeaders]
  }
}

