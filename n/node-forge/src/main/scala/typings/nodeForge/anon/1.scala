package typings.nodeForge.anon

import typings.nodeForge.mod.md.sha512.Sha512224MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def create(): Sha512224MessageDigest
}
object `1` {
  
  inline def apply(create: () => Sha512224MessageDigest): `1` = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: () => Sha512224MessageDigest): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
