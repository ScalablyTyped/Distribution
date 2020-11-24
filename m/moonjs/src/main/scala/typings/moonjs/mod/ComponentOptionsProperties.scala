package typings.moonjs.mod

import typings.moonjs.moonjsBooleans.`true`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentOptionsProperties[Props /* <: String */, Data, Methods] extends js.Object {
  
  var data: js.UndefOr[Data] = js.native
  
  var el: js.UndefOr[String | HTMLElement] = js.native
  
  var functional: js.UndefOr[`true`] = js.native
  
  var hooks: js.UndefOr[LifecycleHooks] = js.native
  
  var methods: js.UndefOr[Methods] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var props: js.UndefOr[js.Array[Props]] = js.native
  
  var render: js.UndefOr[js.Function2[/* h */ CreateElement, /* ctx */ js.Any, VDomElement]] = js.native
  
  var template: js.UndefOr[String] = js.native
}
object ComponentOptionsProperties {
  
  @scala.inline
  def apply[Props /* <: String */, Data, Methods](): ComponentOptionsProperties[Props, Data, Methods] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptionsProperties[Props, Data, Methods]]
  }
  
  @scala.inline
  implicit class ComponentOptionsPropertiesOps[Self <: ComponentOptionsProperties[_, _, _], Props /* <: String */, Data, Methods] (val x: Self with (ComponentOptionsProperties[Props, Data, Methods])) extends AnyVal {
    
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
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEl(value: String | HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    
    @scala.inline
    def setFunctional(value: `true`): Self = this.set("functional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctional: Self = this.set("functional", js.undefined)
    
    @scala.inline
    def setHooks(value: LifecycleHooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setMethods(value: Methods): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPropsVarargs(value: Props*): Self = this.set("props", js.Array(value :_*))
    
    @scala.inline
    def setProps(value: js.Array[Props]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setRender(value: (/* h */ CreateElement, /* ctx */ js.Any) => VDomElement): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
