package typings.next

import typings.next.anon.ContentType
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
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
    def this(response: String, hasContentType: ContentType) = this()
    def this(response: ReadableStream[js.typedarray.Uint8Array], hasContentType: ContentType) = this()
    
    /* private */ /* CompleteClass */
    var _contentType: Any = js.native
    
    /* private */ /* CompleteClass */
    var _result: Any = js.native
    
    /* CompleteClass */
    override def contentType(): ContentTypeOption = js.native
    
    /* CompleteClass */
    override def isDynamic(): Boolean = js.native
    
    /* CompleteClass */
    override def pipe(res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def toUnchunkedString(): String = js.native
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
  
  trait RenderResult extends StObject {
    
    /* private */ var _contentType: Any
    
    /* private */ var _result: Any
    
    def contentType(): ContentTypeOption
    
    def isDynamic(): Boolean
    
    def pipe(res: ServerResponse[IncomingMessage]): js.Promise[Unit]
    
    def toUnchunkedString(): String
  }
  object RenderResult {
    
    inline def apply(
      _contentType: Any,
      _result: Any,
      contentType: () => ContentTypeOption,
      isDynamic: () => Boolean,
      pipe: ServerResponse[IncomingMessage] => js.Promise[Unit],
      toUnchunkedString: () => String
    ): RenderResult = {
      val __obj = js.Dynamic.literal(_contentType = _contentType.asInstanceOf[js.Any], _result = _result.asInstanceOf[js.Any], contentType = js.Any.fromFunction0(contentType), isDynamic = js.Any.fromFunction0(isDynamic), pipe = js.Any.fromFunction1(pipe), toUnchunkedString = js.Any.fromFunction0(toUnchunkedString))
      __obj.asInstanceOf[RenderResult]
    }
    
    extension [Self <: RenderResult](x: Self) {
      
      inline def setContentType(value: () => ContentTypeOption): Self = StObject.set(x, "contentType", js.Any.fromFunction0(value))
      
      inline def setIsDynamic(value: () => Boolean): Self = StObject.set(x, "isDynamic", js.Any.fromFunction0(value))
      
      inline def setPipe(value: ServerResponse[IncomingMessage] => js.Promise[Unit]): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
      
      inline def setToUnchunkedString(value: () => String): Self = StObject.set(x, "toUnchunkedString", js.Any.fromFunction0(value))
      
      inline def set_contentType(value: Any): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
      
      inline def set_result(value: Any): Self = StObject.set(x, "_result", value.asInstanceOf[js.Any])
    }
  }
}
