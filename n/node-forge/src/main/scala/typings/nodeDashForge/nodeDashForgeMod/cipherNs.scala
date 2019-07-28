package typings.nodeDashForge.nodeDashForgeMod

import typings.nodeDashForge.nodeDashForgeMod.cipherNs.Algorithm
import typings.nodeDashForge.nodeDashForgeMod.cipherNs.BlockCipher
import typings.nodeDashForge.nodeDashForgeMod.cipherNs.Mode
import typings.nodeDashForge.nodeDashForgeMod.cipherNs.StartOptions
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteBuffer
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "cipher")
@js.native
object cipherNs extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashForge.nodeDashForgeStrings.`AES-ECB`
    - typings.nodeDashForge.nodeDashForgeStrings.`AES-CBC`
    - typings.nodeDashForge.nodeDashForgeStrings.`AES-CFB`
    - typings.nodeDashForge.nodeDashForgeStrings.`AES-OFB`
    - typings.nodeDashForge.nodeDashForgeStrings.`AES-CTR`
    - typings.nodeDashForge.nodeDashForgeStrings.`AES-GCM`
    - typings.nodeDashForge.nodeDashForgeStrings.`3DES-ECB`
    - typings.nodeDashForge.nodeDashForgeStrings.`3DES-CBC`
    - typings.nodeDashForge.nodeDashForgeStrings.`DES-ECB`
    - typings.nodeDashForge.nodeDashForgeStrings.`DES-CBC`
  */
  trait Algorithm extends js.Object
  
  @js.native
  trait BlockCipher extends js.Object {
    var mode: Mode = js.native
    var output: ByteStringBuffer = js.native
    def finish(): Boolean = js.native
    def start(): Unit = js.native
    def start(options: StartOptions): Unit = js.native
    def update(payload: ByteBuffer): Unit = js.native
  }
  
  trait Mode extends js.Object {
    var tag: ByteStringBuffer
  }
  
  trait StartOptions extends js.Object {
    var additionalData: js.UndefOr[String] = js.undefined
    var iv: js.UndefOr[ByteBuffer | js.Array[Byte] | Bytes] = js.undefined
    var tag: js.UndefOr[ByteStringBuffer] = js.undefined
    var tagLength: js.UndefOr[Double] = js.undefined
  }
  
  def createCipher(algorithm: Algorithm, payload: Bytes): BlockCipher = js.native
  def createCipher(algorithm: Algorithm, payload: ByteBuffer): BlockCipher = js.native
  def createDecipher(algorithm: Algorithm, payload: Bytes): BlockCipher = js.native
  def createDecipher(algorithm: Algorithm, payload: ByteBuffer): BlockCipher = js.native
}

