package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Success response to a new file creation request.
  */
trait INewFileResponse extends js.Object {
  /**
    * ID of the new item.
    */
  var id: java.lang.String
  /**
    * The file's name and file extension.
    */
  var name: java.lang.String
  /**
    * URL where the item can be downloaded from.
    */
  var source: java.lang.String
}

object INewFileResponse {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, source: java.lang.String): INewFileResponse = {
    val __obj = js.Dynamic.literal(id = id, name = name, source = source)
  
    __obj.asInstanceOf[INewFileResponse]
  }
}

