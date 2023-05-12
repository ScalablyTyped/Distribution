package typings.mobx

import typings.mobx.anon.Promisevoidcancelvoid
import typings.mobx.distCoreReactionMod.IReactionDisposer
import typings.mobx.distUtilsUtilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiWhenMod {
  
  @JSImport("mobx/dist/api/when", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def when(predicate: js.Function0[Boolean]): Promisevoidcancelvoid = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any]).asInstanceOf[Promisevoidcancelvoid]
  inline def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  inline def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  inline def when(predicate: js.Function0[Boolean], opts: IWhenOptions): Promisevoidcancelvoid = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Promisevoidcancelvoid]
  
  trait GenericAbortSignal extends StObject {
    
    val aborted: Boolean
    
    var addEventListener: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
    
    var onabort: js.UndefOr[(js.Function1[/* args */ Any, Any]) | Null] = js.undefined
    
    var removeEventListener: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  }
  object GenericAbortSignal {
    
    inline def apply(aborted: Boolean): GenericAbortSignal = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericAbortSignal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericAbortSignal] (val x: Self) extends AnyVal {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setAddEventListener(value: /* args */ Any => Any): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1(value))
      
      inline def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
      
      inline def setOnabort(value: /* args */ Any => Any): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
      
      inline def setOnabortNull: Self = StObject.set(x, "onabort", null)
      
      inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      inline def setRemoveEventListener(value: /* args */ Any => Any): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
      
      inline def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
    }
  }
  
  trait IWhenOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var signal: js.UndefOr[GenericAbortSignal] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IWhenOptions {
    
    inline def apply(): IWhenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWhenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWhenOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnError(value: /* error */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setSignal(value: GenericAbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
