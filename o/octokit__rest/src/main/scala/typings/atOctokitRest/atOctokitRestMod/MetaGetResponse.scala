package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaGetResponse extends js.Object {
  var git: js.Array[String]
  var hooks: js.Array[String]
  var importer: js.Array[String]
  var pages: js.Array[String]
  var verifiable_password_authentication: Boolean
}

object MetaGetResponse {
  @scala.inline
  def apply(
    git: js.Array[String],
    hooks: js.Array[String],
    importer: js.Array[String],
    pages: js.Array[String],
    verifiable_password_authentication: Boolean
  ): MetaGetResponse = {
    val __obj = js.Dynamic.literal(git = git, hooks = hooks, importer = importer, pages = pages, verifiable_password_authentication = verifiable_password_authentication)
  
    __obj.asInstanceOf[MetaGetResponse]
  }
}

