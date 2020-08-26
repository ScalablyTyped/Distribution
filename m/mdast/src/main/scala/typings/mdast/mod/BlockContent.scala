package typings.mdast.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mod.Paragraph
  - typings.mdast.mod.Heading
  - typings.mdast.mod.ThematicBreak
  - typings.mdast.mod.Blockquote
  - typings.mdast.mod.List
  - typings.mdast.mod.Table
  - typings.mdast.mod.HTML
  - typings.mdast.mod.Code
*/
trait BlockContent extends _TopLevelContent

object BlockContent {
  @scala.inline
  def ThematicBreak(`type`: thematicBreak): BlockContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def HTML(`type`: html, value: js.Any): BlockContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Table(children: js.Array[TableContent], `type`: table): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Paragraph(children: js.Array[PhrasingContent], `type`: paragraph): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Blockquote(children: js.Array[BlockContent], `type`: blockquote): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Code(`type`: code, value: js.Any): BlockContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def List(children: js.Array[ListContent], `type`: list): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
  @scala.inline
  def Heading(children: js.Array[PhrasingContent], depth: `1` | `2` | `3` | `4` | `5` | `6`, `type`: heading): BlockContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContent]
  }
}

