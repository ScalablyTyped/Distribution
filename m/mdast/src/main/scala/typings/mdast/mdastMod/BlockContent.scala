package typings.mdast.mdastMod

import typings.mdast.mdastNumbers.`1`
import typings.mdast.mdastNumbers.`2`
import typings.mdast.mdastNumbers.`3`
import typings.mdast.mdastNumbers.`4`
import typings.mdast.mdastNumbers.`5`
import typings.mdast.mdastNumbers.`6`
import typings.mdast.mdastStrings.blockquote
import typings.mdast.mdastStrings.code
import typings.mdast.mdastStrings.heading
import typings.mdast.mdastStrings.html
import typings.mdast.mdastStrings.list
import typings.mdast.mdastStrings.paragraph
import typings.mdast.mdastStrings.table
import typings.mdast.mdastStrings.thematicBreak
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mdastMod.Paragraph
  - typings.mdast.mdastMod.Heading
  - typings.mdast.mdastMod.ThematicBreak
  - typings.mdast.mdastMod.Blockquote
  - typings.mdast.mdastMod.List
  - typings.mdast.mdastMod.Table
  - typings.mdast.mdastMod.HTML
  - typings.mdast.mdastMod.Code
*/
trait BlockContent extends _TopLevelContent

object BlockContent {
  @scala.inline
  def ThematicBreak(`type`: thematicBreak, data: Data = null, position: Position = null): BlockContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def HTML(`type`: html, value: js.Any, data: Data = null, position: Position = null): BlockContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Blockquote(children: js.Array[BlockContent], `type`: blockquote, data: Data = null, position: Position = null): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Heading(
    children: js.Array[PhrasingContent],
    depth: `1` | `2` | `3` | `4` | `5` | `6`,
    `type`: heading,
    data: Data = null,
    position: Position = null
  ): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def List(
    children: js.Array[ListContent],
    `type`: list,
    data: Data = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    position: Position = null,
    spread: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null
  ): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Code(
    `type`: code,
    value: js.Any,
    data: Data = null,
    lang: String = null,
    meta: String = null,
    position: Position = null
  ): BlockContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Table(
    children: js.Array[TableContent],
    `type`: table,
    align: js.Array[AlignType] = null,
    data: Data = null,
    position: Position = null
  ): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Paragraph(
    children: js.Array[PhrasingContent],
    `type`: paragraph,
    data: Data = null,
    position: Position = null
  ): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
}

