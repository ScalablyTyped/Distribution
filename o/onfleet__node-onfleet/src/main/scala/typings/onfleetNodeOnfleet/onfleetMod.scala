package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.BaseUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onfleetMod {
  
  @JSImport("@onfleet/node-onfleet/onfleet", JSImport.Namespace)
  @js.native
  class ^ protected () extends Onfleet {
    def this(api_key: String) = this()
  }
  
  @js.native
  trait Onfleet extends StObject {
    
    var admins: typings.onfleetNodeOnfleet.administratorsMod.^ = js.native
    
    var api: BaseUrl = js.native
    
    var apiKey: String = js.native
    
    var containers: typings.onfleetNodeOnfleet.containersMod.^ = js.native
    
    var destinations: typings.onfleetNodeOnfleet.destinationsMod.^ = js.native
    
    var hubs: typings.onfleetNodeOnfleet.hubsMod.^ = js.native
    
    var organization: typings.onfleetNodeOnfleet.organizationMod.^ = js.native
    
    var recipients: typings.onfleetNodeOnfleet.recipientsMod.^ = js.native
    
    var tasks: typings.onfleetNodeOnfleet.tasksMod.^ = js.native
    
    var teams: typings.onfleetNodeOnfleet.teamsMod.^ = js.native
    
    def verifyKey(): js.Promise[Boolean] = js.native
    
    var webhooks: typings.onfleetNodeOnfleet.webhooksMod.^ = js.native
    
    var workers: typings.onfleetNodeOnfleet.workersMod.^ = js.native
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
    
    @scala.inline
    implicit class OnfleetMutableBuilder[Self <: Onfleet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmins(value: typings.onfleetNodeOnfleet.administratorsMod.^): Self = StObject.set(x, "admins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi(value: BaseUrl): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainers(value: typings.onfleetNodeOnfleet.containersMod.^): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinations(value: typings.onfleetNodeOnfleet.destinationsMod.^): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubs(value: typings.onfleetNodeOnfleet.hubsMod.^): Self = StObject.set(x, "hubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization(value: typings.onfleetNodeOnfleet.organizationMod.^): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipients(value: typings.onfleetNodeOnfleet.recipientsMod.^): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasks(value: typings.onfleetNodeOnfleet.tasksMod.^): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeams(value: typings.onfleetNodeOnfleet.teamsMod.^): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyKey(value: () => js.Promise[Boolean]): Self = StObject.set(x, "verifyKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWebhooks(value: typings.onfleetNodeOnfleet.webhooksMod.^): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkers(value: typings.onfleetNodeOnfleet.workersMod.^): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    }
  }
}
