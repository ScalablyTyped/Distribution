package typings.pinoMultiStream.anon

import typings.node.NodeJS.WritableStream
import typings.pino.mod.DestinationStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var level: js.UndefOr[typings.pinoMultiStream.mod.Level] = js.undefined
  var stream: DestinationStream | WritableStream
}

object Level {
  @scala.inline
  def apply(stream: DestinationStream | WritableStream, level: typings.pinoMultiStream.mod.Level = null): Level = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

