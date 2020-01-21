package typings.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecordingsDir extends js.Object {
  var recordingsDir: js.UndefOr[String] = js.undefined
}

object AnonRecordingsDir {
  @scala.inline
  def apply(recordingsDir: String = null): AnonRecordingsDir = {
    val __obj = js.Dynamic.literal()
    if (recordingsDir != null) __obj.updateDynamic("recordingsDir")(recordingsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecordingsDir]
  }
}

