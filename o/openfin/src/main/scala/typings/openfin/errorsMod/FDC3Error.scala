package typings.openfin.errorsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/errors", "FDC3Error")
@js.native
class FDC3Error protected () extends Error {
  def this(code: String, message: String) = this()
  /**
    * A string from one of [[ApplicationError]], [[ChannelError]], [[ConnectionError]], [[ResolveError]] or [[SendContextError]].
    *
    * Future versions of the service may add additional error codes. Applications should allow for the possibility of
    * error codes that do not exist in the above enumerations.
    */
  var code: String = js.native
}

