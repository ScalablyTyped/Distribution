package typings.pouchDashReduxDashMiddleware.pouchDashReduxDashMiddlewareMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document
  extends /* field */ StringDictionary[js.Any] {
  var _id: js.Any
}

object Document {
  @scala.inline
  def apply(_id: js.Any, StringDictionary: /* field */ StringDictionary[js.Any] = null): Document = {
    val __obj = js.Dynamic.literal(_id = _id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Document]
  }
}

