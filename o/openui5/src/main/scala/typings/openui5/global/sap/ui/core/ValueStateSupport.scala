package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValueStateSupport {
  
  @JSGlobal("sap.ui.core.ValueStateSupport")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Appends a generic success, warning or error message to the given tooltip text if the given
    * Elementhas a property "valueState" with one of these three states.
    * @param oElement the Element of which the tooltip needs to be modified
    * @param sTooltipText the original tooltip text (may be null)
    * @returns the given text, with appended success/warning/error text, if appropriate
    */
  @scala.inline
  def enrichTooltip(oElement: typings.openui5.sap.ui.core.Element, sTooltipText: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("enrichTooltip")(oElement.asInstanceOf[js.Any], sTooltipText.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Returns a ValueState object based on the given integer value 0 : ValueState.None 1 :
    * ValueState.Warning 2 : ValueState.Success 3 : ValueState.Error
    * @since 1.25.0
    * @param iState the state as an integer
    * @returns the corresponding ValueState object
    */
  @scala.inline
  def formatValueState(iState: Double): typings.openui5.sap.ui.core.ValueState = ^.asInstanceOf[js.Dynamic].applyDynamic("formatValueState")(iState.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.ValueState]
  
  /**
    * Returns a generic success, warning or error message if the given Elementhas a property "valueState"
    * with one of these three states or the given ValueStaterepresents one of these states.
    * @param vValue the Element of which the valueState needs to be checked, or the ValueState explicitly
    * @returns the success/warning/error text, if appropriate; otherwise null
    */
  @scala.inline
  def getAdditionalText(vValue: typings.openui5.sap.ui.core.Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalText")(vValue.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getAdditionalText(vValue: typings.openui5.sap.ui.core.ValueState): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalText")(vValue.asInstanceOf[js.Any]).asInstanceOf[String]
}
