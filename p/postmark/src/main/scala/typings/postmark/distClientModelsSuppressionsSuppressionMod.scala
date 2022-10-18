package typings.postmark

import typings.postmark.anon.EmailAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsSuppressionsSuppressionMod {
  
  type CreateSuppressionsRequest = SuppressionEntries
  
  type DeleteSuppressionsRequest = CreateSuppressionsRequest
  
  trait Suppression extends StObject {
    
    var CreatedAt: String
    
    var EmailAddress: String
    
    var Origin: String
    
    var SuppressionReason: String
  }
  object Suppression {
    
    inline def apply(CreatedAt: String, EmailAddress: String, Origin: String, SuppressionReason: String): Suppression = {
      val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], SuppressionReason = SuppressionReason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suppression]
    }
    
    extension [Self <: Suppression](x: Self) {
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
      
      inline def setSuppressionReason(value: String): Self = StObject.set(x, "SuppressionReason", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuppressionEntries extends StObject {
    
    var Suppressions: js.Array[EmailAddress]
  }
  object SuppressionEntries {
    
    inline def apply(Suppressions: js.Array[EmailAddress]): SuppressionEntries = {
      val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressionEntries]
    }
    
    extension [Self <: SuppressionEntries](x: Self) {
      
      inline def setSuppressions(value: js.Array[EmailAddress]): Self = StObject.set(x, "Suppressions", value.asInstanceOf[js.Any])
      
      inline def setSuppressionsVarargs(value: EmailAddress*): Self = StObject.set(x, "Suppressions", js.Array(value*))
    }
  }
  
  trait SuppressionStatus extends StObject {
    
    var EmailAddress: String
    
    var Message: String
    
    var Status: String
  }
  object SuppressionStatus {
    
    inline def apply(EmailAddress: String, Message: String, Status: String): SuppressionStatus = {
      val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressionStatus]
    }
    
    extension [Self <: SuppressionStatus](x: Self) {
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuppressionStatuses extends StObject {
    
    var Suppressions: js.Array[SuppressionStatus]
  }
  object SuppressionStatuses {
    
    inline def apply(Suppressions: js.Array[SuppressionStatus]): SuppressionStatuses = {
      val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuppressionStatuses]
    }
    
    extension [Self <: SuppressionStatuses](x: Self) {
      
      inline def setSuppressions(value: js.Array[SuppressionStatus]): Self = StObject.set(x, "Suppressions", value.asInstanceOf[js.Any])
      
      inline def setSuppressionsVarargs(value: SuppressionStatus*): Self = StObject.set(x, "Suppressions", js.Array(value*))
    }
  }
  
  trait Suppressions extends StObject {
    
    var Suppressions: js.Array[Suppression]
  }
  object Suppressions {
    
    inline def apply(Suppressions: js.Array[Suppression]): Suppressions = {
      val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suppressions]
    }
    
    extension [Self <: Suppressions](x: Self) {
      
      inline def setSuppressions(value: js.Array[Suppression]): Self = StObject.set(x, "Suppressions", value.asInstanceOf[js.Any])
      
      inline def setSuppressionsVarargs(value: Suppression*): Self = StObject.set(x, "Suppressions", js.Array(value*))
    }
  }
}
