package typings.pinoMultiStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerOptions
  extends typings.pino.mod.LoggerOptions {
  
  var streams: js.UndefOr[Streams] = js.native
}
object LoggerOptions {
  
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setStreamsVarargs(value: typings.pinoMultiStream.anon.Level*): Self = this.set("streams", js.Array(value :_*))
    
    @scala.inline
    def setStreams(value: Streams): Self = this.set("streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreams: Self = this.set("streams", js.undefined)
  }
}
