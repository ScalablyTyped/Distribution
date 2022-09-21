package typings.postmark

import typings.postmark.errorsErrorsMod.HttpError
import typings.postmark.errorsErrorsMod.PostmarkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorHandlerMod {
  
  @JSImport("postmark/dist/client/errors/ErrorHandler", "ErrorHandler")
  @js.native
  open class ErrorHandler () extends StObject {
    
    /**
      * Build general Postmark error.
      *
      * @param errorMessage - error message that needs to be identified and transformed to proper Postmark error.
      *
      * @returns properly formatted Postmark error.
      */
    def buildError(errorMessage: String): PostmarkError | HttpError = js.native
    def buildError(errorMessage: String, code: Double): PostmarkError | HttpError = js.native
    def buildError(errorMessage: String, code: Double, statusCode: Double): PostmarkError | HttpError = js.native
    def buildError(errorMessage: String, code: Unit, statusCode: Double): PostmarkError | HttpError = js.native
    
    /**
      * Build Postmark error based on HTTP request status.
      *
      * @param error - http request library error, that will be transformed to Postmark error.
      *
      * @returns properly formatted Postmark error.
      */
    /* private */ var buildErrorByHttpStatusCode: Any = js.native
  }
}
