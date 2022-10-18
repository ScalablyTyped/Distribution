package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateSkipHolidayMod {
  
  inline def apply(dt: js.Date, uf: Double, localidade: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(dt.asInstanceOf[js.Any], uf.asInstanceOf[js.Any], localidade.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def apply(dt: js.Date, uf: Double, localidade: Double, holidays: DataSet): js.Date = (^.asInstanceOf[js.Dynamic].apply(dt.asInstanceOf[js.Any], uf.asInstanceOf[js.Any], localidade.asInstanceOf[js.Any], holidays.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  @JSImport("@nginstack/engine/lib/date/skipHoliday", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
