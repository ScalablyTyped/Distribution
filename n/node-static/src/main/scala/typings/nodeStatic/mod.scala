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
import scala.scalajs.js.`|`
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
    
    @JSImport("node-static", "mime.define")
    @js.native
    def define(mimes: TypeMap): Unit = js.native
    @JSImport("node-static", "mime.define")
    @js.native
    def define(mimes: TypeMap, force: Boolean): Unit = js.native
    
    @JSImport("node-static", "mime.getExtension")
    @js.native
    def getExtension(mime: String): String | Null = js.native
    
    @JSImport("node-static", "mime.getType")
    @js.native
    def getType(path: String): String | Null = js.native
  }
  
  @JSImport("node-static", "version")
  @js.native
  val version: js.Tuple3[Double, Double, Double] = js.native
  
  @js.native
  trait ByteRange extends StObject {
    
    var from: Double = js.native
    
    var to: Double = js.native
    
    var valid: Boolean = js.native
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
  
  @js.native
  trait Options extends StObject {
    
    var cache: js.UndefOr[Double | Boolean] = js.native
    
    var `cache-control`: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var indexFile: js.UndefOr[String] = js.native
    
    var server: js.UndefOr[String] = js.native
    
    var serverInfo: js.UndefOr[Buffer] = js.native
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
