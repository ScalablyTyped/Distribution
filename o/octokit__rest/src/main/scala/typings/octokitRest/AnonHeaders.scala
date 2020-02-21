package typings.octokitRest

import typings.octokitRest.mod.Octokit._Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends _Link {
  var headers: AnonLink
}

object AnonHeaders {
  @scala.inline
  def apply(headers: AnonLink): AnonHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeaders]
  }
}

