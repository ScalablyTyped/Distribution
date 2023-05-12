package typings.openui5.sapMLibraryMod

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupHelper extends StObject {
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Converts the given percentage value to an absolute number based on the given base size.
    *
    * @returns The calculated size string with "px" as unit or `null` when the format of given parameter is
    * wrong.
    */
  def calcPercentageSize(
    /**
    * A percentage value in string format, for example "25%"
    */
  sPercentage: String,
    /**
    * A float number which the calculation is based on.
    */
  fBaseSize: float
  ): String | Null
}
object PopupHelper {
  
  @JSImport("sap/m/library", "PopupHelper")
  @js.native
  val ^ : PopupHelper = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupHelper] (val x: Self) extends AnyVal {
    
    inline def setCalcPercentageSize(value: (String, float) => String | Null): Self = StObject.set(x, "calcPercentageSize", js.Any.fromFunction2(value))
  }
}
