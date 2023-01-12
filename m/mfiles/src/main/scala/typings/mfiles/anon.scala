package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Finally extends StObject {
    
    var Finally: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var OnError: js.UndefOr[
        js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
      ] = js.undefined
    
    var OnSuccess: js.UndefOr[
        js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
      ] = js.undefined
  }
  object Finally {
    
    inline def apply(): Finally = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Finally]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Finally] (val x: Self) extends AnyVal {
      
      inline def setFinally(value: () => Unit): Self = StObject.set(x, "Finally", js.Any.fromFunction0(value))
      
      inline def setFinallyUndefined: Self = StObject.set(x, "Finally", js.undefined)
      
      inline def setOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "OnError", js.undefined)
      
      inline def setOnSuccess(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = StObject.set(x, "OnSuccess", js.Any.fromFunction2(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
    }
  }
  
  trait FinallyOnError extends StObject {
    
    var Finally: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var OnError: js.UndefOr[
        js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
      ] = js.undefined
    
    var OnSuccess: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.undefined
  }
  object FinallyOnError {
    
    inline def apply(): FinallyOnError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FinallyOnError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FinallyOnError] (val x: Self) extends AnyVal {
      
      inline def setFinally(value: () => Unit): Self = StObject.set(x, "Finally", js.Any.fromFunction0(value))
      
      inline def setFinallyUndefined: Self = StObject.set(x, "Finally", js.undefined)
      
      inline def setOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "OnError", js.undefined)
      
      inline def setOnSuccess(value: /* objectVersions */ IObjectVersions => Unit): Self = StObject.set(x, "OnSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
    }
  }
  
  trait OnError extends StObject {
    
    var Finally: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var OnError: js.UndefOr[
        js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
      ] = js.undefined
    
    var OnSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object OnError {
    
    inline def apply(): OnError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnError] (val x: Self) extends AnyVal {
      
      inline def setFinally(value: () => Unit): Self = StObject.set(x, "Finally", js.Any.fromFunction0(value))
      
      inline def setFinallyUndefined: Self = StObject.set(x, "Finally", js.undefined)
      
      inline def setOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "OnError", js.undefined)
      
      inline def setOnSuccess(value: () => Unit): Self = StObject.set(x, "OnSuccess", js.Any.fromFunction0(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
    }
  }
  
  trait OnSuccess extends StObject {
    
    var Finally: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var OnError: js.UndefOr[
        js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
      ] = js.undefined
    
    var OnSuccess: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.undefined
  }
  object OnSuccess {
    
    inline def apply(): OnSuccess = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnSuccess]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnSuccess] (val x: Self) extends AnyVal {
      
      inline def setFinally(value: () => Unit): Self = StObject.set(x, "Finally", js.Any.fromFunction0(value))
      
      inline def setFinallyUndefined: Self = StObject.set(x, "Finally", js.undefined)
      
      inline def setOnError(value: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Unit): Self = StObject.set(x, "OnError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "OnError", js.undefined)
      
      inline def setOnSuccess(value: /* objectVersion */ IObjectVersion => Unit): Self = StObject.set(x, "OnSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "OnSuccess", js.undefined)
    }
  }
}
