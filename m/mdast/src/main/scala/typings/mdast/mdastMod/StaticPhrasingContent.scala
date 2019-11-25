package typings.mdast.mdastMod

import typings.mdast.mdastStrings.break
import typings.mdast.mdastStrings.delete
import typings.mdast.mdastStrings.emphasis
import typings.mdast.mdastStrings.footnote
import typings.mdast.mdastStrings.footnoteReference
import typings.mdast.mdastStrings.html
import typings.mdast.mdastStrings.image
import typings.mdast.mdastStrings.imageReference
import typings.mdast.mdastStrings.inlineCode
import typings.mdast.mdastStrings.strong
import typings.mdast.mdastStrings.text
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mdastMod.Text
  - typings.mdast.mdastMod.Emphasis
  - typings.mdast.mdastMod.Strong
  - typings.mdast.mdastMod.Delete
  - typings.mdast.mdastMod.HTML
  - typings.mdast.mdastMod.InlineCode
  - typings.mdast.mdastMod.Break
  - typings.mdast.mdastMod.Image
  - typings.mdast.mdastMod.ImageReference
  - typings.mdast.mdastMod.Footnote
  - typings.mdast.mdastMod.FootnoteReference
*/
trait StaticPhrasingContent extends PhrasingContent

object StaticPhrasingContent {
  @scala.inline
  def Footnote(
    children: js.Array[PhrasingContent],
    `type`: footnote,
    data: Data = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Emphasis(
    children: js.Array[PhrasingContent],
    `type`: emphasis,
    data: Data = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Break(`type`: break, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def FootnoteReference(
    identifier: String,
    `type`: footnoteReference,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Text(`type`: text, value: String, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def HTML(`type`: html, value: String, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Image(
    `type`: image,
    url: String,
    alt: String = null,
    data: Data = null,
    position: Position = null,
    title: String = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def ImageReference(
    identifier: String,
    referenceType: ReferenceType,
    `type`: imageReference,
    alt: String = null,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def InlineCode(`type`: inlineCode, value: String, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
}

