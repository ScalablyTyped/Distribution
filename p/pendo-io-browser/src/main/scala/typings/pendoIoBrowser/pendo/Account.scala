package typings.pendoIoBrowser.pendo

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  id ? :string} & pendo-io-browser.pendo.Metadata */
trait Account
  extends /* key */ StringDictionary[String | Double | Boolean | Date | (js.Array[Double | String])] {
  var id: js.UndefOr[String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[String | Double | Boolean | Date | (js.Array[Double | String])] = null,
    id: String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

