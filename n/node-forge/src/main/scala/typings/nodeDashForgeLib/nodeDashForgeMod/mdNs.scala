package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "md")
@js.native
object mdNs extends js.Object {
  @js.native
  trait MessageDigest extends js.Object {
    def digest(): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer = js.native
    def update(msg: java.lang.String): MessageDigest = js.native
    def update(msg: java.lang.String, encoding: nodeDashForgeLib.nodeDashForgeMod.Encoding): MessageDigest = js.native
  }
  
  @JSName("md5")
  @js.native
  object md5Ns extends js.Object {
    def create(): nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest = js.native
  }
  
  @JSName("sha1")
  @js.native
  object sha1Ns extends js.Object {
    def create(): nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest = js.native
  }
  
  @JSName("sha256")
  @js.native
  object sha256Ns extends js.Object {
    def create(): nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest = js.native
  }
  
  @JSName("sha512")
  @js.native
  object sha512Ns extends js.Object {
    def create(): nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest = js.native
  }
  
}

