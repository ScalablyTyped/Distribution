package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseBody extends StObject {
  
  var base: js.UndefOr[RefFromString] = js.undefined
  
  var body: js.UndefOr[FromString] = js.undefined
  
  var title: js.UndefOr[FromString] = js.undefined
}
object BaseBody {
  
  inline def apply(): BaseBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseBody] (val x: Self) extends AnyVal {
    
    inline def setBase(value: RefFromString): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setBody(value: FromString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setTitle(value: FromString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
