package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepresentedCountryRecord extends RegisteredCountryRecord {
  
  val `type`: String = js.native
}
object RepresentedCountryRecord {
  
  @scala.inline
  def apply(geoname_id: Double, iso_code: String, names: Names, `type`: String): RepresentedCountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepresentedCountryRecord]
  }
  
  @scala.inline
  implicit class RepresentedCountryRecordMutableBuilder[Self <: RepresentedCountryRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
