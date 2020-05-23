package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorsObject
  extends /* field */ StringDictionary[js.Array[String]] {
  var _query: js.UndefOr[js.Any] = js.undefined
}

object IErrorsObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Array[String]] = null, _query: js.Any = null): IErrorsObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_query != null) __obj.updateDynamic("_query")(_query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorsObject]
  }
}

