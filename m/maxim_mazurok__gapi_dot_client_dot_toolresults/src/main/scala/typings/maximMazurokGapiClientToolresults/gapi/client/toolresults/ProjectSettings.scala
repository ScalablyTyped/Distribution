package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectSettings extends js.Object {
  
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
  implicit class ProjectSettingsOps[Self <: ProjectSettings] (val x: Self) extends AnyVal {
    
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
    def setDefaultBucket(value: String): Self = this.set("defaultBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBucket: Self = this.set("defaultBucket", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
