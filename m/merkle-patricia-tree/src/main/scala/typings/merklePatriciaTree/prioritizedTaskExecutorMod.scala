package typings.merklePatriciaTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle-patricia-tree/dist/prioritizedTaskExecutor", JSImport.Namespace)
@js.native
object prioritizedTaskExecutorMod extends js.Object {
  
  @js.native
  class PrioritizedTaskExecutor protected () extends js.Object {
    /**
      * Executes tasks up to maxPoolSize at a time, other items are put in a priority queue.
      * @class PrioritizedTaskExecutor
      * @private
      * @param {Number} maxPoolSize The maximum size of the pool
      * @prop {Number} maxPoolSize The maximum size of the pool
      * @prop {Number} currentPoolSize The current size of the pool
      * @prop {Array} queue The task queue
      */
    def this(maxPoolSize: Double) = this()
    
    var currentPoolSize: js.Any = js.native
    
    /**
      * Executes the task.
      * @private
      * @param {Number} priority The priority of the task
      * @param {Function} fn The function that accepts the callback, which must be called upon the task completion.
      */
    def execute(priority: Double, fn: js.Function): Unit = js.native
    
    /**
      * Checks if the taskExecutor is finished.
      * @private
      * @returns {Boolean} - Returns `true` if the taskExecutor is finished, otherwise returns `false`.
      */
    def finished(): Boolean = js.native
    
    var maxPoolSize: js.Any = js.native
    
    var queue: js.Any = js.native
  }
}
