package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DueonTitle extends StObject {
  
  var description: js.UndefOr[FromString] = js.undefined
  
  var due_on: js.UndefOr[FromString] = js.undefined
  
  var title: js.UndefOr[FromString] = js.undefined
}
object DueonTitle {
  
  inline def apply(): DueonTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DueonTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DueonTitle] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: FromString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDue_on(value: FromString): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
    
    inline def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
    
    inline def setTitle(value: FromString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
