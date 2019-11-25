package typings.postmark

import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkClickLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClickLocation extends js.Object {
  var ClickLocation: LinkClickLocation
  var Link: String
  var Summary: String
}

object Anon_ClickLocation {
  @scala.inline
  def apply(ClickLocation: LinkClickLocation, Link: String, Summary: String): Anon_ClickLocation = {
    val __obj = js.Dynamic.literal(ClickLocation = ClickLocation.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClickLocation]
  }
}

