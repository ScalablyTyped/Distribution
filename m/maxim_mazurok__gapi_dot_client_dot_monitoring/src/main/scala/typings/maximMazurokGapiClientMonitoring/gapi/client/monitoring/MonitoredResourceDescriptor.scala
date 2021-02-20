package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoredResourceDescriptor extends StObject {
  
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
  implicit class MonitoredResourceDescriptorMutableBuilder[Self <: MonitoredResourceDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[LabelDescriptor]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: LabelDescriptor*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
