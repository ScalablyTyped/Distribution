package typings.mobx

import typings.mobx.distCoreReactionMod.IReactionDisposer
import typings.mobx.distCoreReactionMod.IReactionPublic
import typings.mobx.distUtilsComparerMod.IEqualsComparer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiAutorunMod {
  
  @JSImport("mobx/dist/api/autorun", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autorun(view: js.Function1[/* r */ IReactionPublic, Any]): IReactionDisposer = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any]).asInstanceOf[IReactionDisposer]
  inline def autorun(view: js.Function1[/* r */ IReactionPublic, Any], opts: IAutorunOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  @scala.annotation.targetName("reaction_true")
  inline def reaction[T, FireImmediately /* <: Boolean */](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function3[
      /* arg */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: FireImmediately extends true ? T | undefined : T */ /* prev */ js.Any, 
      /* r */ IReactionPublic, 
      Unit
    ]
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  @scala.annotation.targetName("reaction_true")
  inline def reaction[T, FireImmediately /* <: Boolean */](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function3[
      /* arg */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: FireImmediately extends true ? T | undefined : T */ /* prev */ js.Any, 
      /* r */ IReactionPublic, 
      Unit
    ],
    opts: IReactionOptions[T, FireImmediately]
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  trait IAutorunOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    /**
      * Experimental.
      * Warns if the view doesn't track observables
      */
    var requiresObservable: js.UndefOr[Boolean] = js.undefined
    
    var scheduler: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Any]] = js.undefined
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
      
      inline def setOnError(value: /* error */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setRequiresObservable(value: Boolean): Self = StObject.set(x, "requiresObservable", value.asInstanceOf[js.Any])
      
      inline def setRequiresObservableUndefined: Self = StObject.set(x, "requiresObservable", js.undefined)
      
      inline def setScheduler(value: /* callback */ js.Function0[Unit] => Any): Self = StObject.set(x, "scheduler", js.Any.fromFunction1(value))
      
      inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    }
  }
  
  trait IReactionOptions[T, FireImmediately /* <: Boolean */]
    extends StObject
       with IAutorunOptions {
    
    @JSName("equals")
    var equals_FIReactionOptions: js.UndefOr[IEqualsComparer[T]] = js.undefined
    
    var fireImmediately: js.UndefOr[FireImmediately] = js.undefined
  }
  object IReactionOptions {
    
    inline def apply[T, FireImmediately /* <: Boolean */](): IReactionOptions[T, FireImmediately] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReactionOptions[T, FireImmediately]]
    }
    
    extension [Self <: IReactionOptions[?, ?], T, FireImmediately /* <: Boolean */](x: Self & (IReactionOptions[T, FireImmediately])) {
      
      inline def setEquals_(value: (T, T) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setFireImmediately(value: FireImmediately): Self = StObject.set(x, "fireImmediately", value.asInstanceOf[js.Any])
      
      inline def setFireImmediatelyUndefined: Self = StObject.set(x, "fireImmediately", js.undefined)
    }
  }
}
