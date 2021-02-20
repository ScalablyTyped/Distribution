package typings.nodeForge.mod

import typings.node.Buffer
import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmac {
  
  @JSImport("node-forge", "hmac.create")
  @js.native
  def create(): HMAC = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.nodeForgeStrings.sha1
    - typings.nodeForge.nodeForgeStrings.md5
    - typings.nodeForge.nodeForgeStrings.sha256
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    @scala.inline
    def md5: typings.nodeForge.nodeForgeStrings.md5 = "md5".asInstanceOf[typings.nodeForge.nodeForgeStrings.md5]
    
    @scala.inline
    def sha1: typings.nodeForge.nodeForgeStrings.sha1 = "sha1".asInstanceOf[typings.nodeForge.nodeForgeStrings.sha1]
    
    @scala.inline
    def sha256: typings.nodeForge.nodeForgeStrings.sha256 = "sha256".asInstanceOf[typings.nodeForge.nodeForgeStrings.sha256]
  }
  
  @js.native
  trait HMAC extends StObject {
    
    def digest(): ByteBuffer = js.native
    
    def getMact(): ByteBuffer = js.native
    
    def start(md: Algorithm): Unit = js.native
    def start(md: Algorithm, key: String): Unit = js.native
    def start(md: Algorithm, key: ByteBuffer): Unit = js.native
    
    def update(bytes: String): Unit = js.native
    def update(bytes: Buffer): Unit = js.native
    def update(bytes: ByteBuffer): Unit = js.native
  }
}
