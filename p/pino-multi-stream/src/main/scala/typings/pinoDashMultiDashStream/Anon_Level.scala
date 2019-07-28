package typings.pinoDashMultiDashStream

import typings.node.NodeJSNs.WritableStream
import typings.pinoDashMultiDashStream.pinoDashMultiDashStreamMod.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: js.UndefOr[Level] = js.undefined
  var stream: WritableStream
}

object Anon_Level {
  @scala.inline
  def apply(stream: WritableStream, level: Level = null): Anon_Level = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (level != null) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[Anon_Level]
  }
}

