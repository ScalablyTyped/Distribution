package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateDateCompareMod {
  
  inline def apply(referenceDate: js.Date, compareDate: js.Date): Double = (^.asInstanceOf[js.Dynamic].apply(referenceDate.asInstanceOf[js.Any], compareDate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(referenceDate: js.Date, compareDate: js.Date, timeSensitive: Boolean): Double = (^.asInstanceOf[js.Dynamic].apply(referenceDate.asInstanceOf[js.Any], compareDate.asInstanceOf[js.Any], timeSensitive.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@nginstack/engine/lib/date/dateCompare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
