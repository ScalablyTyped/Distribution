package typings.oauthDotJs.OAuthNs

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
    val __obj = js.Dynamic.literal(anchor = anchor, authority = authority, directory = directory, file = file, host = host, password = password, path = path, port = port, protocol = protocol, query = query, relative = relative, source = source, user = user, userInfo = userInfo)
  
    __obj.asInstanceOf[Uri]
  }
}

