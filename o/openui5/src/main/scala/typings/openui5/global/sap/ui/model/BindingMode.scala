package typings.openui5.global.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.BindingMode")
@js.native
object BindingMode extends js.Object {
  
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
