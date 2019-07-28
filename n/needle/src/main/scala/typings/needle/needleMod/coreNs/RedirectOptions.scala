package typings.needle.needleMod.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  /**
    * When true, Needle will only follow redirects that point to the same host
    * as the original request.
    * false by default.
    */
  var follow_if_same_host: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, Needle will only follow redirects that point to the same protocol
    * as the original request.
    * false by default.
    */
  var follow_if_same_protocol: js.UndefOr[Boolean] = js.undefined
  /**
    * If enabled, resends the request using the original verb
    * instead of being rewritten to get with no data.
    * false by default.
    */
  var follow_keep_method: js.UndefOr[Boolean] = js.undefined
  /**
    * Sends the cookies received in the set-cookie header
    * as part of the following request.
    * false by default.
    */
  var follow_set_cookie: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the 'Referer' header to the requested URI
    * when following a redirect.
    * false by default.
    */
  var follow_set_referer: js.UndefOr[Boolean] = js.undefined
}

object RedirectOptions {
  @scala.inline
  def apply(
    follow_if_same_host: js.UndefOr[Boolean] = js.undefined,
    follow_if_same_protocol: js.UndefOr[Boolean] = js.undefined,
    follow_keep_method: js.UndefOr[Boolean] = js.undefined,
    follow_set_cookie: js.UndefOr[Boolean] = js.undefined,
    follow_set_referer: js.UndefOr[Boolean] = js.undefined
  ): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(follow_if_same_host)) __obj.updateDynamic("follow_if_same_host")(follow_if_same_host)
    if (!js.isUndefined(follow_if_same_protocol)) __obj.updateDynamic("follow_if_same_protocol")(follow_if_same_protocol)
    if (!js.isUndefined(follow_keep_method)) __obj.updateDynamic("follow_keep_method")(follow_keep_method)
    if (!js.isUndefined(follow_set_cookie)) __obj.updateDynamic("follow_set_cookie")(follow_set_cookie)
    if (!js.isUndefined(follow_set_referer)) __obj.updateDynamic("follow_set_referer")(follow_set_referer)
    __obj.asInstanceOf[RedirectOptions]
  }
}

