package typings.postmark

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/client/Errors", JSImport.Namespace)
@js.native
object distClientModelsClientErrorsMod extends js.Object {
  @js.native
  class ApiInputError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class HttpError protected () extends PostmarkError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class InternalServerError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class InvalidAPIKeyError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class PostmarkError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: Double, statusCode: Double) = this()
    var code: Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var statusCode: Double = js.native
    /* protected */ def setUpStackTrace(): Unit = js.native
  }
  
  @js.native
  class ServiceUnavailablerError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class UnknownError protected () extends HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
}

