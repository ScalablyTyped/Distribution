package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/date-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areEqualDates(x: js.Date, y: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEqualDates")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toMidnightDate(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toMidnightDate")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
}
