package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.blob
import typings.octokitRest.octokitRestStrings.commit
import typings.octokitRest.octokitRestStrings.tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagParams extends js.Object {
  /**
    * The tag message.
    */
  var message: String
  /**
    * The SHA of the git object this is tagging.
    */
  var `object`: String
  var owner: String
  var repo: String
  /**
    * The tag's name. This is typically a version (e.g., "v0.0.1").
    */
  var tag: String
  /**
    * An object with information about the individual creating the tag.
    */
  var tagger: js.UndefOr[GitCreateTagParamsTagger] = js.undefined
  /**
    * The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.
    */
  var `type`: commit | tree | blob
}

object GitCreateTagParams {
  @scala.inline
  def apply(
    message: String,
    `object`: String,
    owner: String,
    repo: String,
    tag: String,
    `type`: commit | tree | blob,
    tagger: GitCreateTagParamsTagger = null
  ): GitCreateTagParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tagger != null) __obj.updateDynamic("tagger")(tagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTagParams]
  }
}

