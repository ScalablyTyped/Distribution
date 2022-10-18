package typings.mimicResponse

import typings.node.NodeJS.ReadableStream
import typings.node.nodeColonhttpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mimic-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: ReadableStream */](fromStream: IncomingMessage, toStream: T): T & IncomingMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fromStream.asInstanceOf[js.Any], toStream.asInstanceOf[js.Any])).asInstanceOf[T & IncomingMessage]
}
