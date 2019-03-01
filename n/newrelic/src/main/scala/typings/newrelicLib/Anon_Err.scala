package typings
package newrelicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var moduleName: java.lang.String
  var onError: js.UndefOr[js.Function1[/* err */ stdLib.Error, scala.Unit]] = js.undefined
  def onRequire(): scala.Unit
}

object Anon_Err {
  @scala.inline
  def apply(
    moduleName: java.lang.String,
    onRequire: js.Function0[scala.Unit],
    onError: js.Function1[/* err */ stdLib.Error, scala.Unit] = null
  ): Anon_Err = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moduleName")(moduleName)
    __obj.updateDynamic("onRequire")(onRequire)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    __obj.asInstanceOf[Anon_Err]
  }
}

