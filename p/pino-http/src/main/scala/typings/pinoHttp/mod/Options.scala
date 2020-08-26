package typings.pinoHttp.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pino.mod.DestinationStream
import typings.pino.mod.Level
import typings.pino.mod.Logger
import typings.pino.mod.LoggerOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for pino-http
  *
  * See https://github.com/pinojs/pino-http#pinohttpopts-stream
  */
@js.native
trait Options extends LoggerOptions {
  var autoLogging: js.UndefOr[Boolean | AutoLoggingOptions] = js.native
  var customAttributeKeys: js.UndefOr[CustomAttributeKeys] = js.native
  var customErrorMessage: js.UndefOr[js.Function2[/* error */ Error, /* res */ ServerResponse, String]] = js.native
  var customLogLevel: js.UndefOr[js.Function2[/* res */ ServerResponse, /* error */ Error, Level]] = js.native
  var customSuccessMessage: js.UndefOr[js.Function1[/* res */ ServerResponse, String]] = js.native
  var genReqId: js.UndefOr[GenReqId] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var reqCustomProps: js.UndefOr[js.Function1[/* req */ IncomingMessage, js.Object]] = js.native
  var stream: js.UndefOr[DestinationStream] = js.native
  var useLevel: js.UndefOr[Level] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAutoLogging(value: Boolean | AutoLoggingOptions): Self = this.set("autoLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLogging: Self = this.set("autoLogging", js.undefined)
    @scala.inline
    def setCustomAttributeKeys(value: CustomAttributeKeys): Self = this.set("customAttributeKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAttributeKeys: Self = this.set("customAttributeKeys", js.undefined)
    @scala.inline
    def setCustomErrorMessage(value: (/* error */ Error, /* res */ ServerResponse) => String): Self = this.set("customErrorMessage", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomErrorMessage: Self = this.set("customErrorMessage", js.undefined)
    @scala.inline
    def setCustomLogLevel(value: (/* res */ ServerResponse, /* error */ Error) => Level): Self = this.set("customLogLevel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomLogLevel: Self = this.set("customLogLevel", js.undefined)
    @scala.inline
    def setCustomSuccessMessage(value: /* res */ ServerResponse => String): Self = this.set("customSuccessMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomSuccessMessage: Self = this.set("customSuccessMessage", js.undefined)
    @scala.inline
    def setGenReqId(value: /* req */ IncomingMessage => ReqId): Self = this.set("genReqId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGenReqId: Self = this.set("genReqId", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setReqCustomProps(value: /* req */ IncomingMessage => js.Object): Self = this.set("reqCustomProps", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReqCustomProps: Self = this.set("reqCustomProps", js.undefined)
    @scala.inline
    def setStream(value: DestinationStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setUseLevel(value: Level): Self = this.set("useLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLevel: Self = this.set("useLevel", js.undefined)
  }
  
}

