package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameConstraintsJson extends StObject {
  
  var excludedSubtrees: js.UndefOr[js.Array[GeneralSubtreeJson]] = js.undefined
  
  var permittedSubtrees: js.UndefOr[js.Array[GeneralSubtreeJson]] = js.undefined
}
object NameConstraintsJson {
  
  inline def apply(): NameConstraintsJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameConstraintsJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameConstraintsJson] (val x: Self) extends AnyVal {
    
    inline def setExcludedSubtrees(value: js.Array[GeneralSubtreeJson]): Self = StObject.set(x, "excludedSubtrees", value.asInstanceOf[js.Any])
    
    inline def setExcludedSubtreesUndefined: Self = StObject.set(x, "excludedSubtrees", js.undefined)
    
    inline def setExcludedSubtreesVarargs(value: GeneralSubtreeJson*): Self = StObject.set(x, "excludedSubtrees", js.Array(value*))
    
    inline def setPermittedSubtrees(value: js.Array[GeneralSubtreeJson]): Self = StObject.set(x, "permittedSubtrees", value.asInstanceOf[js.Any])
    
    inline def setPermittedSubtreesUndefined: Self = StObject.set(x, "permittedSubtrees", js.undefined)
    
    inline def setPermittedSubtreesVarargs(value: GeneralSubtreeJson*): Self = StObject.set(x, "permittedSubtrees", js.Array(value*))
  }
}
