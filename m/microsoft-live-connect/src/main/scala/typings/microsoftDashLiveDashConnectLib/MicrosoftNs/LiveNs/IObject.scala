package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Convenience interface for when you have a bunch of objects of different
  * types in a single collection. You discriminate between them using their
  * 'type' field.
  */
trait IObject extends js.Object {
  /**
    * The object's type.
    */
  var `type`: java.lang.String
}

object IObject {
  @scala.inline
  def apply(`type`: java.lang.String): IObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[IObject]
  }
}

