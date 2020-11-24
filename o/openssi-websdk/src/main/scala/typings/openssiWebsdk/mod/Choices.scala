package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Choices extends js.Object {
  
  var attr1: js.Any = js.native
  
  var attributes: js.Any = js.native
  
  var pred1: js.Any = js.native
  
  var predicates: js.Any = js.native
}
object Choices {
  
  @scala.inline
  def apply(attr1: js.Any, attributes: js.Any, pred1: js.Any, predicates: js.Any): Choices = {
    val __obj = js.Dynamic.literal(attr1 = attr1.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], pred1 = pred1.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
  
  @scala.inline
  implicit class ChoicesOps[Self <: Choices] (val x: Self) extends AnyVal {
    
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
    def setAttr1(value: js.Any): Self = this.set("attr1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPred1(value: js.Any): Self = this.set("pred1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicates(value: js.Any): Self = this.set("predicates", value.asInstanceOf[js.Any])
  }
}
