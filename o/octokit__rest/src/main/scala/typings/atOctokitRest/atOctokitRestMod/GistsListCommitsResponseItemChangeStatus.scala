package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListCommitsResponseItemChangeStatus extends js.Object {
  var additions: Double
  var deletions: Double
  var total: Double
}

object GistsListCommitsResponseItemChangeStatus {
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): GistsListCommitsResponseItemChangeStatus = {
    val __obj = js.Dynamic.literal(additions = additions, deletions = deletions, total = total)
  
    __obj.asInstanceOf[GistsListCommitsResponseItemChangeStatus]
  }
}

