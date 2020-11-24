package typings.mmdbLib.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubdivisionsRecord extends js.Object {
  
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
  implicit class SubdivisionsRecordOps[Self <: SubdivisionsRecord] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
  }
}
