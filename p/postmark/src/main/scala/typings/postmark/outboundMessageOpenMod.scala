package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outboundMessageOpenMod {
  
  trait ClientDetails extends StObject {
    
    var Company: String
    
    var Family: String
    
    var Name: String
  }
  object ClientDetails {
    
    inline def apply(Company: String, Family: String, Name: String): ClientDetails = {
      val __obj = js.Dynamic.literal(Company = Company.asInstanceOf[js.Any], Family = Family.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientDetails]
    }
    
    extension [Self <: ClientDetails](x: Self) {
      
      inline def setCompany(value: String): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: String): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeoLocation extends StObject {
    
    var City: js.UndefOr[String] = js.undefined
    
    var Coords: js.UndefOr[String] = js.undefined
    
    var Country: js.UndefOr[String] = js.undefined
    
    var CountryISOCode: js.UndefOr[String] = js.undefined
    
    var IP: js.UndefOr[String] = js.undefined
    
    var Region: js.UndefOr[String] = js.undefined
    
    var RegionISOCode: js.UndefOr[String] = js.undefined
    
    var Zip: js.UndefOr[String] = js.undefined
  }
  object GeoLocation {
    
    inline def apply(): GeoLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoLocation]
    }
    
    extension [Self <: GeoLocation](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
      
      inline def setCoords(value: String): Self = StObject.set(x, "Coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "Coords", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      inline def setCountryISOCode(value: String): Self = StObject.set(x, "CountryISOCode", value.asInstanceOf[js.Any])
      
      inline def setCountryISOCodeUndefined: Self = StObject.set(x, "CountryISOCode", js.undefined)
      
      inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
      
      inline def setIPUndefined: Self = StObject.set(x, "IP", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
      
      inline def setRegionISOCode(value: String): Self = StObject.set(x, "RegionISOCode", value.asInstanceOf[js.Any])
      
      inline def setRegionISOCodeUndefined: Self = StObject.set(x, "RegionISOCode", js.undefined)
      
      inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "Zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "Zip", js.undefined)
    }
  }
  
  trait OpenEvent extends StObject {
    
    var Client: ClientDetails
    
    var Geo: GeoLocation
    
    var MessageID: String
    
    var MessageStream: String
    
    var OS: ClientDetails
    
    var Platform: String
    
    var ReadSeconds: Double
    
    var ReceivedAt: String
    
    var Recipient: String
    
    var RecordType: String
    
    var Tag: String
    
    var UserAgent: String
  }
  object OpenEvent {
    
    inline def apply(
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
    
    extension [Self <: OpenEvent](x: Self) {
      
      inline def setClient(value: ClientDetails): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      inline def setGeo(value: GeoLocation): Self = StObject.set(x, "Geo", value.asInstanceOf[js.Any])
      
      inline def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
      
      inline def setMessageStream(value: String): Self = StObject.set(x, "MessageStream", value.asInstanceOf[js.Any])
      
      inline def setOS(value: ClientDetails): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      inline def setReadSeconds(value: Double): Self = StObject.set(x, "ReadSeconds", value.asInstanceOf[js.Any])
      
      inline def setReceivedAt(value: String): Self = StObject.set(x, "ReceivedAt", value.asInstanceOf[js.Any])
      
      inline def setRecipient(value: String): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
      
      inline def setRecordType(value: String): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutboundMessageOpens extends StObject {
    
    var Opens: js.Array[OpenEvent]
    
    var TotalCount: Double
  }
  object OutboundMessageOpens {
    
    inline def apply(Opens: js.Array[OpenEvent], TotalCount: Double): OutboundMessageOpens = {
      val __obj = js.Dynamic.literal(Opens = Opens.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutboundMessageOpens]
    }
    
    extension [Self <: OutboundMessageOpens](x: Self) {
      
      inline def setOpens(value: js.Array[OpenEvent]): Self = StObject.set(x, "Opens", value.asInstanceOf[js.Any])
      
      inline def setOpensVarargs(value: OpenEvent*): Self = StObject.set(x, "Opens", js.Array(value*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
