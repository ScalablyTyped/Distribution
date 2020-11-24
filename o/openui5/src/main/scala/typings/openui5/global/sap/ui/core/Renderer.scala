package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.Renderer")
@js.native
object Renderer extends js.Object {
  
  /**
    * Returns the TextAlignment for the provided configuration.
    * @param oTextAlign the text alignment of the Control
    * @param oTextDirection the text direction of the Control
    * @returns the actual text alignment that must be set for this environment
    */
  def getTextAlign(
    oTextAlign: typings.openui5.sap.ui.core.TextAlign,
    oTextDirection: typings.openui5.sap.ui.core.TextDirection
  ): String = js.native
}
