package typings.mdast.mod

import typings.mdast.mdastStrings.definition
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Definition
  extends DefinitionContent
     with Node
     with Association
     with Resource {
  
  @JSName("type")
  var type_Definition: definition = js.native
}
object Definition {
  
  @scala.inline
  def apply(identifier: String, `type`: definition, url: String): Definition = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: definition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
