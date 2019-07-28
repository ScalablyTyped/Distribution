package typings.parseDashGithubDashUrl.parseDashGithubDashUrlMod

import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends Url {
  var branch: String
  var filepath: String | Null
  var name: String | Null
  var owner: String | Null
  var repo: String | Null
  var repository: String | Null
}

object Result {
  @scala.inline
  def apply(
    branch: String,
    auth: String = null,
    filepath: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
    href: String = null,
    name: String = null,
    owner: String = null,
    path: String = null,
    pathname: String = null,
    port: String = null,
    protocol: String = null,
    query: String | ParsedUrlQuery = null,
    repo: String = null,
    repository: String = null,
    search: String = null,
    slashes: js.UndefOr[Boolean] = js.undefined
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

