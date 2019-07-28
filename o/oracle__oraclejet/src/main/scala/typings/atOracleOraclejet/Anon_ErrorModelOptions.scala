package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorModelOptions
  extends /* propName */ StringDictionary[js.Any] {
  var error: js.UndefOr[js.Function3[/* model */ Model, /* xhr */ js.Any, /* options */ js.Object, Unit]] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* model */ Model, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
}

object Anon_ErrorModelOptions {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    error: (/* model */ Model, /* xhr */ js.Any, /* options */ js.Object) => Unit = null,
    success: (/* model */ Model, /* response */ js.Any, /* options */ js.Object) => Unit = null
  ): Anon_ErrorModelOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    __obj.asInstanceOf[Anon_ErrorModelOptions]
  }
}

