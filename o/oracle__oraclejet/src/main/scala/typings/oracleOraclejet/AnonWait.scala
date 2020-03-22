package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWait
  extends /* propName */ StringDictionary[js.Any] {
  var error: js.UndefOr[js.Function3[/* model */ Model, /* xhr */ js.Any, /* options */ js.Object, Unit]] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* model */ Model, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  @JSName("wait")
  var wait_FAnonWait: js.UndefOr[Boolean] = js.undefined
}

object AnonWait {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    error: (/* model */ Model, /* xhr */ js.Any, /* options */ js.Object) => Unit = null,
    success: (/* model */ Model, /* response */ js.Any, /* options */ js.Object) => Unit = null,
    wait: js.UndefOr[Boolean] = js.undefined
  ): AnonWait = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWait]
  }
}

