package typings.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Revision extends js.Object {
  var revision: String
  var time: String
  var version: String
}

object Anon_Revision {
  @scala.inline
  def apply(revision: String, time: String, version: String): Anon_Revision = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Revision]
  }
}

