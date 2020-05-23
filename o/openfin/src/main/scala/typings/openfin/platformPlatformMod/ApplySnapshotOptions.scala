package typings.openfin.platformPlatformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplySnapshotOptions extends js.Object {
  var closeExistingWindows: Boolean
}

object ApplySnapshotOptions {
  @scala.inline
  def apply(closeExistingWindows: Boolean): ApplySnapshotOptions = {
    val __obj = js.Dynamic.literal(closeExistingWindows = closeExistingWindows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySnapshotOptions]
  }
}

