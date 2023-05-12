package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsPriorityQueueMod {
  
  /**
    * @classdesc
    * Priority queue.
    *
    * The implementation is inspired from the Closure Library's Heap class and
    * Python's heapq module.
    *
    * See https://github.com/google/closure-library/blob/master/closure/goog/structs/heap.js
    * and https://hg.python.org/cpython/file/2.7/Lib/heapq.py.
    *
    * @template T
    */
  @JSImport("ol/structs/PriorityQueue", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with PriorityQueue[T] {
    /**
      * @param {function(T): number} priorityFunction Priority function.
      * @param {function(T): string} keyFunction Key function.
      */
    def this(
      priorityFunction: js.Function1[/* arg0 */ T, Double],
      keyFunction: js.Function1[/* arg0 */ T, String]
    ) = this()
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Remove and return the highest-priority element. O(log N).
      * @return {T} Element.
      */
    /* CompleteClass */
    override def dequeue(): T = js.native
    
    /**
      * @type {Array<T>}
      * @private
      */
    /* private */ /* CompleteClass */
    var elements_ : Any = js.native
    
    /**
      * Enqueue an element. O(log N).
      * @param {T} element Element.
      * @return {boolean} The element was added to the queue.
      */
    /* CompleteClass */
    override def enqueue(element: T): Boolean = js.native
    
    /**
      * @return {number} Count.
      */
    /* CompleteClass */
    override def getCount(): Double = js.native
    
    /**
      * Gets the index of the left child of the node at the given index.
      * @param {number} index The index of the node to get the left child for.
      * @return {number} The index of the left child.
      * @private
      */
    /* private */ /* CompleteClass */
    var getLeftChildIndex_ : Any = js.native
    
    /**
      * Gets the index of the parent of the node at the given index.
      * @param {number} index The index of the node to get the parent for.
      * @return {number} The index of the parent.
      * @private
      */
    /* private */ /* CompleteClass */
    var getParentIndex_ : Any = js.native
    
    /**
      * Gets the index of the right child of the node at the given index.
      * @param {number} index The index of the node to get the right child for.
      * @return {number} The index of the right child.
      * @private
      */
    /* private */ /* CompleteClass */
    var getRightChildIndex_ : Any = js.native
    
    /**
      * Make this a heap. O(N).
      * @private
      */
    /* private */ /* CompleteClass */
    var heapify_ : Any = js.native
    
    /**
      * @return {boolean} Is empty.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /**
      * @param {string} key Key.
      * @return {boolean} Is key queued.
      */
    /* CompleteClass */
    override def isKeyQueued(key: String): Boolean = js.native
    
    /**
      * @param {T} element Element.
      * @return {boolean} Is queued.
      */
    /* CompleteClass */
    override def isQueued(element: T): Boolean = js.native
    
    /**
      * @type {function(T): string}
      * @private
      */
    /* private */ /* CompleteClass */
    var keyFunction_ : Any = js.native
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ /* CompleteClass */
    var priorities_ : Any = js.native
    
    /**
      * @type {function(T): number}
      * @private
      */
    /* private */ /* CompleteClass */
    var priorityFunction_ : Any = js.native
    
    /**
      * @type {!Object<string, boolean>}
      * @private
      */
    /* private */ /* CompleteClass */
    var queuedElements_ : Any = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def reprioritize(): Unit = js.native
    
    /**
      * @param {number} startIndex The index of the root.
      * @param {number} index The index of the node to move up.
      * @private
      */
    /* private */ /* CompleteClass */
    var siftDown_ : Any = js.native
    
    /**
      * @param {number} index The index of the node to move down.
      * @private
      */
    /* private */ /* CompleteClass */
    var siftUp_ : Any = js.native
  }
  
  @JSImport("ol/structs/PriorityQueue", "DROP")
  @js.native
  val DROP: Double = js.native
  
  /**
    * @classdesc
    * Priority queue.
    *
    * The implementation is inspired from the Closure Library's Heap class and
    * Python's heapq module.
    *
    * See https://github.com/google/closure-library/blob/master/closure/goog/structs/heap.js
    * and https://hg.python.org/cpython/file/2.7/Lib/heapq.py.
    *
    * @template T
    */
  trait PriorityQueue[T] extends StObject {
    
    /**
      * FIXME empty description for jsdoc
      */
    def clear(): Unit
    
    /**
      * Remove and return the highest-priority element. O(log N).
      * @return {T} Element.
      */
    def dequeue(): T
    
    /**
      * @type {Array<T>}
      * @private
      */
    /* private */ var elements_ : Any
    
    /**
      * Enqueue an element. O(log N).
      * @param {T} element Element.
      * @return {boolean} The element was added to the queue.
      */
    def enqueue(element: T): Boolean
    
    /**
      * @return {number} Count.
      */
    def getCount(): Double
    
    /**
      * Gets the index of the left child of the node at the given index.
      * @param {number} index The index of the node to get the left child for.
      * @return {number} The index of the left child.
      * @private
      */
    /* private */ var getLeftChildIndex_ : Any
    
    /**
      * Gets the index of the parent of the node at the given index.
      * @param {number} index The index of the node to get the parent for.
      * @return {number} The index of the parent.
      * @private
      */
    /* private */ var getParentIndex_ : Any
    
    /**
      * Gets the index of the right child of the node at the given index.
      * @param {number} index The index of the node to get the right child for.
      * @return {number} The index of the right child.
      * @private
      */
    /* private */ var getRightChildIndex_ : Any
    
    /**
      * Make this a heap. O(N).
      * @private
      */
    /* private */ var heapify_ : Any
    
    /**
      * @return {boolean} Is empty.
      */
    def isEmpty(): Boolean
    
    /**
      * @param {string} key Key.
      * @return {boolean} Is key queued.
      */
    def isKeyQueued(key: String): Boolean
    
    /**
      * @param {T} element Element.
      * @return {boolean} Is queued.
      */
    def isQueued(element: T): Boolean
    
    /**
      * @type {function(T): string}
      * @private
      */
    /* private */ var keyFunction_ : Any
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ var priorities_ : Any
    
    /**
      * @type {function(T): number}
      * @private
      */
    /* private */ var priorityFunction_ : Any
    
    /**
      * @type {!Object<string, boolean>}
      * @private
      */
    /* private */ var queuedElements_ : Any
    
    /**
      * FIXME empty description for jsdoc
      */
    def reprioritize(): Unit
    
    /**
      * @param {number} startIndex The index of the root.
      * @param {number} index The index of the node to move up.
      * @private
      */
    /* private */ var siftDown_ : Any
    
    /**
      * @param {number} index The index of the node to move down.
      * @private
      */
    /* private */ var siftUp_ : Any
  }
  object PriorityQueue {
    
    inline def apply[T](
      clear: () => Unit,
      dequeue: () => T,
      elements_ : Any,
      enqueue: T => Boolean,
      getCount: () => Double,
      getLeftChildIndex_ : Any,
      getParentIndex_ : Any,
      getRightChildIndex_ : Any,
      heapify_ : Any,
      isEmpty: () => Boolean,
      isKeyQueued: String => Boolean,
      isQueued: T => Boolean,
      keyFunction_ : Any,
      priorities_ : Any,
      priorityFunction_ : Any,
      queuedElements_ : Any,
      reprioritize: () => Unit,
      siftDown_ : Any,
      siftUp_ : Any
    ): PriorityQueue[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), elements_ = elements_.asInstanceOf[js.Any], enqueue = js.Any.fromFunction1(enqueue), getCount = js.Any.fromFunction0(getCount), getLeftChildIndex_ = getLeftChildIndex_.asInstanceOf[js.Any], getParentIndex_ = getParentIndex_.asInstanceOf[js.Any], getRightChildIndex_ = getRightChildIndex_.asInstanceOf[js.Any], heapify_ = heapify_.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), isKeyQueued = js.Any.fromFunction1(isKeyQueued), isQueued = js.Any.fromFunction1(isQueued), keyFunction_ = keyFunction_.asInstanceOf[js.Any], priorities_ = priorities_.asInstanceOf[js.Any], priorityFunction_ = priorityFunction_.asInstanceOf[js.Any], queuedElements_ = queuedElements_.asInstanceOf[js.Any], reprioritize = js.Any.fromFunction0(reprioritize), siftDown_ = siftDown_.asInstanceOf[js.Any], siftUp_ = siftUp_.asInstanceOf[js.Any])
      __obj.asInstanceOf[PriorityQueue[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PriorityQueue[?], T] (val x: Self & PriorityQueue[T]) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDequeue(value: () => T): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
      
      inline def setElements_(value: Any): Self = StObject.set(x, "elements_", value.asInstanceOf[js.Any])
      
      inline def setEnqueue(value: T => Boolean): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
      
      inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
      
      inline def setGetLeftChildIndex_(value: Any): Self = StObject.set(x, "getLeftChildIndex_", value.asInstanceOf[js.Any])
      
      inline def setGetParentIndex_(value: Any): Self = StObject.set(x, "getParentIndex_", value.asInstanceOf[js.Any])
      
      inline def setGetRightChildIndex_(value: Any): Self = StObject.set(x, "getRightChildIndex_", value.asInstanceOf[js.Any])
      
      inline def setHeapify_(value: Any): Self = StObject.set(x, "heapify_", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setIsKeyQueued(value: String => Boolean): Self = StObject.set(x, "isKeyQueued", js.Any.fromFunction1(value))
      
      inline def setIsQueued(value: T => Boolean): Self = StObject.set(x, "isQueued", js.Any.fromFunction1(value))
      
      inline def setKeyFunction_(value: Any): Self = StObject.set(x, "keyFunction_", value.asInstanceOf[js.Any])
      
      inline def setPriorities_(value: Any): Self = StObject.set(x, "priorities_", value.asInstanceOf[js.Any])
      
      inline def setPriorityFunction_(value: Any): Self = StObject.set(x, "priorityFunction_", value.asInstanceOf[js.Any])
      
      inline def setQueuedElements_(value: Any): Self = StObject.set(x, "queuedElements_", value.asInstanceOf[js.Any])
      
      inline def setReprioritize(value: () => Unit): Self = StObject.set(x, "reprioritize", js.Any.fromFunction0(value))
      
      inline def setSiftDown_(value: Any): Self = StObject.set(x, "siftDown_", value.asInstanceOf[js.Any])
      
      inline def setSiftUp_(value: Any): Self = StObject.set(x, "siftUp_", value.asInstanceOf[js.Any])
    }
  }
}
