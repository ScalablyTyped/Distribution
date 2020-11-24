package typings.mendixmodelsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToRawChangeValue[P] extends js.Object {
  
  def toRawChangeValue(value: P): js.Any = js.native
}
object ToRawChangeValue {
  
  @scala.inline
  def apply[P](toRawChangeValue: P => js.Any): ToRawChangeValue[P] = {
    val __obj = js.Dynamic.literal(toRawChangeValue = js.Any.fromFunction1(toRawChangeValue))
    __obj.asInstanceOf[ToRawChangeValue[P]]
  }
  
  @scala.inline
  implicit class ToRawChangeValueOps[Self <: ToRawChangeValue[_], P] (val x: Self with ToRawChangeValue[P]) extends AnyVal {
    
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
    def setToRawChangeValue(value: P => js.Any): Self = this.set("toRawChangeValue", js.Any.fromFunction1(value))
  }
}
