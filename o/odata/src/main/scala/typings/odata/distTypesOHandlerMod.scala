package typings.odata

import typings.odata.distTypesOHandlerMod.BodyType
import typings.odata.distTypesORequestMod.ORequest
import typings.odata.distTypesOdataConfigMod.OdataConfig
import typings.odata.distTypesOdataQueryMod.OdataQuery
import typings.std.Blob
import typings.std.BufferSource
import typings.std.FormData
import typings.std.Response
import typings.std.URL
import typings.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("odata/dist/types/OHandler", JSImport.Namespace)
@js.native
object distTypesOHandlerMod extends js.Object {
  @js.native
  class OHandler protected () extends js.Object {
    def this(config: OdataConfig) = this()
    var config: OdataConfig = js.native
    var getBody: js.Any = js.native
    var getFetch: js.Any = js.native
    /**
      * Determines how many request are outstanding.
      */
    val pending: Double = js.native
    var requests: js.Any = js.native
    /**
      * Does a batch http-batch request. All request in that sequent are send via one
      * physically request and afterwards parsed to separate data chunks.
      *
      * @param query The URLSearchParams that are added to the question mark on the url.
      *              That are usually the odata queries like $filter, $top, etc...
      */
    def batch(): js.Promise[_] = js.native
    def batch(query: OdataQuery): js.Promise[_] = js.native
    /**
      * Deletes a resource from the endpoint.
      *
      * @param resource The resource to delete e.g. People/1
      */
    def delete(): this.type = js.native
    def delete(resource: String): this.type = js.native
    /**
      * Request all requests in sequent. Does simply return a Response or Response[]
      * without any data parsing applied.
      *
      * @param query The URLSearchParams that are added to the question mark on the url.
      *              That are usually the odata queries like $filter, $top, etc...
      */
    def fetch(): js.Promise[Response | js.Array[Response]] = js.native
    def fetch(query: OdataQuery): js.Promise[Response | js.Array[Response]] = js.native
    /**
      * Gets the data from the endpoint + resource url.
      *
      * @param resource The resource to request e.g. People/$value.
      */
    def get(): this.type = js.native
    def get(resource: String): this.type = js.native
    /**
      * Returns a URL based on the rootURL + the given resource
      * @param resource The resource to join.
      */
    def getUrl(resource: String): URL = js.native
    /**
      * Patch data to an endpoint + resource.
      *
      * @param resource The resource to patch to.
      * @param body The data to patch.
      */
    def patch(resource: String, body: BodyType): this.type = js.native
    /**
      * Post data to an endpoint + resource.
      *
      * @param resource The resource to post to.
      * @param body The data to post.
      */
    def post(resource: String, body: BodyType): this.type = js.native
    /**
      * Put data to an endpoint + resource.
      *
      * @param resource The resource to put to.
      * @param body The data to put.
      */
    def put(resource: String, body: BodyType): this.type = js.native
    /**
      * Does a fetch request to the given endpoint and request
      * all resources in sequent. Tries to parse the result logical
      * so that no further processing is used. If the result is only one
      * entity a object is returned, otherwise a array of objects.
      *
      * @example
      * ```typescript
      *  const russell = await o('https://services.odata.org/TripPinRESTierService/')
      *  .get('People('russellwhyte')
      *  .query();
      *
      *  console.log(russell); // shows: { FirstName: "Russell", LastName: "Whyte" [...] }
      * ```
      *
      * If the request fails with an error code higher then 400 it throws the
      * Response:
      *
      * @example
      * ```typescript
      *  try {
      *    const unknown = await o('https://services.odata.org/TripPinRESTierService/')
      *      .get('People('unknown')
      *      .query();
      *  } catch(res) { // Response
      *    console.log(res.status); // 404
      *  }
      * ```
      *
      * @param query The URLSearchParams that are added to the question mark on the url.
      *              That are usually the odata queries like $filter, $top, etc...
      * @returns Either an array or a object with the given entities. If multiple
      *          resources are fetched, this method returns a array of array/object. If there
      *          is no content (e.g. for delete) this method returns the Response
      */
    def query(): js.Promise[_] = js.native
    def query(query: OdataQuery): js.Promise[_] = js.native
    /**
      * Use that method to add any kind of request (e.g. a head request) to
      * the execution list.
      *
      * @example
      * ```typescript
      *   const req = new ORequest('http://full.url/healt', { method: 'HEAD'});
      *   const res = await o('http://another.url').request(req).fetch();
      *   console.log(res.status); // e.g. 200 from http://full.url/healt
      * ```
      * @param req The request to add.
      */
    def request(req: ORequest): Unit = js.native
  }
  
  type BodyType = Blob | BufferSource | FormData | URLSearchParams | String | js.Object
}

