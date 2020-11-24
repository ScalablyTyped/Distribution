package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedPropertyDescriptor[T] extends js.Object {
  
  var configurable: js.UndefOr[scala.Boolean] = js.native
  
  var enumerable: js.UndefOr[scala.Boolean] = js.native
  
  var get: js.UndefOr[js.Function0[T]] = js.native
  
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  
  var value: js.UndefOr[T] = js.native
  
  var writable: js.UndefOr[scala.Boolean] = js.native
}
object TypedPropertyDescriptor {
  
  @scala.inline
  def apply[T](): TypedPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedPropertyDescriptor[T]]
  }
  
  @scala.inline
  implicit class TypedPropertyDescriptorOps[Self <: TypedPropertyDescriptor[_], T] (val x: Self with TypedPropertyDescriptor[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurable(value: scala.Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurable: Self = this.set("configurable", js.undefined)
    
    @scala.inline
    def setEnumerable(value: scala.Boolean): Self = this.set("enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumerable: Self = this.set("enumerable", js.undefined)
    
    @scala.inline
    def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setSet(value: /* value */ T => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWritable(value: scala.Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
}
