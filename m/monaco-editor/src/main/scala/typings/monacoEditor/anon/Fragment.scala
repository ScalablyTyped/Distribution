package typings.monacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fragment extends js.Object {
  var authority: js.UndefOr[String] = js.native
  var fragment: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var scheme: String = js.native
}

object Fragment {
  @scala.inline
  def apply(scheme: String): Fragment = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
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
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

