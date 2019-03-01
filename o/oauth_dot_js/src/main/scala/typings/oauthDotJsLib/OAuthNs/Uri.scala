package typings
package oauthDotJsLib.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uri extends js.Object {
  var anchor: java.lang.String
  var authority: java.lang.String
  var directory: java.lang.String
  var file: java.lang.String
  var host: java.lang.String
  var password: java.lang.String
  var path: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var query: java.lang.String
  var relative: java.lang.String
  var source: java.lang.String
  var user: java.lang.String
  var userInfo: java.lang.String
}

object Uri {
  @scala.inline
  def apply(
    anchor: java.lang.String,
    authority: java.lang.String,
    directory: java.lang.String,
    file: java.lang.String,
    host: java.lang.String,
    password: java.lang.String,
    path: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    query: java.lang.String,
    relative: java.lang.String,
    source: java.lang.String,
    user: java.lang.String,
    userInfo: java.lang.String
  ): Uri = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("anchor")(anchor)
    __obj.updateDynamic("authority")(authority)
    __obj.updateDynamic("directory")(directory)
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("relative")(relative)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("user")(user)
    __obj.updateDynamic("userInfo")(userInfo)
    __obj.asInstanceOf[Uri]
  }
}

