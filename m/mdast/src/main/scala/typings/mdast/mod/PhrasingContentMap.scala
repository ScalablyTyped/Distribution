package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhrasingContentMap
  extends StObject
     with StaticPhrasingContentMap {
  
  var link: Link
  
  var linkReference: LinkReference
}
object PhrasingContentMap {
  
  inline def apply(
    break: Break,
    delete: Delete,
    emphasis: Emphasis,
    footnote: Footnote,
    footnoteReference: FootnoteReference,
    html: HTML,
    image: Image,
    imageReference: ImageReference,
    inlineCode: InlineCode,
    link: Link,
    linkReference: LinkReference,
    strong: Strong,
    text: Text
  ): PhrasingContentMap = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], emphasis = emphasis.asInstanceOf[js.Any], footnote = footnote.asInstanceOf[js.Any], footnoteReference = footnoteReference.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageReference = imageReference.asInstanceOf[js.Any], inlineCode = inlineCode.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkReference = linkReference.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContentMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhrasingContentMap] (val x: Self) extends AnyVal {
    
    inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkReference(value: LinkReference): Self = StObject.set(x, "linkReference", value.asInstanceOf[js.Any])
  }
}
