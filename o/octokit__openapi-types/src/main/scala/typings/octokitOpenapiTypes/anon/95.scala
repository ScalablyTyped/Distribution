package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.repositories
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  /** @description Exclude attributes from the API response to improve performance */
  var exclude: js.UndefOr[js.Array[repositories]] = js.undefined
}
object `95` {
  
  inline def apply(): `95` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`95`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `95`] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[repositories]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: repositories*): Self = StObject.set(x, "exclude", js.Array(value*))
  }
}
