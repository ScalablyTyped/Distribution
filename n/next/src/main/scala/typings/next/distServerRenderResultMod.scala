package typings.next

import typings.next.anon.ContentType
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.streamMod.Writable
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerRenderResultMod {
  
  @JSImport("next/dist/server/render-result", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RenderResult {
    def this(response: String) = this()
    def this(response: ReadableStream[js.typedarray.Uint8Array]) = this()
    def this(response: String, param1: ContentType) = this()
    def this(response: ReadableStream[js.typedarray.Uint8Array], param1: ContentType) = this()
  }
  /* static members */
  object default {
    
    @JSImport("next/dist/server/render-result", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/server/render-result", "default.empty")
    @js.native
    def empty: RenderResult = js.native
    inline def empty_=(x: RenderResult): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    inline def fromStatic(value: String): RenderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStatic")(value.asInstanceOf[js.Any]).asInstanceOf[RenderResult]
  }
  
  type ContentTypeOption = js.UndefOr[String]
  
  @js.native
  trait RenderResult extends StObject {
    
    /* private */ var _contentType: Any = js.native
    
    /* private */ var _result: Any = js.native
    
    def contentType(): ContentTypeOption = js.native
    
    def isDynamic(): Boolean = js.native
    
    def pipe(res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
    def pipe(res: Writable): js.Promise[Unit] = js.native
    
    def toUnchunkedString(): String = js.native
  }
}
