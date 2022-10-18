package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanonicalBase extends StObject {
  
  var canonicalBase: js.UndefOr[String] = js.undefined
}
object CanonicalBase {
  
  inline def apply(): CanonicalBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanonicalBase]
  }
  
  extension [Self <: CanonicalBase](x: Self) {
    
    inline def setCanonicalBase(value: String): Self = StObject.set(x, "canonicalBase", value.asInstanceOf[js.Any])
    
    inline def setCanonicalBaseUndefined: Self = StObject.set(x, "canonicalBase", js.undefined)
  }
}
