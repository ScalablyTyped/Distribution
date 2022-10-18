package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  var tag: js.UndefOr[js.Array[String]] = js.undefined
  
  var tags: Any
}
object Tag {
  
  inline def apply(tags: Any): Tag = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setTag(value: js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
    
    inline def setTags(value: Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
