package typings.atOctokitRequestDashError

import typings.atOctokitRequestDashError.atOctokitRequestDashErrorStrings.HttpError
import typings.atOctokitRequestDashError.distDashTypesTypesMod.RequestErrorOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/request-error", JSImport.Namespace)
@js.native
object atOctokitRequestDashErrorMod extends js.Object {
  @js.native
  class RequestError protected () extends Error {
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
    var headers: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResponseHeaders */ js.Any = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("name")
    var name_RequestError: HttpError = js.native
    /**
      * Request options that lead to the error.
      */
    var request: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RequestOptions */ js.Any = js.native
    /**
      * http status code
      */
    var status: Double = js.native
  }
  
}

