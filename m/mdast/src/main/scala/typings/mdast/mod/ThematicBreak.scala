package typings.mdast.mod

import typings.mdast.mdastStrings.thematicBreak
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThematicBreak
  extends StObject
     with Node[Data] {
  
  @JSName("type")
  var type_ThematicBreak: thematicBreak
}
object ThematicBreak {
  
  inline def apply(): ThematicBreak = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("thematicBreak")
    __obj.asInstanceOf[ThematicBreak]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThematicBreak] (val x: Self) extends AnyVal {
    
    inline def setType(value: thematicBreak): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
