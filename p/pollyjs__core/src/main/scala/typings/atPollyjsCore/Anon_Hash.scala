package typings.atPollyjsCore

import typings.atPollyjsCore.atPollyjsCoreMod.MatchBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
  var hostname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
  var password: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
  var pathname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
  var port: js.UndefOr[Boolean | (MatchBy[Double, Double])] = js.undefined
  var protocol: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
  var query: js.UndefOr[Boolean | (MatchBy[_, _])] = js.undefined
  var username: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
}

object Anon_Hash {
  @scala.inline
  def apply(
    hash: Boolean | (MatchBy[String, String]) = null,
    hostname: Boolean | (MatchBy[String, String]) = null,
    password: Boolean | (MatchBy[String, String]) = null,
    pathname: Boolean | (MatchBy[String, String]) = null,
    port: Boolean | (MatchBy[Double, Double]) = null,
    protocol: Boolean | (MatchBy[String, String]) = null,
    query: Boolean | (MatchBy[_, _]) = null,
    username: Boolean | (MatchBy[String, String]) = null
  ): Anon_Hash = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Hash]
  }
}

