package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndRevision extends js.Object {
  var end: Double
  var revision: Double
  var start: Double
}

object Anon_EndRevision {
  @scala.inline
  def apply(end: Double, revision: Double, start: Double): Anon_EndRevision = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EndRevision]
  }
}

