package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.ojmodelMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collection
  extends /* propName */ StringDictionary[js.Any] {
  var error: js.UndefOr[
    js.Function3[/* collection */ Collection, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* collection */ Collection, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
}

object Anon_Collection {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    error: (/* collection */ Collection, /* xhr */ js.Any, /* options */ js.Object) => Unit = null,
    success: (/* collection */ Collection, /* response */ js.Any, /* options */ js.Object) => Unit = null
  ): Anon_Collection = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    __obj.asInstanceOf[Anon_Collection]
  }
}

