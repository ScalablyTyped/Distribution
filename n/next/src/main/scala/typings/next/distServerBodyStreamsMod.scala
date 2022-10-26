package typings.next

import typings.next.anon.ReadableStream
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import typings.std.Uint8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerBodyStreamsMod {
  
  @JSImport("next/dist/server/body-streams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClonableBody[T /* <: IncomingMessage */](readable: T): ClonableBody = ^.asInstanceOf[js.Dynamic].applyDynamic("getClonableBody")(readable.asInstanceOf[js.Any]).asInstanceOf[ClonableBody]
  
  inline def requestToBodyStream(context: ReadableStream, KUint8Array: Uint8ArrayConstructor, stream: Readable): typings.std.ReadableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestToBodyStream")(context.asInstanceOf[js.Any], KUint8Array.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[typings.std.ReadableStream[Any]]
  
  trait ClonableBody extends StObject {
    
    def cloneBodyStream(): Readable
  }
  object ClonableBody {
    
    inline def apply(cloneBodyStream: () => Readable): ClonableBody = {
      val __obj = js.Dynamic.literal(cloneBodyStream = js.Any.fromFunction0(cloneBodyStream))
      __obj.asInstanceOf[ClonableBody]
    }
    
    extension [Self <: ClonableBody](x: Self) {
      
      inline def setCloneBodyStream(value: () => Readable): Self = StObject.set(x, "cloneBodyStream", js.Any.fromFunction0(value))
    }
  }
}
