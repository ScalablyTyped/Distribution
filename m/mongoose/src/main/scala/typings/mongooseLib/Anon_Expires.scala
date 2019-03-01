package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expires
  extends /* other */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var expires: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Expires {
  @scala.inline
  def apply(
    StringDictionary: /* other */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    expires: java.lang.String = null
  ): Anon_Expires = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    __obj.asInstanceOf[Anon_Expires]
  }
}

