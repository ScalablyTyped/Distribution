package typings.mmdbLib.responseMod

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
  
  @scala.inline
  def apply(geoname_id: Double, iso_code: String, names: Names): RegisteredCountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredCountryRecord]
  }
  
  @scala.inline
  implicit class RegisteredCountryRecordMutableBuilder[Self <: RegisteredCountryRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoname_id(value: Double): Self = StObject.set(x, "geoname_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_in_european_union(value: Boolean): Self = StObject.set(x, "is_in_european_union", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_in_european_unionUndefined: Self = StObject.set(x, "is_in_european_union", js.undefined)
    
    @scala.inline
    def setIso_code(value: String): Self = StObject.set(x, "iso_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Names): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
