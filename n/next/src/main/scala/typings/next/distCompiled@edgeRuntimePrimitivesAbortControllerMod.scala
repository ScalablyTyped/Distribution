package typings.next

import typings.next.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesAbortControllerMod` {
  
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
  
  /* was `typeof DOMException` */
  object DOMException {
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.ABORT_ERR")
    @js.native
    val ABORT_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.DATA_CLONE_ERR")
    @js.native
    val DATA_CLONE_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.DOMSTRING_SIZE_ERR")
    @js.native
    val DOMSTRING_SIZE_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.HIERARCHY_REQUEST_ERR")
    @js.native
    val HIERARCHY_REQUEST_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.INDEX_SIZE_ERR")
    @js.native
    val INDEX_SIZE_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.INUSE_ATTRIBUTE_ERR")
    @js.native
    val INUSE_ATTRIBUTE_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.INVALID_ACCESS_ERR")
    @js.native
    val INVALID_ACCESS_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.INVALID_CHARACTER_ERR")
    @js.native
    val INVALID_CHARACTER_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.INVALID_MODIFICATION_ERR")
    @js.native
    val INVALID_MODIFICATION_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.INVALID_NODE_TYPE_ERR")
    @js.native
    val INVALID_NODE_TYPE_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.INVALID_STATE_ERR")
    @js.native
    val INVALID_STATE_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.NAMESPACE_ERR")
    @js.native
    val NAMESPACE_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.NETWORK_ERR")
    @js.native
    val NETWORK_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.NOT_FOUND_ERR")
    @js.native
    val NOT_FOUND_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.NOT_SUPPORTED_ERR")
    @js.native
    val NOT_SUPPORTED_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.NO_DATA_ALLOWED_ERR")
    @js.native
    val NO_DATA_ALLOWED_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.NO_MODIFICATION_ALLOWED_ERR")
    @js.native
    val NO_MODIFICATION_ALLOWED_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.QUOTA_EXCEEDED_ERR")
    @js.native
    val QUOTA_EXCEEDED_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.SECURITY_ERR")
    @js.native
    val SECURITY_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.SYNTAX_ERR")
    @js.native
    val SYNTAX_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.TIMEOUT_ERR")
    @js.native
    val TIMEOUT_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.TYPE_MISMATCH_ERR")
    @js.native
    val TYPE_MISMATCH_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.URL_MISMATCH_ERR")
    @js.native
    val URL_MISMATCH_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.VALIDATION_ERR")
    @js.native
    val VALIDATION_ERR: Double = js.native
    
    /* standard dom */
    @JSImport("next/dist/compiled/@edge-runtime/primitives/abort-controller", "DOMException.WRONG_DOCUMENT_ERR")
    @js.native
    val WRONG_DOCUMENT_ERR: Double = js.native
  }
}
