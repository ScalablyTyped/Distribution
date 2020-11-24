package typings.mobx.decoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.PropertyDescriptor & {  initializer :(): any | undefined} */
@js.native
trait BabelDescriptor extends js.Object {
  
  var configurable: js.UndefOr[Boolean] = js.native
  
  var enumerable: js.UndefOr[Boolean] = js.native
  
  var get: js.UndefOr[js.Function0[_]] = js.native
  
  var initializer: js.UndefOr[js.Function0[_]] = js.native
  
  var set: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  var writable: js.UndefOr[Boolean] = js.native
}
object BabelDescriptor {
  
  @scala.inline
  def apply(): BabelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelDescriptor]
  }
  
  @scala.inline
  implicit class BabelDescriptorOps[Self <: BabelDescriptor] (val x: Self) extends AnyVal {
    
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
    def setConfigurable(value: Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurable: Self = this.set("configurable", js.undefined)
    
    @scala.inline
    def setEnumerable(value: Boolean): Self = this.set("enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumerable: Self = this.set("enumerable", js.undefined)
    
    @scala.inline
    def setGet(value: () => _): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setInitializer(value: () => _): Self = this.set("initializer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitializer: Self = this.set("initializer", js.undefined)
    
    @scala.inline
    def setSet(value: /* v */ js.Any => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
}
