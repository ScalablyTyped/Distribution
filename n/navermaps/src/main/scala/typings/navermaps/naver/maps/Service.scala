package typings.navermaps.naver.maps

import typings.navermaps.anon.Country
import typings.navermaps.anon.Items
import typings.navermaps.anon.Total
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Service {
  
  @js.native
  sealed trait CoordType extends StObject
  @JSGlobal("naver.maps.Service.CoordType")
  @js.native
  object CoordType extends StObject {
    
    @js.native
    sealed trait LATLNG extends CoordType
    
    @js.native
    sealed trait TM128 extends CoordType
  }
  
  @js.native
  sealed trait Encoding extends StObject
  @JSGlobal("naver.maps.Service.Encoding")
  @js.native
  object Encoding extends StObject {
    
    @js.native
    sealed trait EUC_KR extends Encoding
    
    @js.native
    sealed trait UTF_8 extends Encoding
  }
  
  @js.native
  sealed trait Status extends StObject
  @JSGlobal("naver.maps.Service.Status")
  @js.native
  object Status extends StObject {
    
    @js.native
    sealed trait ERROR extends Status
    
    @js.native
    sealed trait OK extends Status
  }
  
  @js.native
  trait AddressItem extends StObject {
    
    var addrdetail: Country = js.native
    
    var address: String = js.native
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
  
  @js.native
  trait GeocodeResponse extends StObject {
    
    var result: Items = js.native
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
  
  @js.native
  trait GeocodeServiceOptions extends ServiceOptions {
    
    var address: js.UndefOr[String] = js.native
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
  
  @js.native
  trait ReverseGeocodeResponse extends StObject {
    
    var result: Total = js.native
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
  
  @js.native
  trait ReverseServiceOptions extends ServiceOptions {
    
    var location: js.UndefOr[Coord | CoordLiteral] = js.native
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
  
  @js.native
  trait ServiceOptions extends StObject {
    
    var coordType: js.UndefOr[js.Any] = js.native
    
    var encoding: js.UndefOr[js.Any] = js.native
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
