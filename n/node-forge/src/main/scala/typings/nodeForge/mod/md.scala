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
    
    inline def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  object sha1 {
    
    @JSImport("node-forge", "md.sha1")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  object sha256 {
    
    @JSImport("node-forge", "md.sha256")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  object sha384 {
    
    @JSImport("node-forge", "md.sha384")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  object sha512 {
    
    @JSImport("node-forge", "md.sha512")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): MessageDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MessageDigest]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.nodeForgeStrings.md5
    - typings.nodeForge.nodeForgeStrings.sha1
    - typings.nodeForge.nodeForgeStrings.sha256
    - typings.nodeForge.nodeForgeStrings.sha384
    - typings.nodeForge.nodeForgeStrings.sha512
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def md5: typings.nodeForge.nodeForgeStrings.md5 = "md5".asInstanceOf[typings.nodeForge.nodeForgeStrings.md5]
    
    inline def sha1: typings.nodeForge.nodeForgeStrings.sha1 = "sha1".asInstanceOf[typings.nodeForge.nodeForgeStrings.sha1]
    
    inline def sha256: typings.nodeForge.nodeForgeStrings.sha256 = "sha256".asInstanceOf[typings.nodeForge.nodeForgeStrings.sha256]
    
    inline def sha384: typings.nodeForge.nodeForgeStrings.sha384 = "sha384".asInstanceOf[typings.nodeForge.nodeForgeStrings.sha384]
    
    inline def sha512: typings.nodeForge.nodeForgeStrings.sha512 = "sha512".asInstanceOf[typings.nodeForge.nodeForgeStrings.sha512]
  }
  
  @js.native
  trait MessageDigest extends StObject {
    
    def digest(): ByteStringBuffer = js.native
    
    def update(msg: String): MessageDigest = js.native
    def update(msg: String, encoding: Encoding): MessageDigest = js.native
  }
}
