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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mod.StaticPhrasingContent
  - typings.mdast.mod.Link
  - typings.mdast.mod.LinkReference
*/
trait PhrasingContent extends _Content
object PhrasingContent {
  
  @scala.inline
  def Break(`type`: break): typings.mdast.mod.Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Break]
  }
  
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete): typings.mdast.mod.Delete = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Delete]
  }
  
  @scala.inline
  def Emphasis(children: js.Array[PhrasingContent], `type`: emphasis): typings.mdast.mod.Emphasis = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Emphasis]
  }
  
  @scala.inline
  def Footnote(children: js.Array[PhrasingContent], `type`: footnote): typings.mdast.mod.Footnote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Footnote]
  }
  
  @scala.inline
  def FootnoteReference(identifier: String, `type`: footnoteReference): typings.mdast.mod.FootnoteReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.FootnoteReference]
  }
  
  @scala.inline
  def HTML(`type`: html, value: js.Any): typings.mdast.mod.HTML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.HTML]
  }
  
  @scala.inline
  def Image(`type`: image, url: String): typings.mdast.mod.Image = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Image]
  }
  
  @scala.inline
  def ImageReference(identifier: String, referenceType: ReferenceType, `type`: imageReference): typings.mdast.mod.ImageReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.ImageReference]
  }
  
  @scala.inline
  def InlineCode(`type`: inlineCode, value: js.Any): typings.mdast.mod.InlineCode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.InlineCode]
  }
  
  @scala.inline
  def Link(children: js.Array[StaticPhrasingContent], `type`: link, url: String): typings.mdast.mod.Link = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Link]
  }
  
  @scala.inline
  def LinkReference(
    children: js.Array[StaticPhrasingContent],
    identifier: String,
    referenceType: ReferenceType,
    `type`: linkReference
  ): typings.mdast.mod.LinkReference = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.LinkReference]
  }
  
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong): typings.mdast.mod.Strong = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Strong]
  }
  
  @scala.inline
  def Text(`type`: text, value: js.Any): typings.mdast.mod.Text = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mdast.mod.Text]
  }
}
