package typings.nodeForge.mod

import typings.nodeForge.mod.util.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "md")
@js.native
object md extends js.Object {
  
  @js.native
  trait MessageDigest extends js.Object {
    
    def digest(): ByteStringBuffer = js.native
    
    def update(msg: String): MessageDigest = js.native
    def update(msg: String, encoding: Encoding): MessageDigest = js.native
  }
  
  @js.native
  object md5 extends js.Object {
    
    def create(): MessageDigest = js.native
  }
  
  @js.native
  object sha1 extends js.Object {
    
    def create(): MessageDigest = js.native
  }
  
  @js.native
  object sha256 extends js.Object {
    
    def create(): MessageDigest = js.native
  }
  
  @js.native
  object sha384 extends js.Object {
    
    def create(): MessageDigest = js.native
  }
  
  @js.native
  object sha512 extends js.Object {
    
    def create(): MessageDigest = js.native
  }
}
