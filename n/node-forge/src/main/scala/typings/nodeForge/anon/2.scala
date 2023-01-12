package typings.nodeForge.anon

import typings.nodeForge.mod.md.sha512.Sha512256MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def create(): Sha512256MessageDigest
}
object `2` {
  
  inline def apply(create: () => Sha512256MessageDigest): `2` = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: () => Sha512256MessageDigest): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
