package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorModelOptions
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
}

object Anon_ErrorModelOptions {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    error: (/* model */ atOracleOraclejetLib.ojmodelMod.Model, /* xhr */ js.Any, /* options */ js.Object) => scala.Unit = null,
    success: (/* model */ atOracleOraclejetLib.ojmodelMod.Model, /* response */ js.Any, /* options */ js.Object) => scala.Unit = null
  ): Anon_ErrorModelOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    __obj.asInstanceOf[Anon_ErrorModelOptions]
  }
}

