package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserStrings.`unicode-range`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnicodeRangeNode
  extends BaseNode
     with Node {
  
  var `type`: `unicode-range` = js.native
}
object UnicodeRangeNode {
  
  @scala.inline
  def apply(sourceIndex: Double, `type`: `unicode-range`, value: String): UnicodeRangeNode = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeRangeNode]
  }
  
  @scala.inline
  implicit class UnicodeRangeNodeOps[Self <: UnicodeRangeNode] (val x: Self) extends AnyVal {
    
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
    def setType(value: `unicode-range`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
