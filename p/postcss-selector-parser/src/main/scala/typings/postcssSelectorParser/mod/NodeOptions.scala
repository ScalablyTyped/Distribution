package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.PartialSpaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeOptions[Value] extends js.Object {
  
  var source: js.UndefOr[NodeSource] = js.native
  
  var sourceIndex: js.UndefOr[Double] = js.native
  
  var spaces: js.UndefOr[PartialSpaces] = js.native
  
  var value: Value = js.native
}
object NodeOptions {
  
  @scala.inline
  def apply[Value](value: Value): NodeOptions[Value] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions[Value]]
  }
  
  @scala.inline
  implicit class NodeOptionsOps[Self <: NodeOptions[_], Value] (val x: Self with NodeOptions[Value]) extends AnyVal {
    
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
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: NodeSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceIndex(value: Double): Self = this.set("sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIndex: Self = this.set("sourceIndex", js.undefined)
    
    @scala.inline
    def setSpaces(value: PartialSpaces): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
  }
}
