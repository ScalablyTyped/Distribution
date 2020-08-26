package typings.oclazyload.oc

import typings.angular.mod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptionsConfig extends IRequestShortcutConfig {
  /**
    * If true, bypasses browser cache by appending a timestamp to URLs. Defaults to true.
    */
  @JSName("cache")
  var cache_IOptionsConfig: js.UndefOr[Boolean] = js.native
  /**
    * If set, will insert files immediately before the provided CSS selector, instead of the default behavior of inserting files immediately before the
    * last child of the <head> element. Defaults to undefined.
    */
  var insertBefore: js.UndefOr[String] = js.native
  /**
    * If true, a module config will be invoked each time the module is reloaded. Use with caution, as re-invoking configs can lead to unexpected results.
    * Defaults to false.
    */
  var reconfig: js.UndefOr[Boolean] = js.native
  /**
    * If true, a module run block will be invoked each time the module is reloaded. Use with caution, as re-invoking run blocks can lead to unexpected results.
    * Defaults to false.
    */
  var rerun: js.UndefOr[Boolean] = js.native
  /**
    * If true, will load files in a series, instead of in parallel. Defaults to false.
    */
  var serie: js.UndefOr[Boolean] = js.native
}

object IOptionsConfig {
  @scala.inline
  def apply(): IOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptionsConfig]
  }
  @scala.inline
  implicit class IOptionsConfigOps[Self <: IOptionsConfig] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setInsertBefore(value: String): Self = this.set("insertBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    @scala.inline
    def setReconfig(value: Boolean): Self = this.set("reconfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconfig: Self = this.set("reconfig", js.undefined)
    @scala.inline
    def setRerun(value: Boolean): Self = this.set("rerun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRerun: Self = this.set("rerun", js.undefined)
    @scala.inline
    def setSerie(value: Boolean): Self = this.set("serie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerie: Self = this.set("serie", js.undefined)
  }
  
}

