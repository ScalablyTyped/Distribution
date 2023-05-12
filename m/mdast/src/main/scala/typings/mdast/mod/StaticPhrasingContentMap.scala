package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticPhrasingContentMap extends StObject {
  
  var break: Break
  
  var delete: Delete
  
  var emphasis: Emphasis
  
  var footnote: Footnote
  
  var footnoteReference: FootnoteReference
  
  var html: HTML
  
  var image: Image
  
  var imageReference: ImageReference
  
  var inlineCode: InlineCode
  
  var strong: Strong
  
  var text: Text
}
object StaticPhrasingContentMap {
  
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
    strong: Strong,
    text: Text
  ): StaticPhrasingContentMap = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], emphasis = emphasis.asInstanceOf[js.Any], footnote = footnote.asInstanceOf[js.Any], footnoteReference = footnoteReference.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageReference = imageReference.asInstanceOf[js.Any], inlineCode = inlineCode.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContentMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticPhrasingContentMap] (val x: Self) extends AnyVal {
    
    inline def setBreak(value: Break): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Delete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setEmphasis(value: Emphasis): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    inline def setFootnote(value: Footnote): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
    
    inline def setFootnoteReference(value: FootnoteReference): Self = StObject.set(x, "footnoteReference", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: HTML): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageReference(value: ImageReference): Self = StObject.set(x, "imageReference", value.asInstanceOf[js.Any])
    
    inline def setInlineCode(value: InlineCode): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
    
    inline def setStrong(value: Strong): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    
    inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
