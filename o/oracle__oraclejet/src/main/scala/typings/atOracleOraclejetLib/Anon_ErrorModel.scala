package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorModel
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var error: js.UndefOr[
    js.Function3[
      /* model */ atOracleOraclejetLib.ojmodelMod.Model, 
      /* xhr */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* model */ atOracleOraclejetLib.ojmodelMod.Model, 
      /* response */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  @JSName("wait")
  var wait_FAnon_ErrorModel: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ErrorModel {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    error: js.Function3[
      /* model */ atOracleOraclejetLib.ojmodelMod.Model, 
      /* xhr */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ] = null,
    success: js.Function3[
      /* model */ atOracleOraclejetLib.ojmodelMod.Model, 
      /* response */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ] = null,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ErrorModel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Anon_ErrorModel]
  }
}

