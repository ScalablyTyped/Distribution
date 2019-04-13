package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUpdateRefResponseObject extends js.Object {
  var sha: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object GitUpdateRefResponseObject {
  @scala.inline
  def apply(sha: java.lang.String, `type`: java.lang.String, url: java.lang.String): GitUpdateRefResponseObject = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GitUpdateRefResponseObject]
  }
}

