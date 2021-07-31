package typings.openui5.global.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageToast {
  
  @JSGlobal("sap.m.MessageToast")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and displays a simple message toast notification message with the given text, and optionally
    * other options.The only mandatory parameter is <code>sMessage</code>.
    * @param sMessage The message to be displayed.
    * @param mOptions Object which can contain all other options. Not all entries in this object are
    * required. This property is optional.
    */
  @scala.inline
  def show(sMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(sMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def show(sMessage: String, mOptions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(sMessage.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
