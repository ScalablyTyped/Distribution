package typings.openui5.global.sap.ui.model.odata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BatchMode {
  
  @JSGlobal("sap.ui.model.odata.BatchMode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Batch grouping enabled
    */
  @JSGlobal("sap.ui.model.odata.BatchMode.Group")
  @js.native
  def Group: js.Any = js.native
  @scala.inline
  def Group_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  /**
    * No batch requests
    */
  @JSGlobal("sap.ui.model.odata.BatchMode.None")
  @js.native
  def None: js.Any = js.native
  @scala.inline
  def None_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
}
