package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.AnonName
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
  var employer: AnonName
  /**
    * Info about the user's work position.
    */
  var position: AnonName
}

object IWorkInfo {
  @scala.inline
  def apply(employer: AnonName, position: AnonName): IWorkInfo = {
    val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWorkInfo]
  }
}

