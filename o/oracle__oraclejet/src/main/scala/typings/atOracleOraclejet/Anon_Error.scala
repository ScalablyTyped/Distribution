package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error
  extends /* propName */ StringDictionary[js.Any] {
  var error: js.UndefOr[js.Function3[/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* json */ js.UndefOr[js.Array[_]], Unit]] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    error: (/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any) => Unit = null,
    success: /* json */ js.UndefOr[js.Array[_]] => Unit = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[Anon_Error]
  }
}

