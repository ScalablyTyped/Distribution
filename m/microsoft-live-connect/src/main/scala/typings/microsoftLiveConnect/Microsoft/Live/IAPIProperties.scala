package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion REST Object Information
//#region API Properties Interfaces
/**
  * 'Properties' object passed into the WL.api method.
  */
@js.native
trait IAPIProperties extends js.Object {
  
  /**
    * A JSON object that specifies the REST API request body. The body
    * property is used only for "POST" and "PUT" requests.
    */
  var body: js.UndefOr[js.Any] = js.native
  
  /**
    * An HTTP method that specifies the action required for the API call.
    * These actions are standard REST API actions: "COPY", "GET", "MOVE",
    * "PUT", "POST", and "DELETE".
    * @default "GET"
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * Contains the path to the REST API object. For information on
    * specifying paths for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: String = js.native
}
object IAPIProperties {
  
  @scala.inline
  def apply(path: String): IAPIProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPIProperties]
  }
  
  @scala.inline
  implicit class IAPIPropertiesOps[Self <: IAPIProperties] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
