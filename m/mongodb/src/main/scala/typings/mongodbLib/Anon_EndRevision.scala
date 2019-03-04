package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndRevision extends js.Object {
  var end: scala.Double
  var revision: scala.Double
  var start: scala.Double
}

object Anon_EndRevision {
  @scala.inline
  def apply(end: scala.Double, revision: scala.Double, start: scala.Double): Anon_EndRevision = {
    val __obj = js.Dynamic.literal(end = end, revision = revision, start = start)
  
    __obj.asInstanceOf[Anon_EndRevision]
  }
}

