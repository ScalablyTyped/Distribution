package typings.nodeForge.mod

import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmac {
  
  @JSImport("node-forge", "hmac")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): HMAC = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[HMAC]
  
  type Algorithm = typings.nodeForge.mod.md.Algorithm
  
  @js.native
  trait HMAC extends StObject {
    
    def digest(): ByteBuffer = js.native
    
    def getMac(): ByteBuffer = js.native
    
    def start(md: Algorithm): Unit = js.native
    def start(md: Algorithm, key: String): Unit = js.native
    def start(md: Algorithm, key: ByteBuffer): Unit = js.native
    def start(md: MessageDigest): Unit = js.native
    def start(md: MessageDigest, key: String): Unit = js.native
    def start(md: MessageDigest, key: ByteBuffer): Unit = js.native
    
    def update(bytes: String): Unit = js.native
  }
}
