package typings
package pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document
  extends /* field */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var _id: js.Any
}

object Document {
  @scala.inline
  def apply(
    _id: js.Any,
    StringDictionary: /* field */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Document]
  }
}

