package typings.nuclearJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reactor extends js.Object {
  
  var ReactMixin: typings.nuclearJs.mod.ReactMixin = js.native
  
  /**
    * Allows multiple dispatches within the `fn` function before notifying
    * any observers.
    */
  def batch(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Dispatches a message to all registered Stores.
    *
    * This process is done synchronously, all registered Stores are passed
    * this message and all components are re-evaluated (efficiently). After
    * a dispatch, a Reactor will emit the new state on the
    * reactor.changeEmitter.
    */
  def dispatch(actionType: String): Unit = js.native
  def dispatch(actionType: String, payload: js.Any): Unit = js.native
  
  /**
    * Returns the immutable value for some KeyPath or Getter in the reactor
    * state.
    *
    * Returns `undefined` if a keyPath doesn't have a value.
    */
  def evaluate(getter: Getter): js.Any = js.native
  
  /**
    * Returns a plain JS value for some KeyPath or Getter in the reactor
    * state.
    *
    * Returns `undefined` if a keyPath doesn't have a value.
    */
  def evaluateToJS(getter: Getter): js.Any = js.native
  
  /**
    * Takes a plain JavaScript object and merges into the reactor state,
    * using `store.deserialize()`.
    *
    * This can be useful if you need to load data already on the page.
    */
  def loadState(state: js.Any): Unit = js.native
  
  /**
    * Adds a change observer that is invoked whenever any dependencies of
    * the getter change.
    *
    * @returns An "unsubscribe" function
    */
  def observe(getter: Getter, handler: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): js.Function0[Unit] = js.native
  /**
    * Adds a change observer that is invoked whenever any part of the
    * reactor state changes.
    */
  def observe(handler: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  var observerState: js.Any = js.native
  
  var prevReactorState: js.Any = js.native
  
  var reactorState: js.Any = js.native
  
  /**
    * Registers stores.
    */
  def registerStores(stores: StringDictionary[Store[_]]): Unit = js.native
  
  /**
    * Replace store implementation (handlers) without modifying the app
    * state or calling `getInitialState`.
    *
    * Useful for hot reloading
    */
  def replaceStores(stores: StringDictionary[Store[_]]): Unit = js.native
  
  /**
    * Resets the state of a reactor and returns it back to initial state.
    */
  def reset(): Unit = js.native
  
  /**
    * Returns a plain JavaScript object representing the application state.
    *
    * By default this maps over all stores and returns `toJS(storeState)`.
    */
  def serialize(): js.Any = js.native
  
  /**
    * Removes the change observer for the getter.
    */
  def unobserve(getter: Getter, handler: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): Unit = js.native
}
@JSImport("nuclear-js", "Reactor")
@js.native
object Reactor
  extends /**
  * State is stored in NuclearJS Reactors. Reactors contain a `state` object
  * which is an Immutable.Map
  *
  * The only way Reactors can change state is by reacting to messages. To
  * update state, Reactor's dispatch messages to all registered stores, and
  * the store returns it's new state based on the message
  */
Instantiable0[Reactor]
     with Instantiable1[/* config */ ReactorConfig, Reactor] {
  
  /**
    * State is stored in NuclearJS Reactors. Reactors contain a `state` object
    * which is an Immutable.Map
    *
    * The only way Reactors can change state is by reacting to messages. To
    * update state, Reactor's dispatch messages to all registered stores, and
    * the store returns it's new state based on the message
    */
  def apply(): Reactor = js.native
  def apply(config: ReactorConfig): Reactor = js.native
}
