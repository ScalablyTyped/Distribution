package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollection extends js.Object {
  val Count: scala.Double
  val Events: IEvents
  def Clear(): scala.Unit
  def Find(item: js.Any): scala.Double
  def GetAt(pos: scala.Double): js.Any
  def MoveTo(pos: scala.Double, newPos: scala.Double): scala.Unit
  def NewTo(pos: scala.Double, replace: scala.Boolean): js.Any
  def PutTo(pos: scala.Double, replace: scala.Boolean, item: js.Any): scala.Unit
  def RemoveAt(pos: scala.Double): scala.Unit
}

object ICollection {
  @scala.inline
  def apply(
    Clear: () => scala.Unit,
    Count: scala.Double,
    Events: IEvents,
    Find: js.Any => scala.Double,
    GetAt: scala.Double => js.Any,
    MoveTo: (scala.Double, scala.Double) => scala.Unit,
    NewTo: (scala.Double, scala.Boolean) => js.Any,
    PutTo: (scala.Double, scala.Boolean, js.Any) => scala.Unit,
    RemoveAt: scala.Double => scala.Unit
  ): ICollection = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), Count = Count, Events = Events, Find = js.Any.fromFunction1(Find), GetAt = js.Any.fromFunction1(GetAt), MoveTo = js.Any.fromFunction2(MoveTo), NewTo = js.Any.fromFunction2(NewTo), PutTo = js.Any.fromFunction3(PutTo), RemoveAt = js.Any.fromFunction1(RemoveAt))
  
    __obj.asInstanceOf[ICollection]
  }
}

