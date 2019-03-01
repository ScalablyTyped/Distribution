package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion REST Object Information
//#region API Properties Interfaces
/**
  * 'Properties' object passed into the WL.api method.
  */
trait IAPIProperties extends js.Object {
  /**
    * A JSON object that specifies the REST API request body. The body
    * property is used only for "POST" and "PUT" requests.
    */
  var body: js.UndefOr[js.Any] = js.undefined
  /**
    * An HTTP method that specifies the action required for the API call.
    * These actions are standard REST API actions: "COPY", "GET", "MOVE",
    * "PUT", "POST", and "DELETE".
    * @default "GET"
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains the path to the REST API object. For information on
    * specifying paths for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: java.lang.String
}

object IAPIProperties {
  @scala.inline
  def apply(path: java.lang.String, body: js.Any = null, method: java.lang.String = null): IAPIProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (body != null) __obj.updateDynamic("body")(body)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[IAPIProperties]
  }
}

