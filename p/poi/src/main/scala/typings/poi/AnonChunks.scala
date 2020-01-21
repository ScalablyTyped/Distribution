package typings.poi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChunks extends js.Object {
  var chunks: js.UndefOr[js.Array[String]] = js.undefined
  var entry: String
}

object AnonChunks {
  @scala.inline
  def apply(entry: String, chunks: js.Array[String] = null): AnonChunks = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChunks]
  }
}

