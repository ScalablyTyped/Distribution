package typings.mdurl.mdurlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var auth: String
  var hash: String
  var hostname: String
  var pathname: String
  var port: String
  var protocol: String
  var search: String
  var slashes: String
}

object Url {
  @scala.inline
  def apply(
    auth: String,
    hash: String,
    hostname: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String,
    slashes: String
  ): Url = {
    val __obj = js.Dynamic.literal(auth = auth, hash = hash, hostname = hostname, pathname = pathname, port = port, protocol = protocol, search = search, slashes = slashes)
  
    __obj.asInstanceOf[Url]
  }
}

