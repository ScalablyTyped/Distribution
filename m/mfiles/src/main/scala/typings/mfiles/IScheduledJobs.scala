package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobs extends js.Object {
  val Count: Double
  def Item(Index: Double): IScheduledJob
}

object IScheduledJobs {
  @scala.inline
  def apply(Count: Double, Item: Double => IScheduledJob): IScheduledJobs = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IScheduledJobs]
  }
}

