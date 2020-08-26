package typings.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBindingMode extends js.Object {
  /**
    * BindingMode default means that the binding mode of the model is used
    */
  var Default: js.Any = js.native
  /**
    * BindingMode one time means value is only read from the model once
    */
  var OneTime: js.Any = js.native
  /**
    * BindingMode one way means from model to view
    */
  var OneWay: js.Any = js.native
  /**
    * BindingMode two way means from model to view and vice versa
    */
  var TwoWay: js.Any = js.native
}

object TypeofBindingMode {
  @scala.inline
  def apply(Default: js.Any, OneTime: js.Any, OneWay: js.Any, TwoWay: js.Any): TypeofBindingMode = {
    val __obj = js.Dynamic.literal(Default = Default.asInstanceOf[js.Any], OneTime = OneTime.asInstanceOf[js.Any], OneWay = OneWay.asInstanceOf[js.Any], TwoWay = TwoWay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBindingMode]
  }
  @scala.inline
  implicit class TypeofBindingModeOps[Self <: TypeofBindingMode] (val x: Self) extends AnyVal {
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
    def setDefault(value: js.Any): Self = this.set("Default", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneTime(value: js.Any): Self = this.set("OneTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneWay(value: js.Any): Self = this.set("OneWay", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwoWay(value: js.Any): Self = this.set("TwoWay", value.asInstanceOf[js.Any])
  }
  
}

