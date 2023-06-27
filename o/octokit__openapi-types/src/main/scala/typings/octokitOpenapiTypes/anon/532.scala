package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `532` extends StObject {
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object `532` {
  
  inline def apply(): `532` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`532`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `532`] (val x: Self) extends AnyVal {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
