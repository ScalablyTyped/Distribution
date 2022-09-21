package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticPhrasingContentMap extends StObject {
  
  var break: Break
  
  var delete: Delete
  
  var emphasis: Emphasis
  
  var footnote: Footnote
  
  var footnotereference: FootnoteReference
  
  var html: HTML
  
  var image: Image
  
  var imagereference: ImageReference
  
  var inlinecode: InlineCode
  
  var strong: Strong
  
  var text: Text
}
object StaticPhrasingContentMap {
  
  inline def apply(
    break: Break,
    delete: Delete,
    emphasis: Emphasis,
    footnote: Footnote,
    footnotereference: FootnoteReference,
    html: HTML,
    image: Image,
    imagereference: ImageReference,
    inlinecode: InlineCode,
    strong: Strong,
    text: Text
  ): StaticPhrasingContentMap = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], emphasis = emphasis.asInstanceOf[js.Any], footnote = footnote.asInstanceOf[js.Any], footnotereference = footnotereference.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imagereference = imagereference.asInstanceOf[js.Any], inlinecode = inlinecode.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContentMap]
  }
  
  extension [Self <: StaticPhrasingContentMap](x: Self) {
    
    inline def setBreak(value: Break): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Delete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setEmphasis(value: Emphasis): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    inline def setFootnote(value: Footnote): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
    
    inline def setFootnotereference(value: FootnoteReference): Self = StObject.set(x, "footnotereference", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: HTML): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImagereference(value: ImageReference): Self = StObject.set(x, "imagereference", value.asInstanceOf[js.Any])
    
    inline def setInlinecode(value: InlineCode): Self = StObject.set(x, "inlinecode", value.asInstanceOf[js.Any])
    
    inline def setStrong(value: Strong): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    
    inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
