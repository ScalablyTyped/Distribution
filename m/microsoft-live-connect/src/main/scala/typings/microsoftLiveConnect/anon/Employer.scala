package typings.microsoftLiveConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Employer extends js.Object {
  var employer: Name
}

object Employer {
  @scala.inline
  def apply(employer: Name): Employer = {
    val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Employer]
  }
}

