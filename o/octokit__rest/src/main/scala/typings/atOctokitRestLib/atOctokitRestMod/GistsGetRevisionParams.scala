package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionParams extends js.Object {
  var gist_id: java.lang.String
  var sha: java.lang.String
}

object GistsGetRevisionParams {
  @scala.inline
  def apply(gist_id: java.lang.String, sha: java.lang.String): GistsGetRevisionParams = {
    val __obj = js.Dynamic.literal(gist_id = gist_id, sha = sha)
  
    __obj.asInstanceOf[GistsGetRevisionParams]
  }
}

