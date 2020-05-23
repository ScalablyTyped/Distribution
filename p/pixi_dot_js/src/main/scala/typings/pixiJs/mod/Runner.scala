package typings.pixiJs.mod

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
@JSImport("pixi.js", "Runner")
@js.native
class Runner protected ()
  extends typings.pixiJs.PIXI.Runner {
  def this(name: String) = this()
  /**
    * `true` if there are no this Runner contains no listeners
    *
    * @member {boolean}
    * @readonly
    */
  /* CompleteClass */
  override val empty: Boolean = js.native
  /**
    * The name of the runner.
    *
    * @member {string}
    * @readonly
    */
  /* CompleteClass */
  override val name: String = js.native
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
  /* CompleteClass */
  override def add(item: js.Any): typings.pixiJs.PIXI.Runner = js.native
  /**
    * Check to see if the listener is already in the Runner
    * @param {any} item - The listener that you would like to check.
    */
  /* CompleteClass */
  override def contains(item: js.Any): Unit = js.native
  /**
    * Remove all references, don't use after this.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Alias for `emit`
    * @memberof PIXI.Runner#
    * @method dispatch
    * @see PIXI.Runner#emit
    */
  /* CompleteClass */
  override def dispatch(): Unit = js.native
  /**
    * Dispatch/Broadcast Runner to all listeners added to the queue.
    * @param {...any} params - optional parameters to pass to each listener
    * @return {PIXI.Runner}
    */
  /* CompleteClass */
  override def emit(params: js.Any*): typings.pixiJs.PIXI.Runner = js.native
  /**
    * Remove a single listener from the dispatch queue.
    * @param {any} item - The listenr that you would like to remove.
    * @return {PIXI.Runner}
    */
  /* CompleteClass */
  override def remove(item: js.Any): typings.pixiJs.PIXI.Runner = js.native
  /**
    * Remove all listeners from the Runner
    * @return {PIXI.Runner}
    */
  /* CompleteClass */
  override def removeAll(): typings.pixiJs.PIXI.Runner = js.native
  /**
    * Alias for `emit`
    * @memberof PIXI.Runner#
    * @method run
    * @see PIXI.Runner#emit
    */
  /* CompleteClass */
  override def run(): Unit = js.native
}

