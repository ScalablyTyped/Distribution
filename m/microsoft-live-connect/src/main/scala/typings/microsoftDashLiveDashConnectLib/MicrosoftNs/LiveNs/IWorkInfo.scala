package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains work information for one employer.
  */
trait IWorkInfo extends js.Object {
  /**
    * Info about the user's employer.
    */
  var employer: microsoftDashLiveDashConnectLib.Anon_Name
  /**
    * Info about the user's work position.
    */
  var position: microsoftDashLiveDashConnectLib.Anon_Name
}

object IWorkInfo {
  @scala.inline
  def apply(
    employer: microsoftDashLiveDashConnectLib.Anon_Name,
    position: microsoftDashLiveDashConnectLib.Anon_Name
  ): IWorkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("employer")(employer)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IWorkInfo]
  }
}

