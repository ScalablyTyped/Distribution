package typings.nodeForge.mod

import typings.nodeForge.mod.util.ByteStringBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object md {
  
  object md5 {
    
    @JSImport("node-forge", "md.md5")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  object sha1 {
    
    @JSImport("node-forge", "md.sha1")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  object sha256 {
    
    @JSImport("node-forge", "md.sha256")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  object sha384 {
    
    @JSImport("node-forge", "md.sha384")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  object sha512 {
    
    @JSImport("node-forge", "md.sha512")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  @js.native
  trait MessageDigest extends StObject {
    
    def digest(): ByteStringBuffer = js.native
    
    def update(msg: String): MessageDigest = js.native
    def update(msg: String, encoding: Encoding): MessageDigest = js.native
  }
}
