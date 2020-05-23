package typings.parseGithubUrl.mod

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
    href: String,
    auth: String = null,
    filepath: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
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
    slashes: Boolean = null.asInstanceOf[Boolean]
  ): Result = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

