package typings.mmdbLib.responseMod

import typings.mmdbLib.mmdbLibStrings.AF
import typings.mmdbLib.mmdbLibStrings.AN
import typings.mmdbLib.mmdbLibStrings.AS
import typings.mmdbLib.mmdbLibStrings.EU
import typings.mmdbLib.mmdbLibStrings.NA
import typings.mmdbLib.mmdbLibStrings.OC
import typings.mmdbLib.mmdbLibStrings.SA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinentRecord extends StObject {
  
  val code: AF | AN | AS | EU | NA | OC | SA
  
  val geoname_id: Double
  
  val names: Names
}
object ContinentRecord {
  
  @scala.inline
  def apply(code: AF | AN | AS | EU | NA | OC | SA, geoname_id: Double, names: Names): ContinentRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinentRecord]
  }
  
  @scala.inline
  implicit class ContinentRecordMutableBuilder[Self <: ContinentRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: AF | AN | AS | EU | NA | OC | SA): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoname_id(value: Double): Self = StObject.set(x, "geoname_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Names): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
