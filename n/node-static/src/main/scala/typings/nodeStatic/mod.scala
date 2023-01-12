package typings.nodeStatic

import org.scalablytyped.runtime.StringDictionary
import typings.mime.mimeMod.^
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-static", "Server")
  @js.native
  open class Server protected () extends StObject {
    def this(root: String) = this()
    def this(root: String, options: Options) = this()
    
    var cache: Double | Boolean = js.native
    
    var defaultHeaders: Headers = js.native
    
    def finish(
      status: Double,
      headers: Headers,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      promise: EventEmitter,
      callback: Callback
    ): Unit = js.native
    
    def gzipOk(req: IncomingMessage, contentType: String): Boolean = js.native
    
    var options: Options = js.native
    
    def parseByteRange(req: IncomingMessage, stat: Stats): ByteRange = js.native
    
    def resolve(pathname: String): String = js.native
    
    def respond(
      pathname: String,
      status: Double,
      _headers: Headers,
      files: js.Array[String],
      stat: Stats,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      finish: Finish
    ): Unit = js.native
    
    def respondGzip(
      pathname: String,
      status: Double,
      contentType: String,
      _headers: Headers,
      files: js.Array[String],
      stat: Stats,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      finish: Finish
    ): Unit = js.native
    
    // tslint:disable-next-line max-line-length
    def respondNoGzip(
      pathname: String,
      status: Double,
      contentType: String,
      _headers: Headers,
      files: js.Array[String],
      stat: Stats,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      finish: Finish
    ): Unit = js.native
    
    var root: String = js.native
    
    def serve(req: IncomingMessage, res: ServerResponse[IncomingMessage]): EventEmitter = js.native
    def serve(req: IncomingMessage, res: ServerResponse[IncomingMessage], callback: Callback): EventEmitter = js.native
    
    def serveDir(pathname: String, req: IncomingMessage, res: ServerResponse[IncomingMessage], finish: Finish): Unit = js.native
    
    def serveFile(
      pathname: String,
      status: Double,
      headers: Headers,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage]
    ): EventEmitter = js.native
    
    def servePath(
      pathname: String,
      status: Double,
      headers: Headers,
      req: IncomingMessage,
      res: ServerResponse[IncomingMessage],
      finish: Finish
    ): EventEmitter = js.native
    
    var serverInfo: String = js.native
    
    def stream(
      pathname: String,
      files: js.Array[String],
      length: Double,
      startByte: Double,
      res: ServerResponse[IncomingMessage],
      callback: Callback
    ): Unit = js.native
  }
  
  @JSImport("node-static", "mime")
  @js.native
  val mime: ^ = js.native
  
  @JSImport("node-static", "version")
  @js.native
  val version: js.Tuple3[Double, Double, Double] = js.native
  
  trait ByteRange extends StObject {
    
    var from: Double
    
    var to: Double
    
    var valid: Boolean
  }
  object ByteRange {
    
    inline def apply(from: Double, to: Double, valid: Boolean): ByteRange = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ByteRange] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function1[/* e */ js.Error, Unit]
  
  type Finish = js.Function2[/* status */ Double, /* headers */ js.UndefOr[Headers], Unit]
  
  type Headers = StringDictionary[Any]
  
  trait Options extends StObject {
    
    var cache: js.UndefOr[Double | Boolean] = js.undefined
    
    var `cache-control`: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var indexFile: js.UndefOr[String] = js.undefined
    
    var server: js.UndefOr[String] = js.undefined
    
    var serverInfo: js.UndefOr[Buffer] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Double | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def `setCache-control`(value: String): Self = StObject.set(x, "cache-control", value.asInstanceOf[js.Any])
      
      inline def `setCache-controlUndefined`: Self = StObject.set(x, "cache-control", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIndexFile(value: String): Self = StObject.set(x, "indexFile", value.asInstanceOf[js.Any])
      
      inline def setIndexFileUndefined: Self = StObject.set(x, "indexFile", js.undefined)
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerInfo(value: Buffer): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
      
      inline def setServerInfoUndefined: Self = StObject.set(x, "serverInfo", js.undefined)
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
}
