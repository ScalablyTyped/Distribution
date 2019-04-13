package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateBlobParams extends js.Object {
  /**
    * The new blob's content.
    */
  var content: java.lang.String
  /**
    * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object GitCreateBlobParams {
  @scala.inline
  def apply(
    content: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    encoding: java.lang.String = null
  ): GitCreateBlobParams = {
    val __obj = js.Dynamic.literal(content = content, owner = owner, repo = repo)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[GitCreateBlobParams]
  }
}

