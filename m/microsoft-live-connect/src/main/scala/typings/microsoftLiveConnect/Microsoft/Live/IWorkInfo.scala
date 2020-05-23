package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Name
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
  var employer: Name
  /**
    * Info about the user's work position.
    */
  var position: Name
}

object IWorkInfo {
  @scala.inline
  def apply(employer: Name, position: Name): IWorkInfo = {
    val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkInfo]
  }
}

