package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `469` extends StObject {
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
}
object `469` {
  
  inline def apply(): `469` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`469`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `469`] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
  }
}
