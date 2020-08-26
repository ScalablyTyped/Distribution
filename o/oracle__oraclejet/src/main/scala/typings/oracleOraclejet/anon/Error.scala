package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error
  extends /* key */ StringDictionary[js.Any] {
  var error: js.UndefOr[
    js.Function3[/* model */ this.type, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  var success: js.UndefOr[
    js.Function3[/* model */ this.type, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
}

object Error {
  @scala.inline
  def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setError(value: (Error, /* xhr */ js.Any, /* options */ js.Object) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSuccess(value: (Error, /* response */ js.Any, /* options */ js.Object) => Unit): Self = this.set("success", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

