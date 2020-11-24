package typings.mmdbLib.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisteredCountryRecord extends js.Object {
  
  val geoname_id: Double = js.native
  
  val is_in_european_union: js.UndefOr[Boolean] = js.native
  
  val iso_code: String = js.native
  
  val names: Names = js.native
}
object RegisteredCountryRecord {
  
  @scala.inline
  def apply(geoname_id: Double, iso_code: String, names: Names): RegisteredCountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredCountryRecord]
  }
  
  @scala.inline
  implicit class RegisteredCountryRecordOps[Self <: RegisteredCountryRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGeoname_id(value: Double): Self = this.set("geoname_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso_code(value: String): Self = this.set("iso_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Names): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_in_european_union(value: Boolean): Self = this.set("is_in_european_union", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_in_european_union: Self = this.set("is_in_european_union", js.undefined)
  }
}
