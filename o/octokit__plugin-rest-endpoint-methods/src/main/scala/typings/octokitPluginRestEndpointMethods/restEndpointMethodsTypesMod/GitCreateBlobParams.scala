package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateBlobParams extends js.Object {
  /**
    * The new blob's content.
    */
  var content: String
  /**
    * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
    */
  var encoding: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object GitCreateBlobParams {
  @scala.inline
  def apply(content: String, owner: String, repo: String, encoding: String = null): GitCreateBlobParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateBlobParams]
  }
}

