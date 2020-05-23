package typings.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Build extends js.Object {
  var build: Revision
  var status: Arch
}

object Build {
  @scala.inline
  def apply(build: Revision, status: Arch): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
}

