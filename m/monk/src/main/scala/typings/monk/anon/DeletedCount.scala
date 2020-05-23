package typings.monk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletedCount extends js.Object {
  var deletedCount: Double
  var result: N
}

object DeletedCount {
  @scala.inline
  def apply(deletedCount: Double, result: N): DeletedCount = {
    val __obj = js.Dynamic.literal(deletedCount = deletedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedCount]
  }
}

