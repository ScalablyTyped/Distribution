package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobTriggers extends js.Object {
  val Count: Double
  def Add(Index: Double, ScheduledJobTrigger: IScheduledJobTrigger): Unit
  def Clone(): IScheduledJobTriggers
  def Item(Index: Double): IScheduledJobTrigger
  def Remove(Index: Double): Unit
}

object IScheduledJobTriggers {
  @scala.inline
  def apply(
    Add: (Double, IScheduledJobTrigger) => Unit,
    Clone: () => IScheduledJobTriggers,
    Count: Double,
    Item: Double => IScheduledJobTrigger,
    Remove: Double => Unit
  ): IScheduledJobTriggers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IScheduledJobTriggers]
  }
}

