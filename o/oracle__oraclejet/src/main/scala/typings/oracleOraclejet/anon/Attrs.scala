package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attrs
  extends /* key */ StringDictionary[js.Any] {
  var attrs: js.UndefOr[js.Object] = js.native
  var contentType: js.UndefOr[String] = js.native
  var error: js.UndefOr[
    js.Function3[/* model */ this.type, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  var patch: js.UndefOr[Boolean] = js.native
  var success: js.UndefOr[
    js.Function3[/* model */ this.type, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  var valdiate: js.UndefOr[Boolean] = js.native
  @JSName("wait")
  var wait_FAttrs: js.UndefOr[Boolean] = js.native
}

object Attrs {
  @scala.inline
  def apply(): Attrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attrs]
  }
  @scala.inline
  implicit class AttrsOps[Self <: Attrs] (val x: Self) extends AnyVal {
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
    def setAttrs(value: js.Object): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setError(value: (Attrs, /* xhr */ js.Any, /* options */ js.Object) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setPatch(value: Boolean): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    @scala.inline
    def setSuccess(value: (Attrs, /* response */ js.Any, /* options */ js.Object) => Unit): Self = this.set("success", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setValdiate(value: Boolean): Self = this.set("valdiate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValdiate: Self = this.set("valdiate", js.undefined)
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

