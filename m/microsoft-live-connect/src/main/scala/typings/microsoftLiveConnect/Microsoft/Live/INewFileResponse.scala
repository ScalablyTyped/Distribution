package typings.microsoftLiveConnect.Microsoft.Live

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
  var id: String
  /**
    * The file's name and file extension.
    */
  var name: String
  /**
    * URL where the item can be downloaded from.
    */
  var source: String
}

object INewFileResponse {
  @scala.inline
  def apply(id: String, name: String, source: String): INewFileResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INewFileResponse]
  }
}

