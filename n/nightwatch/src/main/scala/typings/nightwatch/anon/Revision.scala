package typings.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revision extends js.Object {
  var revision: String
  var time: String
  var version: String
}

object Revision {
  @scala.inline
  def apply(revision: String, time: String, version: String): Revision = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
}

