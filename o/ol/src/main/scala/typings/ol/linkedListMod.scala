package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedListMod {
  
  @JSImport("ol/structs/LinkedList", JSImport.Default)
  @js.native
  class default () extends LinkedList {
    def this(opt_circular: Boolean) = this()
  }
  
  @js.native
  trait Item extends StObject {
    
    var data: js.Any = js.native
    
    var next: js.UndefOr[Item] = js.native
    
    var prev: js.UndefOr[Item] = js.native
  }
  object Item {
    
    @scala.inline
    def apply(data: js.Any): Item = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: Item): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrev(value: Item): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
  
  @js.native
  trait LinkedList extends StObject {
    
    /**
      * Concatenates two lists.
      */
    def concat(list: LinkedList): Unit = js.native
    
    /**
      * Sets the cursor to the first item, and returns the associated data.
      */
    def firstItem(): js.Any = js.native
    
    /**
      * Returns the current item's data.
      */
    def getCurrItem(): js.Any = js.native
    
    /**
      * Returns the current length of the list.
      */
    def getLength(): Double = js.native
    
    /**
      * Returns the next item's data without moving the cursor.
      */
    def getNextItem(): js.Any = js.native
    
    /**
      * Returns the previous item's data without moving the cursor.
      */
    def getPrevItem(): js.Any = js.native
    
    /**
      * Inserts an item into the linked list right after the current one.
      */
    def insertItem(data: js.Any): Unit = js.native
    
    /**
      * Sets the cursor to the last item, and returns the associated data.
      */
    def lastItem(): js.Any = js.native
    
    /**
      * Sets the cursor to the next item, and returns the associated data.
      */
    def nextItem(): js.Any = js.native
    
    /**
      * Sets the cursor to the previous item, and returns the associated data.
      */
    def prevItem(): js.Any = js.native
    
    /**
      * Removes the current item from the list. Sets the cursor to the next item,
      * if possible.
      */
    def removeItem(): Unit = js.native
    
    /**
      * Sets the first item of the list. This only works for circular lists, and sets
      * the last item accordingly.
      */
    def setFirstItem(): Unit = js.native
  }
  object LinkedList {
    
    @scala.inline
    def apply(
      concat: LinkedList => Unit,
      firstItem: () => js.Any,
      getCurrItem: () => js.Any,
      getLength: () => Double,
      getNextItem: () => js.Any,
      getPrevItem: () => js.Any,
      insertItem: js.Any => Unit,
      lastItem: () => js.Any,
      nextItem: () => js.Any,
      prevItem: () => js.Any,
      removeItem: () => Unit,
      setFirstItem: () => Unit
    ): LinkedList = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), firstItem = js.Any.fromFunction0(firstItem), getCurrItem = js.Any.fromFunction0(getCurrItem), getLength = js.Any.fromFunction0(getLength), getNextItem = js.Any.fromFunction0(getNextItem), getPrevItem = js.Any.fromFunction0(getPrevItem), insertItem = js.Any.fromFunction1(insertItem), lastItem = js.Any.fromFunction0(lastItem), nextItem = js.Any.fromFunction0(nextItem), prevItem = js.Any.fromFunction0(prevItem), removeItem = js.Any.fromFunction0(removeItem), setFirstItem = js.Any.fromFunction0(setFirstItem))
      __obj.asInstanceOf[LinkedList]
    }
    
    @scala.inline
    implicit class LinkedListMutableBuilder[Self <: LinkedList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcat(value: LinkedList => Unit): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirstItem(value: () => js.Any): Self = StObject.set(x, "firstItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrItem(value: () => js.Any): Self = StObject.set(x, "getCurrItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNextItem(value: () => js.Any): Self = StObject.set(x, "getNextItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrevItem(value: () => js.Any): Self = StObject.set(x, "getPrevItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInsertItem(value: js.Any => Unit): Self = StObject.set(x, "insertItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLastItem(value: () => js.Any): Self = StObject.set(x, "lastItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextItem(value: () => js.Any): Self = StObject.set(x, "nextItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrevItem(value: () => js.Any): Self = StObject.set(x, "prevItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveItem(value: () => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetFirstItem(value: () => Unit): Self = StObject.set(x, "setFirstItem", js.Any.fromFunction0(value))
    }
  }
}
