package typings.mimicResponse

import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mimic-response", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  Mimic a [Node.js HTTP response stream](https://nodejs.org/api/http.html#http_class_http_incomingmessage)
  Makes `toStream` include the properties from `fromStream`.
  @param fromStream - The stream to copy the properties from.
  @param toStream - The stream to copy the properties to.
  @return The same object as `toStream`.
  */
  def apply[T /* <: ReadableStream */](
     // eslint-disable-line @typescript-eslint/prefer-readonly-parameter-types
  fromStream: IncomingMessage,
    toStream: T
  ): T with IncomingMessage = js.native
}
