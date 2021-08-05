package typings.mdast.mod

import typings.mdast.mdastStrings.thematicBreak
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThematicBreak
  extends StObject
     with Node
     with BlockContent {
  
  @JSName("type")
  var type_ThematicBreak: thematicBreak
}
object ThematicBreak {
  
  inline def apply(): ThematicBreak = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("thematicBreak")
    __obj.asInstanceOf[ThematicBreak]
  }
  
  extension [Self <: ThematicBreak](x: Self) {
    
    inline def setType(value: thematicBreak): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
