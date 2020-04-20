package typings.openui5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofBindingMode extends js.Object {
  /**
    * BindingMode default means that the binding mode of the model is used
    */
  var Default: js.Any
  /**
    * BindingMode one time means value is only read from the model once
    */
  var OneTime: js.Any
  /**
    * BindingMode one way means from model to view
    */
  var OneWay: js.Any
  /**
    * BindingMode two way means from model to view and vice versa
    */
  var TwoWay: js.Any
}

object TypeofBindingMode {
  @scala.inline
  def apply(Default: js.Any, OneTime: js.Any, OneWay: js.Any, TwoWay: js.Any): TypeofBindingMode = {
    val __obj = js.Dynamic.literal(Default = Default.asInstanceOf[js.Any], OneTime = OneTime.asInstanceOf[js.Any], OneWay = OneWay.asInstanceOf[js.Any], TwoWay = TwoWay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBindingMode]
  }
}

