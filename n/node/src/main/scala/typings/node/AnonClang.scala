package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClang extends js.Object {
  var clang: Double
  var host_arch: java.lang.String
  var node_install_npm: Boolean
  var node_install_waf: Boolean
  var node_prefix: java.lang.String
  var node_shared_openssl: Boolean
  var node_shared_v8: Boolean
  var node_shared_zlib: Boolean
  var node_use_dtrace: Boolean
  var node_use_etw: Boolean
  var node_use_openssl: Boolean
  var target_arch: java.lang.String
  var v8_no_strict_aliasing: Double
  var v8_use_snapshot: Boolean
  var visibility: java.lang.String
}

object AnonClang {
  @scala.inline
  def apply(
    clang: Double,
    host_arch: java.lang.String,
    node_install_npm: Boolean,
    node_install_waf: Boolean,
    node_prefix: java.lang.String,
    node_shared_openssl: Boolean,
    node_shared_v8: Boolean,
    node_shared_zlib: Boolean,
    node_use_dtrace: Boolean,
    node_use_etw: Boolean,
    node_use_openssl: Boolean,
    target_arch: java.lang.String,
    v8_no_strict_aliasing: Double,
    v8_use_snapshot: Boolean,
    visibility: java.lang.String
  ): AnonClang = {
    val __obj = js.Dynamic.literal(clang = clang.asInstanceOf[js.Any], host_arch = host_arch.asInstanceOf[js.Any], node_install_npm = node_install_npm.asInstanceOf[js.Any], node_install_waf = node_install_waf.asInstanceOf[js.Any], node_prefix = node_prefix.asInstanceOf[js.Any], node_shared_openssl = node_shared_openssl.asInstanceOf[js.Any], node_shared_v8 = node_shared_v8.asInstanceOf[js.Any], node_shared_zlib = node_shared_zlib.asInstanceOf[js.Any], node_use_dtrace = node_use_dtrace.asInstanceOf[js.Any], node_use_etw = node_use_etw.asInstanceOf[js.Any], node_use_openssl = node_use_openssl.asInstanceOf[js.Any], target_arch = target_arch.asInstanceOf[js.Any], v8_no_strict_aliasing = v8_no_strict_aliasing.asInstanceOf[js.Any], v8_use_snapshot = v8_use_snapshot.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClang]
  }
}

