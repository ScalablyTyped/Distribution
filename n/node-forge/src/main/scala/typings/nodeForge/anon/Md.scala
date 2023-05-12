package typings.nodeForge.anon

import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Md
  extends StObject
     with ToNativeBufferParameters {
  
  var md: MessageDigest
}
object Md {
  
  inline def apply(md: MessageDigest): Md = {
    val __obj = js.Dynamic.literal(md = md.asInstanceOf[js.Any])
    __obj.asInstanceOf[Md]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Md] (val x: Self) extends AnyVal {
    
    inline def setMd(value: MessageDigest): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
  }
}
