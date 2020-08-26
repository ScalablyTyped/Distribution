package typings.pify.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PifyOptions extends js.Object {
  var errorFirst: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.Array[String | RegExp]] = js.native
  var excludeMain: js.UndefOr[Boolean] = js.native
  var include: js.UndefOr[js.Array[String | RegExp]] = js.native
  var multiArgs: js.UndefOr[Boolean] = js.native
  var promiseModule: js.UndefOr[PromiseModule] = js.native
}

object PifyOptions {
  @scala.inline
  def apply(): PifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PifyOptions]
  }
  @scala.inline
  implicit class PifyOptionsOps[Self <: PifyOptions] (val x: Self) extends AnyVal {
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
    def setErrorFirst(value: Boolean): Self = this.set("errorFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorFirst: Self = this.set("errorFirst", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String | RegExp]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExcludeMain(value: Boolean): Self = this.set("excludeMain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeMain: Self = this.set("excludeMain", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[String | RegExp]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setMultiArgs(value: Boolean): Self = this.set("multiArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiArgs: Self = this.set("multiArgs", js.undefined)
    @scala.inline
    def setPromiseModule(value: PromiseModule): Self = this.set("promiseModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromiseModule: Self = this.set("promiseModule", js.undefined)
  }
  
}

