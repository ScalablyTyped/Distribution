package typings
package nightwatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Revision extends js.Object {
  var revision: java.lang.String
  var time: java.lang.String
  var version: java.lang.String
}

object Anon_Revision {
  @scala.inline
  def apply(revision: java.lang.String, time: java.lang.String, version: java.lang.String): Anon_Revision = {
    val __obj = js.Dynamic.literal(revision = revision, time = time, version = version)
  
    __obj.asInstanceOf[Anon_Revision]
  }
}

