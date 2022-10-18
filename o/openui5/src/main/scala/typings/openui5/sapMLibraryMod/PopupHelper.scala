package typings.openui5.sapMLibraryMod

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupHelper {
  
  @JSImport("sap/m/library", "PopupHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the given percentage value to an absolute number based on the given base size.
    *
    * @returns The calculated size string with "px" as unit or `null` when the format of given parameter is
    * wrong.
    */
  inline def calcPercentageSize(
    /**
    * A percentage value in string format, for example "25%"
    */
  sPercentage: String,
    /**
    * A float number which the calculation is based on.
    */
  fBaseSize: float
  ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("calcPercentageSize")(sPercentage.asInstanceOf[js.Any], fBaseSize.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
