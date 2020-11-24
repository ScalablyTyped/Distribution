package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoredResourceDescriptor extends js.Object {
  
  /** Optional. A detailed description of the monitored resource type that might be used in documentation. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Optional. A concise name for the monitored resource type that might be displayed in user interfaces. It should be a Title Cased Noun Phrase, without any article or other
    * determiners. For example, "Google Cloud SQL Database".
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Required. A set of labels used to describe instances of this monitored resource type. For example, an individual Google Cloud SQL database is identified by values for the labels
    * "database_id" and "zone".
    */
  var labels: js.UndefOr[js.Array[LabelDescriptor]] = js.native
  
  /** Optional. The launch stage of the monitored resource definition. */
  var launchStage: js.UndefOr[String] = js.native
  
  /**
    * Optional. The resource name of the monitored resource descriptor: "projects/{project_id}/monitoredResourceDescriptors/{type}" where {type} is the value of the type field in this
    * object and {project_id} is a project ID that provides API-specific context for accessing the type. APIs that do not use project information can use the resource name format
    * "monitoredResourceDescriptors/{type}".
    */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The monitored resource type. For example, the type "cloudsql_database" represents databases in Google Cloud SQL. */
  var `type`: js.UndefOr[String] = js.native
}
object MonitoredResourceDescriptor {
  
  @scala.inline
  def apply(): MonitoredResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoredResourceDescriptor]
  }
  
  @scala.inline
  implicit class MonitoredResourceDescriptorOps[Self <: MonitoredResourceDescriptor] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: LabelDescriptor*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[LabelDescriptor]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLaunchStage(value: String): Self = this.set("launchStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchStage: Self = this.set("launchStage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
