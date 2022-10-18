package typings.next

import typings.next.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesAbortControllerMod` {
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "AbortController")
  @js.native
  val AbortController: typings.std.AbortController = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "AbortSignal")
  @js.native
  open class AbortSignal ()
    extends StObject
       with Instantiable
  object AbortSignal {
    
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "AbortSignal")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns an AbortSignal instance whose abort reason is set to reason if not undefined; otherwise to an "AbortError" DOMException. */
    inline def abort(): typings.std.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[typings.std.AbortSignal]
    inline def abort(reason: String): typings.std.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(reason.asInstanceOf[js.Any]).asInstanceOf[typings.std.AbortSignal]
    
    /** Returns an AbortSignal instance which will be aborted in milliseconds milliseconds. Its abort reason will be set to a "TimeoutError" DOMException. */
    inline def timeout(milliseconds: Double): typings.std.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.std.AbortSignal]
  }
}
