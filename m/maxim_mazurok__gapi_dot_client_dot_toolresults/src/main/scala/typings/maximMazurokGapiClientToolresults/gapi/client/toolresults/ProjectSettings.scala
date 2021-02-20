package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectSettings extends StObject {
  
  /** The name of the Google Cloud Storage bucket to which results are written. By default, this is unset. In update request: optional In response: optional */
  var defaultBucket: js.UndefOr[String] = js.native
  
  /** The name of the project's settings. Always of the form: projects/{project-id}/settings In update request: never set In response: always set */
  var name: js.UndefOr[String] = js.native
}
object ProjectSettings {
  
  @scala.inline
  def apply(): ProjectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectSettings]
  }
  
  @scala.inline
  implicit class ProjectSettingsMutableBuilder[Self <: ProjectSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultBucket(value: String): Self = StObject.set(x, "defaultBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBucketUndefined: Self = StObject.set(x, "defaultBucket", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
