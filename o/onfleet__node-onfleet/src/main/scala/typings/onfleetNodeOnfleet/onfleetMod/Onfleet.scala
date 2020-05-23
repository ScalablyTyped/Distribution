package typings.onfleetNodeOnfleet.onfleetMod

import typings.onfleetNodeOnfleet.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Onfleet extends js.Object {
  var admins: typings.onfleetNodeOnfleet.administratorsMod.^
  var api: BaseUrl
  var apiKey: String
  var containers: typings.onfleetNodeOnfleet.containersMod.^
  var destinations: typings.onfleetNodeOnfleet.destinationsMod.^
  var hubs: typings.onfleetNodeOnfleet.hubsMod.^
  var organization: typings.onfleetNodeOnfleet.organizationMod.^
  var recipients: typings.onfleetNodeOnfleet.recipientsMod.^
  var tasks: typings.onfleetNodeOnfleet.tasksMod.^
  var teams: typings.onfleetNodeOnfleet.teamsMod.^
  var webhooks: typings.onfleetNodeOnfleet.webhooksMod.^
  var workers: typings.onfleetNodeOnfleet.workersMod.^
  def verifyKey(): js.Promise[Boolean]
}

object Onfleet {
  @scala.inline
  def apply(
    admins: typings.onfleetNodeOnfleet.administratorsMod.^,
    api: BaseUrl,
    apiKey: String,
    containers: typings.onfleetNodeOnfleet.containersMod.^,
    destinations: typings.onfleetNodeOnfleet.destinationsMod.^,
    hubs: typings.onfleetNodeOnfleet.hubsMod.^,
    organization: typings.onfleetNodeOnfleet.organizationMod.^,
    recipients: typings.onfleetNodeOnfleet.recipientsMod.^,
    tasks: typings.onfleetNodeOnfleet.tasksMod.^,
    teams: typings.onfleetNodeOnfleet.teamsMod.^,
    verifyKey: () => js.Promise[Boolean],
    webhooks: typings.onfleetNodeOnfleet.webhooksMod.^,
    workers: typings.onfleetNodeOnfleet.workersMod.^
  ): Onfleet = {
    val __obj = js.Dynamic.literal(admins = admins.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], apiKey = apiKey.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], hubs = hubs.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], verifyKey = js.Any.fromFunction0(verifyKey), webhooks = webhooks.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Onfleet]
  }
}

