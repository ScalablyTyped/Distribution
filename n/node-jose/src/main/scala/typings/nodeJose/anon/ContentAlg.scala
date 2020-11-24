package typings.nodeJose.anon

import typings.nodeJose.nodeJoseStrings.DEF
import typings.nodeJose.nodeJoseStrings.compact
import typings.nodeJose.nodeJoseStrings.flattened
import typings.nodeJose.nodeJoseStrings.general
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentAlg extends js.Object {
  
  var contentAlg: js.UndefOr[String] = js.native
  
  var fields: js.UndefOr[js.Object] = js.native
  
  var format: js.UndefOr[general | compact | flattened] = js.native
  
  var protect: js.UndefOr[String | js.Array[String]] = js.native
  
  var zip: js.UndefOr[Boolean | DEF] = js.native
}
object ContentAlg {
  
  @scala.inline
  def apply(): ContentAlg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentAlg]
  }
  
  @scala.inline
  implicit class ContentAlgOps[Self <: ContentAlg] (val x: Self) extends AnyVal {
    
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
    def setContentAlg(value: String): Self = this.set("contentAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAlg: Self = this.set("contentAlg", js.undefined)
    
    @scala.inline
    def setFields(value: js.Object): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFormat(value: general | compact | flattened): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setProtectVarargs(value: String*): Self = this.set("protect", js.Array(value :_*))
    
    @scala.inline
    def setProtect(value: String | js.Array[String]): Self = this.set("protect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtect: Self = this.set("protect", js.undefined)
    
    @scala.inline
    def setZip(value: Boolean | DEF): Self = this.set("zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
}
