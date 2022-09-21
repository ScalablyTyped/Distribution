package typings.openrct2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CompanyValue extends StObject {
    
    var companyValue: Double
    
    var name: String
  }
  object CompanyValue {
    
    inline def apply(companyValue: Double, name: String): CompanyValue = {
      val __obj = js.Dynamic.literal(companyValue = companyValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompanyValue]
    }
    
    extension [Self <: CompanyValue](x: Self) {
      
      inline def setCompanyValue(value: Double): Self = StObject.set(x, "companyValue", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
