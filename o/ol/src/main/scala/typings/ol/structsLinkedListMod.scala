package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsLinkedListMod {
  
  @JSImport("ol/structs/LinkedList", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LinkedList {
    def this(opt_circular: Boolean) = this()
    
    /**
      * Concatenates two lists.
      */
    /* CompleteClass */
    override def concat(list: LinkedList): Unit = js.native
    
    /**
      * Sets the cursor to the first item, and returns the associated data.
      */
    /* CompleteClass */
    override def firstItem(): Any = js.native
    
    /**
      * Returns the current item's data.
      */
    /* CompleteClass */
    override def getCurrItem(): Any = js.native
    
    /**
      * Returns the current length of the list.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /**
      * Returns the next item's data without moving the cursor.
      */
    /* CompleteClass */
    override def getNextItem(): Any = js.native
    
    /**
      * Returns the previous item's data without moving the cursor.
      */
    /* CompleteClass */
    override def getPrevItem(): Any = js.native
    
    /**
      * Inserts an item into the linked list right after the current one.
      */
    /* CompleteClass */
    override def insertItem(data: Any): Unit = js.native
    
    /**
      * Sets the cursor to the last item, and returns the associated data.
      */
    /* CompleteClass */
    override def lastItem(): Any = js.native
    
    /**
      * Sets the cursor to the next item, and returns the associated data.
      */
    /* CompleteClass */
    override def nextItem(): Any = js.native
    
    /**
      * Sets the cursor to the previous item, and returns the associated data.
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
    
    var data: Any
    
    var next: js.UndefOr[Item] = js.undefined
    
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
  
  trait LinkedList extends StObject {
    
    /**
      * Concatenates two lists.
      */
    def concat(list: LinkedList): Unit
    
    /**
      * Sets the cursor to the first item, and returns the associated data.
      */
    def firstItem(): Any
    
    /**
      * Returns the current item's data.
      */
    def getCurrItem(): Any
    
    /**
      * Returns the current length of the list.
      */
    def getLength(): Double
    
    /**
      * Returns the next item's data without moving the cursor.
      */
    def getNextItem(): Any
    
    /**
      * Returns the previous item's data without moving the cursor.
      */
    def getPrevItem(): Any
    
    /**
      * Inserts an item into the linked list right after the current one.
      */
    def insertItem(data: Any): Unit
    
    /**
      * Sets the cursor to the last item, and returns the associated data.
      */
    def lastItem(): Any
    
    /**
      * Sets the cursor to the next item, and returns the associated data.
      */
    def nextItem(): Any
    
    /**
      * Sets the cursor to the previous item, and returns the associated data.
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
      concat: LinkedList => Unit,
      firstItem: () => Any,
      getCurrItem: () => Any,
      getLength: () => Double,
      getNextItem: () => Any,
      getPrevItem: () => Any,
      insertItem: Any => Unit,
      lastItem: () => Any,
      nextItem: () => Any,
      prevItem: () => Any,
      removeItem: () => Unit,
      setFirstItem: () => Unit
    ): LinkedList = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), firstItem = js.Any.fromFunction0(firstItem), getCurrItem = js.Any.fromFunction0(getCurrItem), getLength = js.Any.fromFunction0(getLength), getNextItem = js.Any.fromFunction0(getNextItem), getPrevItem = js.Any.fromFunction0(getPrevItem), insertItem = js.Any.fromFunction1(insertItem), lastItem = js.Any.fromFunction0(lastItem), nextItem = js.Any.fromFunction0(nextItem), prevItem = js.Any.fromFunction0(prevItem), removeItem = js.Any.fromFunction0(removeItem), setFirstItem = js.Any.fromFunction0(setFirstItem))
      __obj.asInstanceOf[LinkedList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkedList] (val x: Self) extends AnyVal {
      
      inline def setConcat(value: LinkedList => Unit): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setFirstItem(value: () => Any): Self = StObject.set(x, "firstItem", js.Any.fromFunction0(value))
      
      inline def setGetCurrItem(value: () => Any): Self = StObject.set(x, "getCurrItem", js.Any.fromFunction0(value))
      
      inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      inline def setGetNextItem(value: () => Any): Self = StObject.set(x, "getNextItem", js.Any.fromFunction0(value))
      
      inline def setGetPrevItem(value: () => Any): Self = StObject.set(x, "getPrevItem", js.Any.fromFunction0(value))
      
      inline def setInsertItem(value: Any => Unit): Self = StObject.set(x, "insertItem", js.Any.fromFunction1(value))
      
      inline def setLastItem(value: () => Any): Self = StObject.set(x, "lastItem", js.Any.fromFunction0(value))
      
      inline def setNextItem(value: () => Any): Self = StObject.set(x, "nextItem", js.Any.fromFunction0(value))
      
      inline def setPrevItem(value: () => Any): Self = StObject.set(x, "prevItem", js.Any.fromFunction0(value))
      
      inline def setRemoveItem(value: () => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction0(value))
      
      inline def setSetFirstItem(value: () => Unit): Self = StObject.set(x, "setFirstItem", js.Any.fromFunction0(value))
    }
  }
}
