package typings.nodegit.mod

import typings.nodegit.mod.^
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("nodegit", "Promise")
@js.native
class Promise[T] protected ()
  extends StObject
     with typings.std.Promise[T] {
  /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used to resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}
object Promise {
  
  /* was `typeof Promise` */
  inline def apply: PromiseConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Promise").asInstanceOf[PromiseConstructor]
}
