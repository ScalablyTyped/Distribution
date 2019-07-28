package typings.pino

import typings.pino.pinoMod.WriteFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsObject extends js.Object {
  /**
    * This option will create a pino-like log object instead of passing all arguments to a console method.
    * When `write` is set, `asObject` will always be `true`.
    */
  var asObject: js.UndefOr[Boolean] = js.undefined
  /**
    * Instead of passing log messages to console.log they can be passed to a supplied function. If `write` is
    * set to a single function, all logging objects are passed to this function. If write is an object, it can
    * have methods that correspond to the levels. When a message is logged at a given level, the corresponding
    * method is called. If a method isn't present, the logging falls back to using the `console`.
    */
  var write: js.UndefOr[WriteFn | Anon_Debug] = js.undefined
}

object Anon_AsObject {
  @scala.inline
  def apply(asObject: js.UndefOr[Boolean] = js.undefined, write: WriteFn | Anon_Debug = null): Anon_AsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asObject)) __obj.updateDynamic("asObject")(asObject)
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsObject]
  }
}

