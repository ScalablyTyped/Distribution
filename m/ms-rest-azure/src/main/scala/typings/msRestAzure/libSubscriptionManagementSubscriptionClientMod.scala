package typings.msRestAzure

import typings.msRest.mod.ServiceClientCredentials
import typings.msRest.mod.ServiceClientOptions
import typings.msRestAzure.libSubscriptionManagementOperationsMod.Subscriptions
import typings.msRestAzure.libSubscriptionManagementOperationsMod.Tenants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSubscriptionManagementSubscriptionClientMod {
  
  @JSImport("ms-rest-azure/lib/subscriptionManagement/subscriptionClient", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SubscriptionClient {
    /**
      * Initializes a new instance of the SubscriptionClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {string} [baseUri] - The base URI of the service.
      *
      * @param {object} [options] - The parameter options
      *
      * @param {Array} [options.filters] - Filters to be added to the request pipeline
      *
      * @param {object} [options.requestOptions] - Options for the underlying request object
      * {@link https://github.com/request/request#requestoptions-callback Options doc}
      *
      * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
      *
      * @param {string} [options.apiVersion] - The API version to use for the operation.
      *
      * @param {string} [options.acceptLanguage] - Gets or sets the preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String, options: ServiceClientOptions) = this()
    def this(credentials: ServiceClientCredentials, baseUri: Unit, options: ServiceClientOptions) = this()
    
    /* CompleteClass */
    var acceptLanguage: String = js.native
    
    /* CompleteClass */
    var apiVersion: String = js.native
    
    /* CompleteClass */
    var credentials: ServiceClientCredentials = js.native
    
    /* CompleteClass */
    var generateClientRequestId: Boolean = js.native
    
    /* CompleteClass */
    var longRunningOperationRetryTimeout: Double = js.native
    
    // Operation groups
    /* CompleteClass */
    var subscriptions: Subscriptions = js.native
    
    /* CompleteClass */
    var tenants: Tenants = js.native
  }
  
  trait SubscriptionClient extends StObject {
    
    var acceptLanguage: String
    
    var apiVersion: String
    
    var credentials: ServiceClientCredentials
    
    var generateClientRequestId: Boolean
    
    var longRunningOperationRetryTimeout: Double
    
    // Operation groups
    var subscriptions: Subscriptions
    
    var tenants: Tenants
  }
  object SubscriptionClient {
    
    inline def apply(
      acceptLanguage: String,
      apiVersion: String,
      credentials: ServiceClientCredentials,
      generateClientRequestId: Boolean,
      longRunningOperationRetryTimeout: Double,
      subscriptions: Subscriptions,
      tenants: Tenants
    ): SubscriptionClient = {
      val __obj = js.Dynamic.literal(acceptLanguage = acceptLanguage.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], generateClientRequestId = generateClientRequestId.asInstanceOf[js.Any], longRunningOperationRetryTimeout = longRunningOperationRetryTimeout.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], tenants = tenants.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionClient]
    }
    
    extension [Self <: SubscriptionClient](x: Self) {
      
      inline def setAcceptLanguage(value: String): Self = StObject.set(x, "acceptLanguage", value.asInstanceOf[js.Any])
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setCredentials(value: ServiceClientCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setGenerateClientRequestId(value: Boolean): Self = StObject.set(x, "generateClientRequestId", value.asInstanceOf[js.Any])
      
      inline def setLongRunningOperationRetryTimeout(value: Double): Self = StObject.set(x, "longRunningOperationRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setSubscriptions(value: Subscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setTenants(value: Tenants): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
    }
  }
}
