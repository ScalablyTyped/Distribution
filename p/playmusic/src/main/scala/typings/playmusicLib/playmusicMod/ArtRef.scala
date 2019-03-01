package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtRef extends js.Object {
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ArtRef {
  @scala.inline
  def apply(url: java.lang.String = null): ArtRef = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ArtRef]
  }
}

