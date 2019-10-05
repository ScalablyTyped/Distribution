package typings.nodeDashForge.nodeDashForgeMod

import typings.node.Buffer
import typings.nodeDashForge.nodeDashForgeMod.hmac.Algorithm
import typings.nodeDashForge.nodeDashForgeMod.hmac.HMAC
import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "hmac")
@js.native
object hmac extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashForge.nodeDashForgeStrings.sha1
    - typings.nodeDashForge.nodeDashForgeStrings.md5
    - typings.nodeDashForge.nodeDashForgeStrings.sha256
  */
  trait Algorithm extends js.Object
  
  @js.native
  trait HMAC extends js.Object {
    def digest(): ByteBuffer = js.native
    def getMact(): ByteBuffer = js.native
    def start(md: Algorithm): Unit = js.native
    def start(md: Algorithm, key: String): Unit = js.native
    def start(md: Algorithm, key: ByteBuffer): Unit = js.native
    def update(bytes: String): Unit = js.native
    def update(bytes: Buffer): Unit = js.native
    def update(bytes: ByteBuffer): Unit = js.native
  }
  
  def create(): HMAC = js.native
}

