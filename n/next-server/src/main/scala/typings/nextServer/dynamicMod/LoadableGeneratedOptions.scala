package typings.nextServer.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadableGeneratedOptions extends js.Object {
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.native
  var webpack: js.UndefOr[js.Function0[_]] = js.native
}

object LoadableGeneratedOptions {
  @scala.inline
  def apply(): LoadableGeneratedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadableGeneratedOptions]
  }
  @scala.inline
  implicit class LoadableGeneratedOptionsOps[Self <: LoadableGeneratedOptions] (val x: Self) extends AnyVal {
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
    def setModules(value: () => LoaderMap): Self = this.set("modules", js.Any.fromFunction0(value))
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setWebpack(value: () => _): Self = this.set("webpack", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWebpack: Self = this.set("webpack", js.undefined)
  }
  
}

