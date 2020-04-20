package typings.postmark

import typings.postmark.messageSupportingTypesMod.LinkClickLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClickLocation extends js.Object {
  var ClickLocation: LinkClickLocation
  var Link: String
  var Summary: String
}

object AnonClickLocation {
  @scala.inline
  def apply(ClickLocation: LinkClickLocation, Link: String, Summary: String): AnonClickLocation = {
    val __obj = js.Dynamic.literal(ClickLocation = ClickLocation.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClickLocation]
  }
}

