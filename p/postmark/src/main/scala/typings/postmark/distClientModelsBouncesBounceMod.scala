package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsBouncesBounceMod {
  
  trait Bounce extends StObject {
    
    var BouncedAt: String
    
    var CanActivate: Boolean
    
    var Content: js.UndefOr[String] = js.undefined
    
    var Description: String
    
    var Details: String
    
    var DumpAvailable: Boolean
    
    var Email: String
    
    var From: String
    
    var ID: Double
    
    var Inactive: Boolean
    
    var MessageID: String
    
    var MessageStream: String
    
    var Name: String
    
    var RecordType: String
    
    var ServerID: String
    
    var Subject: String
    
    var Tag: js.UndefOr[String] = js.undefined
    
    var Type: String
    
    var TypeCode: Double
  }
  object Bounce {
    
    inline def apply(
      BouncedAt: String,
      CanActivate: Boolean,
      Description: String,
      Details: String,
      DumpAvailable: Boolean,
      Email: String,
      From: String,
      ID: Double,
      Inactive: Boolean,
      MessageID: String,
      MessageStream: String,
      Name: String,
      RecordType: String,
      ServerID: String,
      Subject: String,
      Type: String,
      TypeCode: Double
    ): Bounce = {
      val __obj = js.Dynamic.literal(BouncedAt = BouncedAt.asInstanceOf[js.Any], CanActivate = CanActivate.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], DumpAvailable = DumpAvailable.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Inactive = Inactive.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeCode = TypeCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounce]
    }
    
    extension [Self <: Bounce](x: Self) {
      
      inline def setBouncedAt(value: String): Self = StObject.set(x, "BouncedAt", value.asInstanceOf[js.Any])
      
      inline def setCanActivate(value: Boolean): Self = StObject.set(x, "CanActivate", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: String): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      inline def setDumpAvailable(value: Boolean): Self = StObject.set(x, "DumpAvailable", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
      
      inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setInactive(value: Boolean): Self = StObject.set(x, "Inactive", value.asInstanceOf[js.Any])
      
      inline def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      inline def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setRecordType(value: String): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
      
      inline def setServerID(value: String): Self = StObject.set(x, "ServerID", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeCode(value: Double): Self = StObject.set(x, "TypeCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait BounceActivationResponse extends StObject {
    
    var Bounce: typings.postmark.distClientModelsBouncesBounceMod.Bounce
    
    var Message: String
  }
  object BounceActivationResponse {
    
    inline def apply(Bounce: Bounce, Message: String): BounceActivationResponse = {
      val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceActivationResponse]
    }
    
    extension [Self <: BounceActivationResponse](x: Self) {
      
      inline def setBounce(value: Bounce): Self = StObject.set(x, "Bounce", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
  
  trait BounceDump extends StObject {
    
    var Body: String
  }
  object BounceDump {
    
    inline def apply(Body: String): BounceDump = {
      val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceDump]
    }
    
    extension [Self <: BounceDump](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    }
  }
  
  trait BounceMetric extends StObject {
    
    var Count: Double
    
    var Name: String
    
    var Type: js.UndefOr[String] = js.undefined
  }
  object BounceMetric {
    
    inline def apply(Count: Double, Name: String): BounceMetric = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceMetric]
    }
    
    extension [Self <: BounceMetric](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  trait Bounces extends StObject {
    
    var Bounces: js.Array[Bounce]
    
    var TotalCount: Double
  }
  object Bounces {
    
    inline def apply(Bounces: js.Array[Bounce], TotalCount: Double): Bounces = {
      val __obj = js.Dynamic.literal(Bounces = Bounces.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounces]
    }
    
    extension [Self <: Bounces](x: Self) {
      
      inline def setBounces(value: js.Array[Bounce]): Self = StObject.set(x, "Bounces", value.asInstanceOf[js.Any])
      
      inline def setBouncesVarargs(value: Bounce*): Self = StObject.set(x, "Bounces", js.Array(value*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeliveryStatistics extends StObject {
    
    var Bounces: js.Array[BounceMetric]
    
    var InactiveMails: Double
  }
  object DeliveryStatistics {
    
    inline def apply(Bounces: js.Array[BounceMetric], InactiveMails: Double): DeliveryStatistics = {
      val __obj = js.Dynamic.literal(Bounces = Bounces.asInstanceOf[js.Any], InactiveMails = InactiveMails.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryStatistics]
    }
    
    extension [Self <: DeliveryStatistics](x: Self) {
      
      inline def setBounces(value: js.Array[BounceMetric]): Self = StObject.set(x, "Bounces", value.asInstanceOf[js.Any])
      
      inline def setBouncesVarargs(value: BounceMetric*): Self = StObject.set(x, "Bounces", js.Array(value*))
      
      inline def setInactiveMails(value: Double): Self = StObject.set(x, "InactiveMails", value.asInstanceOf[js.Any])
    }
  }
}
