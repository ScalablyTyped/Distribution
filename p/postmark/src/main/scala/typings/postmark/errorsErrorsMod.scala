package typings.postmark

import typings.postmark.anon.InactiveRecipient
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsErrorsMod {
  
  @JSImport("postmark/dist/client/errors/Errors", "ApiInputError")
  @js.native
  open class ApiInputError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  /* static members */
  object ApiInputError {
    
    @JSImport("postmark/dist/client/errors/Errors", "ApiInputError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("postmark/dist/client/errors/Errors", "ApiInputError.ERROR_CODES")
    @js.native
    def ERROR_CODES: InactiveRecipient = js.native
    inline def ERROR_CODES_=(x: InactiveRecipient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODES")(x.asInstanceOf[js.Any])
    
    inline def buildSpecificError(message: String, code: Double, statusCode: Double): ApiInputError = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSpecificError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[ApiInputError]
  }
  
  @JSImport("postmark/dist/client/errors/Errors", "HttpError")
  @js.native
  open class HttpError protected () extends PostmarkError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors/Errors", "InactiveRecipientsError")
  @js.native
  open class InactiveRecipientsError protected () extends ApiInputError {
    def this(message: String, code: Double, statusCode: Double) = this()
    
    var recipients: js.Array[String] = js.native
  }
  /* static members */
  object InactiveRecipientsError {
    
    @JSImport("postmark/dist/client/errors/Errors", "InactiveRecipientsError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("postmark/dist/client/errors/Errors", "InactiveRecipientsError.inactiveRecipientsPatterns")
    @js.native
    def inactiveRecipientsPatterns: js.Array[js.RegExp] = js.native
    inline def inactiveRecipientsPatterns_=(x: js.Array[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveRecipientsPatterns")(x.asInstanceOf[js.Any])
    
    inline def parseInactiveRecipients(message: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInactiveRecipients")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("postmark/dist/client/errors/Errors", "InternalServerError")
  @js.native
  open class InternalServerError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors/Errors", "InvalidAPIKeyError")
  @js.native
  open class InvalidAPIKeyError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors/Errors", "InvalidEmailRequestError")
  @js.native
  open class InvalidEmailRequestError protected () extends ApiInputError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors/Errors", "PostmarkError")
  @js.native
  open class PostmarkError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: Double, statusCode: Double) = this()
    def this(message: String, code: Unit, statusCode: Double) = this()
    
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* protected */ def setUpStackTrace(): Unit = js.native
    
    var statusCode: Double = js.native
  }
  
  @JSImport("postmark/dist/client/errors/Errors", "RateLimitExceededError")
  @js.native
  open class RateLimitExceededError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors/Errors", "ServiceUnavailablerError")
  @js.native
  open class ServiceUnavailablerError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark/dist/client/errors/Errors", "UnknownError")
  @js.native
  open class UnknownError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
}
