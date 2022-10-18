package typings.merklePatriciaTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPrioritizedTaskExecutorMod {
  
  @JSImport("merkle-patricia-tree/dist/prioritizedTaskExecutor", "PrioritizedTaskExecutor")
  @js.native
  open class PrioritizedTaskExecutor protected () extends StObject {
    /**
      * Executes tasks up to maxPoolSize at a time, other items are put in a priority queue.
      * @class PrioritizedTaskExecutor
      * @private
      * @param maxPoolSize The maximum size of the pool
      */
    def this(maxPoolSize: Double) = this()
    
    /** The current size of the pool */
    /* private */ var currentPoolSize: Any = js.native
    
    /**
      * Executes the task or queues it if no spots are available.
      * When a task is added, check if there are spots left in the pool.
      * If a spot is available, claim that spot and give back the spot once the asynchronous task has been resolved.
      * When no spots are available, add the task to the task queue. The task will be executed at some point when another task has been resolved.
      * @private
      * @param priority The priority of the task
      * @param fn The function that accepts the callback, which must be called upon the task completion.
      */
    def executeOrQueue(priority: Double, fn: js.Function): Unit = js.native
    
    /**
      * Checks if the taskExecutor is finished.
      * @private
      * @returns Returns `true` if the taskExecutor is finished, otherwise returns `false`.
      */
    def finished(): Boolean = js.native
    
    /** The maximum size of the pool */
    /* private */ var maxPoolSize: Any = js.native
    
    /** The task queue */
    /* private */ var queue: Any = js.native
  }
}
