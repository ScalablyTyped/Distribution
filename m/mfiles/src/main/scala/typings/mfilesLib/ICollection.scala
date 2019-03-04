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
    Clear: js.Function0[scala.Unit],
    Count: scala.Double,
    Events: IEvents,
    Find: js.Function1[js.Any, scala.Double],
    GetAt: js.Function1[scala.Double, js.Any],
    MoveTo: js.Function2[scala.Double, scala.Double, scala.Unit],
    NewTo: js.Function2[scala.Double, scala.Boolean, js.Any],
    PutTo: js.Function3[scala.Double, scala.Boolean, js.Any, scala.Unit],
    RemoveAt: js.Function1[scala.Double, scala.Unit]
  ): ICollection = {
    val __obj = js.Dynamic.literal(Clear = Clear, Count = Count, Events = Events, Find = Find, GetAt = GetAt, MoveTo = MoveTo, NewTo = NewTo, PutTo = PutTo, RemoveAt = RemoveAt)
  
    __obj.asInstanceOf[ICollection]
  }
}

