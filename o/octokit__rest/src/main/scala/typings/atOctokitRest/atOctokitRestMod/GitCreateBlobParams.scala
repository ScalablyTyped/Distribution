package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(content = content, owner = owner, repo = repo)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[GitCreateBlobParams]
  }
}

