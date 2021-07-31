package typings.mdast.mod

import typings.mdast.mdastStrings.definition
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition
  extends StObject
     with Node
     with Association
     with Resource
     with DefinitionContent {
  
  @JSName("type")
  var type_Definition: definition
}
object Definition {
  
  @scala.inline
  def apply(identifier: String, url: String): Definition = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("definition")
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: definition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
