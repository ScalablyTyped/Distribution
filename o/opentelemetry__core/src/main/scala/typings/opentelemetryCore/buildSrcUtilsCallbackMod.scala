package typings.opentelemetryCore

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsCallbackMod {
  
  @JSImport("@opentelemetry/core/build/src/utils/callback", "BindOnceFuture")
  @js.native
  open class BindOnceFuture[R, This, T /* <: js.ThisFunction1[/* this */ This, /* repeated */ Any, R] */] protected () extends StObject {
    def this(_callback: T, _that: This) = this()
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _deferred: Any = js.native
    
    /* private */ var _isCalled: Any = js.native
    
    /* private */ var _that: Any = js.native
    
    def call(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
    ): js.Promise[R] = js.native
    
    def isCalled: Boolean = js.native
    
    def promise: js.Promise[R] = js.native
  }
}
