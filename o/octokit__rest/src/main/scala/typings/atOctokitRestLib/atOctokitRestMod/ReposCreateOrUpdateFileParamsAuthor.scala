package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileParamsAuthor extends js.Object {
  var email: java.lang.String
  var name: java.lang.String
}

object ReposCreateOrUpdateFileParamsAuthor {
  @scala.inline
  def apply(email: java.lang.String, name: java.lang.String): ReposCreateOrUpdateFileParamsAuthor = {
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileParamsAuthor]
  }
}

