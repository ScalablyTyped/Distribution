package typings.mimicResponse

import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Mimic a [Node.js HTTP response stream](https://nodejs.org/api/http.html#http_class_http_incomingmessage)
  Makes `toStream` include the properties from `fromStream`.
  @param fromStream - The stream to copy the properties from.
  @param toStream - The stream to copy the properties to.
  @return The same object as `toStream`.
  */
  @scala.inline
  def apply[T /* <: ReadableStream */](
    fromStream: IncomingMessage,
    // eslint-disable-line @typescript-eslint/prefer-readonly-parameter-types
  toStream: T
  ): T & IncomingMessage = (^.asInstanceOf[js.Dynamic].apply(fromStream.asInstanceOf[js.Any], toStream.asInstanceOf[js.Any])).asInstanceOf[T & IncomingMessage]
  
  @JSImport("mimic-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
