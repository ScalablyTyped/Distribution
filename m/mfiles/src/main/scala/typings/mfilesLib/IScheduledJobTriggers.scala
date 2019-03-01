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
    Add: js.Function2[scala.Double, IScheduledJobTrigger, scala.Unit],
    Clone: js.Function0[IScheduledJobTriggers],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IScheduledJobTrigger],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IScheduledJobTriggers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IScheduledJobTriggers]
  }
}

