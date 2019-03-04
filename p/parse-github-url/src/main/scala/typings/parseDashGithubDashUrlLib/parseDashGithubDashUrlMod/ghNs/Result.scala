package typings
package parseDashGithubDashUrlLib.parseDashGithubDashUrlMod.ghNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result
  extends nodeLib.urlMod.Url {
  var branch: java.lang.String
  var filepath: java.lang.String | scala.Null
  var name: java.lang.String | scala.Null
  var owner: java.lang.String | scala.Null
  var repo: java.lang.String | scala.Null
  var repository: java.lang.String | scala.Null
}

object Result {
  @scala.inline
  def apply(
    branch: java.lang.String,
    auth: java.lang.String = null,
    filepath: java.lang.String = null,
    hash: java.lang.String = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    href: java.lang.String = null,
    name: java.lang.String = null,
    owner: java.lang.String = null,
    path: java.lang.String = null,
    pathname: java.lang.String = null,
    port: java.lang.String = null,
    protocol: java.lang.String = null,
    query: java.lang.String | nodeLib.querystringMod.ParsedUrlQuery = null,
    repo: java.lang.String = null,
    repository: java.lang.String = null,
    search: java.lang.String = null,
    slashes: js.UndefOr[scala.Boolean] = js.undefined
  ): Result = {
    val __obj = js.Dynamic.literal(branch = branch)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (filepath != null) __obj.updateDynamic("filepath")(filepath)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (href != null) __obj.updateDynamic("href")(href)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (search != null) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes)
    __obj.asInstanceOf[Result]
  }
}

