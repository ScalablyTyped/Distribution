package typings.mercadopago

import typings.mercadopago.modelsDefaultConfigurationDotmodelMod.SearchConfiguration
import typings.mercadopago.sharedPayerIdentificationMod.Identification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsCustomersSearchConfigurationDotmodelMod {
  
  trait CustomerQs extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var first_name: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var identification: js.UndefOr[Identification] = js.undefined
    
    var last_name: js.UndefOr[String] = js.undefined
  }
  object CustomerQs {
    
    inline def apply(): CustomerQs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerQs]
    }
    
    extension [Self <: CustomerQs](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIdentification(value: Identification): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
      
      inline def setIdentificationUndefined: Self = StObject.set(x, "identification", js.undefined)
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    }
  }
  
  type CustomerSearchConfiguration = SearchConfiguration[CustomerQs]
}
