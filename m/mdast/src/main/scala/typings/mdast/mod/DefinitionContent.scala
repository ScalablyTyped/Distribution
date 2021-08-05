package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mod.Definition
  - typings.mdast.mod.FootnoteDefinition
*/
trait DefinitionContent
  extends StObject
     with _TopLevelContent
object DefinitionContent {
  
  inline def Definition(identifier: String, url: String): typings.mdast.mod.Definition = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("definition")
    __obj.asInstanceOf[typings.mdast.mod.Definition]
  }
  
  inline def FootnoteDefinition(children: js.Array[BlockContent], identifier: String): typings.mdast.mod.FootnoteDefinition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnoteDefinition")
    __obj.asInstanceOf[typings.mdast.mod.FootnoteDefinition]
  }
}
