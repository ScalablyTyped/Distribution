package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyTitle extends StObject {
  
  var body: js.UndefOr[FromString] = js.undefined
  
  var title: js.UndefOr[FromString] = js.undefined
}
object BodyTitle {
  
  inline def apply(): BodyTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyTitle] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FromString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setTitle(value: FromString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
