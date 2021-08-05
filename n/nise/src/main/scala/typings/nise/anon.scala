package typings.nise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    var abort: js.Array[js.Any]
    
    var error: js.Array[js.Any]
    
    var load: js.Array[js.Any]
    
    var progress: js.Array[js.Any]
  }
  object Abort {
    
    inline def apply(
      abort: js.Array[js.Any],
      error: js.Array[js.Any],
      load: js.Array[js.Any],
      progress: js.Array[js.Any]
    ): Abort = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abort]
    }
    
    extension [Self <: Abort](x: Self) {
      
      inline def setAbort(value: js.Array[js.Any]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setAbortVarargs(value: js.Any*): Self = StObject.set(x, "abort", js.Array(value :_*))
      
      inline def setError(value: js.Array[js.Any]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorVarargs(value: js.Any*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      inline def setLoad(value: js.Array[js.Any]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadVarargs(value: js.Any*): Self = StObject.set(x, "load", js.Array(value :_*))
      
      inline def setProgress(value: js.Array[js.Any]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressVarargs(value: js.Any*): Self = StObject.set(x, "progress", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<nise.nise.FakeServerOptions> */
  trait PartialFakeServerOptions extends StObject {
    
    var autoRespond: js.UndefOr[Boolean] = js.undefined
    
    var autoRespondAfter: js.UndefOr[Double] = js.undefined
    
    var fakeHTTPMethods: js.UndefOr[Boolean] = js.undefined
    
    var respondImmediately: js.UndefOr[Boolean] = js.undefined
  }
  object PartialFakeServerOptions {
    
    inline def apply(): PartialFakeServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFakeServerOptions]
    }
    
    extension [Self <: PartialFakeServerOptions](x: Self) {
      
      inline def setAutoRespond(value: Boolean): Self = StObject.set(x, "autoRespond", value.asInstanceOf[js.Any])
      
      inline def setAutoRespondAfter(value: Double): Self = StObject.set(x, "autoRespondAfter", value.asInstanceOf[js.Any])
      
      inline def setAutoRespondAfterUndefined: Self = StObject.set(x, "autoRespondAfter", js.undefined)
      
      inline def setAutoRespondUndefined: Self = StObject.set(x, "autoRespond", js.undefined)
      
      inline def setFakeHTTPMethods(value: Boolean): Self = StObject.set(x, "fakeHTTPMethods", value.asInstanceOf[js.Any])
      
      inline def setFakeHTTPMethodsUndefined: Self = StObject.set(x, "fakeHTTPMethods", js.undefined)
      
      inline def setRespondImmediately(value: Boolean): Self = StObject.set(x, "respondImmediately", value.asInstanceOf[js.Any])
      
      inline def setRespondImmediatelyUndefined: Self = StObject.set(x, "respondImmediately", js.undefined)
    }
  }
}
