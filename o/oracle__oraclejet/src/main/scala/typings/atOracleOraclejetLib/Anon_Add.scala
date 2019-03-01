package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var add: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* collection */ atOracleOraclejetLib.ojmodelMod.Collection, 
      /* xhr */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var fetchSize: js.UndefOr[scala.Double] = js.undefined
  var set: js.UndefOr[scala.Boolean] = js.undefined
  var since: js.UndefOr[js.Any] = js.undefined
  var startID: js.UndefOr[js.Any] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* collection */ atOracleOraclejetLib.ojmodelMod.Collection, 
      /* response */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var until: js.UndefOr[js.Any] = js.undefined
}

object Anon_Add {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    add: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Function3[
      /* collection */ atOracleOraclejetLib.ojmodelMod.Collection, 
      /* xhr */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ] = null,
    fetchSize: scala.Int | scala.Double = null,
    set: js.UndefOr[scala.Boolean] = js.undefined,
    since: js.Any = null,
    startID: js.Any = null,
    startIndex: scala.Int | scala.Double = null,
    success: js.Function3[
      /* collection */ atOracleOraclejetLib.ojmodelMod.Collection, 
      /* response */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ] = null,
    until: js.Any = null
  ): Anon_Add = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (error != null) __obj.updateDynamic("error")(error)
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(set)) __obj.updateDynamic("set")(set)
    if (since != null) __obj.updateDynamic("since")(since)
    if (startID != null) __obj.updateDynamic("startID")(startID)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[Anon_Add]
  }
}

