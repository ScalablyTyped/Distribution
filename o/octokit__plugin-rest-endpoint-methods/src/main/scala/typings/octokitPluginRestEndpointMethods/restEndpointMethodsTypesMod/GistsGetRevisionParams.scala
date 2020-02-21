package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionParams extends js.Object {
  var gist_id: String
  var sha: String
}

object GistsGetRevisionParams {
  @scala.inline
  def apply(gist_id: String, sha: String): GistsGetRevisionParams = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsGetRevisionParams]
  }
}

