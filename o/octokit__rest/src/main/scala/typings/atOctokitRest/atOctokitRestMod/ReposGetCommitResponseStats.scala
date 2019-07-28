package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseStats extends js.Object {
  var additions: Double
  var deletions: Double
  var total: Double
}

object ReposGetCommitResponseStats {
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): ReposGetCommitResponseStats = {
    val __obj = js.Dynamic.literal(additions = additions, deletions = deletions, total = total)
  
    __obj.asInstanceOf[ReposGetCommitResponseStats]
  }
}

