package typings.atOnfleetNodeDashOnfleet.onfleetMod

import typings.atOnfleetNodeDashOnfleet.Anon_BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Onfleet extends js.Object {
  var admins: typings.atOnfleetNodeDashOnfleet.resourcesAdministratorsMod.^
  var api: Anon_BaseUrl
  var apiKey: String
  var containers: typings.atOnfleetNodeDashOnfleet.resourcesContainersMod.^
  var destinations: typings.atOnfleetNodeDashOnfleet.resourcesDestinationsMod.^
  var hubs: typings.atOnfleetNodeDashOnfleet.resourcesHubsMod.^
  var organization: typings.atOnfleetNodeDashOnfleet.resourcesOrganizationMod.^
  var recipients: typings.atOnfleetNodeDashOnfleet.resourcesRecipientsMod.^
  var tasks: typings.atOnfleetNodeDashOnfleet.resourcesTasksMod.^
  var teams: typings.atOnfleetNodeDashOnfleet.resourcesTeamsMod.^
  var webhooks: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.^
  var workers: typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod.^
  def verifyKey(): Boolean
}

object Onfleet {
  @scala.inline
  def apply(
    admins: typings.atOnfleetNodeDashOnfleet.resourcesAdministratorsMod.^,
    api: Anon_BaseUrl,
    apiKey: String,
    containers: typings.atOnfleetNodeDashOnfleet.resourcesContainersMod.^,
    destinations: typings.atOnfleetNodeDashOnfleet.resourcesDestinationsMod.^,
    hubs: typings.atOnfleetNodeDashOnfleet.resourcesHubsMod.^,
    organization: typings.atOnfleetNodeDashOnfleet.resourcesOrganizationMod.^,
    recipients: typings.atOnfleetNodeDashOnfleet.resourcesRecipientsMod.^,
    tasks: typings.atOnfleetNodeDashOnfleet.resourcesTasksMod.^,
    teams: typings.atOnfleetNodeDashOnfleet.resourcesTeamsMod.^,
    verifyKey: () => Boolean,
    webhooks: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.^,
    workers: typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod.^
  ): Onfleet = {
    val __obj = js.Dynamic.literal(admins = admins.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], apiKey = apiKey.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], hubs = hubs.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], verifyKey = js.Any.fromFunction0(verifyKey), webhooks = webhooks.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Onfleet]
  }
}

