package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationItemBody extends StObject {
  
  var content: js.UndefOr[NullableOption[String]] = js.undefined
  
  var contentType: js.UndefOr[NullableOption[BodyType]] = js.undefined
}
object EducationItemBody {
  
  inline def apply(): EducationItemBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationItemBody]
  }
  
  extension [Self <: EducationItemBody](x: Self) {
    
    inline def setContent(value: NullableOption[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentType(value: NullableOption[BodyType]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
