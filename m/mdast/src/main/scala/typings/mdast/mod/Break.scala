package typings.mdast.mod

import typings.mdast.mdastStrings.break
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Break
  extends StaticPhrasingContent
     with Node {
  
  @JSName("type")
  var type_Break: break = js.native
}
object Break {
  
  @scala.inline
  def apply(`type`: break): Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Break]
  }
  
  @scala.inline
  implicit class BreakMutableBuilder[Self <: Break] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: break): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
