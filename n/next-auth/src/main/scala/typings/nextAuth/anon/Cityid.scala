package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cityid extends StObject {
  
  var city_id: js.UndefOr[Double] = js.undefined
  
  var city_name: js.UndefOr[String] = js.undefined
  
  var company: js.UndefOr[String] = js.undefined
  
  var country_id: js.UndefOr[Double] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var group_id: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var until: js.UndefOr[Double] = js.undefined
}
object Cityid {
  
  inline def apply(): Cityid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cityid]
  }
  
  extension [Self <: Cityid](x: Self) {
    
    inline def setCity_id(value: Double): Self = StObject.set(x, "city_id", value.asInstanceOf[js.Any])
    
    inline def setCity_idUndefined: Self = StObject.set(x, "city_id", js.undefined)
    
    inline def setCity_name(value: String): Self = StObject.set(x, "city_name", value.asInstanceOf[js.Any])
    
    inline def setCity_nameUndefined: Self = StObject.set(x, "city_name", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setCountry_id(value: Double): Self = StObject.set(x, "country_id", value.asInstanceOf[js.Any])
    
    inline def setCountry_idUndefined: Self = StObject.set(x, "country_id", js.undefined)
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_idUndefined: Self = StObject.set(x, "group_id", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    
    inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
  }
}
