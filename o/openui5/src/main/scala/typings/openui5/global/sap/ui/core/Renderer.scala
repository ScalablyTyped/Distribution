package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Renderer {
  
  @JSGlobal("sap.ui.core.Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the TextAlignment for the provided configuration.
    * @param oTextAlign the text alignment of the Control
    * @param oTextDirection the text direction of the Control
    * @returns the actual text alignment that must be set for this environment
    */
  @scala.inline
  def getTextAlign(
    oTextAlign: typings.openui5.sap.ui.core.TextAlign,
    oTextDirection: typings.openui5.sap.ui.core.TextDirection
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextAlign")(oTextAlign.asInstanceOf[js.Any], oTextDirection.asInstanceOf[js.Any])).asInstanceOf[String]
}
