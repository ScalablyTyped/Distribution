package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deletions extends js.Object {
  var additions: Double
  var deletions: Double
  var total: Double
}

object Deletions {
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): Deletions = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deletions]
  }
}

