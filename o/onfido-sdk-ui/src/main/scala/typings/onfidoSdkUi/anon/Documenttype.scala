package typings.onfidoSdkUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Documenttype extends StObject {
  
  var country: String
  
  var document_type: String
}
object Documenttype {
  
  inline def apply(country: String, document_type: String): Documenttype = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], document_type = document_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documenttype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Documenttype] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setDocument_type(value: String): Self = StObject.set(x, "document_type", value.asInstanceOf[js.Any])
  }
}
