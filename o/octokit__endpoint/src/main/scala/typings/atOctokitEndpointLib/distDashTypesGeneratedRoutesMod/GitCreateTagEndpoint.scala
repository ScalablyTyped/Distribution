package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagEndpoint extends js.Object {
  var message: java.lang.String
  var `object`: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
  var tag: java.lang.String
  var tagger: js.UndefOr[js.Object] = js.undefined
  var `tagger.date`: js.UndefOr[java.lang.String] = js.undefined
  var `tagger.email`: js.UndefOr[java.lang.String] = js.undefined
  var `tagger.name`: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object GitCreateTagEndpoint {
  @scala.inline
  def apply(
    message: java.lang.String,
    `object`: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    tag: java.lang.String,
    `type`: java.lang.String,
    tagger: js.Object = null,
    `tagger.date`: java.lang.String = null,
    `tagger.email`: java.lang.String = null,
    `tagger.name`: java.lang.String = null
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

