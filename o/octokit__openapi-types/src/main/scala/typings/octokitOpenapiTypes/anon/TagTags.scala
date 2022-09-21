package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagTags extends StObject {
  
  var tag: js.UndefOr[js.Array[String]] = js.undefined
  
  var tags: Any
}
object TagTags {
  
  inline def apply(tags: Any): TagTags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagTags]
  }
  
  extension [Self <: TagTags](x: Self) {
    
    inline def setTag(value: js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
    
    inline def setTags(value: Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
