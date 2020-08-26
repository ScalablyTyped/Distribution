package typings.newrelic.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleName extends js.Object {
  var moduleName: String = js.native
  var onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  def onRequire(): Unit = js.native
}

object ModuleName {
  @scala.inline
  def apply(moduleName: String, onRequire: () => Unit): ModuleName = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], onRequire = js.Any.fromFunction0(onRequire))
    __obj.asInstanceOf[ModuleName]
  }
  @scala.inline
  implicit class ModuleNameOps[Self <: ModuleName] (val x: Self) extends AnyVal {
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
    def setModuleName(value: String): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRequire(value: () => Unit): Self = this.set("onRequire", js.Any.fromFunction0(value))
    @scala.inline
    def setOnError(value: /* err */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
  }
  
}

