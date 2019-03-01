package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image
  extends StaticPhrasingContent
     with unistLib.unistMod.Node
     with Resource
     with Alternative {
  @JSName("type")
  var type_Image: mdastLib.mdastLibStrings.image
}

object Image {
  @scala.inline
  def apply(
    `type`: mdastLib.mdastLibStrings.image,
    url: java.lang.String,
    alt: java.lang.String = null,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null,
    title: java.lang.String = null
  ): Image = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("url")(url)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Image]
  }
}

