package typings.ol.linkedListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedList extends js.Object {
  def concat(list: LinkedList): Unit = js.native
  def firstItem(): js.Any = js.native
  def getCurrItem(): js.Any = js.native
  def getLength(): Double = js.native
  def getNextItem(): js.Any = js.native
  def getPrevItem(): js.Any = js.native
  def insertItem(data: js.Any): Unit = js.native
  def lastItem(): js.Any = js.native
  def nextItem(): js.Any = js.native
  def prevItem(): js.Any = js.native
  def removeItem(): Unit = js.native
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
  implicit class LinkedListOps[Self <: LinkedList] (val x: Self) extends AnyVal {
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
    def setConcat(value: LinkedList => Unit): Self = this.set("concat", js.Any.fromFunction1(value))
    @scala.inline
    def setFirstItem(value: () => js.Any): Self = this.set("firstItem", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrItem(value: () => js.Any): Self = this.set("getCurrItem", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNextItem(value: () => js.Any): Self = this.set("getNextItem", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPrevItem(value: () => js.Any): Self = this.set("getPrevItem", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertItem(value: js.Any => Unit): Self = this.set("insertItem", js.Any.fromFunction1(value))
    @scala.inline
    def setLastItem(value: () => js.Any): Self = this.set("lastItem", js.Any.fromFunction0(value))
    @scala.inline
    def setNextItem(value: () => js.Any): Self = this.set("nextItem", js.Any.fromFunction0(value))
    @scala.inline
    def setPrevItem(value: () => js.Any): Self = this.set("prevItem", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveItem(value: () => Unit): Self = this.set("removeItem", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFirstItem(value: () => Unit): Self = this.set("setFirstItem", js.Any.fromFunction0(value))
  }
  
}

