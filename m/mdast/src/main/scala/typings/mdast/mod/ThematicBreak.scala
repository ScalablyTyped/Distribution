package typings.mdast.mod

import typings.mdast.mdastStrings.thematicBreak
import typings.unist.mod.Node
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
  implicit class ThematicBreakOps[Self <: ThematicBreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: thematicBreak): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
