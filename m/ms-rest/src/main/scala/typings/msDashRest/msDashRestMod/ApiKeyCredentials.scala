package typings.msDashRest.msDashRestMod

import typings.msDashRest.Fn_Err
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest", "ApiKeyCredentials")
@js.native
/**
  * @constructor
  * @param {object} options   Specifies the options to be provided for auth. Either header or query needs to be provided.
  * @param {object} [inHeader]  A key value pair of the header parameters that need to be applied to the request.
  * @param {object} [inQuery]   A key value pair of the query parameters that need to be applied to the request.
  */
class ApiKeyCredentials () extends ServiceClientCredentials {
  def this(options: ApiKeyCredentialOptions) = this()
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  /* CompleteClass */
  override def signRequest(webResource: WebResource, callback: Fn_Err): Unit = js.native
}

