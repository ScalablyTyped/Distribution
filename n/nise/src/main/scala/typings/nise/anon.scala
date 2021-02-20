package typings.nise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Abort extends StObject {
    
    var abort: js.Array[_] = js.native
    
    var error: js.Array[_] = js.native
    
    var load: js.Array[_] = js.native
    
    var progress: js.Array[_] = js.native
  }
  object Abort {
    
    @scala.inline
    def apply(abort: js.Array[_], error: js.Array[_], load: js.Array[_], progress: js.Array[_]): Abort = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abort]
    }
    
    @scala.inline
    implicit class AbortMutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: js.Array[_]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortVarargs(value: js.Any*): Self = StObject.set(x, "abort", js.Array(value :_*))
      
      @scala.inline
      def setError(value: js.Array[_]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorVarargs(value: js.Any*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setLoad(value: js.Array[_]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadVarargs(value: js.Any*): Self = StObject.set(x, "load", js.Array(value :_*))
      
      @scala.inline
      def setProgress(value: js.Array[_]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressVarargs(value: js.Any*): Self = StObject.set(x, "progress", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<nise.nise.FakeServerOptions> */
  @js.native
  trait PartialFakeServerOptions extends StObject {
    
    var autoRespond: js.UndefOr[Boolean] = js.native
    
    var autoRespondAfter: js.UndefOr[Double] = js.native
    
    var fakeHTTPMethods: js.UndefOr[Boolean] = js.native
    
    var respondImmediately: js.UndefOr[Boolean] = js.native
  }
  object PartialFakeServerOptions {
    
    @scala.inline
    def apply(): PartialFakeServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFakeServerOptions]
    }
    
    @scala.inline
    implicit class PartialFakeServerOptionsMutableBuilder[Self <: PartialFakeServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRespond(value: Boolean): Self = StObject.set(x, "autoRespond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRespondAfter(value: Double): Self = StObject.set(x, "autoRespondAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRespondAfterUndefined: Self = StObject.set(x, "autoRespondAfter", js.undefined)
      
      @scala.inline
      def setAutoRespondUndefined: Self = StObject.set(x, "autoRespond", js.undefined)
      
      @scala.inline
      def setFakeHTTPMethods(value: Boolean): Self = StObject.set(x, "fakeHTTPMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFakeHTTPMethodsUndefined: Self = StObject.set(x, "fakeHTTPMethods", js.undefined)
      
      @scala.inline
      def setRespondImmediately(value: Boolean): Self = StObject.set(x, "respondImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespondImmediatelyUndefined: Self = StObject.set(x, "respondImmediately", js.undefined)
    }
  }
}
