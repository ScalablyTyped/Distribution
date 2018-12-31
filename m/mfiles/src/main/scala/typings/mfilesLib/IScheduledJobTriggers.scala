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

