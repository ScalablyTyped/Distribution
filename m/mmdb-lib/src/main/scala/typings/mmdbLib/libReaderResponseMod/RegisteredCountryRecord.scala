package typings.mmdbLib.libReaderResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredCountryRecord extends StObject {
  
  val geoname_id: Double
  
  val is_in_european_union: js.UndefOr[Boolean] = js.undefined
  
  val iso_code: String
  
  val names: Names
}
object RegisteredCountryRecord {
  
  inline def apply(geoname_id: Double, iso_code: String, names: Names): RegisteredCountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredCountryRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisteredCountryRecord] (val x: Self) extends AnyVal {
    
    inline def setGeoname_id(value: Double): Self = StObject.set(x, "geoname_id", value.asInstanceOf[js.Any])
    
    inline def setIs_in_european_union(value: Boolean): Self = StObject.set(x, "is_in_european_union", value.asInstanceOf[js.Any])
    
    inline def setIs_in_european_unionUndefined: Self = StObject.set(x, "is_in_european_union", js.undefined)
    
    inline def setIso_code(value: String): Self = StObject.set(x, "iso_code", value.asInstanceOf[js.Any])
    
    inline def setNames(value: Names): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
