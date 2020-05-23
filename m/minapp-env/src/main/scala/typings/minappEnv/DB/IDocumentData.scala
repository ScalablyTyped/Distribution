package typings.minappEnv.DB

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentData
  extends /* key */ StringDictionary[js.Any] {
  var _id: js.UndefOr[DocumentId] = js.undefined
}

object IDocumentData {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, _id: DocumentId = null): IDocumentData = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentData]
  }
}

