package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `372` extends StObject {
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
}
object `372` {
  
  inline def apply(): `372` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`372`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `372`] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
  }
}
