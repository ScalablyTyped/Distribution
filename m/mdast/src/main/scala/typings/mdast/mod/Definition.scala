package typings.mdast.mod

import typings.mdast.mdastStrings.definition
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition
  extends StObject
     with Node[Data]
     with Association
     with Resource {
  
  @JSName("type")
  var type_Definition: definition
}
object Definition {
  
  inline def apply(identifier: String, url: String): Definition = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("definition")
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    inline def setType(value: definition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
