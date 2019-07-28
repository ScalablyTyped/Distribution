package typings.mdast.mdastMod

import typings.mdast.mdastStrings.link
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link
  extends Parent
     with Resource
     with PhrasingContent {
  @JSName("children")
  var children_Link: js.Array[StaticPhrasingContent]
  @JSName("type")
  var type_Link: link
}

object Link {
  @scala.inline
  def apply(
    children: js.Array[StaticPhrasingContent],
    `type`: link,
    url: String,
    data: Data = null,
    position: Position = null,
    title: String = null
  ): Link = {
    val __obj = js.Dynamic.literal(children = children, url = url)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Link]
  }
}

