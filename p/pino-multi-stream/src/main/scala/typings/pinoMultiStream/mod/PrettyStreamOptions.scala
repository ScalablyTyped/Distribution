package typings.pinoMultiStream.mod

import typings.node.NodeJS.WritableStream
import typings.pino.mod.DestinationStream
import typings.pino.mod.PrettyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<pino.pino.LoggerOptions, 'prettyPrint'> */
@js.native
trait PrettyStreamOptions extends js.Object {
  var dest: js.UndefOr[DestinationStream | WritableStream] = js.native
  /**
    * Allows to optionally define which prettifier module to use
    */
  // TODO: use type definitions from 'pino-pretty' when available.
  var prettifier: js.UndefOr[js.Any] = js.native
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.native
}

object PrettyStreamOptions {
  @scala.inline
  def apply(): PrettyStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrettyStreamOptions]
  }
  @scala.inline
  implicit class PrettyStreamOptionsOps[Self <: PrettyStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDest(value: DestinationStream | WritableStream): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    @scala.inline
    def setPrettifier(value: js.Any): Self = this.set("prettifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettifier: Self = this.set("prettifier", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean | PrettyOptions): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
  }
  
}

