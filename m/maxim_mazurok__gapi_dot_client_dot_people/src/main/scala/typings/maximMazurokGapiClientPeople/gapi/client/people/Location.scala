package typings.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends js.Object {
  
  /** The building identifier. */
  var buildingId: js.UndefOr[String] = js.native
  
  /** Whether the location is the current location. */
  var current: js.UndefOr[Boolean] = js.native
  
  /** The individual desk location. */
  var deskCode: js.UndefOr[String] = js.native
  
  /** The floor name or number. */
  var floor: js.UndefOr[String] = js.native
  
  /** The floor section in `floor_name`. */
  var floorSection: js.UndefOr[String] = js.native
  
  /** Metadata about the location. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The type of the location. The type can be custom or one of these predefined values: * `desk` * `grewUp` */
  var `type`: js.UndefOr[String] = js.native
  
  /** The free-form value of the location. */
  var value: js.UndefOr[String] = js.native
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    
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
    def setBuildingId(value: String): Self = this.set("buildingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildingId: Self = this.set("buildingId", js.undefined)
    
    @scala.inline
    def setCurrent(value: Boolean): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setDeskCode(value: String): Self = this.set("deskCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeskCode: Self = this.set("deskCode", js.undefined)
    
    @scala.inline
    def setFloor(value: String): Self = this.set("floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloor: Self = this.set("floor", js.undefined)
    
    @scala.inline
    def setFloorSection(value: String): Self = this.set("floorSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorSection: Self = this.set("floorSection", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
