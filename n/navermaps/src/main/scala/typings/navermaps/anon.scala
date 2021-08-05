package typings.navermaps

import typings.navermaps.naver.maps.Service.AddressItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
  
  trait Items extends StObject {
    
    var items: js.Array[AddressItem]
    
    var total: Double
    
    var userquery: js.Any
  }
  object Items {
    
    inline def apply(items: js.Array[AddressItem], total: Double, userquery: js.Any): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setItems(value: js.Array[AddressItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: AddressItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUserquery(value: js.Any): Self = StObject.set(x, "userquery", value.asInstanceOf[js.Any])
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
      
      inline def setItemsVarargs(value: AddressItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUserquery(value: String): Self = StObject.set(x, "userquery", value.asInstanceOf[js.Any])
    }
  }
}
