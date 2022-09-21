package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorityQueueMod {
  
  @JSImport("ol/structs/PriorityQueue", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with PriorityQueue[T] {
    def this(priorityFunction: js.Function1[/* p0 */ T, Double], keyFunction: js.Function1[/* p0 */ T, String]) = this()
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Remove and return the highest-priority element. O(log N).
      */
    /* CompleteClass */
    override def dequeue(): T = js.native
    
    /**
      * Enqueue an element. O(log N).
      */
    /* CompleteClass */
    override def enqueue(element: T): Boolean = js.native
    
    /* CompleteClass */
    override def getCount(): Double = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def isKeyQueued(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def isQueued(element: T): Boolean = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def reprioritize(): Unit = js.native
  }
  
  @JSImport("ol/structs/PriorityQueue", "DROP")
  @js.native
  val DROP: Double = js.native
  
  trait PriorityQueue[T] extends StObject {
    
    /**
      * FIXME empty description for jsdoc
      */
    def clear(): Unit
    
    /**
      * Remove and return the highest-priority element. O(log N).
      */
    def dequeue(): T
    
    /**
      * Enqueue an element. O(log N).
      */
    def enqueue(element: T): Boolean
    
    def getCount(): Double
    
    def isEmpty(): Boolean
    
    def isKeyQueued(key: String): Boolean
    
    def isQueued(element: T): Boolean
    
    /**
      * FIXME empty description for jsdoc
      */
    def reprioritize(): Unit
  }
  object PriorityQueue {
    
    inline def apply[T](
      clear: () => Unit,
      dequeue: () => T,
      enqueue: T => Boolean,
      getCount: () => Double,
      isEmpty: () => Boolean,
      isKeyQueued: String => Boolean,
      isQueued: T => Boolean,
      reprioritize: () => Unit
    ): PriorityQueue[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), getCount = js.Any.fromFunction0(getCount), isEmpty = js.Any.fromFunction0(isEmpty), isKeyQueued = js.Any.fromFunction1(isKeyQueued), isQueued = js.Any.fromFunction1(isQueued), reprioritize = js.Any.fromFunction0(reprioritize))
      __obj.asInstanceOf[PriorityQueue[T]]
    }
    
    extension [Self <: PriorityQueue[?], T](x: Self & PriorityQueue[T]) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDequeue(value: () => T): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
      
      inline def setEnqueue(value: T => Boolean): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
      
      inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setIsKeyQueued(value: String => Boolean): Self = StObject.set(x, "isKeyQueued", js.Any.fromFunction1(value))
      
      inline def setIsQueued(value: T => Boolean): Self = StObject.set(x, "isQueued", js.Any.fromFunction1(value))
      
      inline def setReprioritize(value: () => Unit): Self = StObject.set(x, "reprioritize", js.Any.fromFunction0(value))
    }
  }
}
