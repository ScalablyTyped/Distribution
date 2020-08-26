package typings.openfin.windowWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowInfo extends js.Object {
  var canNavigateBack: Boolean = js.native
  var canNavigateForward: Boolean = js.native
  var preloadScripts: js.Array[_] = js.native
  var title: String = js.native
  var url: String = js.native
}

object WindowInfo {
  @scala.inline
  def apply(
    canNavigateBack: Boolean,
    canNavigateForward: Boolean,
    preloadScripts: js.Array[_],
    title: String,
    url: String
  ): WindowInfo = {
    val __obj = js.Dynamic.literal(canNavigateBack = canNavigateBack.asInstanceOf[js.Any], canNavigateForward = canNavigateForward.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowInfo]
  }
  @scala.inline
  implicit class WindowInfoOps[Self <: WindowInfo] (val x: Self) extends AnyVal {
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
    def setCanNavigateBack(value: Boolean): Self = this.set("canNavigateBack", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanNavigateForward(value: Boolean): Self = this.set("canNavigateForward", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreloadScriptsVarargs(value: js.Any*): Self = this.set("preloadScripts", js.Array(value :_*))
    @scala.inline
    def setPreloadScripts(value: js.Array[_]): Self = this.set("preloadScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

