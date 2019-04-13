package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagParams extends js.Object {
  /**
    * The tag message.
    */
  var message: java.lang.String
  /**
    * The SHA of the git object this is tagging.
    */
  var `object`: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * The tag's name. This is typically a version (e.g., "v0.0.1").
    */
  var tag: java.lang.String
  /**
    * An object with information about the individual creating the tag.
    */
  var tagger: js.UndefOr[GitCreateTagParamsTagger] = js.undefined
  /**
    * The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.
    */
  var `type`: atOctokitRestLib.atOctokitRestLibStrings.commit | atOctokitRestLib.atOctokitRestLibStrings.tree | atOctokitRestLib.atOctokitRestLibStrings.blob
}

object GitCreateTagParams {
  @scala.inline
  def apply(
    message: java.lang.String,
    `object`: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    tag: java.lang.String,
    `type`: atOctokitRestLib.atOctokitRestLibStrings.commit | atOctokitRestLib.atOctokitRestLibStrings.tree | atOctokitRestLib.atOctokitRestLibStrings.blob,
    tagger: GitCreateTagParamsTagger = null
  ): GitCreateTagParams = {
    val __obj = js.Dynamic.literal(message = message, owner = owner, repo = repo, tag = tag)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tagger != null) __obj.updateDynamic("tagger")(tagger)
    __obj.asInstanceOf[GitCreateTagParams]
  }
}

