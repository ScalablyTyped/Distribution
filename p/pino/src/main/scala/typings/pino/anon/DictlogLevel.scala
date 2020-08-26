package typings.pino.anon

import org.scalablytyped.runtime.StringDictionary
import typings.pino.mod.WriteFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictlogLevel extends /* logLevel */ StringDictionary[WriteFn] {
  var debug: js.UndefOr[WriteFn] = js.native
  var error: js.UndefOr[WriteFn] = js.native
  var fatal: js.UndefOr[WriteFn] = js.native
  var info: js.UndefOr[WriteFn] = js.native
  var trace: js.UndefOr[WriteFn] = js.native
  var warn: js.UndefOr[WriteFn] = js.native
}

object DictlogLevel {
  @scala.inline
  def apply(): DictlogLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictlogLevel]
  }
  @scala.inline
  implicit class DictlogLevelOps[Self <: DictlogLevel] (val x: Self) extends AnyVal {
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
    def setDebug(value: /* o */ js.Object => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setError(value: /* o */ js.Object => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFatal(value: /* o */ js.Object => Unit): Self = this.set("fatal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFatal: Self = this.set("fatal", js.undefined)
    @scala.inline
    def setInfo(value: /* o */ js.Object => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setTrace(value: /* o */ js.Object => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    @scala.inline
    def setWarn(value: /* o */ js.Object => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
  
}

