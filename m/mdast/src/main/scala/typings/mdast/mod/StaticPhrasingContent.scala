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
import typings.mdast.mdastStrings.strong
import typings.mdast.mdastStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mod.Text
  - typings.mdast.mod.Emphasis
  - typings.mdast.mod.Strong
  - typings.mdast.mod.Delete
  - typings.mdast.mod.HTML
  - typings.mdast.mod.InlineCode
  - typings.mdast.mod.Break
  - typings.mdast.mod.Image
  - typings.mdast.mod.ImageReference
  - typings.mdast.mod.Footnote
  - typings.mdast.mod.FootnoteReference
*/
trait StaticPhrasingContent extends PhrasingContent

object StaticPhrasingContent {
  @scala.inline
  def Footnote(children: js.Array[PhrasingContent], `type`: footnote): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Emphasis(children: js.Array[PhrasingContent], `type`: emphasis): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def HTML(`type`: html, value: js.Any): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Break(`type`: break): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def FootnoteReference(identifier: String, `type`: footnoteReference): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def InlineCode(`type`: inlineCode, value: js.Any): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def ImageReference(identifier: String, referenceType: ReferenceType, `type`: imageReference): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Text(`type`: text, value: js.Any): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Image(`type`: image, url: String): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
}

