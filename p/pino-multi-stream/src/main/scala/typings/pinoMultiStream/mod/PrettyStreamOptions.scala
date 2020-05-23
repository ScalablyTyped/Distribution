package typings.pinoMultiStream.mod

import typings.node.NodeJS.WritableStream
import typings.pino.mod.DestinationStream
import typings.pino.mod.PrettyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<pino.pino.LoggerOptions, 'prettyPrint'> */
trait PrettyStreamOptions extends js.Object {
  var dest: js.UndefOr[DestinationStream | WritableStream] = js.undefined
  /**
    * Allows to optionally define which prettifier module to use
    */
  // TODO: use type definitions from 'pino-pretty' when available.
  var prettifier: js.UndefOr[js.Any] = js.undefined
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.undefined
}

object PrettyStreamOptions {
  @scala.inline
  def apply(
    dest: DestinationStream | WritableStream = null,
    prettifier: js.Any = null,
    prettyPrint: Boolean | PrettyOptions = null
  ): PrettyStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (prettifier != null) __obj.updateDynamic("prettifier")(prettifier.asInstanceOf[js.Any])
    if (prettyPrint != null) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrettyStreamOptions]
  }
}

