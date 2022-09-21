package typings.mercadopago

import typings.mercadopago.preferencesCreatePayloadModelMod.CreatePreferencePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preferencesUpdatePayloadModelMod {
  
  trait UpdatePreferencePayload
    extends StObject
       with CreatePreferencePayload {
    
    /** Preference id. */
    var id: String
  }
  object UpdatePreferencePayload {
    
    inline def apply(id: String): UpdatePreferencePayload = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatePreferencePayload]
    }
    
    extension [Self <: UpdatePreferencePayload](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
