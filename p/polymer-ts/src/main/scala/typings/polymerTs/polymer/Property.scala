package typings.polymerTs.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property extends js.Object {
  
  var computed: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  @JSName("notify")
  var notify_FProperty: js.UndefOr[Boolean] = js.native
  
  var observer: js.UndefOr[String] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var reflectToAttribute: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[js.Any] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object Property {
  
  @scala.inline
  def apply(): Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit class PropertyOps[Self <: Property] (val x: Self) extends AnyVal {
    
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
    def setComputed(value: String): Self = this.set("computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputed: Self = this.set("computed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    
    @scala.inline
    def setObserver(value: String): Self = this.set("observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserver: Self = this.set("observer", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setReflectToAttribute(value: Boolean): Self = this.set("reflectToAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReflectToAttribute: Self = this.set("reflectToAttribute", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
