package typings.octokitRest

import typings.octokitRest.mod._Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLink extends _Link {
  var link: String
}

object AnonLink {
  @scala.inline
  def apply(link: String): AnonLink = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLink]
  }
}

