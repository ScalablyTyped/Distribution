package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jobs extends js.Object {
  var jobs: Double
  var total_ms: Double
}

object Jobs {
  @scala.inline
  def apply(jobs: Double, total_ms: Double): Jobs = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_ms = total_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobs]
  }
}

