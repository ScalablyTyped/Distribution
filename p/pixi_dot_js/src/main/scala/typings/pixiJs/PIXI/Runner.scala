package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Runner extends js.Object {
  
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
object Runner {
  
  @scala.inline
  def apply(
    add: js.Any => Runner,
    contains: js.Any => Unit,
    destroy: () => Unit,
    dispatch: () => Unit,
    emit: /* repeated */ js.Any => Runner,
    empty: Boolean,
    name: String,
    remove: js.Any => Runner,
    removeAll: () => Runner,
    run: () => Unit
  ): Runner = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), contains = js.Any.fromFunction1(contains), destroy = js.Any.fromFunction0(destroy), dispatch = js.Any.fromFunction0(dispatch), emit = js.Any.fromFunction1(emit), empty = empty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[Runner]
  }
  
  @scala.inline
  implicit class RunnerOps[Self <: Runner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: js.Any => Runner): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContains(value: js.Any => Unit): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispatch(value: () => Unit): Self = this.set("dispatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmit(value: /* repeated */ js.Any => Runner): Self = this.set("emit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Runner): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: () => Runner): Self = this.set("removeAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
  }
}
