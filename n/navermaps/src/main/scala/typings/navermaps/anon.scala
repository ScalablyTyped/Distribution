package typings.navermaps

import typings.navermaps.naver.maps.Service.AddressItem
import typings.navermaps.naver.maps.Service.AddressItemV2
import typings.navermaps.naver.maps.Service.GeocodeStatus
import typings.navermaps.naver.maps.Service.Meta
import typings.navermaps.naver.maps.Service.ResultItem
import typings.navermaps.naver.maps.Service.ReverseGeocodeAddress
import typings.navermaps.naver.maps.Service.ReverseGeocodeStatus
import typings.navermaps.navermapsStrings.A
import typings.navermaps.navermapsStrings.BUILDING_NAME
import typings.navermaps.navermapsStrings.BUILDING_NUMBER
import typings.navermaps.navermapsStrings.L
import typings.navermaps.navermapsStrings.LAND_NUMBER
import typings.navermaps.navermapsStrings.POSTAL_CODE
import typings.navermaps.navermapsStrings.RI
import typings.navermaps.navermapsStrings.ROAD_NAME
import typings.navermaps.navermapsStrings.S
import typings.navermaps.navermapsStrings.SIDO
import typings.navermaps.navermapsStrings.SIGUGUN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: ReverseGeocodeAddress
    
    var results: js.Array[ResultItem]
    
    var status: ReverseGeocodeStatus
  }
  object Address {
    
    inline def apply(address: ReverseGeocodeAddress, results: js.Array[ResultItem], status: ReverseGeocodeStatus): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: ReverseGeocodeAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[ResultItem]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: ResultItem*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setStatus(value: ReverseGeocodeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Addresses extends StObject {
    
    var addresses: js.Array[AddressItemV2]
    
    var errorMessage: String
    
    var meta: Meta
    
    var status: GeocodeStatus
  }
  object Addresses {
    
    inline def apply(addresses: js.Array[AddressItemV2], errorMessage: String, meta: Meta, status: GeocodeStatus): Addresses = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addresses]
    }
    
    extension [Self <: Addresses](x: Self) {
      
      inline def setAddresses(value: js.Array[AddressItemV2]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: AddressItemV2*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: GeocodeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var longName: String
    
    var shortName: String
    
    var types: SIDO | SIGUGUN | RI | ROAD_NAME | BUILDING_NUMBER | BUILDING_NAME | LAND_NUMBER | POSTAL_CODE
  }
  object Code {
    
    inline def apply(
      code: String,
      longName: String,
      shortName: String,
      types: SIDO | SIGUGUN | RI | ROAD_NAME | BUILDING_NUMBER | BUILDING_NAME | LAND_NUMBER | POSTAL_CODE
    ): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], longName = longName.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLongName(value: String): Self = StObject.set(x, "longName", value.asInstanceOf[js.Any])
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setTypes(
        value: SIDO | SIGUGUN | RI | ROAD_NAME | BUILDING_NUMBER | BUILDING_NAME | LAND_NUMBER | POSTAL_CODE
      ): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait Country extends StObject {
    
    var country: String
    
    var dongmyun: String
    
    var rest: String
    
    var sido: String
    
    var sigugun: String
  }
  object Country {
    
    inline def apply(country: String, dongmyun: String, rest: String, sido: String, sigugun: String): Country = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], dongmyun = dongmyun.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sigugun = sigugun.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDongmyun(value: String): Self = StObject.set(x, "dongmyun", value.asInstanceOf[js.Any])
      
      inline def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setSido(value: String): Self = StObject.set(x, "sido", value.asInstanceOf[js.Any])
      
      inline def setSigugun(value: String): Self = StObject.set(x, "sigugun", value.asInstanceOf[js.Any])
    }
  }
  
  trait Crs extends StObject {
    
    var crs: String
    
    var x: String
    
    var y: String
  }
  object Crs {
    
    inline def apply(crs: String, x: String, y: String): Crs = {
      val __obj = js.Dynamic.literal(crs = crs.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crs]
    }
    
    extension [Self <: Crs](x: Self) {
      
      inline def setCrs(value: String): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var mappingId: String
    
    var `type`: L | A | S | String
  }
  object Id {
    
    inline def apply(id: String, mappingId: String, `type`: L | A | S | String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mappingId = mappingId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMappingId(value: String): Self = StObject.set(x, "mappingId", value.asInstanceOf[js.Any])
      
      inline def setType(value: L | A | S | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Items extends StObject {
    
    var items: js.Array[AddressItem]
    
    var total: Double
    
    var userquery: Any
  }
  object Items {
    
    inline def apply(items: js.Array[AddressItem], total: Double, userquery: Any): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setItems(value: js.Array[AddressItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: AddressItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUserquery(value: Any): Self = StObject.set(x, "userquery", value.asInstanceOf[js.Any])
    }
  }
  
  trait Total extends StObject {
    
    var items: js.Array[AddressItem]
    
    var total: Double
    
    var userquery: String
  }
  object Total {
    
    inline def apply(items: js.Array[AddressItem], total: Double, userquery: String): Total = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
      __obj.asInstanceOf[Total]
    }
    
    extension [Self <: Total](x: Self) {
      
      inline def setItems(value: js.Array[AddressItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: AddressItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUserquery(value: String): Self = StObject.set(x, "userquery", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: String
    
    var y: String
  }
  object X {
    
    inline def apply(x: String, y: String): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
