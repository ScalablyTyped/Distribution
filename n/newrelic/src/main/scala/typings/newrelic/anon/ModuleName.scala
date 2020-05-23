package typings.newrelic.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleName extends js.Object {
  var moduleName: String
  var onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
  def onRequire(): Unit
}

object ModuleName {
  @scala.inline
  def apply(moduleName: String, onRequire: () => Unit, onError: /* err */ Error => Unit = null): ModuleName = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], onRequire = js.Any.fromFunction0(onRequire))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[ModuleName]
  }
}

