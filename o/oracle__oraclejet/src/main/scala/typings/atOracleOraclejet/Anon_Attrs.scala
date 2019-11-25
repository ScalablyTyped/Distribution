package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs
  extends /* propName */ StringDictionary[js.Any] {
  var attrs: js.UndefOr[js.Object] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[js.Function3[/* model */ Model, /* xhr */ js.Any, /* options */ js.Object, Unit]] = js.undefined
  var patch: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* model */ Model, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  var valdiate: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FAnon_Attrs: js.UndefOr[Boolean] = js.undefined
}

object Anon_Attrs {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    attrs: js.Object = null,
    contentType: String = null,
    error: (/* model */ Model, /* xhr */ js.Any, /* options */ js.Object) => Unit = null,
    patch: js.UndefOr[Boolean] = js.undefined,
    success: (/* model */ Model, /* response */ js.Any, /* options */ js.Object) => Unit = null,
    valdiate: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): Anon_Attrs = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (!js.isUndefined(valdiate)) __obj.updateDynamic("valdiate")(valdiate.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attrs]
  }
}

