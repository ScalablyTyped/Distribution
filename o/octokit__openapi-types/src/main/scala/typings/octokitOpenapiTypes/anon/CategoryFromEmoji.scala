package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryFromEmoji extends StObject {
  
  var category: FromEmoji
}
object CategoryFromEmoji {
  
  inline def apply(category: FromEmoji): CategoryFromEmoji = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryFromEmoji]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryFromEmoji] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: FromEmoji): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
