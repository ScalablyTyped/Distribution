package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var id: java.lang.String
  /**
    * The name of the user.
    */
  var name: java.lang.String
}

object IUserInfo {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): IUserInfo = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[IUserInfo]
  }
}

