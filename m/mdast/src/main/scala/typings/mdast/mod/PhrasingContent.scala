package typings.mdast.mod

import typings.mdast.mdastStrings.break
import typings.mdast.mdastStrings.delete
import typings.mdast.mdastStrings.emphasis
import typings.mdast.mdastStrings.footnote
import typings.mdast.mdastStrings.footnoteReference
import typings.mdast.mdastStrings.html
import typings.mdast.mdastStrings.image
import typings.mdast.mdastStrings.imageReference
import typings.mdast.mdastStrings.inlineCode
import typings.mdast.mdastStrings.link
import typings.mdast.mdastStrings.linkReference
import typings.mdast.mdastStrings.strong
import typings.mdast.mdastStrings.text
import typings.unist.mod.Data
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mod.StaticPhrasingContent
  - typings.mdast.mod.Link
  - typings.mdast.mod.LinkReference
*/
trait PhrasingContent extends _Content

object PhrasingContent {
  @scala.inline
  def Footnote(
    children: js.Array[PhrasingContent],
    `type`: footnote,
    data: Data = null,
    position: Position = null
  ): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Emphasis(
    children: js.Array[PhrasingContent],
    `type`: emphasis,
    data: Data = null,
    position: Position = null
  ): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def HTML(`type`: html, value: js.Any, data: Data = null, position: Position = null): PhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Break(`type`: break, data: Data = null, position: Position = null): PhrasingContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def FootnoteReference(
    identifier: String,
    `type`: footnoteReference,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): PhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def InlineCode(`type`: inlineCode, value: js.Any, data: Data = null, position: Position = null): PhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
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
  ): PhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete, data: Data = null, position: Position = null): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Link(
    children: js.Array[StaticPhrasingContent],
    `type`: link,
    url: String,
    data: Data = null,
    position: Position = null,
    title: String = null
  ): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Text(`type`: text, value: js.Any, data: Data = null, position: Position = null): PhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong, data: Data = null, position: Position = null): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def LinkReference(
    children: js.Array[StaticPhrasingContent],
    identifier: String,
    referenceType: ReferenceType,
    `type`: linkReference,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  @scala.inline
  def Image(
    `type`: image,
    url: String,
    alt: String = null,
    data: Data = null,
    position: Position = null,
    title: String = null
  ): PhrasingContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
}

