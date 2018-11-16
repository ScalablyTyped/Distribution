package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.KVOArray")
@js.native
class KVOArray protected () extends KVO {
  def this(array: js.Array[_]) = this()
  def clear(): scala.Unit = js.native
  def forEach(callback: js.Function2[/* element */ js.Any, /* index */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getArray(): js.Array[_] = js.native
  def getAt(index: scala.Double): js.Any = js.native
  def getIndexOfElement(element: js.Any): scala.Double = js.native
  def getLength(): scala.Double = js.native
  def insertAt(index: scala.Double, element: js.Any): scala.Unit = js.native
  def pop(): js.Any = js.native
  def push(element: js.Any): scala.Double = js.native
  def removeAt(index: scala.Double): js.Any = js.native
  def removeElement(element: js.Any): scala.Unit = js.native
  def setAt(index: scala.Double, element: js.Any): scala.Unit = js.native
  def splice(startIndex: scala.Double, deleteCount: scala.Double): js.Array[_] = js.native
  def splice(startIndex: scala.Double, deleteCount: scala.Double, element: js.Any): js.Array[_] = js.native
}

