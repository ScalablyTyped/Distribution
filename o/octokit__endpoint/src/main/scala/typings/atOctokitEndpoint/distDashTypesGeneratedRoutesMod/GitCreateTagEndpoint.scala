package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagEndpoint extends js.Object {
  var message: String
  var `object`: String
  var owner: String
  var repo: String
  var tag: String
  var tagger: js.UndefOr[js.Object] = js.undefined
  var `tagger.date`: js.UndefOr[String] = js.undefined
  var `tagger.email`: js.UndefOr[String] = js.undefined
  var `tagger.name`: js.UndefOr[String] = js.undefined
  var `type`: String
}

object GitCreateTagEndpoint {
  @scala.inline
  def apply(
    message: String,
    `object`: String,
    owner: String,
    repo: String,
    tag: String,
    `type`: String,
    tagger: js.Object = null,
    `tagger.date`: String = null,
    `tagger.email`: String = null,
    `tagger.name`: String = null
  ): GitCreateTagEndpoint = {
    val __obj = js.Dynamic.literal(message = message, owner = owner, repo = repo, tag = tag)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (tagger != null) __obj.updateDynamic("tagger")(tagger)
    if (`tagger.date` != null) __obj.updateDynamic("tagger.date")(`tagger.date`)
    if (`tagger.email` != null) __obj.updateDynamic("tagger.email")(`tagger.email`)
    if (`tagger.name` != null) __obj.updateDynamic("tagger.name")(`tagger.name`)
    __obj.asInstanceOf[GitCreateTagEndpoint]
  }
}

