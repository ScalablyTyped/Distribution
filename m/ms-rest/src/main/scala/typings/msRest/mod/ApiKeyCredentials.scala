package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
