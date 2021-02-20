package typings.openui5.global.sap.ui.model.odata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CountMode {
  
  @JSGlobal("sap.ui.model.odata.CountMode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Count is retrieved by a separate request upfront and inline with each data request
    */
  @JSGlobal("sap.ui.model.odata.CountMode.Both")
  @js.native
  def Both: js.Any = js.native
  @scala.inline
  def Both_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Both")(x.asInstanceOf[js.Any])
  
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in the data request
    */
  @JSGlobal("sap.ui.model.odata.CountMode.Inline")
  @js.native
  def Inline: js.Any = js.native
  
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in every data request
    */
  @JSGlobal("sap.ui.model.odata.CountMode.InlineRepeat")
  @js.native
  def InlineRepeat: js.Any = js.native
  @scala.inline
  def InlineRepeat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InlineRepeat")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Inline_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Inline")(x.asInstanceOf[js.Any])
  
  /**
    * Count is not requested from the server
    */
  @JSGlobal("sap.ui.model.odata.CountMode.None")
  @js.native
  def None: js.Any = js.native
  @scala.inline
  def None_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**
    * Count is retrieved by sending a separate $count request, before requesting data
    */
  @JSGlobal("sap.ui.model.odata.CountMode.Request")
  @js.native
  def Request: js.Any = js.native
  @scala.inline
  def Request_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Request")(x.asInstanceOf[js.Any])
}
