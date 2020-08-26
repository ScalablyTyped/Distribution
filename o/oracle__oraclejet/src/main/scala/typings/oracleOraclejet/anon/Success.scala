package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Success
  extends /* key */ StringDictionary[js.Any] {
  var error: js.UndefOr[js.Function3[/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* json */ js.UndefOr[js.Array[_]], Unit]] = js.native
}

object Success {
  @scala.inline
  def apply(): Success = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Success]
  }
  @scala.inline
  implicit class SuccessOps[Self <: Success] (val x: Self) extends AnyVal {
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
    def setError(value: (/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSuccess(value: /* json */ js.UndefOr[js.Array[_]] => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

