package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRequestPageBuildResponse extends js.Object {
  var status: java.lang.String
  var url: java.lang.String
}

object ReposRequestPageBuildResponse {
  @scala.inline
  def apply(status: java.lang.String, url: java.lang.String): ReposRequestPageBuildResponse = {
    val __obj = js.Dynamic.literal(status = status, url = url)
  
    __obj.asInstanceOf[ReposRequestPageBuildResponse]
  }
}

