package typings.mercadopago

import typings.mercadopago.mercadopagoStrings.INC
import typings.mercadopago.mercadopagoStrings.IVA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Amount extends StObject {
    
    var amount: Double
    
    var payment_id: Double
  }
  object Amount {
    
    inline def apply(amount: Double, payment_id: Double): Amount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], payment_id = payment_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amount]
    }
    
    extension [Self <: Amount](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setPayment_id(value: Double): Self = StObject.set(x, "payment_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    /** Identificador do método de envio. */
    var id: Double
  }
  object Id {
    
    inline def apply(id: Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdString extends StObject {
    
    /** Identificador de data_type do meio de pagamento. */
    var id: String
  }
  object IdString {
    
    inline def apply(id: String): IdString = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdString]
    }
    
    extension [Self <: IdString](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<mercadopago.mercadopago/shared/phone.Phone, 'extension'> */
  trait OmitPhoneextension extends StObject {
    
    var area_code: String
    
    var number: String
  }
  object OmitPhoneextension {
    
    inline def apply(area_code: String, number: String): OmitPhoneextension = {
      val __obj = js.Dynamic.literal(area_code = area_code.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitPhoneextension]
    }
    
    extension [Self <: OmitPhoneextension](x: Self) {
      
      inline def setArea_code(value: String): Self = StObject.set(x, "area_code", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    /** Identificador de imposto */
    var `type`: IVA | INC
    
    /** Valor do imposto. É suportado no máximo duas casas decimais. Para itens isentos de imposto, zero deve ser relatado. */
    var value: Double
  }
  object Type {
    
    inline def apply(`type`: IVA | INC, value: Double): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: IVA | INC): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
