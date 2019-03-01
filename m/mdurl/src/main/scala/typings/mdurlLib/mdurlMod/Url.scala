package typings
package mdurlLib.mdurlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var auth: java.lang.String
  var hash: java.lang.String
  var hostname: java.lang.String
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var search: java.lang.String
  var slashes: java.lang.String
}

object Url {
  @scala.inline
  def apply(
    auth: java.lang.String,
    hash: java.lang.String,
    hostname: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    search: java.lang.String,
    slashes: java.lang.String
  ): Url = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("pathname")(pathname)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("slashes")(slashes)
    __obj.asInstanceOf[Url]
  }
}

