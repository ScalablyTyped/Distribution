package typings.nodeForge.anon

import typings.nodeForge.mod.md.sha256.MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def create(): MessageDigest
}
object `0` {
  
  inline def apply(create: () => MessageDigest): `0` = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setCreate(value: () => MessageDigest): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
