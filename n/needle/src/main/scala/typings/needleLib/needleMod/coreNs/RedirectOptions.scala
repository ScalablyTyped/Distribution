package typings
package needleLib.needleMod.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  /**
    * When true, Needle will only follow redirects that point to the same host
    * as the original request.
    * false by default.
    */
  var follow_if_same_host: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, Needle will only follow redirects that point to the same protocol
    * as the original request.
    * false by default.
    */
  var follow_if_same_protocol: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If enabled, resends the request using the original verb
    * instead of being rewritten to get with no data.
    * false by default.
    */
  var follow_keep_method: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sends the cookies received in the set-cookie header
    * as part of the following request.
    * false by default.
    */
  var follow_set_cookie: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the 'Referer' header to the requested URI
    * when following a redirect.
    * false by default.
    */
  var follow_set_referer: js.UndefOr[scala.Boolean] = js.undefined
}

