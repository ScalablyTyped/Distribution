package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bounceMod {
  
  @js.native
  trait Bounce extends StObject {
    
    var BouncedAt: String = js.native
    
    var CanActivate: Boolean = js.native
    
    var Content: js.UndefOr[String] = js.native
    
    var Description: String = js.native
    
    var Details: String = js.native
    
    var DumpAvailable: Boolean = js.native
    
    var Email: String = js.native
    
    var From: String = js.native
    
    var ID: Double = js.native
    
    var Inactive: Boolean = js.native
    
    var MessageID: String = js.native
    
    var MessageStream: String = js.native
    
    var Name: String = js.native
    
    var RecordType: String = js.native
    
    var ServerID: String = js.native
    
    var Subject: String = js.native
    
    var Tag: js.UndefOr[String] = js.native
    
    var Type: String = js.native
    
    var TypeCode: Double = js.native
  }
  object Bounce {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BounceMutableBuilder[Self <: Bounce] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBouncedAt(value: String): Self = StObject.set(x, "BouncedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanActivate(value: Boolean): Self = StObject.set(x, "CanActivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpAvailable(value: Boolean): Self = StObject.set(x, "DumpAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactive(value: Boolean): Self = StObject.set(x, "Inactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordType(value: String): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerID(value: String): Self = StObject.set(x, "ServerID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeCode(value: Double): Self = StObject.set(x, "TypeCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BounceActivationResponse extends StObject {
    
    var Bounce: typings.postmark.bounceMod.Bounce = js.native
    
    var Message: String = js.native
  }
  object BounceActivationResponse {
    
    @scala.inline
    def apply(Bounce: Bounce, Message: String): BounceActivationResponse = {
      val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceActivationResponse]
    }
    
    @scala.inline
    implicit class BounceActivationResponseMutableBuilder[Self <: BounceActivationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounce(value: Bounce): Self = StObject.set(x, "Bounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BounceDump extends StObject {
    
    var Body: String = js.native
  }
  object BounceDump {
    
    @scala.inline
    def apply(Body: String): BounceDump = {
      val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceDump]
    }
    
    @scala.inline
    implicit class BounceDumpMutableBuilder[Self <: BounceDump] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BounceMetric extends StObject {
    
    var Count: Double = js.native
    
    var Name: String = js.native
    
    var Type: js.UndefOr[String] = js.native
  }
  object BounceMetric {
    
    @scala.inline
    def apply(Count: Double, Name: String): BounceMetric = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceMetric]
    }
    
    @scala.inline
    implicit class BounceMetricMutableBuilder[Self <: BounceMetric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  @js.native
  trait Bounces extends StObject {
    
    var Bounces: js.Array[Bounce] = js.native
    
    var TotalCount: Double = js.native
  }
  object Bounces {
    
    @scala.inline
    def apply(Bounces: js.Array[Bounce], TotalCount: Double): Bounces = {
      val __obj = js.Dynamic.literal(Bounces = Bounces.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounces]
    }
    
    @scala.inline
    implicit class BouncesMutableBuilder[Self <: Bounces] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounces(value: js.Array[Bounce]): Self = StObject.set(x, "Bounces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBouncesVarargs(value: Bounce*): Self = StObject.set(x, "Bounces", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeliveryStatistics extends StObject {
    
    var Bounces: js.Array[BounceMetric] = js.native
    
    var InactiveMails: Double = js.native
  }
  object DeliveryStatistics {
    
    @scala.inline
    def apply(Bounces: js.Array[BounceMetric], InactiveMails: Double): DeliveryStatistics = {
      val __obj = js.Dynamic.literal(Bounces = Bounces.asInstanceOf[js.Any], InactiveMails = InactiveMails.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryStatistics]
    }
    
    @scala.inline
    implicit class DeliveryStatisticsMutableBuilder[Self <: DeliveryStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounces(value: js.Array[BounceMetric]): Self = StObject.set(x, "Bounces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBouncesVarargs(value: BounceMetric*): Self = StObject.set(x, "Bounces", js.Array(value :_*))
      
      @scala.inline
      def setInactiveMails(value: Double): Self = StObject.set(x, "InactiveMails", value.asInstanceOf[js.Any])
    }
  }
}
