package typings
package olLib.structsLinkedListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedList extends js.Object {
  def concat(list: LinkedList): scala.Unit
  def firstItem(): js.Any
  def getCurrItem(): js.Any
  def getLength(): scala.Double
  def getNextItem(): js.Any
  def getPrevItem(): js.Any
  def insertItem(data: js.Any): scala.Unit
  def lastItem(): js.Any
  def nextItem(): js.Any
  def prevItem(): js.Any
  def removeItem(): scala.Unit
  def setFirstItem(): scala.Unit
}

object LinkedList {
  @scala.inline
  def apply(
    concat: LinkedList => scala.Unit,
    firstItem: () => js.Any,
    getCurrItem: () => js.Any,
    getLength: () => scala.Double,
    getNextItem: () => js.Any,
    getPrevItem: () => js.Any,
    insertItem: js.Any => scala.Unit,
    lastItem: () => js.Any,
    nextItem: () => js.Any,
    prevItem: () => js.Any,
    removeItem: () => scala.Unit,
    setFirstItem: () => scala.Unit
  ): LinkedList = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), firstItem = js.Any.fromFunction0(firstItem), getCurrItem = js.Any.fromFunction0(getCurrItem), getLength = js.Any.fromFunction0(getLength), getNextItem = js.Any.fromFunction0(getNextItem), getPrevItem = js.Any.fromFunction0(getPrevItem), insertItem = js.Any.fromFunction1(insertItem), lastItem = js.Any.fromFunction0(lastItem), nextItem = js.Any.fromFunction0(nextItem), prevItem = js.Any.fromFunction0(prevItem), removeItem = js.Any.fromFunction0(removeItem), setFirstItem = js.Any.fromFunction0(setFirstItem))
  
    __obj.asInstanceOf[LinkedList]
  }
}

