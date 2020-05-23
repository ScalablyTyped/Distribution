package typings.pollyjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordingsDir extends js.Object {
  var recordingsDir: js.UndefOr[String] = js.undefined
}

object RecordingsDir {
  @scala.inline
  def apply(recordingsDir: String = null): RecordingsDir = {
    val __obj = js.Dynamic.literal()
    if (recordingsDir != null) __obj.updateDynamic("recordingsDir")(recordingsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingsDir]
  }
}

