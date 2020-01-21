package typings.onfleetNodeOnfleet.onfleetMod

import typings.onfleetNodeOnfleet.AnonBaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@onfleet/node-onfleet/onfleet", JSImport.Namespace)
@js.native
class ^ protected () extends Onfleet {
  def this(api_key: String) = this()
  /* CompleteClass */
  override var admins: typings.onfleetNodeOnfleet.administratorsMod.^ = js.native
  /* CompleteClass */
  override var api: AnonBaseUrl = js.native
  /* CompleteClass */
  override var apiKey: String = js.native
  /* CompleteClass */
  override var containers: typings.onfleetNodeOnfleet.containersMod.^ = js.native
  /* CompleteClass */
  override var destinations: typings.onfleetNodeOnfleet.destinationsMod.^ = js.native
  /* CompleteClass */
  override var hubs: typings.onfleetNodeOnfleet.hubsMod.^ = js.native
  /* CompleteClass */
  override var organization: typings.onfleetNodeOnfleet.organizationMod.^ = js.native
  /* CompleteClass */
  override var recipients: typings.onfleetNodeOnfleet.recipientsMod.^ = js.native
  /* CompleteClass */
  override var tasks: typings.onfleetNodeOnfleet.tasksMod.^ = js.native
  /* CompleteClass */
  override var teams: typings.onfleetNodeOnfleet.teamsMod.^ = js.native
  /* CompleteClass */
  override var webhooks: typings.onfleetNodeOnfleet.webhooksMod.^ = js.native
  /* CompleteClass */
  override var workers: typings.onfleetNodeOnfleet.workersMod.^ = js.native
  /* CompleteClass */
  override def verifyKey(): Boolean = js.native
}

