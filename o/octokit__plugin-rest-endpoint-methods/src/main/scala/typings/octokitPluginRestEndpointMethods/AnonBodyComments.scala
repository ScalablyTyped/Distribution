package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyComments extends js.Object {
  var body: AnonType
  var comments: AnonType
  @JSName("comments[].body")
  var `comments[]Dotbody`: AnonRequired
  @JSName("comments[].path")
  var `comments[]Dotpath`: AnonRequired
  @JSName("comments[].position")
  var `comments[]Dotposition`: AnonRequired
  var commit_id: AnonType
  var event: AnonEnum
  var number: AnonAlias
  var owner: AnonRequired
  var pull_number: AnonRequired
  var repo: AnonRequired
}

object AnonBodyComments {
  @scala.inline
  def apply(
    body: AnonType,
    comments: AnonType,
    `comments[]Dotbody`: AnonRequired,
    `comments[]Dotpath`: AnonRequired,
    `comments[]Dotposition`: AnonRequired,
    commit_id: AnonType,
    event: AnonEnum,
    number: AnonAlias,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired
  ): AnonBodyComments = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].body")(`comments[]Dotbody`.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].path")(`comments[]Dotpath`.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].position")(`comments[]Dotposition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyComments]
  }
}

