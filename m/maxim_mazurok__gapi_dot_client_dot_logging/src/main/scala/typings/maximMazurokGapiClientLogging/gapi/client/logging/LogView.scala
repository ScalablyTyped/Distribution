package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogView extends StObject {
  
  /** Output only. The creation timestamp of the view. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Describes this view. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Filter that restricts which log entries in a bucket are visible in this view. Filters are restricted to be a logical AND of ==/!= of any of the following: originating
    * project/folder/organization/billing account. resource type log id Example: SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
    */
  var filter: js.UndefOr[String] = js.native
  
  /** The resource name of the view. For example "projects/my-project-id/locations/my-location/buckets/my-bucket-id/views/my-view */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The last update timestamp of the view. */
  var updateTime: js.UndefOr[String] = js.native
}
object LogView {
  
  @scala.inline
  def apply(): LogView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogView]
  }
  
  @scala.inline
  implicit class LogViewMutableBuilder[Self <: LogView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
