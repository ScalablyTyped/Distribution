package typings.overlayscrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionInfo extends js.Object {
  var defaultOptions: js.UndefOr[js.Object] = js.native
  var name: String = js.native
  def extensionFactory(defaultOptions: js.Object, compatibility: Compatibility, framework: js.Any): Extension = js.native
}

object ExtensionInfo {
  @scala.inline
  def apply(extensionFactory: (js.Object, Compatibility, js.Any) => Extension, name: String): ExtensionInfo = {
    val __obj = js.Dynamic.literal(extensionFactory = js.Any.fromFunction3(extensionFactory), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  @scala.inline
  implicit class ExtensionInfoOps[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
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
    def setExtensionFactory(value: (js.Object, Compatibility, js.Any) => Extension): Self = this.set("extensionFactory", js.Any.fromFunction3(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultOptions(value: js.Object): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOptions: Self = this.set("defaultOptions", js.undefined)
  }
  
}

