package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseStats extends js.Object {
  var additions: scala.Double
  var deletions: scala.Double
  var total: scala.Double
}

object ReposGetCommitResponseStats {
  @scala.inline
  def apply(additions: scala.Double, deletions: scala.Double, total: scala.Double): ReposGetCommitResponseStats = {
    val __obj = js.Dynamic.literal(additions = additions, deletions = deletions, total = total)
  
    __obj.asInstanceOf[ReposGetCommitResponseStats]
  }
}

