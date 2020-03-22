package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRevision extends js.Object {
  var end: Double
  var revision: Double
  var start: Double
}

object AnonRevision {
  @scala.inline
  def apply(end: Double, revision: Double, start: Double): AnonRevision = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRevision]
  }
}

