package typings.openui5.global.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BindingMode {
  
  @JSGlobal("sap.ui.model.BindingMode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * BindingMode default means that the binding mode of the model is used
    */
  @JSGlobal("sap.ui.model.BindingMode.Default")
  @js.native
  def Default: js.Any = js.native
  inline def Default_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /**
    * BindingMode one time means value is only read from the model once
    */
  @JSGlobal("sap.ui.model.BindingMode.OneTime")
  @js.native
  def OneTime: js.Any = js.native
  inline def OneTime_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneTime")(x.asInstanceOf[js.Any])
  
  /**
    * BindingMode one way means from model to view
    */
  @JSGlobal("sap.ui.model.BindingMode.OneWay")
  @js.native
  def OneWay: js.Any = js.native
  inline def OneWay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneWay")(x.asInstanceOf[js.Any])
  
  /**
    * BindingMode two way means from model to view and vice versa
    */
  @JSGlobal("sap.ui.model.BindingMode.TwoWay")
  @js.native
  def TwoWay: js.Any = js.native
  inline def TwoWay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TwoWay")(x.asInstanceOf[js.Any])
}
