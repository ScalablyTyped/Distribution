package typings.pendoIoBrowser.pendo

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  id  :string} & pendo-io-browser.pendo.Metadata */
trait Visitor
  extends /* key */ StringDictionary[String | Double | Boolean | Date | (js.Array[Double | String])] {
  var id: String
}

object Visitor {
  @scala.inline
  def apply(
    id: String,
    StringDictionary: /* key */ StringDictionary[String | Double | Boolean | Date | (js.Array[Double | String])] = null
  ): Visitor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Visitor]
  }
}

