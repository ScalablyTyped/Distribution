package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Finally extends StObject {
    
    var Finally: js.UndefOr[js.Function0[Unit]] = js.native
    
    var OnError: js.UndefOr[
        js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
      ] = js.native
    
    var OnSuccess: js.UndefOr[
        js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
      ] = js.native
  }
  object Finally {
    
    @scala.inline
    def apply(): Finally = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Finally]
    }
    
    @scala.inline
    implicit class FinallyMutableBuilder[Self <: Finally] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinally(value: () => Unit): Self = StObject.set(x, "Finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinallyUndefined: Self = StObject.set(x, "Finally", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "OnError", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = StObject.set(x, "OnSuccess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
    }
  }
  
  @js.native
  trait FinallyOnError extends StObject {
    
    var Finally: js.UndefOr[js.Function0[Unit]] = js.native
    
    var OnError: js.UndefOr[
        js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
      ] = js.native
    
    var OnSuccess: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  }
  object FinallyOnError {
    
    @scala.inline
    def apply(): FinallyOnError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FinallyOnError]
    }
    
    @scala.inline
    implicit class FinallyOnErrorMutableBuilder[Self <: FinallyOnError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinally(value: () => Unit): Self = StObject.set(x, "Finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinallyUndefined: Self = StObject.set(x, "Finally", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "OnError", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
    }
  }
  
  @js.native
  trait OnError extends StObject {
    
    var Finally: js.UndefOr[js.Function0[Unit]] = js.native
    
    var OnError: js.UndefOr[
        js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
      ] = js.native
    
    var OnSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object OnError {
    
    @scala.inline
    def apply(): OnError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnError]
    }
    
    @scala.inline
    implicit class OnErrorMutableBuilder[Self <: OnError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinally(value: () => Unit): Self = StObject.set(x, "Finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinallyUndefined: Self = StObject.set(x, "Finally", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "OnError", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: () => Unit): Self = StObject.set(x, "OnSuccess", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
    }
  }
  
  @js.native
  trait OnSuccess extends StObject {
    
    var Finally: js.UndefOr[js.Function0[Unit]] = js.native
    
    var OnError: js.UndefOr[
        js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
      ] = js.native
    
    var OnSuccess: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  }
  object OnSuccess {
    
    @scala.inline
    def apply(): OnSuccess = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnSuccess]
    }
    
    @scala.inline
    implicit class OnSuccessMutableBuilder[Self <: OnSuccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinally(value: () => Unit): Self = StObject.set(x, "Finally", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinallyUndefined: Self = StObject.set(x, "Finally", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "OnError", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
    }
  }
}
