package typings.postmark

import typings.postmark.errorsMod.PostmarkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/ErrorHandler", JSImport.Namespace)
@js.native
object errorHandlerMod extends js.Object {
  @js.native
  class ErrorHandler () extends js.Object {
    /**
      * Build general Postmark error.
      *
      * @param errorMessage - error message that needs to be identified and transformed to proper Postmark error.
      *
      * @returns properly formatted Postmark error.
      */
    var buildGeneralError: js.Any = js.native
    /**
      * Build Postmark error based on HTTP request status.
      *
      * @param error - http request library error, that will be transformed to Postmark error.
      *
      * @returns properly formatted Postmark error.
      */
    var buildStatusError: js.Any = js.native
    /**
      * Process callback function for HTTP request.
      *
      * @param error - error that needs to be identified and transformed to proper Postmark error.
      *
      * @returns properly formatted Postmark error.
      */
    def generateError(error: js.Any): PostmarkError = js.native
  }
  
}

