package typings.mdast.mod

import typings.mdast.mdastStrings.thematicBreak
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThematicBreak
  extends BlockContent
     with Node {
  
  @JSName("type")
  var type_ThematicBreak: thematicBreak = js.native
}
object ThematicBreak {
  
  @scala.inline
  def apply(`type`: thematicBreak): ThematicBreak = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThematicBreak]
  }
  
  @scala.inline
  implicit class ThematicBreakMutableBuilder[Self <: ThematicBreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: thematicBreak): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
