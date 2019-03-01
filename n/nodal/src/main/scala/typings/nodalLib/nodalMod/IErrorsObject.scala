package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorsObject
  extends /* field */ org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] {
  var _query: js.UndefOr[js.Any] = js.undefined
}

object IErrorsObject {
  @scala.inline
  def apply(
    StringDictionary: /* field */ org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    _query: js.Any = null
  ): IErrorsObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_query != null) __obj.updateDynamic("_query")(_query)
    __obj.asInstanceOf[IErrorsObject]
  }
}

