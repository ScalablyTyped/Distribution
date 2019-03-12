package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobTriggers extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ScheduledJobTrigger: IScheduledJobTrigger): scala.Unit
  def Clone(): IScheduledJobTriggers
  def Item(Index: scala.Double): IScheduledJobTrigger
  def Remove(Index: scala.Double): scala.Unit
}

object IScheduledJobTriggers {
  @scala.inline
  def apply(
    Add: (scala.Double, IScheduledJobTrigger) => scala.Unit,
    Clone: () => IScheduledJobTriggers,
    Count: scala.Double,
    Item: scala.Double => IScheduledJobTrigger,
    Remove: scala.Double => scala.Unit
  ): IScheduledJobTriggers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IScheduledJobTriggers]
  }
}

