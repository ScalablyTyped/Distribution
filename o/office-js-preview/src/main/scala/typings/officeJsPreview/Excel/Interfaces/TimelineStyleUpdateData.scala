package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TimelineStyle object, for use in `timelineStyle.set({ ... })`. */
trait TimelineStyleUpdateData extends StObject {
  
  /**
    * Specifies the name of the timeline style.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
}
object TimelineStyleUpdateData {
  
  inline def apply(): TimelineStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineStyleUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineStyleUpdateData] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
