package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiCoreLibraryMod.ValueState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreValueStateSupportMod extends Shortcut {
  
  @JSImport("sap/ui/core/ValueStateSupport", JSImport.Default)
  @js.native
  val default: ValueStateSupport = js.native
  
  /**
    * Helper functionality for value state support.
    */
  @js.native
  trait ValueStateSupport extends StObject {
    
    /**
      * Appends a generic success, warning or error message to the given tooltip text if the given Element has
      * a property "valueState" with one of these three states.
      *
      * @returns the given text, with appended success/warning/error text, if appropriate
      */
    def enrichTooltip(
      /**
      * the Element of which the tooltip needs to be modified
      */
    oElement: typings.openui5.sapUiCoreElementMod.default,
      /**
      * the original tooltip text (may be null)
      */
    sTooltipText: String
    ): String = js.native
    
    /**
      * @since 1.25.0
      *
      * Returns a ValueState object based on the given integer value
      *
      * 0 : ValueState.None 1 : ValueState.Warning 2 : ValueState.Success 3 : ValueState.Error 4 : ValueState.Information
      *
      * @returns the corresponding ValueState object
      */
    def formatValueState(/**
      * the state as an integer
      */
    iState: int): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    def getAdditionalText(
      /**
      * the Element of which the valueState needs to be checked, or the ValueState explicitly
      */
    vValue: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): String | Null = js.native
    /**
      * Returns a generic success, warning or error message if the given Element has a property "valueState"
      * with one of these three states or the given ValueState represents one of these states.
      *
      * @returns the success/warning/error text, if appropriate; otherwise null
      */
    def getAdditionalText(
      /**
      * the Element of which the valueState needs to be checked, or the ValueState explicitly
      */
    vValue: typings.openui5.sapUiCoreElementMod.default
    ): String | Null = js.native
    def getAdditionalText(
      /**
      * the Element of which the valueState needs to be checked, or the ValueState explicitly
      */
    vValue: ValueState
    ): String | Null = js.native
  }
  
  type _To = ValueStateSupport
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreValueStateSupportMod.foo` */
  override def _to: ValueStateSupport = default
}
