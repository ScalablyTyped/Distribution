package typings.maximMazurokGapiClientFirebaseml.gapi.client.firebaseml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelOperationMetadata extends js.Object {
  
  var basicOperationStatus: js.UndefOr[String] = js.native
  
  /** The name of the model we are creating/updating The name must have the form `projects/{project_id}/models/{model_id}` */
  var name: js.UndefOr[String] = js.native
}
object ModelOperationMetadata {
  
  @scala.inline
  def apply(): ModelOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelOperationMetadata]
  }
  
  @scala.inline
  implicit class ModelOperationMetadataOps[Self <: ModelOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setBasicOperationStatus(value: String): Self = this.set("basicOperationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicOperationStatus: Self = this.set("basicOperationStatus", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
