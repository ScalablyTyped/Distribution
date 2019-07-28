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
    val __obj = js.Dynamic.literal(revision = revision, time = time, version = version)
  
    __obj.asInstanceOf[Anon_Revision]
  }
}

