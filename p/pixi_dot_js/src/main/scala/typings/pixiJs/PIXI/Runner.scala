package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Runner is a highly performant and simple alternative to signals. Best used in situations
  * where events are dispatched to many objects at high frequency (say every frame!)
  *
  *
  * like a signal..
  * ```
  * import { Runner } from '@pixi/runner';
  *
  * const myObject = {
  *     loaded: new Runner('loaded')
  * }
  *
  * const listener = {
  *     loaded: function(){
  *         // thin
  *     }
  * }
  *
  * myObject.update.add(listener);
  *
  * myObject.loaded.emit();
  * ```
  *
  * Or for handling calling the same function on many items
  * ```
  * import { Runner } from '@pixi/runner';
  *
  * const myGame = {
  *     update: new Runner('update')
  * }
  *
  * const gameObject = {
  *     update: function(time){
  *         // update my gamey state
  *     }
  * }
  *
  * myGame.update.add(gameObject1);
  *
  * myGame.update.emit(time);
  * ```
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Runner")
@js.native
class Runner protected () extends js.Object {
  def this(name: String) = this()
  /**
    * `true` if there are no this Runner contains no listeners
    *
    * @member {boolean}
    * @readonly
    */
  val empty: Boolean = js.native
  /**
    * The name of the runner.
    *
    * @member {string}
    * @readonly
    */
  val name: String = js.native
  /**
    * Add a listener to the Runner
    *
    * Runners do not need to have scope or functions passed to them.
    * All that is required is to pass the listening object and ensure that it has contains a function that has the same name
    * as the name provided to the Runner when it was created.
    *
    * Eg A listener passed to this Runner will require a 'complete' function.
    *
    * ```
    * import { Runner } from '@pixi/runner';
    *
    * const complete = new Runner('complete');
    * ```
    *
    * The scope used will be the object itself.
    *
    * @param {any} item - The object that will be listening.
    * @return {PIXI.Runner}
    */
  def add(item: js.Any): Runner = js.native
  /**
    * Check to see if the listener is already in the Runner
    * @param {any} item - The listener that you would like to check.
    */
  def contains(item: js.Any): Unit = js.native
  /**
    * Remove all references, don't use after this.
    */
  def destroy(): Unit = js.native
  /**
    * Alias for `emit`
    * @memberof PIXI.Runner#
    * @method dispatch
    * @see PIXI.Runner#emit
    */
  def dispatch(): Unit = js.native
  /**
    * Dispatch/Broadcast Runner to all listeners added to the queue.
    * @param {...any} params - optional parameters to pass to each listener
    * @return {PIXI.Runner}
    */
  def emit(params: js.Any*): Runner = js.native
  /**
    * Remove a single listener from the dispatch queue.
    * @param {any} item - The listenr that you would like to remove.
    * @return {PIXI.Runner}
    */
  def remove(item: js.Any): Runner = js.native
  /**
    * Remove all listeners from the Runner
    * @return {PIXI.Runner}
    */
  def removeAll(): Runner = js.native
  /**
    * Alias for `emit`
    * @memberof PIXI.Runner#
    * @method run
    * @see PIXI.Runner#emit
    */
  def run(): Unit = js.native
}

