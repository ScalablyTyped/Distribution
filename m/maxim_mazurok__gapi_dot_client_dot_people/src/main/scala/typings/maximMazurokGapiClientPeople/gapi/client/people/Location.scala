package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
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
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildingId(value: String): Self = StObject.set(x, "buildingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingIdUndefined: Self = StObject.set(x, "buildingId", js.undefined)
    
    @scala.inline
    def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setDeskCode(value: String): Self = StObject.set(x, "deskCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeskCodeUndefined: Self = StObject.set(x, "deskCode", js.undefined)
    
    @scala.inline
    def setFloor(value: String): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorSection(value: String): Self = StObject.set(x, "floorSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorSectionUndefined: Self = StObject.set(x, "floorSection", js.undefined)
    
    @scala.inline
    def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
