package typings.mobx

import typings.mobx.comparerMod.IEqualsComparer
import typings.mobx.reactionMod.IReactionDisposer
import typings.mobx.reactionMod.IReactionPublic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autorunMod {
  
  @JSImport("mobx/lib/api/autorun", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autorun(view: js.Function1[/* r */ IReactionPublic, js.Any]): IReactionDisposer = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any]).asInstanceOf[IReactionDisposer]
  inline def autorun(view: js.Function1[/* r */ IReactionPublic, js.Any], opts: IAutorunOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  inline def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  inline def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  trait IAutorunOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
    
    /**
      * Experimental.
      * Warns if the view doesn't track observables
      */
    var requiresObservable: js.UndefOr[Boolean] = js.undefined
    
    var scheduler: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], js.Any]] = js.undefined
  }
  object IAutorunOptions {
    
    inline def apply(): IAutorunOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAutorunOptions]
    }
    
    extension [Self <: IAutorunOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnError(value: /* error */ js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setRequiresObservable(value: Boolean): Self = StObject.set(x, "requiresObservable", value.asInstanceOf[js.Any])
      
      inline def setRequiresObservableUndefined: Self = StObject.set(x, "requiresObservable", js.undefined)
      
      inline def setScheduler(value: /* callback */ js.Function0[Unit] => js.Any): Self = StObject.set(x, "scheduler", js.Any.fromFunction1(value))
      
      inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    }
  }
  
  trait IReactionOptions
    extends StObject
       with IAutorunOptions {
    
    @JSName("equals")
    var equals_FIReactionOptions: js.UndefOr[IEqualsComparer[js.Any]] = js.undefined
    
    var fireImmediately: js.UndefOr[Boolean] = js.undefined
  }
  object IReactionOptions {
    
    inline def apply(): IReactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReactionOptions]
    }
    
    extension [Self <: IReactionOptions](x: Self) {
      
      inline def setEquals_(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setFireImmediately(value: Boolean): Self = StObject.set(x, "fireImmediately", value.asInstanceOf[js.Any])
      
      inline def setFireImmediatelyUndefined: Self = StObject.set(x, "fireImmediately", js.undefined)
    }
  }
}
