package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mod.StaticPhrasingContent
  - typings.mdast.mod.Link
  - typings.mdast.mod.LinkReference
*/
trait PhrasingContent
  extends StObject
     with _Content
object PhrasingContent {
  
  inline def Break(): typings.mdast.mod.Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("break")
    __obj.asInstanceOf[typings.mdast.mod.Break]
  }
  
  inline def Delete(children: js.Array[PhrasingContent]): typings.mdast.mod.Delete = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[typings.mdast.mod.Delete]
  }
  
  inline def Emphasis(children: js.Array[PhrasingContent]): typings.mdast.mod.Emphasis = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("emphasis")
    __obj.asInstanceOf[typings.mdast.mod.Emphasis]
  }
  
  inline def Footnote(children: js.Array[PhrasingContent]): typings.mdast.mod.Footnote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote")
    __obj.asInstanceOf[typings.mdast.mod.Footnote]
  }
  
  inline def FootnoteReference(identifier: String): typings.mdast.mod.FootnoteReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnoteReference")
    __obj.asInstanceOf[typings.mdast.mod.FootnoteReference]
  }
  
  inline def HTML(value: js.Any): typings.mdast.mod.HTML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("html")
    __obj.asInstanceOf[typings.mdast.mod.HTML]
  }
  
  inline def Image(url: String): typings.mdast.mod.Image = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.mdast.mod.Image]
  }
  
  inline def ImageReference(identifier: String, referenceType: ReferenceType): typings.mdast.mod.ImageReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imageReference")
    __obj.asInstanceOf[typings.mdast.mod.ImageReference]
  }
  
  inline def InlineCode(value: js.Any): typings.mdast.mod.InlineCode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("inlineCode")
    __obj.asInstanceOf[typings.mdast.mod.InlineCode]
  }
  
  inline def Link(children: js.Array[StaticPhrasingContent], url: String): typings.mdast.mod.Link = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link")
    __obj.asInstanceOf[typings.mdast.mod.Link]
  }
  
  inline def LinkReference(children: js.Array[StaticPhrasingContent], identifier: String, referenceType: ReferenceType): typings.mdast.mod.LinkReference = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linkReference")
    __obj.asInstanceOf[typings.mdast.mod.LinkReference]
  }
  
  inline def Strong(children: js.Array[PhrasingContent]): typings.mdast.mod.Strong = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strong")
    __obj.asInstanceOf[typings.mdast.mod.Strong]
  }
  
  inline def Text(value: js.Any): typings.mdast.mod.Text = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typings.mdast.mod.Text]
  }
}
