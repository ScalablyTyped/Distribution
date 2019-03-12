package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var attrs: js.UndefOr[js.Object] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* model */ atOracleOraclejetLib.ojmodelMod.Model, 
      /* xhr */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var patch: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* model */ atOracleOraclejetLib.ojmodelMod.Model, 
      /* response */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var valdiate: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("wait")
  var wait_FAnon_Attrs: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Attrs {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    attrs: js.Object = null,
    contentType: java.lang.String = null,
    error: (/* model */ atOracleOraclejetLib.ojmodelMod.Model, /* xhr */ js.Any, /* options */ js.Object) => scala.Unit = null,
    patch: js.UndefOr[scala.Boolean] = js.undefined,
    success: (/* model */ atOracleOraclejetLib.ojmodelMod.Model, /* response */ js.Any, /* options */ js.Object) => scala.Unit = null,
    valdiate: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Attrs = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (!js.isUndefined(valdiate)) __obj.updateDynamic("valdiate")(valdiate)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Anon_Attrs]
  }
}

