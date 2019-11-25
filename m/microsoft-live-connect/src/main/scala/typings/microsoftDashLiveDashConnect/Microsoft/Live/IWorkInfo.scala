package typings.microsoftDashLiveDashConnect.Microsoft.Live

import typings.microsoftDashLiveDashConnect.Anon_Name
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
  var employer: Anon_Name
  /**
    * Info about the user's work position.
    */
  var position: Anon_Name
}

object IWorkInfo {
  @scala.inline
  def apply(employer: Anon_Name, position: Anon_Name): IWorkInfo = {
    val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWorkInfo]
  }
}

