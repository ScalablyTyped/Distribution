package typings.poi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chunks extends js.Object {
  var chunks: js.UndefOr[js.Array[String]] = js.undefined
  var entry: String
}

object Anon_Chunks {
  @scala.inline
  def apply(entry: String, chunks: js.Array[String] = null): Anon_Chunks = {
    val __obj = js.Dynamic.literal(entry = entry)
    if (chunks != null) __obj.updateDynamic("chunks")(chunks)
    __obj.asInstanceOf[Anon_Chunks]
  }
}

