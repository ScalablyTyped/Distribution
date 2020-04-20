package typings.ol.linkedListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedList extends js.Object {
  def concat(list: LinkedList): Unit
  def firstItem(): js.Any
  def getCurrItem(): js.Any
  def getLength(): Double
  def getNextItem(): js.Any
  def getPrevItem(): js.Any
  def insertItem(data: js.Any): Unit
  def lastItem(): js.Any
  def nextItem(): js.Any
  def prevItem(): js.Any
  def removeItem(): Unit
  def setFirstItem(): Unit
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
}

