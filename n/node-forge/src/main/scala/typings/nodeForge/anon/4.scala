package typings.nodeForge.anon

import typings.nodeForge.mod.md.md5.MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  def create(): MessageDigest
}
object `4` {
  
  inline def apply(create: () => MessageDigest): `4` = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setCreate(value: () => MessageDigest): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
