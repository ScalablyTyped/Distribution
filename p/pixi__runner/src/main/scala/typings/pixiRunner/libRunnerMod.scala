package typings.pixiRunner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRunnerMod {
  
  @JSImport("@pixi/runner/lib/Runner", "Runner")
  @js.native
  open class Runner protected () extends StObject {
    /**
      * @param name - The function name that will be executed on the listeners added to this Runner.
      */
    def this(name: String) = this()
    
    /* private */ var _aliasCount: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /**
      * Add a listener to the Runner
      *
      * Runners do not need to have scope or functions passed to them.
      * All that is required is to pass the listening object and ensure that it has contains a function that has the same name
      * as the name provided to the Runner when it was created.
      *
      * E.g. A listener passed to this Runner will require a 'complete' function.
      *
      * ```js
      * import { Runner } from '@pixi/runner';
      *
      * const complete = new Runner('complete');
      * ```
      *
      * The scope used will be the object itself.
      * @param {any} item - The object that will be listening.
      */
    def add(item: Any): this.type = js.native
    
    /**
      * Check to see if the listener is already in the Runner
      * @param {any} item - The listener that you would like to check.
      */
    def contains(item: Any): Boolean = js.native
    
    /** Remove all references, don't use after this. */
    def destroy(): Unit = js.native
    
    /**
      * Dispatch/Broadcast Runner to all listeners added to the queue.
      * @param {...any} params - (optional) parameters to pass to each listener
      */
    def emit(
      a0: js.UndefOr[Any],
      a1: js.UndefOr[Any],
      a2: js.UndefOr[Any],
      a3: js.UndefOr[Any],
      a4: js.UndefOr[Any],
      a5: js.UndefOr[Any],
      a6: js.UndefOr[Any],
      a7: js.UndefOr[Any]
    ): this.type = js.native
    
    /**
      * `true` if there are no this Runner contains no listeners
      * @readonly
      */
    def empty: Boolean = js.native
    
    /* private */ var ensureNonAliasedItems: Any = js.native
    
    var items: js.Array[Any] = js.native
    
    /**
      * The name of the runner.
      * @readonly
      */
    def name: String = js.native
    
    /**
      * Remove a single listener from the dispatch queue.
      * @param {any} item - The listener that you would like to remove.
      */
    def remove(item: Any): this.type = js.native
    
    /** Remove all listeners from the Runner */
    def removeAll(): this.type = js.native
  }
}
