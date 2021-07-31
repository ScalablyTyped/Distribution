package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskInputRule
  extends StObject
     with Element {
  
  /**
    * Gets current value of property <code>maskFormatSymbol</code>.Defines the symbol used in the mask
    * format which will accept a certain range of characters.Default value is <code>*</code>.
    * @returns Value of property <code>maskFormatSymbol</code>
    */
  def getMaskFormatSymbol(): String = js.native
  
  /**
    * Gets current value of property <code>regex</code>.Defines the allowed characters as a regular
    * expression.Default value is <code>[a-zA-Z0-9]</code>.
    * @returns Value of property <code>regex</code>
    */
  def getRegex(): String = js.native
}
