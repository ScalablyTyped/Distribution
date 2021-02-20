package typings.mobx

import typings.mobx.anon.Promisevoidcancelvoid
import typings.mobx.reactionMod.IReactionDisposer
import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whenMod {
  
  @JSImport("mobx/lib/api/when", "when")
  @js.native
  def when(predicate: js.Function0[Boolean]): Promisevoidcancelvoid = js.native
  @JSImport("mobx/lib/api/when", "when")
  @js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  @JSImport("mobx/lib/api/when", "when")
  @js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  @JSImport("mobx/lib/api/when", "when")
  @js.native
  def when(predicate: js.Function0[Boolean], opts: IWhenOptions): Promisevoidcancelvoid = js.native
  
  @js.native
  trait IWhenOptions extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
    
    /**
      * Experimental.
      * Warns if the view doesn't track observables
      */
    var requiresObservable: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
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
