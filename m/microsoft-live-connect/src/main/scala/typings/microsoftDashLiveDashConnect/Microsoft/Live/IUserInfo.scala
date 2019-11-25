package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region REST Object Information
/**
  * Sub object of REST objects that contains information about a user.
  */
trait IUserInfo extends js.Object {
  /**
    * The Live ID of the user.
    */
  var id: String
  /**
    * The name of the user.
    */
  var name: String
}

object IUserInfo {
  @scala.inline
  def apply(id: String, name: String): IUserInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUserInfo]
  }
}

