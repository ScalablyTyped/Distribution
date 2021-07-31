package typings.navermaps.naver.maps

import typings.navermaps.anon.Country
import typings.navermaps.anon.Items
import typings.navermaps.anon.Total
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Service {
  
  @js.native
  sealed trait CoordType extends StObject
  @JSGlobal("naver.maps.Service.CoordType")
  @js.native
  object CoordType extends StObject {
    
    @js.native
    sealed trait LATLNG
      extends StObject
         with CoordType
    
    @js.native
    sealed trait TM128
      extends StObject
         with CoordType
  }
  
  @js.native
  sealed trait Encoding extends StObject
  @JSGlobal("naver.maps.Service.Encoding")
  @js.native
  object Encoding extends StObject {
    
    @js.native
    sealed trait EUC_KR
      extends StObject
         with Encoding
    
    @js.native
    sealed trait UTF_8
      extends StObject
         with Encoding
  }
  
  @js.native
  sealed trait Status extends StObject
  @JSGlobal("naver.maps.Service.Status")
  @js.native
  object Status extends StObject {
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Status
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
  }
  
  trait AddressItem extends StObject {
    
    var addrdetail: Country
    
    var address: String
  }
  object AddressItem {
    
    @scala.inline
    def apply(addrdetail: Country, address: String): AddressItem = {
      val __obj = js.Dynamic.literal(addrdetail = addrdetail.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressItem]
    }
    
    @scala.inline
    implicit class AddressItemMutableBuilder[Self <: AddressItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddrdetail(value: Country): Self = StObject.set(x, "addrdetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeocodeResponse extends StObject {
    
    var result: Items
  }
  object GeocodeResponse {
    
    @scala.inline
    def apply(result: Items): GeocodeResponse = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeResponse]
    }
    
    @scala.inline
    implicit class GeocodeResponseMutableBuilder[Self <: GeocodeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResult(value: Items): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeocodeServiceOptions
    extends StObject
       with ServiceOptions {
    
    var address: js.UndefOr[String] = js.undefined
  }
  object GeocodeServiceOptions {
    
    @scala.inline
    def apply(): GeocodeServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeocodeServiceOptions]
    }
    
    @scala.inline
    implicit class GeocodeServiceOptionsMutableBuilder[Self <: GeocodeServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    }
  }
  
  trait ReverseGeocodeResponse extends StObject {
    
    var result: Total
  }
  object ReverseGeocodeResponse {
    
    @scala.inline
    def apply(result: Total): ReverseGeocodeResponse = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReverseGeocodeResponse]
    }
    
    @scala.inline
    implicit class ReverseGeocodeResponseMutableBuilder[Self <: ReverseGeocodeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResult(value: Total): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReverseServiceOptions
    extends StObject
       with ServiceOptions {
    
    var location: js.UndefOr[Coord | CoordLiteral] = js.undefined
  }
  object ReverseServiceOptions {
    
    @scala.inline
    def apply(): ReverseServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReverseServiceOptions]
    }
    
    @scala.inline
    implicit class ReverseServiceOptionsMutableBuilder[Self <: ReverseServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Coord | CoordLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  trait ServiceOptions extends StObject {
    
    var coordType: js.UndefOr[js.Any] = js.undefined
    
    var encoding: js.UndefOr[js.Any] = js.undefined
  }
  object ServiceOptions {
    
    @scala.inline
    def apply(): ServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceOptions]
    }
    
    @scala.inline
    implicit class ServiceOptionsMutableBuilder[Self <: ServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordType(value: js.Any): Self = StObject.set(x, "coordType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordTypeUndefined: Self = StObject.set(x, "coordType", js.undefined)
      
      @scala.inline
      def setEncoding(value: js.Any): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
