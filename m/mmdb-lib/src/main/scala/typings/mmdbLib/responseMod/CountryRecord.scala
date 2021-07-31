package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryRecord
  extends StObject
     with RegisteredCountryRecord {
  
  val confidence: js.UndefOr[Double] = js.undefined
}
object CountryRecord {
  
  @scala.inline
  def apply(geoname_id: Double, iso_code: String, names: Names): CountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryRecord]
  }
  
  @scala.inline
  implicit class CountryRecordMutableBuilder[Self <: CountryRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
  }
}
