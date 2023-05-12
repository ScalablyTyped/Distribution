package typings.onfidoSdkUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nationalidtype extends StObject {
  
  var national_id_type: js.UndefOr[String] = js.undefined
  
  var national_id_value: js.UndefOr[String] = js.undefined
}
object Nationalidtype {
  
  inline def apply(): Nationalidtype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nationalidtype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nationalidtype] (val x: Self) extends AnyVal {
    
    inline def setNational_id_type(value: String): Self = StObject.set(x, "national_id_type", value.asInstanceOf[js.Any])
    
    inline def setNational_id_typeUndefined: Self = StObject.set(x, "national_id_type", js.undefined)
    
    inline def setNational_id_value(value: String): Self = StObject.set(x, "national_id_value", value.asInstanceOf[js.Any])
    
    inline def setNational_id_valueUndefined: Self = StObject.set(x, "national_id_value", js.undefined)
  }
}
