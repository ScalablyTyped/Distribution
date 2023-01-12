package typings.nodeForge.anon

import typings.nodeForge.mod.md.sha1.MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create extends StObject {
  
  def create(): MessageDigest
}
object Create {
  
  inline def apply(create: () => MessageDigest): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[Create]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: () => MessageDigest): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
