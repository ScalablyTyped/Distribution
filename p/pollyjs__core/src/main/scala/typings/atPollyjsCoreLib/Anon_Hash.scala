package typings
package atPollyjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: js.UndefOr[
    scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String])
  ] = js.undefined
  var hostname: js.UndefOr[
    scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String])
  ] = js.undefined
  var password: js.UndefOr[
    scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String])
  ] = js.undefined
  var pathname: js.UndefOr[
    scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String])
  ] = js.undefined
  var port: js.UndefOr[
    scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[scala.Double, scala.Double])
  ] = js.undefined
  var protocol: js.UndefOr[
    scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String])
  ] = js.undefined
  var query: js.UndefOr[scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[_, _])] = js.undefined
  var username: js.UndefOr[
    scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String])
  ] = js.undefined
}

object Anon_Hash {
  @scala.inline
  def apply(
    hash: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String]) = null,
    hostname: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String]) = null,
    password: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String]) = null,
    pathname: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String]) = null,
    port: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[scala.Double, scala.Double]) = null,
    protocol: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String]) = null,
    query: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[_, _]) = null,
    username: scala.Boolean | (atPollyjsCoreLib.atPollyjsCoreMod.MatchBy[java.lang.String, java.lang.String]) = null
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

