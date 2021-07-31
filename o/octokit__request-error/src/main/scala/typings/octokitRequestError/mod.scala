package typings.octokitRequestError

import typings.octokitRequestError.octokitRequestErrorStrings.HttpError
import typings.octokitRequestError.typesMod.RequestErrorOptions
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/request-error", "RequestError")
  @js.native
  class RequestError protected ()
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
      */
    var headers: ResponseHeaders = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_RequestError: HttpError = js.native
    
    /**
      * Request options that lead to the error.
      */
    var request: RequestOptions = js.native
    
    /**
      * http status code
      */
    var status: Double = js.native
  }
}
