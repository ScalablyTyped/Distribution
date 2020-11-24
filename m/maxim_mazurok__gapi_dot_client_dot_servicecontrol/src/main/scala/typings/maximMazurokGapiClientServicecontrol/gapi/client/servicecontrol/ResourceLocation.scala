package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLocation extends js.Object {
  
  /**
    * The locations of a resource after the execution of the operation. Requests to create or delete a location based resource must populate the 'current_locations' field and not the
    * 'original_locations' field. For example: "europe-west1-a" "us-east1" "nam3"
    */
  var currentLocations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The locations of a resource prior to the execution of the operation. Requests that mutate the resource's location must populate both the 'original_locations' as well as the
    * 'current_locations' fields. For example: "europe-west1-a" "us-east1" "nam3"
    */
  var originalLocations: js.UndefOr[js.Array[String]] = js.native
}
object ResourceLocation {
  
  @scala.inline
  def apply(): ResourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLocation]
  }
  
  @scala.inline
  implicit class ResourceLocationOps[Self <: ResourceLocation] (val x: Self) extends AnyVal {
    
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
    def setCurrentLocationsVarargs(value: String*): Self = this.set("currentLocations", js.Array(value :_*))
    
    @scala.inline
    def setCurrentLocations(value: js.Array[String]): Self = this.set("currentLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentLocations: Self = this.set("currentLocations", js.undefined)
    
    @scala.inline
    def setOriginalLocationsVarargs(value: String*): Self = this.set("originalLocations", js.Array(value :_*))
    
    @scala.inline
    def setOriginalLocations(value: js.Array[String]): Self = this.set("originalLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalLocations: Self = this.set("originalLocations", js.undefined)
  }
}
