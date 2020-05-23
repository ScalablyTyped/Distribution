package typings.pino.anon

import typings.pino.mod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /**
    * Specifies the minimum level (inclusive) of when the `send` function should be called, if not supplied
    * the `send` function will be called based on the main logging `level` (set via `options.level`,
    * defaulting to `info`).
    */
  var level: js.UndefOr[typings.pino.mod.Level | String] = js.undefined
  /**
    * Remotely record log messages.
    *
    * @description Called after writing the log message.
    */
  def send(level: typings.pino.mod.Level, logEvent: LogEvent): Unit
}

object Level {
  @scala.inline
  def apply(send: (typings.pino.mod.Level, LogEvent) => Unit, level: typings.pino.mod.Level | String = null): Level = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

