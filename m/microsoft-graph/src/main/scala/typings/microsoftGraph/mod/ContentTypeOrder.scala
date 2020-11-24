package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTypeOrder extends js.Object {
  
  // Whether this is the default Content Type
  var default: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Specifies the position in which the Content Type appears in the selection UI.
  var position: js.UndefOr[NullableOption[Double]] = js.native
}
object ContentTypeOrder {
  
  @scala.inline
  def apply(): ContentTypeOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentTypeOrder]
  }
  
  @scala.inline
  implicit class ContentTypeOrderOps[Self <: ContentTypeOrder] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: NullableOption[Boolean]): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    
    @scala.inline
    def setPosition(value: NullableOption[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
}
