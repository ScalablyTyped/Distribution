package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `498` extends StObject {
  
  var tag: js.UndefOr[js.Array[String]] = js.undefined
}
object `498` {
  
  inline def apply(): `498` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`498`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `498`] (val x: Self) extends AnyVal {
    
    inline def setTag(value: js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
  }
}
