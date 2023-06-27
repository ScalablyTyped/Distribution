package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `480` extends StObject {
  
  var query: js.UndefOr[DirectionPagePerpage] = js.undefined
}
object `480` {
  
  inline def apply(): `480` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`480`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `480`] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: DirectionPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
