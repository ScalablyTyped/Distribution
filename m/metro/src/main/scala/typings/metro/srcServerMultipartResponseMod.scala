package typings.metro

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcServerMultipartResponseMod {
  
  @JSImport("metro/src/Server/MultipartResponse", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MultipartResponse {
    def this(res: ServerResponse[IncomingMessage]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("metro/src/Server/MultipartResponse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def serializeHeaders(headers: Headers): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def wrapIfSupported(req: IncomingMessage, res: ServerResponse[IncomingMessage]): MultipartResponse | ServerResponse[IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapIfSupported")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[MultipartResponse | ServerResponse[IncomingMessage]]
  }
  
  type Data = String | Buffer | js.typedarray.Uint8Array
  
  type Headers = StringDictionary[String | Double]
  
  @js.native
  trait MultipartResponse extends StObject {
    
    def end(): Unit = js.native
    def end(data: Data): Unit = js.native
    
    var headers: Headers = js.native
    
    var res: ServerResponse[IncomingMessage] = js.native
    
    def setHeader(name: String, value: String): Unit = js.native
    def setHeader(name: String, value: Double): Unit = js.native
    
    def writeChunk(): Unit = js.native
    def writeChunk(headers: Null, data: Unit, isLast: Boolean): Unit = js.native
    def writeChunk(headers: Null, data: Data): Unit = js.native
    def writeChunk(headers: Null, data: Data, isLast: Boolean): Unit = js.native
    def writeChunk(headers: Headers): Unit = js.native
    def writeChunk(headers: Headers, data: Unit, isLast: Boolean): Unit = js.native
    def writeChunk(headers: Headers, data: Data): Unit = js.native
    def writeChunk(headers: Headers, data: Data, isLast: Boolean): Unit = js.native
    
    def writeHead(status: Double): Unit = js.native
    def writeHead(status: Double, headers: Headers): Unit = js.native
  }
}
