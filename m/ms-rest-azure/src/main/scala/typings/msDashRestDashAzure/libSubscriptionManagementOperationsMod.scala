package typings.msDashRestDashAzure

import typings.msDashRest.msDashRestMod.HttpOperationResponse
import typings.msDashRest.msDashRestMod.ServiceCallback
import typings.msDashRestDashAzure.libSubscriptionManagementModelsMod.LocationListResult
import typings.msDashRestDashAzure.libSubscriptionManagementModelsMod.Subscription
import typings.msDashRestDashAzure.libSubscriptionManagementModelsMod.SubscriptionListResult
import typings.msDashRestDashAzure.libSubscriptionManagementModelsMod.TenantListResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure/lib/subscriptionManagement/operations", JSImport.Namespace)
@js.native
object libSubscriptionManagementOperationsMod extends js.Object {
  @js.native
  trait Subscriptions extends js.Object {
    /**
      * Gets details about a specified subscription.
      *
      * @param {string} subscriptionId The ID of the target subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {Subscription} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Subscription} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Subscription} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(subscriptionId: String): js.Promise[Subscription] = js.native
    def get(subscriptionId: String, callback: ServiceCallback[Subscription]): Unit = js.native
    def get(subscriptionId: String, options: Anon_CustomHeaders): js.Promise[Subscription] = js.native
    def get(subscriptionId: String, options: Anon_CustomHeaders, callback: ServiceCallback[Subscription]): Unit = js.native
    /**
      * Gets details about a specified subscription.
      *
      * @param {string} subscriptionId The ID of the target subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Subscription>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(subscriptionId: String): js.Promise[HttpOperationResponse[Subscription]] = js.native
    def getWithHttpOperationResponse(subscriptionId: String, options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[Subscription]] = js.native
    /**
      * Gets all subscriptions for a tenant.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {SubscriptionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {SubscriptionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link SubscriptionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[SubscriptionListResult] = js.native
    def list(callback: ServiceCallback[SubscriptionListResult]): Unit = js.native
    def list(options: Anon_CustomHeaders): js.Promise[SubscriptionListResult] = js.native
    def list(options: Anon_CustomHeaders, callback: ServiceCallback[SubscriptionListResult]): Unit = js.native
    /**
      * @summary Gets all available geo-locations.
      *
      * This operation provides all the locations that are available for resource
      * providers; however, each resource provider may support a subset of this
      * list.
      *
      * @param {string} subscriptionId The ID of the target subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {LocationListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {LocationListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link LocationListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listLocations(subscriptionId: String): js.Promise[LocationListResult] = js.native
    def listLocations(subscriptionId: String, callback: ServiceCallback[LocationListResult]): Unit = js.native
    def listLocations(subscriptionId: String, options: Anon_CustomHeaders): js.Promise[LocationListResult] = js.native
    def listLocations(subscriptionId: String, options: Anon_CustomHeaders, callback: ServiceCallback[LocationListResult]): Unit = js.native
    /**
      * @summary Gets all available geo-locations.
      *
      * This operation provides all the locations that are available for resource
      * providers; however, each resource provider may support a subset of this
      * list.
      *
      * @param {string} subscriptionId The ID of the target subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<LocationListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listLocationsWithHttpOperationResponse(subscriptionId: String): js.Promise[HttpOperationResponse[LocationListResult]] = js.native
    def listLocationsWithHttpOperationResponse(subscriptionId: String, options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[LocationListResult]] = js.native
    /**
      * Gets all subscriptions for a tenant.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {SubscriptionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {SubscriptionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link SubscriptionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[SubscriptionListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[SubscriptionListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: Anon_CustomHeaders): js.Promise[SubscriptionListResult] = js.native
    def listNext(
      nextPageLink: String,
      options: Anon_CustomHeaders,
      callback: ServiceCallback[SubscriptionListResult]
    ): Unit = js.native
    /**
      * Gets all subscriptions for a tenant.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<SubscriptionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[SubscriptionListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[SubscriptionListResult]] = js.native
    /**
      * Gets all subscriptions for a tenant.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<SubscriptionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[SubscriptionListResult]] = js.native
    def listWithHttpOperationResponse(options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[SubscriptionListResult]] = js.native
  }
  
  @js.native
  trait Tenants extends js.Object {
    /**
      * Gets the tenants for your account.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {TenantListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {TenantListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link TenantListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[TenantListResult] = js.native
    def list(callback: ServiceCallback[TenantListResult]): Unit = js.native
    def list(options: Anon_CustomHeaders): js.Promise[TenantListResult] = js.native
    def list(options: Anon_CustomHeaders, callback: ServiceCallback[TenantListResult]): Unit = js.native
    /**
      * Gets the tenants for your account.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {TenantListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {TenantListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link TenantListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[TenantListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[TenantListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: Anon_CustomHeaders): js.Promise[TenantListResult] = js.native
    def listNext(nextPageLink: String, options: Anon_CustomHeaders, callback: ServiceCallback[TenantListResult]): Unit = js.native
    /**
      * Gets the tenants for your account.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<TenantListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[TenantListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[TenantListResult]] = js.native
    /**
      * Gets the tenants for your account.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<TenantListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[TenantListResult]] = js.native
    def listWithHttpOperationResponse(options: Anon_CustomHeaders): js.Promise[HttpOperationResponse[TenantListResult]] = js.native
  }
  
}

