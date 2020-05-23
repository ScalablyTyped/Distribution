package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsStarEndpoint extends js.Object {
  var gist_id: String
}

object GistsStarEndpoint {
  @scala.inline
  def apply(gist_id: String): GistsStarEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsStarEndpoint]
  }
}

