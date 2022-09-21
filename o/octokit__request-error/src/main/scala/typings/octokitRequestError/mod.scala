package typings.octokitRequestError

import typings.octokitRequestError.octokitRequestErrorStrings.HttpError
import typings.octokitRequestError.typesMod.RequestErrorOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/request-error", "RequestError")
  @js.native
  open class RequestError protected ()
    extends StObject
       with Error {
    def this(message: String, statusCode: Double, options: RequestErrorOptions) = this()
    
    /**
      * http status code
      *
      * @deprecated `error.code` is deprecated in favor of `error.status`
      */
    var code: Double = js.native
    
    /**
      * error response headers
      *
      * @deprecated `error.headers` is deprecated in favor of `error.response.headers`
      */
    var headers: ResponseHeaders = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_RequestError: HttpError = js.native
    
    /**
      * Request options that lead to the error.
      */
    var request: RequestOptions = js.native
    
    /**
      * Response object if a response was received
      */
    var response: js.UndefOr[OctokitResponse[Any, Double]] = js.native
    
    /**
      * http status code
      */
    var status: Double = js.native
  }
}
