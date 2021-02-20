package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubdivisionsRecord extends StObject {
  
  val confidence: js.UndefOr[Double] = js.native
  
  val geoname_id: Double = js.native
  
  val iso_code: String = js.native
  
  val names: Names = js.native
}
object SubdivisionsRecord {
  
  @scala.inline
  def apply(geoname_id: Double, iso_code: String, names: Names): SubdivisionsRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubdivisionsRecord]
  }
  
  @scala.inline
  implicit class SubdivisionsRecordMutableBuilder[Self <: SubdivisionsRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setGeoname_id(value: Double): Self = StObject.set(x, "geoname_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso_code(value: String): Self = StObject.set(x, "iso_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Names): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
