package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outboundMessageOpenMod {
  
  @js.native
  trait ClientDetails extends StObject {
    
    var Company: String = js.native
    
    var Family: String = js.native
    
    var Name: String = js.native
  }
  object ClientDetails {
    
    @scala.inline
    def apply(Company: String, Family: String, Name: String): ClientDetails = {
      val __obj = js.Dynamic.literal(Company = Company.asInstanceOf[js.Any], Family = Family.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientDetails]
    }
    
    @scala.inline
    implicit class ClientDetailsMutableBuilder[Self <: ClientDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeoLocation extends StObject {
    
    var City: js.UndefOr[String] = js.native
    
    var Coords: js.UndefOr[String] = js.native
    
    var Country: js.UndefOr[String] = js.native
    
    var CountryISOCode: js.UndefOr[String] = js.native
    
    var IP: js.UndefOr[String] = js.native
    
    var Region: js.UndefOr[String] = js.native
    
    var RegionISOCode: js.UndefOr[String] = js.native
    
    var Zip: js.UndefOr[String] = js.native
  }
  object GeoLocation {
    
    @scala.inline
    def apply(): GeoLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoLocation]
    }
    
    @scala.inline
    implicit class GeoLocationMutableBuilder[Self <: GeoLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
      
      @scala.inline
      def setCoords(value: String): Self = StObject.set(x, "Coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "Coords", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryISOCode(value: String): Self = StObject.set(x, "CountryISOCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryISOCodeUndefined: Self = StObject.set(x, "CountryISOCode", js.undefined)
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      @scala.inline
      def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPUndefined: Self = StObject.set(x, "IP", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionISOCode(value: String): Self = StObject.set(x, "RegionISOCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionISOCodeUndefined: Self = StObject.set(x, "RegionISOCode", js.undefined)
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
      
      @scala.inline
      def setZip(value: String): Self = StObject.set(x, "Zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipUndefined: Self = StObject.set(x, "Zip", js.undefined)
    }
  }
  
  @js.native
  trait OpenEvent extends StObject {
    
    var Client: ClientDetails = js.native
    
    var Geo: GeoLocation = js.native
    
    var MessageID: String = js.native
    
    var MessageStream: String = js.native
    
    var OS: ClientDetails = js.native
    
    var Platform: String = js.native
    
    var ReadSeconds: Double = js.native
    
    var ReceivedAt: String = js.native
    
    var Recipient: String = js.native
    
    var RecordType: String = js.native
    
    var Tag: String = js.native
    
    var UserAgent: String = js.native
  }
  object OpenEvent {
    
    @scala.inline
    def apply(
      Client: ClientDetails,
      Geo: GeoLocation,
      MessageID: String,
      MessageStream: String,
      OS: ClientDetails,
      Platform: String,
      ReadSeconds: Double,
      ReceivedAt: String,
      Recipient: String,
      RecordType: String,
      Tag: String,
      UserAgent: String
    ): OpenEvent = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Geo = Geo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], ReadSeconds = ReadSeconds.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenEvent]
    }
    
    @scala.inline
    implicit class OpenEventMutableBuilder[Self <: OpenEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: ClientDetails): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeo(value: GeoLocation): Self = StObject.set(x, "Geo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOS(value: ClientDetails): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadSeconds(value: Double): Self = StObject.set(x, "ReadSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceivedAt(value: String): Self = StObject.set(x, "ReceivedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipient(value: String): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordType(value: String): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OutboundMessageOpens extends StObject {
    
    var Opens: js.Array[OpenEvent] = js.native
    
    var TotalCount: Double = js.native
  }
  object OutboundMessageOpens {
    
    @scala.inline
    def apply(Opens: js.Array[OpenEvent], TotalCount: Double): OutboundMessageOpens = {
      val __obj = js.Dynamic.literal(Opens = Opens.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundMessageOpens]
    }
    
    @scala.inline
    implicit class OutboundMessageOpensMutableBuilder[Self <: OutboundMessageOpens] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpens(value: js.Array[OpenEvent]): Self = StObject.set(x, "Opens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpensVarargs(value: OpenEvent*): Self = StObject.set(x, "Opens", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
