package typings.mdast.mod

import typings.mdast.mdastStrings.break
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Break
  extends StObject
     with Node[Data] {
  
  @JSName("type")
  var type_Break: break
}
object Break {
  
  inline def apply(): Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("break")
    __obj.asInstanceOf[Break]
  }
  
  extension [Self <: Break](x: Self) {
    
    inline def setType(value: break): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
