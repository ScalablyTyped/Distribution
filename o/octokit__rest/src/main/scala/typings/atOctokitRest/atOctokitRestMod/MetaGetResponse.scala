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
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], importer = importer.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], verifiable_password_authentication = verifiable_password_authentication.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaGetResponse]
  }
}

