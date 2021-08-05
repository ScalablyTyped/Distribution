package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canonical extends StObject {
  
  var canonical: js.UndefOr[Boolean] = js.undefined
  
  var indent: js.UndefOr[Boolean | Double | String] = js.undefined
}
object Canonical {
  
  inline def apply(): Canonical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Canonical]
  }
  
  extension [Self <: Canonical](x: Self) {
    
    inline def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
    
    inline def setIndent(value: Boolean | Double | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
  }
}
