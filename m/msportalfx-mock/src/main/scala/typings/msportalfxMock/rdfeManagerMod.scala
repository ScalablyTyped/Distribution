package typings.msportalfxMock

import typings.msportalfxMock.html5Mod.StringMap
import typings.msportalfxMock.rdfeCertificateMod.SubscriptionCertificate
import typings.msportalfxMock.rdfeSubscriptionMod.Subscription
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdfeManagerMod {
  
  object RdfeManager {
    
    /**
      * The mock rdfe manager
      */
    @JSImport("msportalfx-mock/lib/src/RdfeProxy/rdfeManager", "RdfeManager.Manager")
    @js.native
    class Manager () extends StObject {
      
      /**
        * The Add Management Certificate operation adds a management certificate to the specified subscription.
        *
        * @param subscriptionId The subscription GUID/ID.
        * @param certificate The SubscriptionCertificate to add.
        * @returns false if the subscription doesn't exist,
        *          false if the certificate already exists for the given subscription id,
        *          true if the certificate was successfully added.
        */
      def addManagementCertificate(subscriptionId: String, subscriptionCertificate: SubscriptionCertificate): Boolean = js.native
      
      /* private */ var data: js.Any = js.native
      
      /**
        * The Delete Management Certificate operation deletes a certificate from the specified subscription.
        *
        * @param subscriptionId The subscription GUID/ID.
        * @param thumbprint The thumbprint of the SubscriptionCertificate to delete.
        * @returns false if the subscription doesn't exist,
        *          false if the certificate doiesn't exist for the given subscription id,
        *          true if the certificate was successfully deleted.
        */
      def deleteManagementCertificate(subscriptionId: String, thumbprint: String): Boolean = js.native
      
      /**
        * The Get Management Certificate operation retrieves information about the management certificate with the specified thumbprint.
        *
        * @param subscriptionId The subscription GUID/ID.
        * @param thumbprint The thumbprint of the SubscriptionCertificate to retrieve.
        */
      def getManagementCertificate(subscriptionId: String, thumbprint: String): SubscriptionCertificate = js.native
      
      /**
        * Gets a subscription based on id from the mock data.
        *
        * @param subscriptionId The subscription GUID/ID.
        */
      def getSubscription(subscriptionId: String): Subscription = js.native
      
      /**
        * Gets the list of mock subscriptions.
        */
      def getSubscriptions(): js.Array[Subscription] = js.native
      
      /**
        * Initializes the mock data. Call this with empty data to reset state.
        *
        * @param data The mock data.
        * @return A promise that is resolved when the data is initialized.
        */
      def initializeMockData(data: MockData): Promise[js.Any] = js.native
      
      /**
        * The List Management Certificates operation returns basic information about all of the management certificates that are associated with the specified subscription.
        *
        * @param subscriptionId The subscription GUID/ID.
        */
      def listManagementCertificates(subscriptionId: String): js.Array[SubscriptionCertificate] = js.native
    }
    
    /**
      * Defines structore of mock data.
      */
    trait MockData extends StObject {
      
      /**
        * A map of SubscriptionId keys to SubscriptionCertificate lists which will be use to initialize the RdfeManager.
        */
      var certificates: js.UndefOr[StringMap[js.Array[SubscriptionCertificate]]] = js.undefined
      
      /**
        * The list of subscriptions which will be available for Management Certificate operations.
        */
      var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
    }
    object MockData {
      
      inline def apply(): MockData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MockData]
      }
      
      extension [Self <: MockData](x: Self) {
        
        inline def setCertificates(value: StringMap[js.Array[SubscriptionCertificate]]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
        
        inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
        
        inline def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
        
        inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
        
        inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
      }
    }
  }
}
