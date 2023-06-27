package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiCoreLibraryMod.IndicationColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreIndicationColorSupportMod extends Shortcut {
  
  @JSImport("sap/ui/core/IndicationColorSupport", JSImport.Default)
  @js.native
  val default: IndicationColorSupport = js.native
  
  /**
    * @since 1.66
    *
    * Helper functionality for indication color support.
    */
  @js.native
  trait IndicationColorSupport extends StObject {
    
    def getAdditionalText(
      /**
      * the Element of which the indicationColor needs to be checked, or the IndicationColor explicitly
      */
    vValue: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IndicationColor * / any */ String
    ): String | Null = js.native
    /**
      * Returns a generic indication color message if the given Element has a property `IndicationColor` with
      * one of the states or the given `indicationColor` string represents one of five states.
      *
      * @returns the indication color text, if appropriate; otherwise `null`
      */
    def getAdditionalText(
      /**
      * the Element of which the indicationColor needs to be checked, or the IndicationColor explicitly
      */
    vValue: typings.openui5.sapUiCoreElementMod.default
    ): String | Null = js.native
    def getAdditionalText(
      /**
      * the Element of which the indicationColor needs to be checked, or the IndicationColor explicitly
      */
    vValue: IndicationColor
    ): String | Null = js.native
  }
  
  type _To = IndicationColorSupport
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreIndicationColorSupportMod.foo` */
  override def _to: IndicationColorSupport = default
}
