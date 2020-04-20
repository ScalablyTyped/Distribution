package typings.oauthJs.OAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uri extends js.Object {
  var anchor: String
  var authority: String
  var directory: String
  var file: String
  var host: String
  var password: String
  var path: String
  var port: String
  var protocol: String
  var query: String
  var relative: String
  var source: String
  var user: String
  var userInfo: String
}

object Uri {
  @scala.inline
  def apply(
    anchor: String,
    authority: String,
    directory: String,
    file: String,
    host: String,
    password: String,
    path: String,
    port: String,
    protocol: String,
    query: String,
    relative: String,
    source: String,
    user: String,
    userInfo: String
  ): Uri = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
}

