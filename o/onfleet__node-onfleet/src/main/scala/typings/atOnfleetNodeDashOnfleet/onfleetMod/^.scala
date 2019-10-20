package typings.atOnfleetNodeDashOnfleet.onfleetMod

import typings.atOnfleetNodeDashOnfleet.Anon_BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@onfleet/node-onfleet/onfleet", JSImport.Namespace)
@js.native
class ^ protected () extends Onfleet {
  def this(api_key: String) = this()
  /* CompleteClass */
  override var admins: typings.atOnfleetNodeDashOnfleet.resourcesAdministratorsMod.^ = js.native
  /* CompleteClass */
  override var api: Anon_BaseUrl = js.native
  /* CompleteClass */
  override var apiKey: String = js.native
  /* CompleteClass */
  override var containers: typings.atOnfleetNodeDashOnfleet.resourcesContainersMod.^ = js.native
  /* CompleteClass */
  override var destinations: typings.atOnfleetNodeDashOnfleet.resourcesDestinationsMod.^ = js.native
  /* CompleteClass */
  override var hubs: typings.atOnfleetNodeDashOnfleet.resourcesHubsMod.^ = js.native
  /* CompleteClass */
  override var organization: typings.atOnfleetNodeDashOnfleet.resourcesOrganizationMod.^ = js.native
  /* CompleteClass */
  override var recipients: typings.atOnfleetNodeDashOnfleet.resourcesRecipientsMod.^ = js.native
  /* CompleteClass */
  override var tasks: typings.atOnfleetNodeDashOnfleet.resourcesTasksMod.^ = js.native
  /* CompleteClass */
  override var teams: typings.atOnfleetNodeDashOnfleet.resourcesTeamsMod.^ = js.native
  /* CompleteClass */
  override var webhooks: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.^ = js.native
  /* CompleteClass */
  override var workers: typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod.^ = js.native
  /* CompleteClass */
  override def verifyKey(): Boolean = js.native
}

