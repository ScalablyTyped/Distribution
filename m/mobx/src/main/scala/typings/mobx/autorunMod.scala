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
  
  @scala.inline
  def autorun(view: js.Function1[/* r */ IReactionPublic, js.Any]): IReactionDisposer = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any]).asInstanceOf[IReactionDisposer]
  @scala.inline
  def autorun(view: js.Function1[/* r */ IReactionPublic, js.Any], opts: IAutorunOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(view.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  
  @scala.inline
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("reaction")(expression.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  @scala.inline
  def reaction[T](
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
    
    @scala.inline
    def apply(): IAutorunOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAutorunOptions]
    }
    
    @scala.inline
    implicit class IAutorunOptionsMutableBuilder[Self <: IAutorunOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setRequiresObservable(value: Boolean): Self = StObject.set(x, "requiresObservable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresObservableUndefined: Self = StObject.set(x, "requiresObservable", js.undefined)
      
      @scala.inline
      def setScheduler(value: /* callback */ js.Function0[Unit] => js.Any): Self = StObject.set(x, "scheduler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
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
    
    @scala.inline
    def apply(): IReactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReactionOptions]
    }
    
    @scala.inline
    implicit class IReactionOptionsMutableBuilder[Self <: IReactionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setFireImmediately(value: Boolean): Self = StObject.set(x, "fireImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFireImmediatelyUndefined: Self = StObject.set(x, "fireImmediately", js.undefined)
    }
  }
}
