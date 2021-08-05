package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeTypes extends StObject {
  
  var attribute: Attribute_
  
  var `class`: ClassName_
  
  var combinator: Combinator_
  
  var comment: Comment_
  
  var id: Identifier
  
  var nesting: Nesting_
  
  var pseudo: Pseudo_
  
  var root: Root_
  
  var selector: Selector_
  
  var string: String_
  
  var tag: Tag_
  
  var universal: Universal_
}
object NodeTypes {
  
  inline def apply(
    attribute: Attribute_,
    `class`: ClassName_,
    combinator: Combinator_,
    comment: Comment_,
    id: Identifier,
    nesting: Nesting_,
    pseudo: Pseudo_,
    root: Root_,
    selector: Selector_,
    string: String_,
    tag: Tag_,
    universal: Universal_
  ): NodeTypes = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], combinator = combinator.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], pseudo = pseudo.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeTypes]
  }
  
  extension [Self <: NodeTypes](x: Self) {
    
    inline def setAttribute(value: Attribute_): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setClass(value: ClassName_): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setCombinator(value: Combinator_): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
    
    inline def setComment(value: Comment_): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNesting(value: Nesting_): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
    
    inline def setPseudo(value: Pseudo_): Self = StObject.set(x, "pseudo", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Root_): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: Selector_): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setString(value: String_): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Tag_): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setUniversal(value: Universal_): Self = StObject.set(x, "universal", value.asInstanceOf[js.Any])
  }
}
