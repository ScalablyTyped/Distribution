package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessVersions extends js.Object {
  var ares: java.lang.String
  var http_parser: java.lang.String
  var modules: java.lang.String
  var node: java.lang.String
  var openssl: java.lang.String
  var uv: java.lang.String
  var v8: java.lang.String
  var zlib: java.lang.String
}

object ProcessVersions {
  @scala.inline
  def apply(
    ares: java.lang.String,
    http_parser: java.lang.String,
    modules: java.lang.String,
    node: java.lang.String,
    openssl: java.lang.String,
    uv: java.lang.String,
    v8: java.lang.String,
    zlib: java.lang.String
  ): ProcessVersions = {
    val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessVersions]
  }
}

