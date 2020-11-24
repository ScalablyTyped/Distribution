package typings.openfin.anon

import typings.openfin.GoldenLayout.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends js.Object {
  
  var content: Config = js.native
  
  var dimensions: HeightLeft = js.native
  
  var indexInParent: Double = js.native
  
  var parentId: String = js.native
}
object Content {
  
  @scala.inline
  def apply(content: Config, dimensions: HeightLeft, indexInParent: Double, parentId: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], indexInParent = indexInParent.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    
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
    def setContent(value: Config): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: HeightLeft): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexInParent(value: Double): Self = this.set("indexInParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
  }
}
