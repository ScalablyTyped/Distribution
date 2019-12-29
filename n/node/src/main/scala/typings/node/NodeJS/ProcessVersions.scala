package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessVersions extends js.Object {
  var ares: String
  var http_parser: String
  var modules: String
  var node: String
  var openssl: String
  var uv: String
  var v8: String
  var zlib: String
}

object ProcessVersions {
  @scala.inline
  def apply(
    ares: String,
    http_parser: String,
    modules: String,
    node: String,
    openssl: String,
    uv: String,
    v8: String,
    zlib: String
  ): ProcessVersions = {
    val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessVersions]
  }
}

