package typings
package atOctokitRequestDashErrorLib.atOctokitRequestDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/request-error", "RequestError")
@js.native
class RequestError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String, statusCode: scala.Double, options: atOctokitRequestDashErrorLib.distDashTypesTypesMod.RequestErrorOptions) = this()
  /**
    * http status code
    *
    * @deprecated `error.code` is deprecated in favor of `error.status`
    */
  var code: scala.Double = js.native
  /**
    * error response headers
    */
  var headers: atOctokitRequestDashErrorLib.distDashTypesTypesMod.ResponseHeaders = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("name")
  var name_RequestError: atOctokitRequestDashErrorLib.atOctokitRequestDashErrorLibStrings.HttpError = js.native
  /**
    * Request options that lead to the error.
    */
  var request: atOctokitRequestDashErrorLib.distDashTypesTypesMod.RequestOptions = js.native
  /**
    * http status code
    */
  var status: scala.Double = js.native
}

