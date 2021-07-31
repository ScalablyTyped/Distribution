package typings.openui5.global.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupHelper {
  
  @JSGlobal("sap.m.PopupHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This methods converts the percentage value to an absolute number based on the given base number.
    * @param sPercentage A percentage value in string format, for example "25%"
    * @param fBaseSize A float number which the calculation is based on.
    */
  @scala.inline
  def calcPercentageSize(sPercentage: String, fBaseSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calcPercentageSize")(sPercentage.asInstanceOf[js.Any], fBaseSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
