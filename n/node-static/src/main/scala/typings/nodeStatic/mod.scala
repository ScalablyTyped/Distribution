package typings.nodeStatic

import org.scalablytyped.runtime.StringDictionary
import typings.mime.mod.TypeMap
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-static", "Server")
  @js.native
  class Server protected () extends StObject {
    def this(root: String) = this()
    def this(root: String, options: Options) = this()
    
    var cache: Double | Boolean = js.native
    
    var defaultHeaders: Headers = js.native
    
    def finish(
      status: Double,
      headers: Headers,
      req: IncomingMessage,
      res: ServerResponse,
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
      res: ServerResponse,
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
      res: ServerResponse,
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
      res: ServerResponse,
      finish: Finish
    ): Unit = js.native
    
    var root: String = js.native
    
    def serve(req: IncomingMessage, res: ServerResponse): EventEmitter = js.native
    def serve(req: IncomingMessage, res: ServerResponse, callback: Callback): EventEmitter = js.native
    
    def serveDir(pathname: String, req: IncomingMessage, res: ServerResponse, finish: Finish): Unit = js.native
    
    def serveFile(pathname: String, status: Double, headers: Headers, req: IncomingMessage, res: ServerResponse): EventEmitter = js.native
    
    def servePath(
      pathname: String,
      status: Double,
      headers: Headers,
      req: IncomingMessage,
      res: ServerResponse,
      finish: Finish
    ): EventEmitter = js.native
    
    var serverInfo: String = js.native
    
    def stream(
      pathname: String,
      files: js.Array[String],
      length: Double,
      startByte: Double,
      res: ServerResponse,
      callback: Callback
    ): Unit = js.native
  }
  
  object mime {
    
    @JSImport("node-static", "mime")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def define(mimes: TypeMap): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(mimes.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def define(mimes: TypeMap, force: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(mimes.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def getExtension(mime: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(mime.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    @scala.inline
    def getType(path: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @JSImport("node-static", "version")
  @js.native
  val version: js.Tuple3[Double, Double, Double] = js.native
  
  trait ByteRange extends StObject {
    
    var from: Double
    
    var to: Double
    
    var valid: Boolean
  }
  object ByteRange {
    
    @scala.inline
    def apply(from: Double, to: Double, valid: Boolean): ByteRange = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteRange]
    }
    
    @scala.inline
    implicit class ByteRangeMutableBuilder[Self <: ByteRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function1[/* e */ Error, Unit]
  
  type Finish = js.Function2[/* status */ Double, /* headers */ js.UndefOr[Headers], Unit]
  
  type Headers = StringDictionary[js.Any]
  
  trait Options extends StObject {
    
    var cache: js.UndefOr[Double | Boolean] = js.undefined
    
    var `cache-control`: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var indexFile: js.UndefOr[String] = js.undefined
    
    var server: js.UndefOr[String] = js.undefined
    
    var serverInfo: js.UndefOr[Buffer] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Double | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCache-control`(value: String): Self = StObject.set(x, "cache-control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCache-controlUndefined`: Self = StObject.set(x, "cache-control", js.undefined)
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIndexFile(value: String): Self = StObject.set(x, "indexFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexFileUndefined: Self = StObject.set(x, "indexFile", js.undefined)
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerInfo(value: Buffer): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerInfoUndefined: Self = StObject.set(x, "serverInfo", js.undefined)
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
}
