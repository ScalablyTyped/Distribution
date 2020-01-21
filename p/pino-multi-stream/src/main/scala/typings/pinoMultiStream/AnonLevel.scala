package typings.pinoMultiStream

import typings.node.NodeJS.WritableStream
import typings.pinoMultiStream.mod.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: js.UndefOr[Level] = js.undefined
  var stream: WritableStream
}

object AnonLevel {
  @scala.inline
  def apply(stream: WritableStream, level: Level = null): AnonLevel = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
}

