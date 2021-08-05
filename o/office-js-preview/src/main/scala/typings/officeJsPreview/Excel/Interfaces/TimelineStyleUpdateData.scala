package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TimelineStyle object, for use in `timelineStyle.set({ ... })`. */
trait TimelineStyleUpdateData extends StObject {
  
  /**
    *
    * Gets the name of the TimelineStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
}
object TimelineStyleUpdateData {
  
  inline def apply(): TimelineStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineStyleUpdateData]
  }
  
  extension [Self <: TimelineStyleUpdateData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
