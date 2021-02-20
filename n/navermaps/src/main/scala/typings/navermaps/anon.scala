package typings.navermaps

import typings.navermaps.naver.maps.Service.AddressItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Country extends StObject {
    
    var country: String = js.native
    
    var dongmyun: String = js.native
    
    var rest: String = js.native
    
    var sido: String = js.native
    
    var sigugun: String = js.native
  }
  object Country {
    
    @scala.inline
    def apply(country: String, dongmyun: String, rest: String, sido: String, sigugun: String): Country = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], dongmyun = dongmyun.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sigugun = sigugun.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    @scala.inline
    implicit class CountryMutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDongmyun(value: String): Self = StObject.set(x, "dongmyun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSido(value: String): Self = StObject.set(x, "sido", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigugun(value: String): Self = StObject.set(x, "sigugun", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Items extends StObject {
    
    var items: js.Array[AddressItem] = js.native
    
    var total: Double = js.native
    
    var userquery: js.Any = js.native
  }
  object Items {
    
    @scala.inline
    def apply(items: js.Array[AddressItem], total: Double, userquery: js.Any): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[AddressItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: AddressItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserquery(value: js.Any): Self = StObject.set(x, "userquery", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Total extends StObject {
    
    var items: js.Array[AddressItem] = js.native
    
    var total: Double = js.native
    
    var userquery: String = js.native
  }
  object Total {
    
    @scala.inline
    def apply(items: js.Array[AddressItem], total: Double, userquery: String): Total = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], userquery = userquery.asInstanceOf[js.Any])
      __obj.asInstanceOf[Total]
    }
    
    @scala.inline
    implicit class TotalMutableBuilder[Self <: Total] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[AddressItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: AddressItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserquery(value: String): Self = StObject.set(x, "userquery", value.asInstanceOf[js.Any])
    }
  }
}
