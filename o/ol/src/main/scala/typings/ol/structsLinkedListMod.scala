package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsLinkedListMod {
  
  /**
    * @module ol/structs/LinkedList
    */
  /**
    * @typedef {Object} Item
    * @property {Item} [prev] Previous.
    * @property {Item} [next] Next.
    * @property {?} data Data.
    */
  /**
    * @classdesc
    * Creates an empty linked list structure.
    */
  @JSImport("ol/structs/LinkedList", JSImport.Default)
  @js.native
  /**
    * @param {boolean} [circular] The last item is connected to the first one,
    * and the first item to the last one. Default is true.
    */
  open class default ()
    extends StObject
       with LinkedList {
    def this(circular: Boolean) = this()
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ /* CompleteClass */
    var circular_ : Any = js.native
    
    /**
      * Concatenates two lists.
      * @param {LinkedList} list List to merge into the current list.
      */
    /* CompleteClass */
    override def concat(list: LinkedList): Unit = js.native
    
    /**
      * Sets the cursor to the first item, and returns the associated data.
      *
      * @return {?} Item data.
      */
    /* CompleteClass */
    override def firstItem(): Any = js.native
    
    /**
      * @private
      * @type {Item|undefined}
      */
    /* private */ /* CompleteClass */
    var first_ : Any = js.native
    
    /**
      * Returns the current item's data.
      *
      * @return {?} Item data.
      */
    /* CompleteClass */
    override def getCurrItem(): Any = js.native
    
    /**
      * Returns the current length of the list.
      *
      * @return {number} Length.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the next item's data without moving the cursor.
      *
      * @return {?} Item data.
      */
    /* CompleteClass */
    override def getNextItem(): Any = js.native
    
    /**
      * Returns the previous item's data without moving the cursor.
      *
      * @return {?} Item data.
      */
    /* CompleteClass */
    override def getPrevItem(): Any = js.native
    
    /**
      * @private
      * @type {Item|undefined}
      */
    /* private */ /* CompleteClass */
    var head_ : Any = js.native
    
    /**
      * Inserts an item into the linked list right after the current one.
      *
      * @param {?} data Item data.
      */
    /* CompleteClass */
    override def insertItem(data: Any): Unit = js.native
    
    /**
      * Sets the cursor to the last item, and returns the associated data.
      *
      * @return {?} Item data.
      */
    /* CompleteClass */
    override def lastItem(): Any = js.native
    
    /**
      * @private
      * @type {Item|undefined}
      */
    /* private */ /* CompleteClass */
    var last_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ /* CompleteClass */
    var length_ : Any = js.native
    
    /**
      * Sets the cursor to the next item, and returns the associated data.
      *
      * @return {?} Item data.
      */
    /* CompleteClass */
    override def nextItem(): Any = js.native
    
    /**
      * Sets the cursor to the previous item, and returns the associated data.
      *
      * @return {?} Item data.
      */
    /* CompleteClass */
    override def prevItem(): Any = js.native
    
    /**
      * Removes the current item from the list. Sets the cursor to the next item,
      * if possible.
      */
    /* CompleteClass */
    override def removeItem(): Unit = js.native
    
    /**
      * Sets the first item of the list. This only works for circular lists, and sets
      * the last item accordingly.
      */
    /* CompleteClass */
    override def setFirstItem(): Unit = js.native
  }
  
  trait Item extends StObject {
    
    /**
      * Data.
      */
    var data: Any
    
    /**
      * Next.
      */
    var next: js.UndefOr[Item] = js.undefined
    
    /**
      * Previous.
      */
    var prev: js.UndefOr[Item] = js.undefined
  }
  object Item {
    
    inline def apply(data: Any): Item = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Item): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: Item): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
  
  /**
    * @module ol/structs/LinkedList
    */
  /**
    * @typedef {Object} Item
    * @property {Item} [prev] Previous.
    * @property {Item} [next] Next.
    * @property {?} data Data.
    */
  /**
    * @classdesc
    * Creates an empty linked list structure.
    */
  trait LinkedList extends StObject {
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var circular_ : Any
    
    /**
      * Concatenates two lists.
      * @param {LinkedList} list List to merge into the current list.
      */
    def concat(list: LinkedList): Unit
    
    /**
      * Sets the cursor to the first item, and returns the associated data.
      *
      * @return {?} Item data.
      */
    def firstItem(): Any
    
    /**
      * @private
      * @type {Item|undefined}
      */
    /* private */ var first_ : Any
    
    /**
      * Returns the current item's data.
      *
      * @return {?} Item data.
      */
    def getCurrItem(): Any
    
    /**
      * Returns the current length of the list.
      *
      * @return {number} Length.
      */
    def getLength(): Double
    
    /**
      * Returns the next item's data without moving the cursor.
      *
      * @return {?} Item data.
      */
    def getNextItem(): Any
    
    /**
      * Returns the previous item's data without moving the cursor.
      *
      * @return {?} Item data.
      */
    def getPrevItem(): Any
    
    /**
      * @private
      * @type {Item|undefined}
      */
    /* private */ var head_ : Any
    
    /**
      * Inserts an item into the linked list right after the current one.
      *
      * @param {?} data Item data.
      */
    def insertItem(data: Any): Unit
    
    /**
      * Sets the cursor to the last item, and returns the associated data.
      *
      * @return {?} Item data.
      */
    def lastItem(): Any
    
    /**
      * @private
      * @type {Item|undefined}
      */
    /* private */ var last_ : Any
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var length_ : Any
    
    /**
      * Sets the cursor to the next item, and returns the associated data.
      *
      * @return {?} Item data.
      */
    def nextItem(): Any
    
    /**
      * Sets the cursor to the previous item, and returns the associated data.
      *
      * @return {?} Item data.
      */
    def prevItem(): Any
    
    /**
      * Removes the current item from the list. Sets the cursor to the next item,
      * if possible.
      */
    def removeItem(): Unit
    
    /**
      * Sets the first item of the list. This only works for circular lists, and sets
      * the last item accordingly.
      */
    def setFirstItem(): Unit
  }
  object LinkedList {
    
    inline def apply(
      circular_ : Any,
      concat: LinkedList => Unit,
      firstItem: () => Any,
      first_ : Any,
      getCurrItem: () => Any,
      getLength: () => Double,
      getNextItem: () => Any,
      getPrevItem: () => Any,
      head_ : Any,
      insertItem: Any => Unit,
      lastItem: () => Any,
      last_ : Any,
      length_ : Any,
      nextItem: () => Any,
      prevItem: () => Any,
      removeItem: () => Unit,
      setFirstItem: () => Unit
    ): LinkedList = {
      val __obj = js.Dynamic.literal(circular_ = circular_.asInstanceOf[js.Any], concat = js.Any.fromFunction1(concat), firstItem = js.Any.fromFunction0(firstItem), first_ = first_.asInstanceOf[js.Any], getCurrItem = js.Any.fromFunction0(getCurrItem), getLength = js.Any.fromFunction0(getLength), getNextItem = js.Any.fromFunction0(getNextItem), getPrevItem = js.Any.fromFunction0(getPrevItem), head_ = head_.asInstanceOf[js.Any], insertItem = js.Any.fromFunction1(insertItem), lastItem = js.Any.fromFunction0(lastItem), last_ = last_.asInstanceOf[js.Any], length_ = length_.asInstanceOf[js.Any], nextItem = js.Any.fromFunction0(nextItem), prevItem = js.Any.fromFunction0(prevItem), removeItem = js.Any.fromFunction0(removeItem), setFirstItem = js.Any.fromFunction0(setFirstItem))
      __obj.asInstanceOf[LinkedList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkedList] (val x: Self) extends AnyVal {
      
      inline def setCircular_(value: Any): Self = StObject.set(x, "circular_", value.asInstanceOf[js.Any])
      
      inline def setConcat(value: LinkedList => Unit): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setFirstItem(value: () => Any): Self = StObject.set(x, "firstItem", js.Any.fromFunction0(value))
      
      inline def setFirst_(value: Any): Self = StObject.set(x, "first_", value.asInstanceOf[js.Any])
      
      inline def setGetCurrItem(value: () => Any): Self = StObject.set(x, "getCurrItem", js.Any.fromFunction0(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      inline def setGetNextItem(value: () => Any): Self = StObject.set(x, "getNextItem", js.Any.fromFunction0(value))
      
      inline def setGetPrevItem(value: () => Any): Self = StObject.set(x, "getPrevItem", js.Any.fromFunction0(value))
      
      inline def setHead_(value: Any): Self = StObject.set(x, "head_", value.asInstanceOf[js.Any])
      
      inline def setInsertItem(value: Any => Unit): Self = StObject.set(x, "insertItem", js.Any.fromFunction1(value))
      
      inline def setLastItem(value: () => Any): Self = StObject.set(x, "lastItem", js.Any.fromFunction0(value))
      
      inline def setLast_(value: Any): Self = StObject.set(x, "last_", value.asInstanceOf[js.Any])
      
      inline def setLength_(value: Any): Self = StObject.set(x, "length_", value.asInstanceOf[js.Any])
      
      inline def setNextItem(value: () => Any): Self = StObject.set(x, "nextItem", js.Any.fromFunction0(value))
      
      inline def setPrevItem(value: () => Any): Self = StObject.set(x, "prevItem", js.Any.fromFunction0(value))
      
      inline def setRemoveItem(value: () => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction0(value))
      
      inline def setSetFirstItem(value: () => Unit): Self = StObject.set(x, "setFirstItem", js.Any.fromFunction0(value))
    }
  }
}
