package typings.atPollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecordingsDir extends js.Object {
  var recordingsDir: js.UndefOr[String] = js.undefined
}

object Anon_RecordingsDir {
  @scala.inline
  def apply(recordingsDir: String = null): Anon_RecordingsDir = {
    val __obj = js.Dynamic.literal()
    if (recordingsDir != null) __obj.updateDynamic("recordingsDir")(recordingsDir)
    __obj.asInstanceOf[Anon_RecordingsDir]
  }
}

