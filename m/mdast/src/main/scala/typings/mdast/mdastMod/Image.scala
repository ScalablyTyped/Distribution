package typings.mdast.mdastMod

import typings.mdast.mdastStrings.image
import typings.unist.unistMod.Data
import typings.unist.unistMod.Node
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image
  extends StaticPhrasingContent
     with Node
     with Resource
     with Alternative {
  @JSName("type")
  var type_Image: image
}

object Image {
  @scala.inline
  def apply(
    `type`: image,
    url: String,
    alt: String = null,
    data: Data = null,
    position: Position = null,
    title: String = null
  ): Image = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

