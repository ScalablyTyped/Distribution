package typings.mobx

import typings.mobx.anon.Promisevoidcancelvoid
import typings.mobx.reactionMod.IReactionDisposer
import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whenMod {
  
  @JSImport("mobx/lib/api/when", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def when(predicate: js.Function0[Boolean]): Promisevoidcancelvoid = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any]).asInstanceOf[Promisevoidcancelvoid]
  @scala.inline
  def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  @scala.inline
  def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IReactionDisposer]
  @scala.inline
  def when(predicate: js.Function0[Boolean], opts: IWhenOptions): Promisevoidcancelvoid = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Promisevoidcancelvoid]
  
  trait IWhenOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
    
    /**
      * Experimental.
      * Warns if the view doesn't track observables
      */
    var requiresObservable: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IWhenOptions {
    
    @scala.inline
    def apply(): IWhenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWhenOptions]
    }
    
    @scala.inline
    implicit class IWhenOptionsMutableBuilder[Self <: IWhenOptions] (val x: Self) extends AnyVal {
      
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
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
