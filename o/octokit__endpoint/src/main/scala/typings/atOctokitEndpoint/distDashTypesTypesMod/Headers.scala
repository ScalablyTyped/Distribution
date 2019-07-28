package typings.atOctokitEndpoint.distDashTypesTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers
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

object Headers {
  @scala.inline
  def apply(
    StringDictionary: /* header */ StringDictionary[js.UndefOr[String | Double]] = null,
    accept: String = null,
    authorization: String = null,
    `user-agent`: String = null
  ): Headers = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`)
    __obj.asInstanceOf[Headers]
  }
}

