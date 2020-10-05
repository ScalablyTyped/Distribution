package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clang extends js.Object {
  var clang: Double = js.native
  var host_arch: String = js.native
  var node_install_npm: Boolean = js.native
  var node_install_waf: Boolean = js.native
  var node_prefix: String = js.native
  var node_shared_openssl: Boolean = js.native
  var node_shared_v8: Boolean = js.native
  var node_shared_zlib: Boolean = js.native
  var node_use_dtrace: Boolean = js.native
  var node_use_etw: Boolean = js.native
  var node_use_openssl: Boolean = js.native
  var target_arch: String = js.native
  var v8_no_strict_aliasing: Double = js.native
  var v8_use_snapshot: Boolean = js.native
  var visibility: String = js.native
}

object Clang {
  @scala.inline
  def apply(
    clang: Double,
    host_arch: String,
    node_install_npm: Boolean,
    node_install_waf: Boolean,
    node_prefix: String,
    node_shared_openssl: Boolean,
    node_shared_v8: Boolean,
    node_shared_zlib: Boolean,
    node_use_dtrace: Boolean,
    node_use_etw: Boolean,
    node_use_openssl: Boolean,
    target_arch: String,
    v8_no_strict_aliasing: Double,
    v8_use_snapshot: Boolean,
    visibility: String
  ): Clang = {
    val __obj = js.Dynamic.literal(clang = clang.asInstanceOf[js.Any], host_arch = host_arch.asInstanceOf[js.Any], node_install_npm = node_install_npm.asInstanceOf[js.Any], node_install_waf = node_install_waf.asInstanceOf[js.Any], node_prefix = node_prefix.asInstanceOf[js.Any], node_shared_openssl = node_shared_openssl.asInstanceOf[js.Any], node_shared_v8 = node_shared_v8.asInstanceOf[js.Any], node_shared_zlib = node_shared_zlib.asInstanceOf[js.Any], node_use_dtrace = node_use_dtrace.asInstanceOf[js.Any], node_use_etw = node_use_etw.asInstanceOf[js.Any], node_use_openssl = node_use_openssl.asInstanceOf[js.Any], target_arch = target_arch.asInstanceOf[js.Any], v8_no_strict_aliasing = v8_no_strict_aliasing.asInstanceOf[js.Any], v8_use_snapshot = v8_use_snapshot.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clang]
  }
  @scala.inline
  implicit class ClangOps[Self <: Clang] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClang(value: Double): Self = this.set("clang", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost_arch(value: String): Self = this.set("host_arch", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_install_npm(value: Boolean): Self = this.set("node_install_npm", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_install_waf(value: Boolean): Self = this.set("node_install_waf", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_prefix(value: String): Self = this.set("node_prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_shared_openssl(value: Boolean): Self = this.set("node_shared_openssl", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_shared_v8(value: Boolean): Self = this.set("node_shared_v8", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_shared_zlib(value: Boolean): Self = this.set("node_shared_zlib", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_use_dtrace(value: Boolean): Self = this.set("node_use_dtrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_use_etw(value: Boolean): Self = this.set("node_use_etw", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_use_openssl(value: Boolean): Self = this.set("node_use_openssl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget_arch(value: String): Self = this.set("target_arch", value.asInstanceOf[js.Any])
    @scala.inline
    def setV8_no_strict_aliasing(value: Double): Self = this.set("v8_no_strict_aliasing", value.asInstanceOf[js.Any])
    @scala.inline
    def setV8_use_snapshot(value: Boolean): Self = this.set("v8_use_snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
  
}

