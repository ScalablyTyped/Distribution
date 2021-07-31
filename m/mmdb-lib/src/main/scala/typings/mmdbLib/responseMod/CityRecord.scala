package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CityRecord extends StObject {
  
  val confidence: js.UndefOr[Double] = js.undefined
  
  val geoname_id: Double
  
  val names: Names
}
object CityRecord {
  
  @scala.inline
  def apply(geoname_id: Double, names: Names): CityRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityRecord]
  }
  
  @scala.inline
  implicit class CityRecordMutableBuilder[Self <: CityRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setGeoname_id(value: Double): Self = StObject.set(x, "geoname_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Names): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
