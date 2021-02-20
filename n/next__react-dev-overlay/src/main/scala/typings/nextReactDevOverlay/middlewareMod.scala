package typings.nextReactDevOverlay

import typings.nextReactDevOverlay.anon.Column
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.stacktraceParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("@next/react-dev-overlay/lib/middleware", "createOriginalStackFrame")
  @js.native
  def createOriginalStackFrame(hasLineColumnSourceRootDirectoryFrame: Column): js.Promise[OriginalStackFrameResponse | Null] = js.native
  
  @JSImport("@next/react-dev-overlay/lib/middleware", "getOverlayMiddleware")
  @js.native
  def getOverlayMiddleware(options: OverlayMiddlewareOptions): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function, 
    js.Promise[_]
  ] = js.native
  
  @js.native
  trait OriginalStackFrameResponse extends StObject {
    
    var originalCodeFrame: String | Null = js.native
    
    var originalStackFrame: StackFrame = js.native
  }
  object OriginalStackFrameResponse {
    
    @scala.inline
    def apply(originalStackFrame: StackFrame): OriginalStackFrameResponse = {
      val __obj = js.Dynamic.literal(originalStackFrame = originalStackFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalStackFrameResponse]
    }
    
    @scala.inline
    implicit class OriginalStackFrameResponseMutableBuilder[Self <: OriginalStackFrameResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalCodeFrame(value: String): Self = StObject.set(x, "originalCodeFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalCodeFrameNull: Self = StObject.set(x, "originalCodeFrame", null)
      
      @scala.inline
      def setOriginalStackFrame(value: StackFrame): Self = StObject.set(x, "originalStackFrame", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OverlayMiddlewareOptions extends StObject {
    
    var rootDirectory: String = js.native
    
    def serverStats(): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any) | Null = js.native
    
    def stats(): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any) | Null = js.native
  }
  object OverlayMiddlewareOptions {
    
    @scala.inline
    def apply(
      rootDirectory: String,
      serverStats: () => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any) | Null,
      stats: () => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any) | Null
    ): OverlayMiddlewareOptions = {
      val __obj = js.Dynamic.literal(rootDirectory = rootDirectory.asInstanceOf[js.Any], serverStats = js.Any.fromFunction0(serverStats), stats = js.Any.fromFunction0(stats))
      __obj.asInstanceOf[OverlayMiddlewareOptions]
    }
    
    @scala.inline
    implicit class OverlayMiddlewareOptionsMutableBuilder[Self <: OverlayMiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerStats(
        value: () => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any) | Null
      ): Self = StObject.set(x, "serverStats", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStats(
        value: () => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any) | Null
      ): Self = StObject.set(x, "stats", js.Any.fromFunction0(value))
    }
  }
}
