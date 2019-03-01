package typings
package nextLib.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyPageProps
  extends PageProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object AnyPageProps {
  @scala.inline
  def apply(
    url: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): AnyPageProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnyPageProps]
  }
}

