package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionPublic extends StObject {
  
  var description: js.UndefOr[FromTo] = js.undefined
  
  var public: js.UndefOr[`536`] = js.undefined
  
  var short_description: js.UndefOr[FromTo] = js.undefined
  
  var title: js.UndefOr[`537`] = js.undefined
}
object DescriptionPublic {
  
  inline def apply(): DescriptionPublic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionPublic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionPublic] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: FromTo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPublic(value: `536`): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setShort_description(value: FromTo): Self = StObject.set(x, "short_description", value.asInstanceOf[js.Any])
    
    inline def setShort_descriptionUndefined: Self = StObject.set(x, "short_description", js.undefined)
    
    inline def setTitle(value: `537`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
