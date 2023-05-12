package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericDocumentType extends StObject {
  
  var country: String
  
  var id: String
  
  var pages: Double
  
  var subTitle: String
  
  var title: String
}
object GenericDocumentType {
  
  inline def apply(country: String, id: String, pages: Double, subTitle: String, title: String): GenericDocumentType = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericDocumentType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericDocumentType] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
