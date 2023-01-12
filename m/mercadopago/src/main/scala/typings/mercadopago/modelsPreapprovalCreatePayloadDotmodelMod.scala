package typings.mercadopago

import typings.mercadopago.mercadopagoStrings.days
import typings.mercadopago.mercadopagoStrings.months
import typings.mercadopago.sharedCurrencyMod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsPreapprovalCreatePayloadDotmodelMod {
  
  trait AutoRecurring extends StObject {
    
    /** Identificador de moeda local. */
    var currency_id: Currency
    
    /** Data (ISO_8601) de término da assinatura. */
    var end_date: js.UndefOr[String] = js.undefined
    
    /** Número de dias de recorrência. */
    var frequency: Double
    
    /** Tipo de recorrência (dias ou meses). */
    var frequency_type: days | months
    
    /** Data (ISO_8601) de início da assinatura. */
    var start_date: js.UndefOr[String] = js.undefined
    
    /** Valor da assinatura. */
    var transaction_amount: Double
  }
  object AutoRecurring {
    
    inline def apply(
      currency_id: Currency,
      frequency: Double,
      frequency_type: days | months,
      transaction_amount: Double
    ): AutoRecurring = {
      val __obj = js.Dynamic.literal(currency_id = currency_id.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], frequency_type = frequency_type.asInstanceOf[js.Any], transaction_amount = transaction_amount.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoRecurring]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoRecurring] (val x: Self) extends AnyVal {
      
      inline def setCurrency_id(value: Currency): Self = StObject.set(x, "currency_id", value.asInstanceOf[js.Any])
      
      inline def setEnd_date(value: String): Self = StObject.set(x, "end_date", value.asInstanceOf[js.Any])
      
      inline def setEnd_dateUndefined: Self = StObject.set(x, "end_date", js.undefined)
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequency_type(value: days | months): Self = StObject.set(x, "frequency_type", value.asInstanceOf[js.Any])
      
      inline def setStart_date(value: String): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
      
      inline def setStart_dateUndefined: Self = StObject.set(x, "start_date", js.undefined)
      
      inline def setTransaction_amount(value: Double): Self = StObject.set(x, "transaction_amount", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreatePreApprovalPayload extends StObject {
    
    var auto_recurring: js.UndefOr[AutoRecurring] = js.undefined
    
    /** Url de retorno. */
    var back_url: js.UndefOr[String] = js.undefined
    
    /** Identificador de fornecedor. */
    var collector_id: js.UndefOr[String] = js.undefined
    
    /** Valor de referência de assinatura. */
    var external_reference: js.UndefOr[String] = js.undefined
    
    /** Email do pagador. */
    var payer_email: js.UndefOr[String] = js.undefined
    
    /** Título da assinatura. */
    var reason: js.UndefOr[String] = js.undefined
    
    /** Status de assinatura. */
    var status: js.UndefOr[String] = js.undefined
  }
  object CreatePreApprovalPayload {
    
    inline def apply(): CreatePreApprovalPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePreApprovalPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreatePreApprovalPayload] (val x: Self) extends AnyVal {
      
      inline def setAuto_recurring(value: AutoRecurring): Self = StObject.set(x, "auto_recurring", value.asInstanceOf[js.Any])
      
      inline def setAuto_recurringUndefined: Self = StObject.set(x, "auto_recurring", js.undefined)
      
      inline def setBack_url(value: String): Self = StObject.set(x, "back_url", value.asInstanceOf[js.Any])
      
      inline def setBack_urlUndefined: Self = StObject.set(x, "back_url", js.undefined)
      
      inline def setCollector_id(value: String): Self = StObject.set(x, "collector_id", value.asInstanceOf[js.Any])
      
      inline def setCollector_idUndefined: Self = StObject.set(x, "collector_id", js.undefined)
      
      inline def setExternal_reference(value: String): Self = StObject.set(x, "external_reference", value.asInstanceOf[js.Any])
      
      inline def setExternal_referenceUndefined: Self = StObject.set(x, "external_reference", js.undefined)
      
      inline def setPayer_email(value: String): Self = StObject.set(x, "payer_email", value.asInstanceOf[js.Any])
      
      inline def setPayer_emailUndefined: Self = StObject.set(x, "payer_email", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
