package typings.microsoftLiveConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmployer extends js.Object {
  var employer: AnonName
}

object AnonEmployer {
  @scala.inline
  def apply(employer: AnonName): AnonEmployer = {
    val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmployer]
  }
}

