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
    val __obj = js.Dynamic.literal(end = end, revision = revision, start = start)
  
    __obj.asInstanceOf[Anon_EndRevision]
  }
}

