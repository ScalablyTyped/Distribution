package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsPromiseMod {
  
  @JSImport("@opentelemetry/core/build/src/utils/promise", "Deferred")
  @js.native
  open class Deferred[T] () extends StObject {
    
    /* private */ var _promise: Any = js.native
    
    /* private */ var _reject: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
    def promise: js.Promise[T] = js.native
    
    def reject(err: Any): Unit = js.native
    
    def resolve(`val`: T): Unit = js.native
  }
}
