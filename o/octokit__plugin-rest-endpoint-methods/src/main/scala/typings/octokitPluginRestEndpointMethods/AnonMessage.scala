package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: AnonRequired
  var `object`: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
  var tag: AnonRequired
  var tagger: AnonType
  @JSName("tagger.date")
  var taggerDotdate: AnonType
  @JSName("tagger.email")
  var taggerDotemail: AnonType
  @JSName("tagger.name")
  var taggerDotname: AnonType
  var `type`: AnonEnumRequired
}

object AnonMessage {
  @scala.inline
  def apply(
    message: AnonRequired,
    `object`: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired,
    tag: AnonRequired,
    tagger: AnonType,
    taggerDotdate: AnonType,
    taggerDotemail: AnonType,
    taggerDotname: AnonType,
    `type`: AnonEnumRequired
  ): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagger = tagger.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("tagger.date")(taggerDotdate.asInstanceOf[js.Any])
    __obj.updateDynamic("tagger.email")(taggerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("tagger.name")(taggerDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

