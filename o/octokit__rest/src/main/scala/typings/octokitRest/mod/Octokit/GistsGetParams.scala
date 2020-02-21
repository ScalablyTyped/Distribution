package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetParams extends js.Object {
  var gist_id: String
}

object GistsGetParams {
  @scala.inline
  def apply(gist_id: String): GistsGetParams = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsGetParams]
  }
}

