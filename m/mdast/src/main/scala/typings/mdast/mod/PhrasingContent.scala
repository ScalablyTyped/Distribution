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
  def Footnote(children: js.Array[PhrasingContent], `type`: footnote): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def Emphasis(children: js.Array[PhrasingContent], `type`: emphasis): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def HTML(`type`: html, value: js.Any): PhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def Break(`type`: break): PhrasingContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def FootnoteReference(identifier: String, `type`: footnoteReference): PhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def InlineCode(`type`: inlineCode, value: js.Any): PhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def ImageReference(identifier: String, referenceType: ReferenceType, `type`: imageReference): PhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def Link(children: js.Array[StaticPhrasingContent], `type`: link, url: String): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def Text(`type`: text, value: js.Any): PhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def LinkReference(
    children: js.Array[StaticPhrasingContent],
    identifier: String,
    referenceType: ReferenceType,
    `type`: linkReference
  ): PhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
  
  @scala.inline
  def Image(`type`: image, url: String): PhrasingContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContent]
  }
}
