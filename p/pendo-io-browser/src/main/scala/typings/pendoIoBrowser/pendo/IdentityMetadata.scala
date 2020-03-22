package typings.pendoIoBrowser.pendo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  id ? :string} & pendo-io-browser.pendo.Metadata */
trait IdentityMetadata extends /* key */ StringDictionary[String | Double | Boolean] {
  var id: js.UndefOr[String] = js.undefined
}

object IdentityMetadata {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[String | Double | Boolean] = null, id: String = null): IdentityMetadata = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityMetadata]
  }
}

