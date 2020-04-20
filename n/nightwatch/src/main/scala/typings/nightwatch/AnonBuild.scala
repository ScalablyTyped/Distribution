package typings.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuild extends js.Object {
  var build: AnonRevision
  var status: AnonArch
}

object AnonBuild {
  @scala.inline
  def apply(build: AnonRevision, status: AnonArch): AnonBuild = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuild]
  }
}

