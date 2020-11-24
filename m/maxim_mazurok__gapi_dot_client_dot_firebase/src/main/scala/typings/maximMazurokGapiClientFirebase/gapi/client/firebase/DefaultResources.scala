package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultResources extends js.Object {
  
  /**
    * The default Firebase Hosting site name, in the format: PROJECT_ID Though rare, your `projectId` might already be used as the name for an existing Hosting site in another project
    * (learn more about creating non-default, [additional sites](https://firebase.google.com/docs/hosting/multisites)). In these cases, your `projectId` is appended with a hyphen then
    * five alphanumeric characters to create your default Hosting site name. For example, if your `projectId` is `myproject123`, your default Hosting site name might be:
    * `myproject123-a5c16`
    */
  var hostingSite: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Project's default GCP resource location. The location is one of the available [GCP resource locations](https://firebase.google.com/docs/projects/locations). This field
    * is omitted if the default GCP resource location has not been finalized yet. To set a Project's default GCP resource location, call
    * [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase resources to the Project.
    */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * The default Firebase Realtime Database instance name, in the format: PROJECT_ID Though rare, your `projectId` might already be used as the name for an existing Realtime Database
    * instance in another project (learn more about [database sharding](https://firebase.google.com/docs/database/usage/sharding)). In these cases, your `projectId` is appended with a
    * hyphen then five alphanumeric characters to create your default Realtime Database instance name. For example, if your `projectId` is `myproject123`, your default database instance
    * name might be: `myproject123-a5c16`
    */
  var realtimeDatabaseInstance: js.UndefOr[String] = js.native
  
  /** The default Cloud Storage for Firebase storage bucket, in the format: PROJECT_ID.appspot.com */
  var storageBucket: js.UndefOr[String] = js.native
}
object DefaultResources {
  
  @scala.inline
  def apply(): DefaultResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultResources]
  }
  
  @scala.inline
  implicit class DefaultResourcesOps[Self <: DefaultResources] (val x: Self) extends AnyVal {
    
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
    def setHostingSite(value: String): Self = this.set("hostingSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostingSite: Self = this.set("hostingSite", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setRealtimeDatabaseInstance(value: String): Self = this.set("realtimeDatabaseInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtimeDatabaseInstance: Self = this.set("realtimeDatabaseInstance", js.undefined)
    
    @scala.inline
    def setStorageBucket(value: String): Self = this.set("storageBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageBucket: Self = this.set("storageBucket", js.undefined)
  }
}
