package typings.openui5.global.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilterType {
  
  @JSGlobal("sap.ui.model.FilterType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Filters which are changed by the application
    */
  @JSGlobal("sap.ui.model.FilterType.Application")
  @js.native
  def Application: js.Any = js.native
  @scala.inline
  def Application_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Application")(x.asInstanceOf[js.Any])
  
  /**
    * Filters which are set by the different controls
    */
  @JSGlobal("sap.ui.model.FilterType.Control")
  @js.native
  def Control: js.Any = js.native
  @scala.inline
  def Control_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control")(x.asInstanceOf[js.Any])
}
