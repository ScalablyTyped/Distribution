package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOfGroupInfo extends js.Object {
  /**
    * The UUID of the application this window entry belongs to.
    */
  var appUuid: String
  /**
    * The name of this window entry.
    */
  var windowName: String
}

object WindowOfGroupInfo {
  @scala.inline
  def apply(appUuid: String, windowName: String): WindowOfGroupInfo = {
    val __obj = js.Dynamic.literal(appUuid = appUuid.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowOfGroupInfo]
  }
}

