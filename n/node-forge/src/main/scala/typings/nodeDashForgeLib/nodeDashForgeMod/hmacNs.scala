package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "hmac")
@js.native
object hmacNs extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - nodeDashForgeLib.nodeDashForgeLibStrings.sha1
    - nodeDashForgeLib.nodeDashForgeLibStrings.md5
    - nodeDashForgeLib.nodeDashForgeLibStrings.sha256
  */
  trait Algorithm extends js.Object
  
  @js.native
  trait HMAC extends js.Object {
    def digest(): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
    def getMact(): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
    def start(md: Algorithm): scala.Unit = js.native
    def start(md: Algorithm, key: java.lang.String): scala.Unit = js.native
    def start(md: Algorithm, key: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): scala.Unit = js.native
    def update(bytes: java.lang.String): scala.Unit = js.native
    def update(bytes: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): scala.Unit = js.native
    def update(bytes: nodeLib.Buffer): scala.Unit = js.native
  }
  
  def create(): HMAC = js.native
}

