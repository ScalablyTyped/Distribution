package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaGetResponse extends js.Object {
  var git: js.Array[java.lang.String]
  var hooks: js.Array[java.lang.String]
  var importer: js.Array[java.lang.String]
  var pages: js.Array[java.lang.String]
  var verifiable_password_authentication: scala.Boolean
}

object MetaGetResponse {
  @scala.inline
  def apply(
    git: js.Array[java.lang.String],
    hooks: js.Array[java.lang.String],
    importer: js.Array[java.lang.String],
    pages: js.Array[java.lang.String],
    verifiable_password_authentication: scala.Boolean
  ): MetaGetResponse = {
    val __obj = js.Dynamic.literal(git = git, hooks = hooks, importer = importer, pages = pages, verifiable_password_authentication = verifiable_password_authentication)
  
    __obj.asInstanceOf[MetaGetResponse]
  }
}

