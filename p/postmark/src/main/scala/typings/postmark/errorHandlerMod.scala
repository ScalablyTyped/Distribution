package typings.postmark

import typings.axios.mod.AxiosError
import typings.postmark.errorsMod.PostmarkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorHandlerMod {
  
  @JSImport("postmark/dist/client/ErrorHandler", "ErrorHandler")
  @js.native
  class ErrorHandler () extends StObject {
    
    /**
      * Build Postmark error based on response from http client.
      *
      * @param {AxiosResponse} response - request response used to transform to Postmark error.
      * @return {PostmarkError} - formatted Postmark error
      */
    var buildErrorForResponse: js.Any = js.native
    
    /**
      * Build general Postmark error.
      *
      * @param errorMessage - error message that needs to be identified and transformed to proper Postmark error.
      *
      * @returns properly formatted Postmark error.
      */
    def buildGeneralError(errorMessage: String): PostmarkError = js.native
    
    /**
      * Process callback function for HTTP request.
      *
      * @param error - request error that needs to be transformed to proper Postmark error.
      *
      * @return {PostmarkError} - formatted Postmark error
      */
    def buildRequestError(error: AxiosError[_]): PostmarkError = js.native
    
    /**
      * Build Postmark error based on HTTP request status.
      *
      * @param error - http request library error, that will be transformed to Postmark error.
      *
      * @returns properly formatted Postmark error.
      */
    var buildRequestErrorByStatus: js.Any = js.native
    
    var retrieveDefaultOrValue: js.Any = js.native
  }
}
