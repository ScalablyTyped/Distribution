package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockContentMap extends StObject {
  
  var blockquote: Blockquote
  
  var code: Code
  
  var heading: Heading
  
  var html: HTML
  
  var list: typings.mdast.mod.List
  
  var paragraph: Paragraph
  
  var table: Table
  
  var thematicBreak: ThematicBreak
}
object BlockContentMap {
  
  inline def apply(
    blockquote: Blockquote,
    code: Code,
    heading: Heading,
    html: HTML,
    list: typings.mdast.mod.List,
    paragraph: Paragraph,
    table: Table,
    thematicBreak: ThematicBreak
  ): BlockContentMap = {
    val __obj = js.Dynamic.literal(blockquote = blockquote.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], thematicBreak = thematicBreak.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockContentMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockContentMap] (val x: Self) extends AnyVal {
    
    inline def setBlockquote(value: Blockquote): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: Heading): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: HTML): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setList(value: typings.mdast.mod.List): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setThematicBreak(value: ThematicBreak): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
  }
}
