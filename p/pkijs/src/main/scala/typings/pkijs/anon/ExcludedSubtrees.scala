package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedSubtrees extends StObject {
  
  var excludedSubtrees: js.UndefOr[String] = js.undefined
  
  var permittedSubtrees: js.UndefOr[String] = js.undefined
}
object ExcludedSubtrees {
  
  inline def apply(): ExcludedSubtrees = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludedSubtrees]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedSubtrees] (val x: Self) extends AnyVal {
    
    inline def setExcludedSubtrees(value: String): Self = StObject.set(x, "excludedSubtrees", value.asInstanceOf[js.Any])
    
    inline def setExcludedSubtreesUndefined: Self = StObject.set(x, "excludedSubtrees", js.undefined)
    
    inline def setPermittedSubtrees(value: String): Self = StObject.set(x, "permittedSubtrees", value.asInstanceOf[js.Any])
    
    inline def setPermittedSubtreesUndefined: Self = StObject.set(x, "permittedSubtrees", js.undefined)
  }
}
