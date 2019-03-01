package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collection
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var error: js.UndefOr[
    js.Function3[
      /* collection */ atOracleOraclejetLib.ojmodelMod.Collection, 
      /* xhr */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* collection */ atOracleOraclejetLib.ojmodelMod.Collection, 
      /* response */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_Collection {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    error: js.Function3[
      /* collection */ atOracleOraclejetLib.ojmodelMod.Collection, 
      /* xhr */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ] = null,
    success: js.Function3[
      /* collection */ atOracleOraclejetLib.ojmodelMod.Collection, 
      /* response */ js.Any, 
      /* options */ js.Object, 
      scala.Unit
    ] = null
  ): Anon_Collection = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_Collection]
  }
}

