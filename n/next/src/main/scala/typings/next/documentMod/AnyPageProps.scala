package typings.next.documentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyPageProps
  extends PageProps
     with /* key */ StringDictionary[js.Any]

object AnyPageProps {
  @scala.inline
  def apply(url: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnyPageProps = {
    val __obj = js.Dynamic.literal(url = url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnyPageProps]
  }
}

