package typings.oracleOraclejet.ojcompositeMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModelContext extends js.Object {
  
  var element: Element = js.native
  
  var properties: js.Object = js.native
  
  var slotCounts: js.Object = js.native
  
  var unique: String = js.native
  
  var uniqueId: String = js.native
}
object ViewModelContext {
  
  @scala.inline
  def apply(element: Element, properties: js.Object, slotCounts: js.Object, unique: String, uniqueId: String): ViewModelContext = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], slotCounts = slotCounts.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModelContext]
  }
  
  @scala.inline
  implicit class ViewModelContextOps[Self <: ViewModelContext] (val x: Self) extends AnyVal {
    
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
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Object): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotCounts(value: js.Object): Self = this.set("slotCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: String): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueId(value: String): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
  }
}
