package typings.nodeForge.anon

import typings.nodeForge.mod.md.sha512.Sha384MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  def create(): Sha384MessageDigest
}
object `3` {
  
  inline def apply(create: () => Sha384MessageDigest): `3` = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setCreate(value: () => Sha384MessageDigest): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
