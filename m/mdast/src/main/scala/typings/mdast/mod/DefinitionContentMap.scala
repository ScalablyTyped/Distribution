package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionContentMap extends StObject {
  
  var definition: Definition
  
  var footnoteDefinition: FootnoteDefinition
}
object DefinitionContentMap {
  
  inline def apply(definition: Definition, footnoteDefinition: FootnoteDefinition): DefinitionContentMap = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], footnoteDefinition = footnoteDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionContentMap]
  }
  
  extension [Self <: DefinitionContentMap](x: Self) {
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setFootnoteDefinition(value: FootnoteDefinition): Self = StObject.set(x, "footnoteDefinition", value.asInstanceOf[js.Any])
  }
}
