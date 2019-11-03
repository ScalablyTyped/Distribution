package typings.nodeDashResque

import typings.nodeDashResque.nodeDashResqueMod.Job
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RTimestamp extends js.Object {
  var rTimestamp: Double
  var tasks: js.Array[Job[_]]
}

object Anon_RTimestamp {
  @scala.inline
  def apply(rTimestamp: Double, tasks: js.Array[Job[_]]): Anon_RTimestamp = {
    val __obj = js.Dynamic.literal(rTimestamp = rTimestamp, tasks = tasks)
  
    __obj.asInstanceOf[Anon_RTimestamp]
  }
}

