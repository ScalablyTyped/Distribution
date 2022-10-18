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
  
  trait IWhenOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IWhenOptions {
    
    inline def apply(): IWhenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWhenOptions]
    }
    
    extension [Self <: IWhenOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnError(value: /* error */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
